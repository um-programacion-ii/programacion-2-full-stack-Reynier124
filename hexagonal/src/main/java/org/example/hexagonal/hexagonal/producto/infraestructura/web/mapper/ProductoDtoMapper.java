package org.example.hexagonal.hexagonal.producto.infraestructura.web.mapper;

import org.example.hexagonal.hexagonal.producto.dominio.modelos.Producto;
import org.example.hexagonal.hexagonal.producto.infraestructura.web.dto.ProductoRequest;
import org.example.hexagonal.hexagonal.producto.infraestructura.web.dto.ProductoResponse;
import org.springframework.stereotype.Component;

@Component
public class ProductoDtoMapper {
    public Producto toDomain(ProductoRequest productoRequest) {
        if (productoRequest == null) {
            return null;
        }

        return new Producto(null, productoRequest.getDescripcion(), productoRequest.getPrecio());
    }

    public ProductoResponse toResponse(Producto producto) {
        if (producto == null) {
            return null;
        }
        return new ProductoResponse(producto.getId(), producto.getDescripcion(), producto.getPrecio());
    }
}
