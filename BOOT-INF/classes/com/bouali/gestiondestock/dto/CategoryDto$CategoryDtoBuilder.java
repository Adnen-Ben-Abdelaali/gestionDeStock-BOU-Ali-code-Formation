package com.bouali.gestiondestock.dto;

import java.util.*;
import com.fasterxml.jackson.annotation.*;

public static class CategoryDtoBuilder
{
    private Integer id;
    private String code;
    private String designation;
    private Integer idEntreprise;
    private List<ArticleDto> articles;
    
    CategoryDtoBuilder() {
    }
    
    public CategoryDtoBuilder id(final Integer id) {
        this.id = id;
        return this;
    }
    
    public CategoryDtoBuilder code(final String code) {
        this.code = code;
        return this;
    }
    
    public CategoryDtoBuilder designation(final String designation) {
        this.designation = designation;
        return this;
    }
    
    public CategoryDtoBuilder idEntreprise(final Integer idEntreprise) {
        this.idEntreprise = idEntreprise;
        return this;
    }
    
    @JsonIgnore
    public CategoryDtoBuilder articles(final List<ArticleDto> articles) {
        this.articles = articles;
        return this;
    }
    
    public CategoryDto build() {
        return new CategoryDto(this.id, this.code, this.designation, this.idEntreprise, this.articles);
    }
    
    @Override
    public String toString() {
        return invokedynamic(makeConcatWithConstants:(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/util/List;)Ljava/lang/String;, this.id, this.code, this.designation, this.idEntreprise, this.articles);
    }
}