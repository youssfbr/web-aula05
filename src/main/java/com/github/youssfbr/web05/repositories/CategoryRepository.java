package com.github.youssfbr.web05.repositories;

import com.github.youssfbr.web05.entities.Category;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
public class CategoryRepository {
    private final Map<Long, Category> map = new HashMap<>();
    public List<Category> findAll() {
        return new ArrayList<>(map.values());
    }
    public Category findById(Long id) {
        return map.get(id);
    }
    public void insert(Category category) {
        map.put(category.getId(), category);
    }
}
