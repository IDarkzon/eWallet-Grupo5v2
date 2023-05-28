package com.proyecto.tf.resources;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "evento")
public class Evento {
    @Id
    @Column(name = "id", columnDefinition = "int", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "nombre", length = 30, nullable = false)
    private String nombre;
    @Column(name = "fecha_programada", columnDefinition = "datetime" , nullable = false)
    private Date fechaProgramada;
    @Column(name = "id_usuario", columnDefinition = "int", nullable = false)
    private int id_usuario;
}
