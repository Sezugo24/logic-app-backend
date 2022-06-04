package com.uco.logicapp.dominio.modelo.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.time.LocalDateTime;

@Getter
@AllArgsConstructor
public class DtoUsuario {

    private Integer id;
    private String nombre;
    private String correo;
    private String contraseña;
    //private Progreso progreso;
    private LocalDateTime fechaCreacion;

}
