package org.example.hexagonal.hexagonal.producto.infraestructura.web.dto;

import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
public class ProductoRequest {
    @NotBlank(message = "Descripcion es mandatoria")
    private String descripcion;

    @NotNull(message = "Precio es mandatorio")
    @DecimalMin(value = "0", inclusive = false, message = "Precio tiene que ser mayor a 0")
    private BigDecimal precio;
}
