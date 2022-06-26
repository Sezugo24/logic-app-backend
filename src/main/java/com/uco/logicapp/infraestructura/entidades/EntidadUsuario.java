package com.uco.logicapp.infraestructura.entidades;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;

@Getter
@Setter
@Entity
@Table(name = "usuario")
public class EntidadUsuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "correo")
    private String correo;

    @Column(name = "contrasena")
    private String contraseña;

    @Column(name = "fecha_creacion")
    private LocalDateTime fechaCreacion;

    public EntidadUsuario(Integer id, String nombre, String correo, String contraseña, LocalDateTime fechaCreacion) {
        this.id = id;
        this.nombre = nombre;
        this.correo = correo;
        this.contraseña = contraseña;
        this.fechaCreacion = fechaCreacion;
    }

    public EntidadUsuario(){

    }
}
