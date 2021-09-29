package com.uco.logicapp.dominio.puerto.repositorio;

import com.uco.logicapp.dominio.modelo.dto.DtoUsuario;
import com.uco.logicapp.dominio.modelo.entidad.Usuario;


public interface RepositorioUsuario {


    /**
     * Permite crear un usuario
     * @param usuario
     * @return retorna el id del usuario creado
     */
    Integer crear(Usuario usuario);

    /**
     * Permite actualizar un usuario
     * @param usuario
     */
    void actualizar(Usuario usuario);

    /**
     * Permite eliminar un usuario por medio del id
     * @param id
     */
    void eliminar(Integer id);

}
