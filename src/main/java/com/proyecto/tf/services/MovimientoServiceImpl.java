package com.proyecto.tf.services;

import com.proyecto.tf.entity.Movimiento;
import com.proyecto.tf.repositories.MovimientoRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class MovimientoServiceImpl implements IMovimientoService {

    private final MovimientoRepository movimientoRepository;

    @Override
    public void save(Movimiento movimiento) {
        movimientoRepository.save(movimiento);
    }

    @Override
    public List<Movimiento> get() {
        return movimientoRepository.findAll();
    }

    @Override
    public void delete(int id) {
        Movimiento movimientoToDelete = movimientoRepository.findById(id).orElseThrow();
        movimientoRepository.delete(movimientoToDelete);
    }
}
