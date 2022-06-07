package com.uco.logicapp.infraestructura.repositoriojpa;

import com.uco.logicapp.infraestructura.entidades.EntidadUsuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.io.Serializable;

@Repository
public interface RepositorioUsuarioJPA extends JpaRepository<EntidadUsuario, Serializable> {
    EntidadUsuario findById(Integer id);
}
