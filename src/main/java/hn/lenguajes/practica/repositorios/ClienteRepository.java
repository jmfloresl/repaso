package hn.lenguajes.practica.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import hn.lenguajes.practica.modelos.Cliente;

public interface ClienteRepository extends JpaRepository <Cliente,Integer>  {
    
}

