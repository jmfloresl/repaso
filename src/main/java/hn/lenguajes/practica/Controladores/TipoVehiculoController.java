package hn.lenguajes.practica.Controladores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import hn.lenguajes.practica.modelos.TipoVehiculo;
import hn.lenguajes.practica.servicios.Impl.TipoVehiculoServiceImpl;

@RestController
@RequestMapping("/api/TipoVehiculo")
public class TipoVehiculoController {
    @Autowired
    private TipoVehiculoServiceImpl tipoVehiculoServiceImpl;

     @PostMapping("/crear")
    public TipoVehiculo crearTipoVehiculo(@RequestBody TipoVehiculo nvoTipoVehiculo){

        return this.tipoVehiculoServiceImpl.crearTipoVehiculo(nvoTipoVehiculo);
    }

}
