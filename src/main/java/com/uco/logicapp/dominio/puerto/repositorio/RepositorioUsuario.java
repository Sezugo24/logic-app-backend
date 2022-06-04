package com.uco.logicapp.dominio.puerto.repositorio;

import com.uco.logicapp.dominio.modelo.dto.UsuarioDTO;
import com.uco.logicapp.dominio.modelo.entidad.Usuario;

import java.util.List;


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

    /**
     * Permite listar toda la lista de usuarios
     */

    List<UsuarioDTO> listar();

}
