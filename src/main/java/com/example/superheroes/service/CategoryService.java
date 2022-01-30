package com.example.superheroes.service;

import com.example.superheroes.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class CategoryService {

    private CategoryRepository categoryRepository;

    @Autowired
    public void setCategoryRepository(CategoryRepository categoryRepository){
        this.categoryRepository = categoryRepository;
    }
}
