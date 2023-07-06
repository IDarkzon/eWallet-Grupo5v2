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
import java.util.List;

@Entity
@Table(name = "tarjeta")
@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
public class Tarjeta implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "id", columnDefinition = "int", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "numero", length = 16, nullable = false)
    private String numero;
    @Column(name = "saldo", columnDefinition = "decimal(10,2)", nullable = false)
    private int saldo;
    @Column(name = "fecha_vencimiento", columnDefinition = "date", nullable = false)
    private LocalDate fechaVencimiento;
    @Column(name = "tipo", columnDefinition = "char(1)", nullable = false)
    private byte tipo;
    @Column(name = "proveedor", columnDefinition = "char(1)", nullable = false)
    private byte proveedor;

    @ManyToOne
    @JoinColumn(name = "id_usuario", columnDefinition = "int", nullable = false)
    @JsonIgnoreProperties({"tarjetas", "correo", "contrasena", "eventos"})
    private Usuario usuario;

    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "id_tarjeta")
    private List<Movimiento> movimientos;
}
