package com.proyecto.tf.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "movimiento")
public class Movimiento {
    @Id
    @Column(name = "id", columnDefinition = "int", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "monto", columnDefinition = "decimal(10,2)", nullable = false)
    private double monto;
    @Column(name = "fecha_movimiento", columnDefinition = "datetime", nullable = false)
    private Date fechaMovimiento;
    @Column(name = "tipo", columnDefinition = "char(1)", nullable = false)
    private byte tipo;
    @Column(name = "id_tarjeta", columnDefinition = "int", nullable = false)
    private int id_tarjeta;
}
