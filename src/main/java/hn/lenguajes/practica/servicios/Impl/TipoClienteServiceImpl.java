package hn.lenguajes.practica.servicios.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hn.lenguajes.practica.modelos.TipoCliente;
import hn.lenguajes.practica.repositorios.TipoClienteRepository;
import hn.lenguajes.practica.servicios.TipoClienteService;

@Service
public class TipoClienteServiceImpl implements TipoClienteService  {

    @Autowired
    private TipoClienteRepository TipoClienteRepository;

    @Override
    public TipoCliente crearTipoCliente(TipoCliente nvotipoCliente) {
        TipoCliente TipoClienteGuardado = TipoClienteRepository.save(nvotipoCliente);
        return TipoClienteGuardado; 
    }
    
}
