package hn.lenguajes.practica.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import hn.lenguajes.practica.modelos.TipoVehiculo;

public interface TipoVehiculoRepository extends JpaRepository <TipoVehiculo ,Integer> {
    
}
