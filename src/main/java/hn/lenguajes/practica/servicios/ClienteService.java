package hn.lenguajes.practica.servicios;

import java.util.List;

import hn.lenguajes.practica.modelos.Cliente;

public interface ClienteService {
     public Cliente crearCliente(Cliente cliente); 
    
     public List<Cliente> obtenerTodos();

     public Cliente obtenerClientePorId(int codigoCliente);
}
