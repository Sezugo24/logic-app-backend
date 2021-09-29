package com.uco.logicapp.dominio.servicio;

import com.uco.logicapp.dominio.puerto.repositorio.RepositorioUsuario;

public class ServicioEliminarUsuario {

    private final RepositorioUsuario repositorioUsuario;

    public ServicioEliminarUsuario(RepositorioUsuario repositorioUsuario){
        this.repositorioUsuario = repositorioUsuario;
    }

    public void ejecutar(Integer id){
        this.repositorioUsuario.eliminar(id);
    }

    //Implementar metodo para validar si el usuario a eliminar no existe.

}
