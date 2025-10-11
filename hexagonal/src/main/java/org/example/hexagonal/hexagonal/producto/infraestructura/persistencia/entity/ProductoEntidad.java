package org.example.hexagonal.hexagonal.producto.infraestructura.persistencia.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Entity
@Table(name = "Productos")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductoEntidad {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String descripcion;
    private BigDecimal precio;
}
