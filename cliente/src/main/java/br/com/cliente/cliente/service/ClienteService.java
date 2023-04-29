package br.com.cliente.cliente.service;

import br.com.cliente.cliente.domain.Cliente;
import br.com.cliente.cliente.domain.Endereco;
import br.com.cliente.cliente.dto.ClienteDto;
import br.com.cliente.cliente.dto.EnderecoDto;
import br.com.cliente.cliente.repository.ClienteRepository;
import br.com.cliente.cliente.repository.EnderecoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.SimpleFormatter;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepository clienteRepostory;

    @Autowired
    private EnderecoRepository enderecoRepository;

    public ClienteDto cadastrarCliente(ClienteDto clienteDto) throws ParseException {
        Cliente cliente = this.mapearCliente(clienteDto);
        return clienteDto;
    }

    private Cliente mapearCliente(ClienteDto clienteDto) throws ParseException {
        Cliente cliente = new Cliente();
        cliente.setNome(clienteDto.getNome());
        cliente.setCpfCnpj(cliente.getCpfCnpj());
        cliente.setRg(clienteDto.getRg());
        cliente.setData(this.converteDateStringParaDate(clienteDto.getData()));
        cliente.setDdd(clienteDto.getDdd());
        cliente.setTelefone(clienteDto.getTelefone());
        cliente.setEmail(clienteDto.getEmail());
        cliente.setEndereco(this.montarEndereco(clienteDto.getEnderecoDto()));
        cliente.setEnumStadoCliente(clienteDto.getEnumStadoCliente());

        Cliente clienteCadastrado = clienteRepostory.save(cliente);

        return clienteCadastrado;
    }

    private List<Endereco> montarEndereco(List<EnderecoDto> enderecoDto) {

        List<Endereco> listEndereco = new ArrayList<>();
        Endereco endereco = new Endereco();

        for(int i = 0 ; i < enderecoDto.size(); i++){
            endereco.setLougradouro(enderecoDto.get(i).getLougradouro());
            endereco.setNumero(enderecoDto.get(i).getNumero());
            endereco.setBairro(enderecoDto.get(i).getBairro());
            endereco.setUf(enderecoDto.get(i).getUf());
            endereco.setCep(enderecoDto.get(i).getCep());
            endereco.setComplemento(enderecoDto.get(i).getComplemento());
            listEndereco.add(endereco);
        }
        return listEndereco;
    }

    private Date converteDateStringParaDate(String data) throws ParseException {
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy/MM/dd");;
        Date date = formatter.parse(data);

        return date;
    }
}
