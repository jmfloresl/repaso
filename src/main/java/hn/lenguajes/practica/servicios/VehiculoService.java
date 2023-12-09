package hn.lenguajes.practica.servicios;

import java.util.List;

import hn.lenguajes.practica.modelos.Vehiculo;

public interface VehiculoService {
     public Vehiculo crearVehiculo(Vehiculo vehiculo); 
    
     public List<Vehiculo> obtenerTodos();

     public Vehiculo obtenerVehiculoPorId(int idVehiculo);
}
