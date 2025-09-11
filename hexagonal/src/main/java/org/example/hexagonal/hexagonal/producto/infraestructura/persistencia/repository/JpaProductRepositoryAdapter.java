package org.example.hexagonal.hexagonal.producto.infraestructura.persistencia.repository;

import lombok.RequiredArgsConstructor;
import org.example.hexagonal.hexagonal.producto.dominio.modelos.Producto;
import org.example.hexagonal.hexagonal.producto.dominio.ports.out.ProductRepository;
import org.example.hexagonal.hexagonal.producto.infraestructura.persistencia.entity.ProductoEntidad;
import org.example.hexagonal.hexagonal.producto.infraestructura.persistencia.mapper.ProductoMapper;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
@RequiredArgsConstructor
public class JpaProductRepositoryAdapter implements ProductRepository {

    private final JpaProductRepository jpaProductRepository;
    private final ProductoMapper productoMapper;

    @Override
    public Producto save(Producto producto) {
        ProductoEntidad productoEntidad = productoMapper.toEntidad(producto);
        ProductoEntidad savedProducto = jpaProductRepository.save(productoEntidad);
        return productoMapper.toDomain(savedProducto);
    }

    @Override
    public Optional<Producto> findById(Long id) {
        return Optional.empty();
    }

    @Override
    public List<Producto> findAll() {
        return jpaProductRepository.findAll()
                .stream()
                .map(productoMapper::toDomain)
                .toList();
    }

    @Override
    public Optional<Producto> update(Long id, Producto producto) {
        return Optional.empty();
    }

    @Override
    public boolean delete(Long id) {
        return false;
    }
}
