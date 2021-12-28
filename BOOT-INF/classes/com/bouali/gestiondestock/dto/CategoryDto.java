package com.bouali.gestiondestock.dto;

import java.util.*;
import com.fasterxml.jackson.annotation.*;
import com.bouali.gestiondestock.model.*;

public class CategoryDto
{
    private Integer id;
    private String code;
    private String designation;
    private Integer idEntreprise;
    @JsonIgnore
    private List<ArticleDto> articles;
    
    public static CategoryDto fromEntity(final Category category) {
        if (category == null) {
            return null;
        }
        return builder().id(category.getId()).code(category.getCode()).designation(category.getDesignation()).idEntreprise(category.getIdEntreprise()).build();
    }
    
    public static Category toEntity(final CategoryDto categoryDto) {
        if (categoryDto == null) {
            return null;
        }
        final Category category = new Category();
        category.setId(categoryDto.getId());
        category.setCode(categoryDto.getCode());
        category.setDesignation(categoryDto.getDesignation());
        category.setIdEntreprise(categoryDto.getIdEntreprise());
        return category;
    }
    
    CategoryDto(final Integer id, final String code, final String designation, final Integer idEntreprise, final List<ArticleDto> articles) {
        this.id = id;
        this.code = code;
        this.designation = designation;
        this.idEntreprise = idEntreprise;
        this.articles = articles;
    }
    
    public static CategoryDtoBuilder builder() {
        return new CategoryDtoBuilder();
    }
    
    public Integer getId() {
        return this.id;
    }
    
    public String getCode() {
        return this.code;
    }
    
    public String getDesignation() {
        return this.designation;
    }
    
    public Integer getIdEntreprise() {
        return this.idEntreprise;
    }
    
    public List<ArticleDto> getArticles() {
        return this.articles;
    }
    
    public void setId(final Integer id) {
        this.id = id;
    }
    
    public void setCode(final String code) {
        this.code = code;
    }
    
    public void setDesignation(final String designation) {
        this.designation = designation;
    }
    
    public void setIdEntreprise(final Integer idEntreprise) {
        this.idEntreprise = idEntreprise;
    }
    
    @JsonIgnore
    public void setArticles(final List<ArticleDto> articles) {
        this.articles = articles;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof CategoryDto)) {
            return false;
        }
        final CategoryDto other = (CategoryDto)o;
        if (!other.canEqual(this)) {
            return false;
        }
        final Object this$id = this.getId();
        final Object other$id = other.getId();
        Label_0065: {
            if (this$id == null) {
                if (other$id == null) {
                    break Label_0065;
                }
            }
            else if (this$id.equals(other$id)) {
                break Label_0065;
            }
            return false;
        }
        final Object this$idEntreprise = this.getIdEntreprise();
        final Object other$idEntreprise = other.getIdEntreprise();
        Label_0102: {
            if (this$idEntreprise == null) {
                if (other$idEntreprise == null) {
                    break Label_0102;
                }
            }
            else if (this$idEntreprise.equals(other$idEntreprise)) {
                break Label_0102;
            }
            return false;
        }
        final Object this$code = this.getCode();
        final Object other$code = other.getCode();
        Label_0139: {
            if (this$code == null) {
                if (other$code == null) {
                    break Label_0139;
                }
            }
            else if (this$code.equals(other$code)) {
                break Label_0139;
            }
            return false;
        }
        final Object this$designation = this.getDesignation();
        final Object other$designation = other.getDesignation();
        Label_0176: {
            if (this$designation == null) {
                if (other$designation == null) {
                    break Label_0176;
                }
            }
            else if (this$designation.equals(other$designation)) {
                break Label_0176;
            }
            return false;
        }
        final Object this$articles = this.getArticles();
        final Object other$articles = other.getArticles();
        if (this$articles == null) {
            if (other$articles == null) {
                return true;
            }
        }
        else if (this$articles.equals(other$articles)) {
            return true;
        }
        return false;
    }
    
    protected boolean canEqual(final Object other) {
        return other instanceof CategoryDto;
    }
    
    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $id = this.getId();
        result = result * 59 + (($id == null) ? 43 : $id.hashCode());
        final Object $idEntreprise = this.getIdEntreprise();
        result = result * 59 + (($idEntreprise == null) ? 43 : $idEntreprise.hashCode());
        final Object $code = this.getCode();
        result = result * 59 + (($code == null) ? 43 : $code.hashCode());
        final Object $designation = this.getDesignation();
        result = result * 59 + (($designation == null) ? 43 : $designation.hashCode());
        final Object $articles = this.getArticles();
        result = result * 59 + (($articles == null) ? 43 : $articles.hashCode());
        return result;
    }
    
    @Override
    public String toString() {
        return invokedynamic(makeConcatWithConstants:(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/util/List;)Ljava/lang/String;, this.getId(), this.getCode(), this.getDesignation(), this.getIdEntreprise(), this.getArticles());
    }
    
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
}