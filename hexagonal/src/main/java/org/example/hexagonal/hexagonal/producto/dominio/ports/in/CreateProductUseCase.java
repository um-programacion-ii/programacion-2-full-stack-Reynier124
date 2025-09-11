package org.example.hexagonal.hexagonal.producto.dominio.ports.in;

import org.example.hexagonal.hexagonal.producto.dominio.modelos.Producto;

public interface CreateProductUseCase {
    Producto createProduct(Producto producto);

}
