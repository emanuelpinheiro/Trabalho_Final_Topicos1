package br.unitins.topicos1.model;

import com.fasterxml.jackson.annotation.JsonFormat;

@JsonFormat(shape = JsonFormat.Shape.OBJECT)
public enum EscolhaMetodoPagamento {
    
    PIX(1,"Pix"),
    BOLETO(2, "Boleto");

    private final Integer id;
    private final String label;
    
    private EscolhaMetodoPagamento(Integer id, String label) {
        this.id = id;
        this.label = label;
    }

    public Integer getId() {
        return id;
    }

    public String getLabel() {
        return label;
    }

    public static EscolhaMetodoPagamento ValueOf(Integer id) throws IllegalArgumentException {
        if (id ==null)
            return null;
        for (EscolhaMetodoPagamento escolha :EscolhaMetodoPagamento.values()) {
            if (escolha.getId().equals(id))
                return escolha;
        }

        throw new IllegalArgumentException("Id inválido" + id);
    }
}
