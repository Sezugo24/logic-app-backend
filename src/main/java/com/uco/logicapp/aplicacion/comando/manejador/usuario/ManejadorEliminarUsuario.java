package com.uco.logicapp.aplicacion.comando.manejador.usuario;

import com.uco.logicapp.dominio.servicio.ServicioEliminarUsuario;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
public class ManejadorEliminarUsuario {
    private final ServicioEliminarUsuario servicioEliminarUsuario;

    public ManejadorEliminarUsuario(ServicioEliminarUsuario servicioEliminarUsuario) {
        this.servicioEliminarUsuario = servicioEliminarUsuario;
    }

    public void ejecutar(UUID id){
        servicioEliminarUsuario.ejecutar(id);
    }
}
