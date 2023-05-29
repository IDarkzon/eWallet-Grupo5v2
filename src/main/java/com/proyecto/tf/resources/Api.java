package com.proyecto.tf.resources;

import com.proyecto.tf.repositories.UsuarioRepository;
import com.proyecto.tf.resources.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/usuarios")
public class Api {
    @Autowired
    private UsuarioRepository usuarioRepository;

    @GetMapping("/info")
    public List<Usuario> get() {
        return usuarioRepository.findAll();
    }
}
