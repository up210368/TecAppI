package com.example.p02.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.p02.model.Cliente;
import com.example.p02.repository.ClienteRepository;

@Service
public class ClienteService {
    private final ClienteRepository clienteRepository;

    public ClienteService(ClienteRepository clienteRepository) {
        this.clienteRepository = clienteRepository;
    }

    public List<Cliente> getClientes() {
        return clienteRepository.findAll();
    }

    public Optional<Cliente> getCliente(Long id) {
        return clienteRepository.findById(id);    
    }
    
}