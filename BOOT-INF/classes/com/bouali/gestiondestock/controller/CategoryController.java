package com.bouali.gestiondestock.controller;

import com.bouali.gestiondestock.controller.api.*;
import org.springframework.web.bind.annotation.*;
import com.bouali.gestiondestock.services.*;
import org.springframework.beans.factory.annotation.*;
import com.bouali.gestiondestock.dto.*;
import java.util.*;

@RestController
public class CategoryController implements CategoryApi
{
    private CategoryService categoryService;
    
    @Autowired
    public CategoryController(final CategoryService categoryService) {
        this.categoryService = categoryService;
    }
    
    @Override
    public CategoryDto save(final CategoryDto dto) {
        return this.categoryService.save(dto);
    }
    
    @Override
    public CategoryDto findById(final Integer idCategory) {
        return this.categoryService.findById(idCategory);
    }
    
    @Override
    public CategoryDto findByCode(final String codeCategory) {
        return this.categoryService.findByCode(codeCategory);
    }
    
    @Override
    public List<CategoryDto> findAll() {
        return (List<CategoryDto>)this.categoryService.findAll();
    }
    
    @Override
    public void delete(final Integer id) {
        this.categoryService.delete(id);
    }
}