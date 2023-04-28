package br.com.cliente.cliente.service;

import br.com.cliente.cliente.repository.ClienteRepository;
import br.com.cliente.cliente.repository.EnderecoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepository clienteRepostory;

    @Autowired
    private EnderecoRepository enderecoRepository;
}
