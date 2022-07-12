package com.uco.logicapp.dominio.puerto.repositorio;

import com.uco.logicapp.dominio.modelo.dto.UsuarioDTO;
import com.uco.logicapp.dominio.modelo.entidad.Usuario;

import java.util.List;
import java.util.UUID;


public interface RepositorioUsuario {


    /**
     * Permite crear un usuario
     * @param usuario
     * @return retorna el id del usuario creado
     */
    void crear(Usuario usuario);

    /**
     * Permite actualizar un usuario
     * @param usuario
     */
    void actualizar(Usuario usuario);

    /**
     * Permite eliminar un usuario por medio del id
     * @param id
     */
    void eliminar(UUID id);

    /**
     * Permite listar toda la lista de usuarios
     */

    List<UsuarioDTO> listar();

}
