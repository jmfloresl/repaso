package hn.lenguajes.practica.servicios.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hn.lenguajes.practica.modelos.Vehiculo;
import hn.lenguajes.practica.repositorios.VehiculoRepository;
import hn.lenguajes.practica.servicios.VehiculoService;

@Service
public class VehiculoServiceImpl implements VehiculoService {
    @Autowired
    private VehiculoRepository VehiculoRepository;

    @Override
    public Vehiculo crearVehiculo(Vehiculo nvoVehiculo) {
        Vehiculo VehiculoGuardado = VehiculoRepository.save(nvoVehiculo);
        return VehiculoGuardado; 
    }

    @Override
    public List<Vehiculo> obtenerTodos() {
        return this.VehiculoRepository.findAll();
    }

    @Override
    public Vehiculo obtenerVehiculoPorId(int idVehiculo) {
        Vehiculo VehiculoEncontrado = this.VehiculoRepository.findById(idVehiculo).get();
        return VehiculoEncontrado;
    }
    
}
