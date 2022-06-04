package com.uco.logicapp.aplicacion.consulta;

import com.uco.logicapp.dominio.modelo.dto.UsuarioDTO;
import com.uco.logicapp.dominio.servicio.ServicioListarUsuario;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ManejadorListarUsuario {

    private final ServicioListarUsuario servicioListarUsuario;

    public ManejadorListarUsuario(ServicioListarUsuario servicioListarUsuario){
        this.servicioListarUsuario = servicioListarUsuario;
    }

    public List<UsuarioDTO> ejecutar(){
        return servicioListarUsuario.ejecutar();
    }

}
