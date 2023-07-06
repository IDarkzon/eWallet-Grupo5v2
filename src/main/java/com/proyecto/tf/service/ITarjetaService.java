package com.proyecto.tf.service;

import com.proyecto.tf.entity.Tarjeta;

import java.util.List;

public interface ITarjetaService {

    public void save(Tarjeta tarjeta);
    public List<Tarjeta> get();
    public void delete(int id);
}
