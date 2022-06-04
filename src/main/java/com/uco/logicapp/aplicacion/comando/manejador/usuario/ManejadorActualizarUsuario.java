package com.uco.logicapp.aplicacion.comando.manejador.usuario;

import com.uco.logicapp.aplicacion.comando.ComandoUsuario;
import com.uco.logicapp.aplicacion.comando.fabrica.FabricaUsuario;
import com.uco.logicapp.dominio.modelo.entidad.Usuario;
import com.uco.logicapp.dominio.servicio.ServicioActualizarUsuario;

public class ManejadorActualizarUsuario {
    private final ServicioActualizarUsuario servicioActualizarUsuario;
    private final FabricaUsuario fabricaUsuario;

    public ManejadorActualizarUsuario(ServicioActualizarUsuario servicioActualizarUsuario, FabricaUsuario fabricaUsuario) {
        this.servicioActualizarUsuario = servicioActualizarUsuario;
        this.fabricaUsuario = fabricaUsuario;
    }

    public void ejecutar(ComandoUsuario comandoUsuario){
        Usuario usuario = this.fabricaUsuario.crear(comandoUsuario);
        this.servicioActualizarUsuario.ejecutar(usuario);
    }
}
