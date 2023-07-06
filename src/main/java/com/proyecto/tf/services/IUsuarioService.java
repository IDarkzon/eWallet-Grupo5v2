package com.proyecto.tf.services;

import com.proyecto.tf.entity.Usuario;

import java.util.List;

public interface IUsuarioService {

    public void save(Usuario usuario);
    public List<Usuario> get();
    public void delete(int id);
}
