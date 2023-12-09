package hn.lenguajes.practica.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import hn.lenguajes.practica.modelos.TipoCliente;

public interface TipoClienteRepository extends JpaRepository <TipoCliente,Integer> {
    
}
