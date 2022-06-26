package com.uco.logicapp.aplicacion.comando;

import lombok.Getter;

import java.time.LocalDateTime;

@Getter
public class ComandoUsuario {
    private Integer id;
    private String nombre;
    private String correo;
    private String password;
    //private Progreso progreso;
    private LocalDateTime fechaCreacion;

    public ComandoUsuario(Integer id, String nombre, String correo, String password) {
        this.id = id;
        this.nombre = nombre;
        this.correo = correo;
        this.password = password;
        this.fechaCreacion = fechaActual();
    }

    public LocalDateTime fechaActual(){
        LocalDateTime fecha = LocalDateTime.now();
        return fecha;
    }

    public Integer getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public String getPassword() {
        return password;
    }

    public LocalDateTime getFechaCreacion() {
        return fechaCreacion;
    }
}
