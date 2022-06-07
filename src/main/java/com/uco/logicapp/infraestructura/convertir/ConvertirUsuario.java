package com.uco.logicapp.infraestructura.convertir;

import com.uco.logicapp.dominio.modelo.dto.UsuarioDTO;
import com.uco.logicapp.dominio.modelo.entidad.Usuario;
import com.uco.logicapp.infraestructura.entidades.EntidadUsuario;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ConvertirUsuario {

    private ModelMapper modelMapper = new ModelMapper();

    public EntidadUsuario convertirDominioPorEntidad(Usuario usuario){
        return modelMapper.map(usuario, EntidadUsuario.class);
    }

    public UsuarioDTO convertirEntidadUsuarioPorDominio(EntidadUsuario entidadUsuario){
        return modelMapper.map(entidadUsuario, UsuarioDTO.class);
    }

    public List<UsuarioDTO> convertirListaEntidadUsuarioPorListaCliente(List<EntidadUsuario> listaEntidadUsuario, List<UsuarioDTO> listaUsuario){
        for(EntidadUsuario entidadUsuario: listaEntidadUsuario){
            UsuarioDTO usuario = modelMapper.map(entidadUsuario, UsuarioDTO.class);
            listaUsuario.add(usuario);
        }
        return listaUsuario;
    }

}
