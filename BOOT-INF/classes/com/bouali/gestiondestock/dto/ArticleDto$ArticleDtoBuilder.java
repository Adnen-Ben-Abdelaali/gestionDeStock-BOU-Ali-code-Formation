package com.bouali.gestiondestock.dto;

import java.math.*;

public static class ArticleDtoBuilder
{
    private Integer id;
    private String codeArticle;
    private String designation;
    private BigDecimal prixUnitaireHt;
    private BigDecimal tauxTva;
    private BigDecimal prixUnitaireTtc;
    private String photo;
    private CategoryDto category;
    private Integer idEntreprise;
    
    ArticleDtoBuilder() {
    }
    
    public ArticleDtoBuilder id(final Integer id) {
        this.id = id;
        return this;
    }
    
    public ArticleDtoBuilder codeArticle(final String codeArticle) {
        this.codeArticle = codeArticle;
        return this;
    }
    
    public ArticleDtoBuilder designation(final String designation) {
        this.designation = designation;
        return this;
    }
    
    public ArticleDtoBuilder prixUnitaireHt(final BigDecimal prixUnitaireHt) {
        this.prixUnitaireHt = prixUnitaireHt;
        return this;
    }
    
    public ArticleDtoBuilder tauxTva(final BigDecimal tauxTva) {
        this.tauxTva = tauxTva;
        return this;
    }
    
    public ArticleDtoBuilder prixUnitaireTtc(final BigDecimal prixUnitaireTtc) {
        this.prixUnitaireTtc = prixUnitaireTtc;
        return this;
    }
    
    public ArticleDtoBuilder photo(final String photo) {
        this.photo = photo;
        return this;
    }
    
    public ArticleDtoBuilder category(final CategoryDto category) {
        this.category = category;
        return this;
    }
    
    public ArticleDtoBuilder idEntreprise(final Integer idEntreprise) {
        this.idEntreprise = idEntreprise;
        return this;
    }
    
    public ArticleDto build() {
        return new ArticleDto(this.id, this.codeArticle, this.designation, this.prixUnitaireHt, this.tauxTva, this.prixUnitaireTtc, this.photo, this.category, this.idEntreprise);
    }
    
    @Override
    public String toString() {
        return invokedynamic(makeConcatWithConstants:(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/String;Lcom/bouali/gestiondestock/dto/CategoryDto;Ljava/lang/Integer;)Ljava/lang/String;, this.id, this.codeArticle, this.designation, this.prixUnitaireHt, this.tauxTva, this.prixUnitaireTtc, this.photo, this.category, this.idEntreprise);
    }
}