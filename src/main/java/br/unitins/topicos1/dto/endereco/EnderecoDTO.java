package br.unitins.topicos1.dto.endereco;

import br.unitins.topicos1.model.Endereco;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;

public record EnderecoDTO(
    @NotEmpty(message = "O campo nome não pode ser nulo.")
    String cep,
    @NotEmpty(message = "O campo nome não pode ser nulo.")
    String logradouro,
    @NotEmpty(message = "O campo nome não pode ser nulo.")
    String numero,
    @NotEmpty(message = "O campo nome não pode ser nulo.")
    String complemento,
    @NotEmpty(message = "O campo nome não pode ser nulo.")
    String bairro
    
) {

    
}
