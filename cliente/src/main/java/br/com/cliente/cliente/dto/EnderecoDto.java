package br.com.cliente.cliente.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class EnderecoDto {

    private String lougradouro;
    private String numero;
    private String bairro;
    private String uf;
    private String cep;
    private String complemento;

}
