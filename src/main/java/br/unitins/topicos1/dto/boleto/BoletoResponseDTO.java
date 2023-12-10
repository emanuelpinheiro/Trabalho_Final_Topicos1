package br.unitins.topicos1.dto.boleto;

import java.time.LocalDateTime;
import br.unitins.topicos1.model.Boleto;

public record BoletoResponseDTO(
    Long id,
    String numeroBoleto,
    LocalDateTime dataVencimento

) {
    public static BoletoResponseDTO valueOf(Boleto boleto){
        return new BoletoResponseDTO(
            boleto.getId(),
            boleto.getNumeroBoleto(),
            boleto.getDataVencimento()
            );
    
        }
}
