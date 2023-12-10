package br.unitins.topicos1.dto.pedido;

import br.unitins.topicos1.dto.endereco.EnderecoResponseDTO;

import br.unitins.topicos1.model.StatusPedido;
import br.unitins.topicos1.model.Pedido;
import java.time.LocalDate;
import java.util.List;

public record PedidoResponseDTO(
    Long id,
    Long idUsuario,
    Long idJogo,
    List<EnderecoResponseDTO> listaEndereco,
    LocalDate dataCompra,
    // FormaPagamento formaPagamento,
    StatusPedido statusPedido
) {
    public static PedidoResponseDTO valueOf(Pedido pedido){
        return new PedidoResponseDTO(
            pedido.getId(),
            pedido.getIdUsuario(),
            pedido.getIdJogo(),
            pedido.getListaEndereco()
            .stream()
            .map(t -> EnderecoResponseDTO.valueOf(t)).toList(),
            pedido.getDataCompra(),
            // pedido.getFormaPagamento(),
            pedido.getStatusPedido()
        );
    }
}
