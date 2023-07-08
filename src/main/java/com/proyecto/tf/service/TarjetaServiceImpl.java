package com.proyecto.tf.service;

import com.proyecto.tf.entity.Tarjeta;
import com.proyecto.tf.repository.TarjetaRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class TarjetaServiceImpl implements ITarjetaService {

    private final TarjetaRepository tarjetaRepository;

    @Override
    public void save(Tarjeta tarjeta) {
        tarjetaRepository.save(tarjeta);
    }

    @Override
    public List<Tarjeta> get() {
        return tarjetaRepository.findAll();
    }

    @Override
    public Tarjeta getTarjeta(Integer id) {
        return tarjetaRepository.findById(id).orElseThrow();
    }

    @Override
    public void delete(int id) {
        Tarjeta tarjetaToDelete = tarjetaRepository.findById(id).orElseThrow();
        tarjetaRepository.delete(tarjetaToDelete);
    }
}
