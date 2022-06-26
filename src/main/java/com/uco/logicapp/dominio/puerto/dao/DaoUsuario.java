package com.uco.logicapp.dominio.puerto.dao;

import com.uco.logicapp.dominio.modelo.dto.UsuarioDTO;

import java.util.List;

public interface DaoUsuario {

    /**
     * permite listar usuarios de tipo DtoUsuario
     * @return lista de usuarios
     */
    List<UsuarioDTO> listar();
}
