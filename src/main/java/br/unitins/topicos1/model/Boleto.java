package br.unitins.topicos1.model;

import java.time.LocalDate;
import java.time.LocalDateTime;


public class Boleto extends MetodoDePagamento {

    private String numeroBoleto;
    private LocalDateTime dataVencimento;

    public String getNumeroBoleto() {
        return numeroBoleto;
    }

    public void setNumeroBoleto(String numeroBoleto) {
        this.numeroBoleto = numeroBoleto;
    }

    public LocalDateTime getDataVencimento() {
        return dataVencimento;
    }

    public void setDataVencimento(LocalDateTime localDateTime) {
        this.dataVencimento = localDateTime;
    }

}
