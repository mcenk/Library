package com.mcenk.library.service;

import com.mcenk.library.model.Category;
import com.mcenk.library.repository.CategoryRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CategoryService {


    private final CategoryRepository categoryRepository;

    public CategoryService(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    protected Category loadCategory(Long id){

        return categoryRepository.findById(id).orElseThrow();

    }
}
