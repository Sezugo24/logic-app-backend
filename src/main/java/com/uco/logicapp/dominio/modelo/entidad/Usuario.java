package com.uco.logicapp.dominio.modelo.entidad;

import com.uco.logicapp.dominio.enums.Rol;
import com.uco.logicapp.dominio.validar.ValidarParametro;

import java.time.LocalDateTime;
import java.util.UUID;

public class Usuario {

    private static final String SE_DEBE_INGRESAR_EL_NOMBRE_DE_USUARIO = "ERROR DE INFORMACION NULA EN CAMPO REQUERIDO: Se debe ingresar el nombre del usuario";
    private static final String SE_DEBE_INGRESAR_EL_CORREO_ELECTRONICO_DE_UN_USUARIO = "ERROR DE INFORMACION NULA EN CAMPO REQUERIDO: Se debe ingresar la dirección de correo electronico de un usuario";
    private static final String SE_DEBE_INGRESAR_LA_CONTRASEÑA_DE_USUARIO = "ERROR DE INFORMACION NULA EN CAMPO REQUERIDO: Se debe ingresar la respectiva password del usuario";
    private static final String SE_DEBE_TENER_EN_CUENTA_UNA_LONGITUD_MAYOR_A = "ERROR DE INFORMACION NULA EN CAMPO REQUERIDO: Se debe tener en cuenta una longitud mayor a: %s";
    private static final int LONGITUD_MINIMA_CLAVE = 6;

    private UUID id;
    private String nombre;
    private String nickName;
    private String correo;
    private String clave;
    private Rol rol;
    private LocalDateTime fechaCreacion;

    public Usuario(UUID id, String nombre, String nickName, String correo, String clave, Rol rol, LocalDateTime fechaCreacion) {

        ValidarParametro.validarObligatorio(nombre, SE_DEBE_INGRESAR_EL_NOMBRE_DE_USUARIO);
        ValidarParametro.validarObligatorio(correo, SE_DEBE_INGRESAR_EL_CORREO_ELECTRONICO_DE_UN_USUARIO);
        ValidarParametro.validarObligatorio(clave, SE_DEBE_INGRESAR_LA_CONTRASEÑA_DE_USUARIO);

        this.id = id;
        this.nombre = nombre;
        this.nickName = nickName;
        this.correo = correo;
        this.clave = clave;
        this.rol = rol;
        this.fechaCreacion = fechaCreacion;
    }

    public Usuario(){

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
