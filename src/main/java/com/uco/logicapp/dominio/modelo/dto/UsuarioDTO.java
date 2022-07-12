package com.uco.logicapp.dominio.modelo.dto;
import com.uco.logicapp.dominio.enums.Rol;
import com.uco.logicapp.dominio.modelo.entidad.Usuario;

import java.time.LocalDateTime;
import java.util.UUID;

public class UsuarioDTO {

    private UUID id;
    private String nombre;
    private String nickName;
    private String correo;
    private String clave;
    private Rol rol;
    private LocalDateTime fechaCreacion;

    public UsuarioDTO(UUID id, String nombre, String nickName, String correo, String clave, Rol rol, LocalDateTime fechaCreacion) {
        this.id = id;
        this.nickName = nickName;
        this.nombre = nombre;
        this.correo = correo;
        this.clave = clave;
        this.rol = rol;
        this.fechaCreacion = fechaCreacion;
    }

    public UsuarioDTO() {
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
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

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public Rol getRol() {
        return rol;
    }

    public void setRol(Rol rol) {
        this.rol = rol;
    }

    public Usuario construir(){
        return new Usuario(this.id, this.nickName, this.nombre, this.correo, this.clave, this.rol, this.fechaCreacion);

    }


}
