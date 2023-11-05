package com.github.youssfbr.web05.repositories;

import com.github.youssfbr.web05.entities.Product;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
public class ProductRepository {
    private final Map<Long, Product> map = new HashMap<>();
    public List<Product> findAll() {
        return new ArrayList<>(map.values());
    }
    public Product findById(Long id) {
        return map.get(id);
    }
    public void insert(Product product) {
        map.put(product.getId(), product);
    }
}
