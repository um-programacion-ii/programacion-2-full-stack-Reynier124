package org.example.hexagonal.hexagonal.producto.dominio.ports.out;

import org.example.hexagonal.hexagonal.producto.dominio.modelos.Producto;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public interface ProductRepository {

    Producto save(Producto producto);
    Optional<Producto> findById(Long id);
    List<Producto> findAll();
    Optional<Producto> update(Long id, Producto producto);
    boolean delete(Long id);
}
