package com.uco.logicapp.dominio.servicio;

import com.uco.logicapp.dominio.modelo.entidad.Usuario;
import com.uco.logicapp.dominio.puerto.repositorio.RepositorioUsuario;

public class ServicioActualizarUsuario {

    private final RepositorioUsuario repositorioUsuario;

    public ServicioActualizarUsuario(RepositorioUsuario repositorioUsuario){
        this.repositorioUsuario = repositorioUsuario;
    }

    public void ejecutar(Usuario usuario){
        this.repositorioUsuario.actualizar(usuario);
    }

    //Implementar Excepción que valide si el usuario a actualizar ya existe.







}
