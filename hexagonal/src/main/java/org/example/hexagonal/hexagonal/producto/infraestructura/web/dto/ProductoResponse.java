package org.example.hexagonal.hexagonal.producto.infraestructura.web.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
public class ProductoResponse {

    private Long id;
    private String descripcion;
    private BigDecimal precio;
}
