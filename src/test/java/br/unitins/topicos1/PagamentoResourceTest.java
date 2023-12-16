package br.unitins.topicos1;

import io.quarkus.test.junit.QuarkusTest;
import io.restassured.http.ContentType;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

@QuarkusTest
public class PagamentoResourceTest {

    String token = TokenUtils.generateToken("joao123", "123");

    // @Test
    // public void testRealizarPagamento() {
    //     Long id = 1L;
    //     given()
    //         .contentType(ContentType.JSON)
    //         .header("Authorization", "Bearer " + token)
    //     .when()
    //         .patch("/pedidos/realizar-pagamento/{id}", id)
    //     .then()
    //         .statusCode(200);
    // }
}