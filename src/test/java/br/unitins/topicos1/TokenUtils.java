package br.unitins.topicos1;

import static io.restassured.RestAssured.given;

import br.unitins.topicos1.dto.usuario.LoginDTO;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class TokenUtils {

    public static String generateToken(String login, String senha) {

        // Criar um objeto de autenticação com o login e senha
        LoginDTO loginDTO = new LoginDTO(login, senha);

        // Enviar uma requisição POST para a rota /auth para autenticar o usuário
        Response response = given()
            .contentType(ContentType.JSON)
            .body(loginDTO)
            .when()
            .post("/auth");

        // Verificar se a resposta foi bem-sucedida (status code 2xx)
        if (response.getStatusCode() / 100 == 2) {
            // Extrair o token do cabeçalho "Authorization"
            return response.getHeader("Authorization");
        } else {
            // Adicionar mais detalhes à mensagem de exceção (incluindo o corpo da resposta)
            String errorMessage = "Falha na geração do token. Status code: " + response.getStatusCode();
            if (response.getBody() != null) {
                errorMessage += "\nResposta: " + response.getBody().asString();
            }
            // Lançar uma exceção específica para erros de autenticação
            throw new AuthenticationException(errorMessage);
        }
    }

    // Nova exceção específica para erros de autenticação
    public static class AuthenticationException extends RuntimeException {
        public AuthenticationException(String message) {
            super(message);
        }
    }
}
