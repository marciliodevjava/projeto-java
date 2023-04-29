package br.com.cliente.cliente.dto;

import br.com.cliente.cliente.domain.enuns.EnumStadoCliente;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ClienteDto {

    @NotBlank(message = "Deve conter um nome.")
    private String nome;
    @NotBlank(message = "Deve conter um cpfCnpj.")
    private String cpfCnpj;
    @NotBlank(message = "Deve conter um rg.")
    private String rg;
    @NotBlank(message = "Deve conter uma data")
    private String data;
    @NotBlank(message = "Deve conter um ddd")
    private Long ddd;
    @NotBlank(message = "Deve conter um telefone")
    private String telefone;
    @NotBlank(message = "Deve conter um email")
    private String email;
    @NotBlank(message = "Deve conter um endereco")
    private List<EnderecoDto> enderecoDto;
    @NotBlank(message = "Deve conter um CPF ou CPNJ")
    private EnumStadoCliente enumStadoCliente;
}
