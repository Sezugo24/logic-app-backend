package com.uco.logicapp.aplicacion.comando;

import lombok.Getter;

import java.time.LocalDateTime;
@Getter
public class ComandoUsuario {
    private Integer id;
    private String nombre;
    private String correo;
    private String contraseña;
    //private Progreso progreso;
    private LocalDateTime fechaCreacion;

    public ComandoUsuario(Integer id, String nombre, String correo, String contraseña) {
        this.id = id;
        this.nombre = nombre;
        this.correo = correo;
        this.contraseña = contraseña;
        this.fechaCreacion = fechaActual();
    }

    public LocalDateTime fechaActual(){
        LocalDateTime fecha = LocalDateTime.now();
        return fecha;
    }

}
