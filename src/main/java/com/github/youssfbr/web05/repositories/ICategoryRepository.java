package com.github.youssfbr.web05.repositories;

import com.github.youssfbr.web05.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ICategoryRepository extends JpaRepository<Category, Long> { }
