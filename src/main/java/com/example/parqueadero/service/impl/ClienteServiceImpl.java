package com.example.parqueadero.service.impl;

import com.example.parqueadero.entity.Cliente;
import com.example.parqueadero.repository.ClienteRepository;
import com.example.parqueadero.service.IClienteService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ClienteServiceImpl implements IClienteService {

    private final ClienteRepository clienteRepository;

    @Override
    public List<Cliente> getClient() throws Exception {
        try {

            return clienteRepository.findAll();

        } catch (Exception e) {
            System.out.println(e.getMessage());
            throw new Exception(e.getMessage());
        }
    }

    @Override
    public Cliente saveClient(Cliente cliente) throws Exception {

        try {

            if (Objects.isNull(cliente)){
                throw new Exception("Parametro de entrada nulo");
            }

            return clienteRepository.save(cliente);

        } catch (Exception e) {
            System.out.println(e.getMessage());
            throw new Exception(e.getMessage());
        }

    }

    @Override
    public Optional<Cliente> getClient(Long id) throws Exception {
        try {

            if (id == null){
                throw new Exception("Parametro de entrada nulo");
            }

            return clienteRepository.findById(id);

        } catch (Exception e) {
            System.out.println(e.getMessage());
            throw new Exception(e.getMessage());
        }
    }

}
