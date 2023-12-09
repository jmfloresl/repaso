package hn.lenguajes.practica.Controladores;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import hn.lenguajes.practica.modelos.Cliente;
import hn.lenguajes.practica.servicios.Impl.ClienteServiceImpl;

@RestController
@RequestMapping("/api/Cliente")
public class ClienteController {
    
    @Autowired
    private ClienteServiceImpl clienteServiceImpl;

    @PostMapping("/crear")
    public Cliente crearCliente(@RequestBody Cliente nvoCliente){

        return this.clienteServiceImpl.crearCliente(nvoCliente);
    }

    @GetMapping("/todos")
    public List<Cliente> obtenerTodos(){
        return this.clienteServiceImpl.obtenerTodos();
    }

    @GetMapping("/obtenerPorId")
    public Cliente obtenerClientePorId(@RequestParam int codigoCliente) {
    return this.clienteServiceImpl.obtenerClientePorId(codigoCliente);
    }
}
