package br.unitins.topicos1;

import io.quarkus.test.junit.QuarkusTest;
import io.restassured.http.ContentType;
import org.junit.jupiter.api.Test;

import br.unitins.topicos1.dto.jogo.JogoDTO;

import static io.restassured.RestAssured.given;

@QuarkusTest
public class JogoResourceTest {

    String token = TokenUtils.generateToken("joao123", "123");

    @Test
    public void testInsert() {
        JogoDTO dto = new JogoDTO("Super Mario", "Jogo de plataforma mais famoso", 29.99, 1, 1, null);

        given()
            .contentType(ContentType.JSON)
            .header("Authorization", "Bearer " + token)
            .body(dto)
        .when()
            .post("/jogos")
        .then()
            .statusCode(201);
    }

    // @Test
    // public void testUpdate() {
    //     JogoDTO dto = new JogoDTO("Jogo1", "Descrição do Jogo1", 49.99, 100, 2, null);

    //     given()
    //         .contentType(ContentType.JSON)
    //         .header("Authorization", "Bearer " + token)
    //         .body(dto)
    //     .when()
    //         .put("/jogos/{id}", 1)
    //     .then()
    //         .statusCode(204);
    // }

    @Test
    public void testDelete() {

        given()
            .header("Authorization", "Bearer " + token)
        .when()
            .delete("/jogos/{id}", 1)
        .then()
            .statusCode(204);
    }

    @Test
    public void testFindAll() {
        given()
        .when()
            .get("/jogos")
        .then()
            .statusCode(200);
    }

    @Test
    public void testFindById() {
        given()
            .header("Authorization", "Bearer " + token)
        .when()
            .get("/jogos/{id}", 1)
        .then()
            .statusCode(200);
    }

    @Test
    public void testFindByNome() {
        given()
        .when()
            .get("/jogos/search/nome/{nome}", "Jogo1") 
        .then()
            .statusCode(200);
    }
}