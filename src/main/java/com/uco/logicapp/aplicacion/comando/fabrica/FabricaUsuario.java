package com.uco.logicapp.aplicacion.comando.fabrica;

import com.uco.logicapp.aplicacion.comando.ComandoUsuario;
import com.uco.logicapp.dominio.modelo.entidad.Usuario;
import org.springframework.stereotype.Component;

@Component
public class FabricaUsuario {
    public Usuario crear(ComandoUsuario comandoUsuario){
        return new Usuario(comandoUsuario.getId(), comandoUsuario.getNombre(), comandoUsuario.getNickName(), comandoUsuario.getCorreo(),comandoUsuario.getClave(), comandoUsuario.getRol(), comandoUsuario.getFechaCreacion());
    }
}
