package com.bouali.gestiondestock.services;

import com.bouali.gestiondestock.dto.*;
import java.util.*;

public interface CategoryService
{
    CategoryDto save(final CategoryDto dto);
    
    CategoryDto findById(final Integer id);
    
    CategoryDto findByCode(final String code);
    
    List<CategoryDto> findAll();
    
    void delete(final Integer id);
}