package br.unitins.topicos1.resource;

import java.util.List;

import org.eclipse.microprofile.jwt.JsonWebToken;
import org.jboss.logging.Logger;

import br.unitins.topicos1.dto.pedido.PedidoResponseDTO;
import br.unitins.topicos1.model.Pedido;
import br.unitins.topicos1.service.PagamentoService;
import br.unitins.topicos1.service.PedidoService;
import jakarta.annotation.security.RolesAllowed;
import jakarta.inject.Inject;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.PATCH;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

@Path("/pedidos")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class PagamentoResource {
    
    @Inject
    PagamentoService service;

    @Inject
    JsonWebToken jwt;

    private static final Logger LOG = Logger.getLogger(UsuarioLogadoResource.class);

    @PATCH
    @Path("/realizar-pagamento/{id}")
    @RolesAllowed({ "User", "Admin" })
    public Response realizarPagamento(@PathParam ("id") Long id) {
        LOG.info("Iniciando busca de Pedidos");

        String login = jwt.getSubject();
        
        PedidoResponseDTO pedido = service.realizarPagamento(login,id);
        
        return Response.ok(pedido).build();
    }
}
