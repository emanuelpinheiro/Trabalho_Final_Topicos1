package br.unitins.topicos1.dto.boleto;

import java.time.LocalDateTime;
import br.unitins.topicos1.model.Boleto;
import br.unitins.topicos1.model.Pedido;

public record BoletoResponseDTO(
    Double valor,
    String numeroBoleto,
    LocalDateTime dataEmissao,
    LocalDateTime dataVencimento,
    Pedido idPedido

) {
    public static BoletoResponseDTO valueOf(Boleto boleto){
        return new BoletoResponseDTO(
            boleto.getValor(),
            boleto.getNumeroBoleto(),
            boleto.getDataEmissao(),
            boleto.getDataVencimento(),
            boleto.getIdPedido()
            );
    
        }
}
