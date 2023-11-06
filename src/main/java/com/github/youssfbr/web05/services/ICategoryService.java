package com.github.youssfbr.web05.services;

import com.github.youssfbr.web05.entities.Category;

import java.util.List;

public interface ICategoryService {
    List<Category> findAll();
    Category findById(Long id);
}
