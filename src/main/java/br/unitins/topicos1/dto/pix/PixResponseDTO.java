package br.unitins.topicos1.dto.pix;

import br.unitins.topicos1.model.Pedido;
import br.unitins.topicos1.model.Pix;
import br.unitins.topicos1.model.TipoChavePix;


public record PixResponseDTO(
    Pedido idPedido,
    Double valor,
    String chavePix,
    TipoChavePix tipoChavePix
) {
        public static PixResponseDTO valueOf(Pix pix){
        return new PixResponseDTO(
            pix.getIdPedido(),
            pix.getValor(),
            pix.getChavePix(),
            pix.getTipoChavePix()
        );
    }
}
