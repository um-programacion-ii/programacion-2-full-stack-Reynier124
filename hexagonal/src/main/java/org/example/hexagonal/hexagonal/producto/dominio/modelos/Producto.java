package org.example.hexagonal.hexagonal.producto.dominio.modelos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Producto {
    private Long id;
    private String descripcion;
    private BigDecimal precio; //BigDecimal se utiliza en vez de float o double porque es más preciso


}
