package com.uco.logicapp.aplicacion.comando.manejador.usuario;

import com.uco.logicapp.dominio.servicio.ServicioEliminarUsuario;

public class ManejadorEliminarUsuario {
    private final ServicioEliminarUsuario servicioEliminarUsuario;

    public ManejadorEliminarUsuario(ServicioEliminarUsuario servicioEliminarUsuario) {
        this.servicioEliminarUsuario = servicioEliminarUsuario;
    }

    public void ejecutar(Integer id){
        servicioEliminarUsuario.ejecutar(id);
    }
}
