package br.unitins.topicos1.dto.pedido;

import br.unitins.topicos1.dto.endereco.EnderecoDTO;

import br.unitins.topicos1.model.StatusPedido;
import jakarta.validation.constraints.NotEmpty;

import java.time.LocalDate;
import java.util.List;

public record PedidoDTO (
    @NotEmpty(message = "O campo nome não pode ser nulo.")
    Long idUsuario,
    @NotEmpty(message = "O campo nome não pode ser nulo.")
    Long idJogo,
    @NotEmpty(message = "O campo nome não pode ser nulo.")
    List<EnderecoDTO> listaEndereco,
    @NotEmpty(message = "O campo nome não pode ser nulo.")
    LocalDate dataCompra,

    // FormaPagamento formaPagamento,
    @NotEmpty(message = "O campo nome não pode ser nulo.")
    StatusPedido statusPedido
)
{

}