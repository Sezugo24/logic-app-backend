package com.uco.logicapp.infraestructura.controlador;

import com.uco.logicapp.aplicacion.comando.ComandoUsuario;
import com.uco.logicapp.aplicacion.comando.manejador.usuario.ManejadorActualizarUsuario;
import com.uco.logicapp.aplicacion.comando.manejador.usuario.ManejadorCrearUsuario;
import com.uco.logicapp.aplicacion.comando.manejador.usuario.ManejadorEliminarUsuario;
import com.uco.logicapp.aplicacion.consulta.ManejadorListarUsuario;
import com.uco.logicapp.dominio.modelo.dto.UsuarioDTO;
import com.uco.logicapp.dominio.modelo.entidad.Usuario;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/usuario")
public class ControladorUsuario {
    private final ManejadorCrearUsuario manejadorCrearUsuario;
    private final ManejadorActualizarUsuario manejadorActualizarUsuario;
    private final ManejadorEliminarUsuario manejadorEliminarUsuario;
    private final ManejadorListarUsuario manejadorListarUsuario;

    public ControladorUsuario(ManejadorCrearUsuario manejadorCrearUsuario, ManejadorActualizarUsuario manejadorActualizarUsuario, ManejadorEliminarUsuario manejadorEliminarUsuario, ManejadorListarUsuario manejadorListarUsuario) {
        this.manejadorCrearUsuario = manejadorCrearUsuario;
        this.manejadorActualizarUsuario = manejadorActualizarUsuario;
        this.manejadorEliminarUsuario = manejadorEliminarUsuario;
        this.manejadorListarUsuario = manejadorListarUsuario;
    }

    @PostMapping
    public void crearUsuario(@RequestBody ComandoUsuario comandoUsuario){
        this.manejadorCrearUsuario.ejecutar(comandoUsuario);
    }

    @GetMapping
    public List<UsuarioDTO> listarUsuario(){
        return this.manejadorListarUsuario.ejecutar();
    }

    @PutMapping
    public void actualizarUsuario(@RequestBody ComandoUsuario comandoUsuario){
        this.manejadorActualizarUsuario.ejecutar(comandoUsuario);
    }

    @DeleteMapping
    public void eliminarUsuario(@PathVariable Integer id){
        this.manejadorEliminarUsuario.ejecutar(id);
    }
}
