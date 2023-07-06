package com.proyecto.tf.api;

import com.proyecto.tf.entity.Usuario;
import com.proyecto.tf.services.IUsuarioService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/usuarios")
@AllArgsConstructor
public class UsuarioHandler {

    private final IUsuarioService usuarioService;

    @GetMapping({"/", ""})
    public ResponseEntity<List<Usuario>> get(){
        return ResponseEntity.ok().body(usuarioService.get());
    }


}
