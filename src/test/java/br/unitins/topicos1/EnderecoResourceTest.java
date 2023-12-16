package br.unitins.topicos1;

import io.quarkus.test.junit.QuarkusTest;
import io.restassured.http.ContentType;
import org.junit.jupiter.api.Test;

import br.unitins.topicos1.dto.endereco.EnderecoDTO;

import static io.restassured.RestAssured.given;

@QuarkusTest
public class EnderecoResourceTest {

    String token = TokenUtils.generateToken("joao123", "123");

    @Test
    public void testFindByAll() {
        given()
            .header("Authorization", "Bearer " + token)
        .when()
            .get("/endereco")
        .then()
            .statusCode(200);
    }

    @Test
    public void testFindById() {
        Long id = 1L;
        given()
            .header("Authorization", "Bearer " + token)
        .when()
            .get("/endereco/{id}", id)
        .then()
            .statusCode(200);
    }

    @Test
    public void testFindByCep() {
        String cep = "77010-000";
        given()
            .header("Authorization", "Bearer " + token)
        .when()
            .get("/endereco/cep/{cep}", cep)
        .then()
            .statusCode(200);
    }

    @Test
    public void testInsert() {
        EnderecoDTO dto = new EnderecoDTO("77001-086", "Quadra 107 Norte", 07, "Condomínio", "Plano Diretor Norte", 1L);
        given()
            .contentType(ContentType.JSON)
            .header("Authorization", "Bearer " + token)
            .body(dto)
        .when()
            .post("/endereco/insere-endereco")
        .then()
            .statusCode(201);
    }

    @Test
    public void testUpdate() {
        Long id = 1L;
        Long idEndereco = 1L;
        EnderecoDTO dto = new EnderecoDTO("77006-020", "alameda 15", 25, "Casa", "Plano Diretor Norte", 1L);
        given()
            .contentType(ContentType.JSON)
            .header("Authorization", "Bearer " + token)
            .body(dto)
        .when()
            .put("/endereco/atualiza-endereco/{id}/{idEndereco}", id, idEndereco)
        .then()
            .statusCode(204);
    }

    @Test
    public void testDelete() {
        Long id = 1L;
        Long idEndereco = 1L;
        given()
            .header("Authorization", "Bearer " + token)
        .when()
            .delete("/endereco/deleta-endereco/{id}/{idEndereco}", id, idEndereco)
        .then()
            .statusCode(204);
    }
}