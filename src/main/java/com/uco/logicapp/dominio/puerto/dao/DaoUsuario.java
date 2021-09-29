package com.uco.logicapp.dominio.puerto.dao;

import com.uco.logicapp.dominio.modelo.dto.DtoUsuario;

import java.util.List;

public interface DaoUsuario {

    /**
     * permite listar usuarios de tipo DtoUsuario
     * @return lista de usuarios
     */
    List<DtoUsuario> listar();
}
