package br.unitins.topicos1;

import io.quarkus.test.junit.QuarkusTest;
import io.restassured.http.ContentType;
import org.junit.jupiter.api.Test;

import br.unitins.topicos1.dto.estado.EstadoDTO;

import static io.restassured.RestAssured.given;

@QuarkusTest
public class EstadoResourceTest {

    String token = TokenUtils.generateToken("joao123", "123");

    @Test
    public void testInsert() {
        EstadoDTO dto = new EstadoDTO("Goiânia", "GO");
        given()
            .contentType(ContentType.JSON)
            .header("Authorization", "Bearer " + token)
            .body(dto)
        .when()
            .post("/estados")
        .then()
            .statusCode(201);
    }

    @Test
    public void testUpdate() {
        Long id = 1L;
        EstadoDTO dto = new EstadoDTO("TOCANTIN", "TO");
        given()
            .contentType(ContentType.JSON)
            .header("Authorization", "Bearer " + token)
            .body(dto)
        .when()
            .put("/estados/{id}", id)
        .then()
            .statusCode(204);
    }

    // @Test
    // public void testDelete() {
    //     Long id = 1L;
    //     given()
    //         .header("Authorization", "Bearer " + token)
    //     .when()
    //         .delete("/estados/{id}", id)
    //     .then()
    //         .statusCode(204);
    // }

    @Test
    public void testFindAll() {
        given()
            .header("Authorization", "Bearer " + token)
        .when()
            .get("/estados")
        .then()
            .statusCode(200);
    }

    @Test
    public void testFindById() {
        Long id = 1L;
        given()
            .header("Authorization", "Bearer " + token)
        .when()
            .get("/estados/{id}", id)
        .then()
            .statusCode(200);
    }

    // @Test
    // public void testFindByNome() {
    //     String nome = "Tocantins";
    //     given()
    //         .header("Authorization", "Bearer " + token)
    //     .when()
    //         .get("/estados/search/nome/{nome}", nome)
    //     .then()
    //         .statusCode(200);
    // }
}