package com.uco.logicapp.infraestructura.adaptador.repositorio;

import com.uco.logicapp.dominio.modelo.dto.UsuarioDTO;
import com.uco.logicapp.dominio.modelo.entidad.Usuario;
import com.uco.logicapp.dominio.puerto.repositorio.RepositorioUsuario;
import com.uco.logicapp.infraestructura.convertir.ConvertirUsuario;
import com.uco.logicapp.infraestructura.entidades.EntidadUsuario;
import com.uco.logicapp.infraestructura.repositoriojpa.RepositorioUsuarioJPA;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Repository
public class RepositorioUsuarioPostgres implements RepositorioUsuario {

    private final RepositorioUsuarioJPA repositorioUsuarioJPA;
    private final ConvertirUsuario convertirUsuario;

    public RepositorioUsuarioPostgres(RepositorioUsuarioJPA repositorioUsuarioJPA, ConvertirUsuario convertirUsuario) {
        this.repositorioUsuarioJPA = repositorioUsuarioJPA;
        this.convertirUsuario = convertirUsuario;
    }


    @Override
    public void crear(Usuario usuario) {
        EntidadUsuario entidadUsuario = convertirUsuario.convertirDominioPorEntidad(usuario);
        repositorioUsuarioJPA.save(entidadUsuario);
    }

    @Override
    public void actualizar(Usuario usuario) {
        EntidadUsuario entidadUsuario = convertirUsuario.convertirDominioPorEntidad(usuario);
        repositorioUsuarioJPA.save(entidadUsuario);
    }

    @Override
    public void eliminar(UUID id) {
        repositorioUsuarioJPA.deleteById(id);
    }

    @Override
    public List<UsuarioDTO> listar() {
        List<EntidadUsuario> listaUsuarioEntidad = repositorioUsuarioJPA.findAll();
        List<UsuarioDTO> listaUsuario = new ArrayList<>();
        return convertirUsuario.convertirListaEntidadUsuarioPorListaCliente(listaUsuarioEntidad, listaUsuario);
    }
}
