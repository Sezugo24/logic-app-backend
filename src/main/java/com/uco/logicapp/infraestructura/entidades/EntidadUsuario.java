package com.uco.logicapp.infraestructura.entidades;

import com.uco.logicapp.dominio.enums.Rol;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(name = "usuario")
public class EntidadUsuario {

    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(
            name = "UUID",
            strategy = "org.hibernate.id.UUIDGenerator",
            parameters = {
                    @org.hibernate.annotations.Parameter(
                            name = "uuid_gen_strategy_class",
                            value = "org.hibernate.id.uuid.CustomVersionOneStrategy"
                    )
            }
    )
    @Column(name = "id")
    private UUID id;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "nick_name")
    private String nickName;

    @Column(name = "correo")
    private String correo;

    @Column(name = "clave")
    private String clave;

    @Column(name = "rol")
    private Rol rol;

    @Column(name = "fecha_creacion")
    private LocalDateTime fechaCreacion;

    public EntidadUsuario(UUID id, String nombre, String nickName, String correo, String clave, Rol rol, LocalDateTime fechaCreacion) {
        this.id = id;
        this.nombre = nombre;
        this.nickName = nickName;
        this.correo = correo;
        this.clave = clave;
        this.rol = rol;
        this.fechaCreacion = fechaCreacion;
    }

    public EntidadUsuario(){

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

    public void setFechaCreacion(LocalDateTime fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }
}
