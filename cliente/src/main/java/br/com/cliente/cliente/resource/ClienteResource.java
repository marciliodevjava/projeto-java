package br.com.cliente.cliente.resource;

import br.com.cliente.cliente.dto.ClienteDto;
import br.com.cliente.cliente.service.ClienteService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.ParseException;

@RestController
@RequestMapping("/cliente")
public class ClienteResource {

    @Autowired
    private ClienteService clienteService;

    @PutMapping("/cadastrar")
    public ResponseEntity<ClienteDto> cadastrar(@RequestBody @Valid ClienteDto clienteDto) throws ParseException {

        clienteService.cadastrarCliente(clienteDto);
        return ResponseEntity.ok(clienteDto);
    }
}
