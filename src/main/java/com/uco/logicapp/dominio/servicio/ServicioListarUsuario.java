package com.uco.logicapp.dominio.servicio;

import com.uco.logicapp.dominio.modelo.dto.UsuarioDTO;
import com.uco.logicapp.dominio.puerto.repositorio.RepositorioUsuario;

import java.util.List;

public class ServicioListarUsuario {

    private RepositorioUsuario repositorioUsuario;

    public ServicioListarUsuario(RepositorioUsuario repositorioUsuario){
        this.repositorioUsuario = repositorioUsuario;
    }

    public List<UsuarioDTO> ejecutar() {
        return this.repositorioUsuario.listar();

    }

}
