package br.unitins.topicos1.dto.metodoPagamento;

import java.time.LocalDate;
import java.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonFormat;

public record MetodoPagamentoDTO(
    Double valor,
    @JsonFormat(pattern = "yyyy-MM-dd")
    LocalDate dataPagamento
) {
    
}