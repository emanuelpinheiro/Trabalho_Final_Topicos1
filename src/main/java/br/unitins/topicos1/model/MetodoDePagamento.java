package br.unitins.topicos1.model;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;

@Entity
public class MetodoDePagamento extends DefaultEntity {

    private Double valor;
    private EscolhaMetodoPagamento escolhaMetodoPagamento;
    private LocalDateTime dataPagamento;

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public LocalDateTime getDataPagamento() {
        return dataPagamento;
    }

    public void setDataPagamento(LocalDateTime dataPagamento) {
        this.dataPagamento = dataPagamento;
    }

    public EscolhaMetodoPagamento getEscolhaMetodoPagamento() {
        return escolhaMetodoPagamento;
    }

    public void setEscolhaMetodoPagamento(EscolhaMetodoPagamento escolhaMetodoPagamento) {
        this.escolhaMetodoPagamento = escolhaMetodoPagamento;
    }

}
