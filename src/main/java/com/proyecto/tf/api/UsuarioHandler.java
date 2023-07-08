package com.proyecto.tf.api;

import com.proyecto.tf.entity.Usuario;
import com.proyecto.tf.service.IUsuarioService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping("/{id}")
    public Usuario getUsuario(@PathVariable("id") Integer id) {
        return usuarioService.getUsuario(id);
    }

    @PostMapping("/add")
    public void add(@RequestBody Usuario usuario){
        usuarioService.save(usuario);
    }

    @PutMapping("/update")
    public void update(@RequestBody Usuario usuario){
        usuarioService.save(usuario);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable("id") Integer id) {
        usuarioService.delete(id);
    }
}
