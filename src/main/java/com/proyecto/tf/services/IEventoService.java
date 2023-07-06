package com.proyecto.tf.services;

import com.proyecto.tf.entity.Evento;

import java.util.List;

public interface IEventoService {

    public void save(Evento evento);
    public List<Evento> get();
    public void delete(int id);
}
