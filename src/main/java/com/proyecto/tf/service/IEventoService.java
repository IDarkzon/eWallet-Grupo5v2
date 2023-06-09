package com.proyecto.tf.service;

import com.proyecto.tf.entity.Evento;

import java.util.List;

public interface IEventoService {

    public void save(Evento evento);
    public List<Evento> get();
    public Evento getEvento(Integer id);
    public void delete(int id);
}
