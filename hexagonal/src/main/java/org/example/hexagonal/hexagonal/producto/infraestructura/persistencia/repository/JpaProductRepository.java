package org.example.hexagonal.hexagonal.producto.infraestructura.persistencia.repository;

import org.example.hexagonal.hexagonal.producto.infraestructura.persistencia.entity.ProductoEntidad;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JpaProductRepository extends JpaRepository<ProductoEntidad, Long> {
}
