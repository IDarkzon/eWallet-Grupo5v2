package com.proyecto.tf.service;

import com.proyecto.tf.entity.Usuario;
import com.proyecto.tf.repository.UsuarioRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class UsuarioServiceImpl implements IUsuarioService {

    private final UsuarioRepository usuarioRepository;

    @Override
    public void save(Usuario usuario) {
        usuarioRepository.save(usuario);
    }

    @Override
    public List<Usuario> get() {
        return usuarioRepository.findAll();
    }

    @Override
    public Usuario getUsuario(Integer id) {
        return usuarioRepository.findById(id).orElseThrow();
    }

    @Override
    public void delete(int id) {
        Usuario usuarioToDelete = usuarioRepository.findById(id).orElseThrow();
        usuarioRepository.delete(usuarioToDelete);
    }
}
