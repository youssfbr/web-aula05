package com.github.youssfbr.web05.controllers;

import com.github.youssfbr.web05.entities.Category;
import com.github.youssfbr.web05.repositories.CategoryRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/categories-mem")
public class CategoryMemController {
    private final CategoryRepository categoryRepository;

    public CategoryMemController(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    @GetMapping
    public ResponseEntity<List<Category>> getCategories() {
        return ResponseEntity.ok(categoryRepository.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Category> getCategoryById(@PathVariable long id) {
        return ResponseEntity.ok(categoryRepository.findById(id));
    }
    @PostMapping
    public ResponseEntity<Void> insert(@RequestBody Category category) {
        categoryRepository.insert(category);
        return ResponseEntity.ok().build();
    }
}
