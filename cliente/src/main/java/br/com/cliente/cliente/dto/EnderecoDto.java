package br.com.cliente.cliente.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class EnderecoDto {

    @NotBlank(message = "Deve conter um lougradouro.")
    private String lougradouro;
    @NotBlank(message = "Deve conter um numero.")
    private String numero;
    @NotBlank(message = "Deve conter um bairro")
    private String bairro;
    @NotBlank(message = "Deve conter um uf")
    private String uf;
    @NotBlank(message = "Deve conter um cep")
    private String cep;
    @NotBlank(message = "Deve conter um complemento")
    private String complemento;

}
