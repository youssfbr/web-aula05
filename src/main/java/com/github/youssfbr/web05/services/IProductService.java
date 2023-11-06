package com.github.youssfbr.web05.services;

import com.github.youssfbr.web05.entities.Category;
import com.github.youssfbr.web05.entities.Product;

import java.util.List;

public interface IProductService {
    List<Product> findAll();
    Product findById(Long id);
}
