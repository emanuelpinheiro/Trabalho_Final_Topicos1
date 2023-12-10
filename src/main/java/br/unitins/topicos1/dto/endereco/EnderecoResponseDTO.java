package br.unitins.topicos1.dto.endereco;


import br.unitins.topicos1.model.Endereco;


public record EnderecoResponseDTO(
    String cep,
    String logradouro,
    String numero,
    String complemento,
    String bairro

) {
     public static EnderecoResponseDTO valueOf(Endereco endereco){
        return new EnderecoResponseDTO(
            endereco.getCep(),
            endereco.getLogradouro(),
            endereco.getNumero(),
            endereco.getComplemento(),  
            endereco.getBairro()
            );
    
        }
}
