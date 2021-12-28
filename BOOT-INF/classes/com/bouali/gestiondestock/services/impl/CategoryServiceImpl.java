package com.bouali.gestiondestock.services.impl;

import com.bouali.gestiondestock.services.*;
import org.springframework.stereotype.*;
import com.bouali.gestiondestock.repository.*;
import org.springframework.beans.factory.annotation.*;
import com.bouali.gestiondestock.dto.*;
import com.bouali.gestiondestock.validator.*;
import java.util.*;
import java.util.function.*;
import org.springframework.util.*;
import java.util.stream.*;
import com.bouali.gestiondestock.exception.*;
import com.bouali.gestiondestock.model.*;
import org.slf4j.*;

@Service
public class CategoryServiceImpl implements CategoryService
{
    private static final Logger log;
    private CategoryRepository categoryRepository;
    private ArticleRepository articleRepository;
    
    @Autowired
    public CategoryServiceImpl(final CategoryRepository categoryRepository, final ArticleRepository articleRepository) {
        this.categoryRepository = categoryRepository;
        this.articleRepository = articleRepository;
    }
    
    public CategoryDto save(final CategoryDto dto) {
        final List<String> errors = (List<String>)CategoryValidator.validate(dto);
        if (!errors.isEmpty()) {
            CategoryServiceImpl.log.error("Article is not valid {}", (Object)dto);
            throw new InvalidEntityException("La category n'est pas valide", ErrorCodes.CATEGORY_NOT_VALID, errors);
        }
        return CategoryDto.fromEntity((Category)this.categoryRepository.save((Object)CategoryDto.toEntity(dto)));
    }
    
    public CategoryDto findById(final Integer id) {
        if (id == null) {
            CategoryServiceImpl.log.error("Category ID is null");
            return null;
        }
        return this.categoryRepository.findById((Object)id).map(CategoryDto::fromEntity).orElseThrow(() -> new EntityNotFoundException(invokedynamic(makeConcatWithConstants:(Ljava/lang/Integer;)Ljava/lang/String;, id), ErrorCodes.CATEGORY_NOT_FOUND));
    }
    
    public CategoryDto findByCode(final String code) {
        if (!StringUtils.hasLength(code)) {
            CategoryServiceImpl.log.error("Category CODE is null");
            return null;
        }
        return this.categoryRepository.findCategoryByCode(code).map((Function<? super Category, ? extends CategoryDto>)CategoryDto::fromEntity).orElseThrow(() -> new EntityNotFoundException(invokedynamic(makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;, code), ErrorCodes.CATEGORY_NOT_FOUND));
    }
    
    public List<CategoryDto> findAll() {
        return (List<CategoryDto>)this.categoryRepository.findAll().stream().map(CategoryDto::fromEntity).collect(Collectors.toList());
    }
    
    public void delete(final Integer id) {
        if (id == null) {
            CategoryServiceImpl.log.error("Category ID is null");
            return;
        }
        final List<Article> articles = this.articleRepository.findAllByCategoryId(id);
        if (!articles.isEmpty()) {
            throw new InvalidOperationException("Impossible de supprimer cette categorie qui est deja utilise", ErrorCodes.CATEGORY_ALREADY_IN_USE);
        }
        this.categoryRepository.deleteById((Object)id);
    }
    
    static {
        log = LoggerFactory.getLogger((Class)CategoryServiceImpl.class);
    }
}