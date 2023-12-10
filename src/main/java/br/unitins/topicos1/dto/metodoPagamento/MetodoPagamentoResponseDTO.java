package br.unitins.topicos1.dto.metodoPagamento;

import java.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonFormat;

import br.unitins.topicos1.model.MetodoDePagamento;


public record MetodoPagamentoResponseDTO(
    Long id,
    Double valor,
    LocalDateTime dataPagamento

) {
    public static MetodoPagamentoResponseDTO valueOf(MetodoDePagamento metodoPagamento) {

        return new MetodoPagamentoResponseDTO(
            metodoPagamento.getId(),
            metodoPagamento.getValor(),
            metodoPagamento.getDataPagamento()
        );
    }
} 