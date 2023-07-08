package com.proyecto.tf.service;

import com.proyecto.tf.entity.Evento;
import com.proyecto.tf.repository.EventoRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class EventoServiceImpl implements IEventoService {

    private final EventoRepository eventoRepository;

    @Override
    public void save(Evento evento) {
        eventoRepository.save(evento);
    }

    @Override
    public List<Evento> get() {
        return eventoRepository.findAll();
    }

    @Override
    public Evento getEvento(Integer id) {
        return eventoRepository.findById(id).orElseThrow();
    }

    @Override
    public void delete(int id) {
        Evento eventoToDelete = eventoRepository.findById(id).orElseThrow();
        eventoRepository.delete(eventoToDelete);
    }
}
