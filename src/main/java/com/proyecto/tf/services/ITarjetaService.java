package com.proyecto.tf.services;

import com.proyecto.tf.entity.Tarjeta;
import com.proyecto.tf.entity.Usuario;

import java.util.List;

public interface ITarjetaService {

    public void save(Tarjeta tarjeta);
    public List<Tarjeta> get();
    public void delete(int id);
}
