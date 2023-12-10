package br.unitins.topicos1.model;

import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

public class Pix extends MetodoDePagamento {

    private String chavePix;

    @ManyToOne
    @JoinColumn(name = "id_tipoChavePix")
    private TipoChavePix tipoChavePix;

    public String getChavePix() {
        return chavePix;
    }

    public void setChavePix(String chavePix) {
        this.chavePix = chavePix;
    }

    public TipoChavePix getTipoChavePix() {
        return tipoChavePix;
    }

    public void setTipoChavePix(TipoChavePix tipoChavePix) {
        this.tipoChavePix = tipoChavePix;
    }

}
