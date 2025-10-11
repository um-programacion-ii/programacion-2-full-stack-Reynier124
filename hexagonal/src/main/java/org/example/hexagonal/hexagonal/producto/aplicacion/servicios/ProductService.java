package org.example.hexagonal.hexagonal.producto.aplicacion.servicios;

import lombok.RequiredArgsConstructor;
import org.example.hexagonal.hexagonal.producto.dominio.modelos.Producto;
import org.example.hexagonal.hexagonal.producto.dominio.ports.in.CreateProductUseCase;
import org.example.hexagonal.hexagonal.producto.dominio.ports.in.GetAllProductUseCase;
import org.example.hexagonal.hexagonal.producto.dominio.ports.out.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductService implements GetAllProductUseCase, CreateProductUseCase {

    private final ProductRepository productRepository;


    @Override
    public Producto createProduct(Producto producto) {
        return productRepository.save(producto);
    }

    @Override
    public List<Producto> getAllProducts() {
        return productRepository.findAll();
    }
}
