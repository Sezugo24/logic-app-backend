package com.uco.logicapp.infraestructura.configuracion;

import com.uco.logicapp.dominio.puerto.repositorio.RepositorioUsuario;
import com.uco.logicapp.dominio.servicio.ServicioActualizarUsuario;
import com.uco.logicapp.dominio.servicio.ServicioCrearUsuario;
import com.uco.logicapp.dominio.servicio.ServicioEliminarUsuario;
import com.uco.logicapp.dominio.servicio.ServicioListarUsuario;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanServicioUsuario {

    @Bean
    public ServicioCrearUsuario servicioCrearUsuario(RepositorioUsuario repositorioUsuario){
        return new ServicioCrearUsuario(repositorioUsuario);
    }

    @Bean
    public ServicioActualizarUsuario servicioActualizarUsuario(RepositorioUsuario repositorioUsuario){
        return new ServicioActualizarUsuario(repositorioUsuario);
    }

    @Bean
    public ServicioListarUsuario servicioListarUsuario(RepositorioUsuario repositorioUsuario){
        return new ServicioListarUsuario(repositorioUsuario);
    }

    @Bean
    public ServicioEliminarUsuario servicioEliminarUsuario(RepositorioUsuario repositorioUsuario){
        return new ServicioEliminarUsuario(repositorioUsuario);
    }

}
