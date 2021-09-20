package com.uco.logicapp.dominio.validar;

import com.uco.logicapp.dominio.excepcion.ExcepcionValorObligatorio;

public class ValidarParametro {

    public ValidarParametro(){
    }
    public static void validarObligatorio(Object valor, String mensaje){
        if(valor == null ) {
            throw new ExcepcionValorObligatorio(mensaje);
        }
    }



}
