package com.proyecto.tf.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;
import java.time.LocalDate;

@Entity
@Table(name = "movimiento")
@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
public class Movimiento implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "id", columnDefinition = "int", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "monto", columnDefinition = "decimal(10,2)", nullable = false)
    private double monto;
    @Column(name = "fecha_movimiento", columnDefinition = "datetime", nullable = false)
    private LocalDate fechaMovimiento;
    @Column(name = "tipo", columnDefinition = "char(1)", nullable = false)
    private byte tipo;

    @ManyToOne
    @JoinColumn(name = "id_tarjeta", columnDefinition = "int", nullable = false)
    @JsonIgnoreProperties({"movimientos", "saldo", "fechaVencimiento", "tipo", "proveedor", "usuario"})
    private Tarjeta tarjeta;
}
