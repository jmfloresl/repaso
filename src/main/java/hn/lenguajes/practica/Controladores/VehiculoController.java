package hn.lenguajes.practica.Controladores;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import hn.lenguajes.practica.modelos.Vehiculo;
import hn.lenguajes.practica.servicios.Impl.VehiculoServiceImpl;

@RestController
@RequestMapping("/api/Vehiculo")
public class VehiculoController {

    @Autowired
    private VehiculoServiceImpl vehiculoServiceImpl;

    @PostMapping("/crear")
    public Vehiculo crearVehiculo(@RequestBody Vehiculo nvoVehiculo){

        return this.vehiculoServiceImpl.crearVehiculo(nvoVehiculo);
    }

    @GetMapping("/todos")
    public List<Vehiculo> obtenerTodos(){
        return this.vehiculoServiceImpl.obtenerTodos();
    }

    @GetMapping("/obtenerPorId")
    public Vehiculo obtenerVehiculoPorId(@RequestParam int idVehiculo) {
    return this.vehiculoServiceImpl.obtenerVehiculoPorId(idVehiculo);
    }



}
