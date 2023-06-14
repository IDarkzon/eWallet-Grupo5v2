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
@Table(name = "tarjeta")
public class Tarjeta {
    @Id
    @Column(name = "id", columnDefinition = "int", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "numero", length = 16, nullable = false)
    private String numero;
    @Column(name = "saldo", columnDefinition = "decimal(10,2)", nullable = false)
    private int saldo;
    @Column(name = "fecha_vencimiento", columnDefinition = "date", nullable = false)
    private Date fechaVencimiento;
    @Column(name = "tipo", columnDefinition = "char(1)", nullable = false)
    private byte tipo;
    @Column(name = "proveedor", columnDefinition = "char(1)", nullable = false)
    private byte proveedor;
    @Column(name = "id_usuario", columnDefinition = "int", nullable = false)
    private int id_usuario;
}
