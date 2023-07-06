package com.proyecto.tf.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;
import java.time.LocalDate;

@Entity
@Table(name = "evento")
@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
public class Evento implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "id", columnDefinition = "int", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "nombre", length = 30, nullable = false)
    private String nombre;
    @Column(name = "fecha_programada", columnDefinition = "datetime" , nullable = false)
    private LocalDate fechaProgramada;

    @ManyToOne
    @JoinColumn(name = "id_usuario", columnDefinition = "int", nullable = false)
    @JsonIgnoreProperties({"eventos", "correo", "contrasena", "tarjetas"})
    private Usuario usuario;
}
