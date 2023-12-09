package hn.lenguajes.practica.servicios.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hn.lenguajes.practica.modelos.Cliente;
import hn.lenguajes.practica.repositorios.ClienteRepository;
import hn.lenguajes.practica.servicios.ClienteService;

@Service
public class ClienteServiceImpl implements ClienteService {
    @Autowired
    private ClienteRepository ClienteRepository;

    @Override
    public Cliente crearCliente(Cliente nvocliente) {
          Cliente ClienteGuardado = ClienteRepository.save(nvocliente);
        return ClienteGuardado; 
    }

    @Override
    public List<Cliente> obtenerTodos() {
        return this.ClienteRepository.findAll();
    }

    @Override
    public Cliente obtenerClientePorId(int codigoCliente) {
        Cliente ClienteEncontrado = this.ClienteRepository.findById(codigoCliente).get();
        return ClienteEncontrado;
    }
    
}
