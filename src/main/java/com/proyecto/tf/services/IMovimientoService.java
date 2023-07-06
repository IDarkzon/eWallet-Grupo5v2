package com.proyecto.tf.services;

import com.proyecto.tf.entity.Movimiento;

import java.util.List;

public interface IMovimientoService {

    public void save(Movimiento movimiento);
    public List<Movimiento> get();
    public void delete(int id);
}
