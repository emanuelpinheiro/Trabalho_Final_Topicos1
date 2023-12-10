package br.unitins.topicos1.dto.boleto;

import java.time.LocalDate;
import java.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonFormat;

import io.smallrye.common.constraint.NotNull;
import jakarta.validation.constraints.NotBlank;

public record BoletoDTO(
        @NotBlank(message = "O número do boleto deve ser informado.")
        String numeroBoleto,

        @NotNull()
        @JsonFormat(pattern = "yyyy-MM-dd")
        LocalDate dataVencimento
) {
    
}
