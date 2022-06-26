package com.uco.logicapp.dominio.modelo.dto;
import com.uco.logicapp.dominio.modelo.entidad.Usuario;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
public class UsuarioDTO {

    private Integer id;
    private String nombre;
    private String correo;
    private String password;
    private LocalDateTime fechaCreacion;

    public Usuario construir(){
        return new Usuario(this.id, this.nombre, this.correo, this.password);
    }

}
