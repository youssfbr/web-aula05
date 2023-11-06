package com.github.youssfbr.web05.services.impl;

import com.github.youssfbr.web05.entities.Product;
import com.github.youssfbr.web05.repositories.IProductRepository;
import com.github.youssfbr.web05.services.IProductService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ProductService implements IProductService {
    private final IProductRepository productRepository;

    public ProductService(IProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    @Transactional(readOnly = true)
    public List<Product> findAll() {
        return productRepository.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public Product findById(Long id) {
        return productRepository.findById(id).orElseThrow(() -> new RuntimeException("Product NOT FOUND with ID: " + id));
    }
}
