package com.uco.logicapp.dominio.modelo.dto;
import com.uco.logicapp.dominio.modelo.entidad.Usuario;

import java.time.LocalDateTime;

public class UsuarioDTO {

    private Integer id;
    private String nombre;
    private String correo;
    private String clave;
    private LocalDateTime fechaCreacion;

    public UsuarioDTO(Integer id, String nombre, String correo, String clave, LocalDateTime fechaCreacion) {
        this.id = id;
        this.nombre = nombre;
        this.correo = correo;
        this.clave = clave;
        this.fechaCreacion = fechaCreacion;
    }

    public UsuarioDTO() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public LocalDateTime getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(LocalDateTime fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public Usuario construir(){
        return new Usuario(this.id, this.nombre, this.correo, this.clave, this.fechaCreacion);

    }


}
