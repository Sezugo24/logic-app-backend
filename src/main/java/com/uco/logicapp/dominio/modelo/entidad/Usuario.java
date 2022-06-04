 package com.uco.logicapp.dominio.modelo.entidad;

import com.uco.logicapp.dominio.validar.ValidarParametro;
import lombok.Getter;

import java.time.LocalDateTime;

@Getter
public class Usuario {

    private static final String SE_DEBE_INGRESAR_EL_NOMBRE_DE_USUARIO = "Se debe ingresar el nombre del usuario";
    private static final String SE_DEBE_INGRESAR_EL_CORREO_ELECTRONICO_DE_UN_USUARIO = "Se debe ingresar la dirección de correo electronico de un usuario";
    private static final String SE_DEBE_INGRESAR_LA_CONTRASEÑA_DE_USUARIO = "Se debe ingresar la respectiva contraseña del usuario";
    private static final String SE_DEBE_TENER_EN_CUENTA_UNA_LONGITUD_MAYOR_A = "Se debe tener en cuenta una longitud mayor a: %s";
    private static final int LONGITUD_MINIMA_CLAVE = 6;

    private Integer id;
    private String nombre;
    private String correo;
    private String contraseña;
    //private Progreso progreso;
    private LocalDateTime fechaCreacion;

    public Usuario(Integer id, String nombre, String correo, String contraseña) {

        ValidarParametro.validarObligatorio(nombre, SE_DEBE_INGRESAR_EL_NOMBRE_DE_USUARIO);
        ValidarParametro.validarObligatorio(correo, SE_DEBE_INGRESAR_EL_CORREO_ELECTRONICO_DE_UN_USUARIO);
        ValidarParametro.validarObligatorio(contraseña, SE_DEBE_INGRESAR_LA_CONTRASEÑA_DE_USUARIO);

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
