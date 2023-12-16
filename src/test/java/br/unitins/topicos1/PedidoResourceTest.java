package br.unitins.topicos1;

import io.quarkus.test.junit.QuarkusTest;
import io.restassured.http.ContentType;
import org.junit.jupiter.api.Test;

import br.unitins.topicos1.dto.itempedido.ItemPedidoDTO;
import br.unitins.topicos1.dto.pedido.PedidoDTO;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

import java.util.List;

@QuarkusTest
public class PedidoResourceTest {

    String token = TokenUtils.generateToken("joao123", "123");

    @Test
    public void testInsert() {
        
        PedidoDTO pedidoDTO = new PedidoDTO(1, 1L, List.of(new ItemPedidoDTO(1, 49.99, 1L)));

        given()
            .contentType(ContentType.JSON)
            .header("Authorization", "Bearer " + token)
            .body(pedidoDTO)
        .when()
            .post("/pedidos/fazer-pedido")
        .then()
            .statusCode(201);
    }

    @Test
    public void testFindByAll() {
        given()
            .contentType(ContentType.JSON)
            .header("Authorization", "Bearer " + token)
        .when()
            .get("/pedidos/buscar/meuspedidos")
        .then()
            .statusCode(200);
    }

    // @Test
    // public void testFindById() {
    //     Long pedidoId = 1L;

    //     given()
    //         .contentType(ContentType.JSON)
    //         .header("Authorization", "Bearer " + token)
    //     .when()
    //         .get("/pedidos/buscar/pedido/" + pedidoId)
    //     .then()
    //         .statusCode(200)
    //         .body("id", equalTo(pedidoId.intValue()));
    // }
}
