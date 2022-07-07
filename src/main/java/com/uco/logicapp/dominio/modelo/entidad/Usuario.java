package com.uco.logicapp.dominio.modelo.entidad;

import com.uco.logicapp.dominio.validar.ValidarParametro;

import java.time.LocalDateTime;

public class Usuario {

    private static final String SE_DEBE_INGRESAR_EL_NOMBRE_DE_USUARIO = "Se debe ingresar el nombre del usuario";
    private static final String SE_DEBE_INGRESAR_EL_CORREO_ELECTRONICO_DE_UN_USUARIO = "Se debe ingresar la dirección de correo electronico de un usuario";
    private static final String SE_DEBE_INGRESAR_LA_CONTRASEÑA_DE_USUARIO = "Se debe ingresar la respectiva password del usuario";
    private static final String SE_DEBE_TENER_EN_CUENTA_UNA_LONGITUD_MAYOR_A = "Se debe tener en cuenta una longitud mayor a: %s";
    private static final int LONGITUD_MINIMA_CLAVE = 6;

    private Integer id;
    private String nombre;
    private String correo;
    private String clave;
    private LocalDateTime fechaCreacion;

    public Usuario(Integer id, String nombre, String correo, String clave, LocalDateTime fechaCreacion) {

        ValidarParametro.validarObligatorio(nombre, SE_DEBE_INGRESAR_EL_NOMBRE_DE_USUARIO);
        ValidarParametro.validarObligatorio(correo, SE_DEBE_INGRESAR_EL_CORREO_ELECTRONICO_DE_UN_USUARIO);
        ValidarParametro.validarObligatorio(clave, SE_DEBE_INGRESAR_LA_CONTRASEÑA_DE_USUARIO);

        this.id = id;
        this.nombre = nombre;
        this.correo = correo;
        this.clave = clave;
        this.fechaCreacion = fechaCreacion;
    }

    public Usuario(){

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
}
