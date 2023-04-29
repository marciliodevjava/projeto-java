package br.com.cliente.cliente.dto;

import br.com.cliente.cliente.domain.Endereco;
import br.com.cliente.cliente.domain.enuns.EnumStadoCliente;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class ClienteDto {

    private String nome;
    private String cpfCnpj;
    private String rg;
    private String data;
    private Long ddd;
    private String telefone;
    private String email;
    private List<EnderecoDto> enderecoDto;
    private EnumStadoCliente enumStadoCliente;
}
