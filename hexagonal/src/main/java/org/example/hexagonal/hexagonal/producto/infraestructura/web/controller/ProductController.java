package org.example.hexagonal.hexagonal.producto.infraestructura.web.controller;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.example.hexagonal.hexagonal.producto.dominio.modelos.Producto;
import org.example.hexagonal.hexagonal.producto.dominio.ports.in.CreateProductUseCase;
import org.example.hexagonal.hexagonal.producto.dominio.ports.in.GetAllProductUseCase;
import org.example.hexagonal.hexagonal.producto.infraestructura.web.dto.ProductoRequest;
import org.example.hexagonal.hexagonal.producto.infraestructura.web.dto.ProductoResponse;
import org.example.hexagonal.hexagonal.producto.infraestructura.web.mapper.ProductoDtoMapper;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/products")
@RequiredArgsConstructor
public class ProductController {

    private final CreateProductUseCase createProductUseCase;
    private final ProductoDtoMapper productoDtoMapper;
    private final GetAllProductUseCase getAllProductUseCase;

    @GetMapping("/test")
    public ResponseEntity<String> test() {
        return ResponseEntity.ok("Hello World");
    }

    @PostMapping
    public ResponseEntity<ProductoResponse> createProduct(@Valid @RequestBody ProductoRequest producto) {
        Producto product = productoDtoMapper.toDomain(producto);
        Producto createdProduct = createProductUseCase.createProduct(product);
        return new ResponseEntity<>(productoDtoMapper.toResponse(createdProduct), HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<ProductoResponse>> getAllProducts() {
        List <ProductoResponse> productoResponses = getAllProductUseCase.getAllProducts()
                .stream()
                .map(productoDtoMapper::toResponse)
                .toList();
        return new ResponseEntity<>(productoResponses, HttpStatus.OK);
    }
}
