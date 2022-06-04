package com.uco.logicapp.aplicacion.comando.manejador.usuario;

import com.uco.logicapp.aplicacion.comando.ComandoUsuario;
import com.uco.logicapp.aplicacion.comando.fabrica.FabricaUsuario;
import com.uco.logicapp.dominio.modelo.entidad.Usuario;
import com.uco.logicapp.dominio.servicio.ServicioCrearUsuario;
import org.springframework.stereotype.Component;

@Component
public class ManejadorCrearUsuario {
    private final ServicioCrearUsuario servicioCrearUsuario;
    private final FabricaUsuario fabricaUsuario;

    public ManejadorCrearUsuario(ServicioCrearUsuario servicioCrearUsuario, FabricaUsuario fabricaUsuario) {
        this.servicioCrearUsuario = servicioCrearUsuario;
        this.fabricaUsuario = fabricaUsuario;
    }

    public void ejecutar(ComandoUsuario comandoUsuario){
        Usuario usuario = this.fabricaUsuario.crear(comandoUsuario);
        this.servicioCrearUsuario.ejecutar(usuario);
    }
}
