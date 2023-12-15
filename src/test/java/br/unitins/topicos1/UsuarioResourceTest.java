package br.unitins.topicos1;

import br.unitins.topicos1.dto.telefone.TelefoneDTO;
import br.unitins.topicos1.dto.usuario.UsuarioDTO;
import io.quarkus.test.junit.QuarkusTest;
import io.restassured.http.ContentType;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

@QuarkusTest
public class UsuarioResourceTest {

    String token = TokenUtils.generateToken("joao123", "123");

    // @Test
    // public void testInsert() {
    // UsuarioDTO dto = new UsuarioDTO("Roberta Pardo", "roberta", "123",
    //     "roberta@email.com", "123.456.789-09", Arrays.asList(new TelefoneDTO("63", "987654321")));
        
    // given()
    //     .contentType(ContentType.JSON)
    //     .body(dto)
    // .when()
    //     .post("/usuarios/cadastro")
    // .then()
    //     .statusCode(201);
    // }

    // @Test
    // public void testUpdate() {
    //     UsuarioDTO dto = new UsuarioDTO("Joao Silva", "joao123", "123",
    //             "joao@email.com", "123.456.789-00", Arrays.asList(new TelefoneDTO("62", "888888888")));

    //     given()
    //         .contentType(ContentType.JSON)
    //         .header("Authorization", "Bearer " + token)
    //         .body(dto)
    //     .when()
    //         .put("/usuarios/1")
    //     .then()
    //         .statusCode(204);
    // }

    @Test
    public void testDelete() {
        given()
            .header("Authorization", "Bearer " + token)
        .when()
            .delete("/usuarios/1")
        .then()
            .statusCode(204);
    }

    @Test
    public void testFindAll() {
        given()
            .header("Authorization", "Bearer " + token)
        .when()
            .get("/usuarios")
        .then()
            .statusCode(200);
    }

    @Test
    public void testFindById() {
        given()
            .header("Authorization", "Bearer " + token)
        .when()
            .get("/usuarios/1")
        .then()
            .statusCode(200);
    }

    @Test
    public void testFindByNome() {
        given()
            .header("Authorization", "Bearer " + token)
            .pathParam("nome", "Joao Silva")
        .when()
            .get("/usuarios/search/nome/{nome}")
        .then()
            .statusCode(200);
    }
}
