package org.example.hexagonal.hexagonal.producto.infraestructura.persistencia.mapper;

import org.example.hexagonal.hexagonal.producto.dominio.modelos.Producto;
import org.example.hexagonal.hexagonal.producto.infraestructura.persistencia.entity.ProductoEntidad;
import org.springframework.stereotype.Component;

@Component
public class ProductoMapper {

    public ProductoEntidad toEntidad(Producto producto) {
        if (producto == null) {
            return null;
        }
        return new ProductoEntidad(producto.getId(), producto.getDescripcion(), producto.getPrecio());
    }
    public Producto toDomain(ProductoEntidad productoEntidad) {
        if (productoEntidad == null) {
            return null;
        }
        return new Producto(productoEntidad.getId(), productoEntidad.getDescripcion(), productoEntidad.getPrecio());
    }
}
