package com.github.youssfbr.web05.repositories;

import com.github.youssfbr.web05.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IProductRepository extends JpaRepository<Product, Long> { }
