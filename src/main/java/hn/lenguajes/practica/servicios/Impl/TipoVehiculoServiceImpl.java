package hn.lenguajes.practica.servicios.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import hn.lenguajes.practica.modelos.TipoVehiculo;
import hn.lenguajes.practica.repositorios.TipoVehiculoRepository;
import hn.lenguajes.practica.servicios.TipoVehiculoService;

@Service
public class TipoVehiculoServiceImpl implements TipoVehiculoService {
    
    @Autowired
    private TipoVehiculoRepository TipoVehiculoRepository;

    @Override
    public TipoVehiculo crearTipoVehiculo(TipoVehiculo nvotipoVehiculo) {
       TipoVehiculo TipoVehiculoGuardado = TipoVehiculoRepository.save(nvotipoVehiculo);
        return TipoVehiculoGuardado; 
    }
}
