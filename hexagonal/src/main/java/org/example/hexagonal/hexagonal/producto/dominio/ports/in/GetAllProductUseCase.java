package org.example.hexagonal.hexagonal.producto.dominio.ports.in;

import org.example.hexagonal.hexagonal.producto.dominio.modelos.Producto;

import java.util.List;

public interface GetAllProductUseCase {
    List<Producto> getAllProducts();
}
