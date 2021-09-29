package com.uco.logicapp.dominio.servicio;

import com.uco.logicapp.dominio.modelo.entidad.Usuario;
import com.uco.logicapp.dominio.puerto.repositorio.RepositorioUsuario;

public class ServicioCrearUsuario {


    private final RepositorioUsuario repositorioUsuario;

    public ServicioCrearUsuario(RepositorioUsuario repositorioUsuario){
        this.repositorioUsuario = repositorioUsuario;
    }

    public void ejecutar(Usuario usuario){
        repositorioUsuario.crear(usuario);
    }

    //Implementar excepcion por si el usuario ya existe.



}
