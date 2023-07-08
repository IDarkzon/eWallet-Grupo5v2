package com.proyecto.tf.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "usuario")
@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
public class Usuario implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "id", columnDefinition = "int", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "nombre", length = 50, nullable = false)
    private String nombre;
    @Column(name = "apellido", length = 50, nullable = false)
    private String apellido;
    @Column(name = "correo", length = 50, nullable = false)
    private String correo;
    @Column(name = "contrasena", length = 50, nullable = false)
    private String contrasena;

    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "usuario")
    @JsonIgnoreProperties({"usuario", "movimientos", "saldo", "fechaVencimiento", "tipo", "proveedor"})
    private List<Tarjeta> tarjetas;

    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "usuario")
    @JsonIgnoreProperties({"usuario", "fechaProgramada"})
    private List<Evento> eventos;
}