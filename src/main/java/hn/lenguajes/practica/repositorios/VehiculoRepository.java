package hn.lenguajes.practica.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import hn.lenguajes.practica.modelos.Vehiculo;

public interface VehiculoRepository extends JpaRepository <Vehiculo, Integer>{
    
}
