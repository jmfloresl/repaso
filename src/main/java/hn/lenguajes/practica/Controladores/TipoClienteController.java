package hn.lenguajes.practica.Controladores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import hn.lenguajes.practica.modelos.TipoCliente;
import hn.lenguajes.practica.servicios.Impl.TipoClienteServiceImpl;

@RestController
@RequestMapping("/api/TipoCliente")
public class TipoClienteController {
    @Autowired
    private TipoClienteServiceImpl tipoClienteServiceImpl;

     @PostMapping("/crear")
    public TipoCliente crearTipoCliente(@RequestBody TipoCliente nvoTipoCliente){

        return this.tipoClienteServiceImpl.crearTipoCliente(nvoTipoCliente);
    }


}
