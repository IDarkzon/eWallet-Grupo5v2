package com.proyecto.tf.service;

import com.proyecto.tf.entity.Usuario;

import java.util.List;

public interface IUsuarioService {

    public void save(Usuario usuario);
    public List<Usuario> get();
    public Usuario getUsuario(Integer id);
    public void delete(int id);
}
