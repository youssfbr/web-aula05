package com.github.youssfbr.web05.controllers;

import com.github.youssfbr.web05.entities.Product;
import com.github.youssfbr.web05.repositories.ProductRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products-mem")
public class ProductMemController {
    private final ProductRepository productRepository;

    public ProductMemController(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @GetMapping
    public ResponseEntity<List<Product>> getProducts() {
        return ResponseEntity.ok(productRepository.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Product> getProductById(@PathVariable long id) {
        return ResponseEntity.ok(productRepository.findById(id));
    }
    @PostMapping
    public ResponseEntity<Void> insert(@RequestBody Product product) {
        productRepository.insert(product);
        return ResponseEntity.ok().build();
    }
}
