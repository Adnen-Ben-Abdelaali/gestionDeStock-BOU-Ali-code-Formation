package com.bouali.gestiondestock.dto;

import java.time.*;
import java.math.*;
import com.bouali.gestiondestock.model.*;

public static class MvtStkDtoBuilder
{
    private Integer id;
    private Instant dateMvt;
    private BigDecimal quantite;
    private ArticleDto article;
    private TypeMvtStk typeMvt;
    private SourceMvtStk sourceMvt;
    private Integer idEntreprise;
    
    MvtStkDtoBuilder() {
    }
    
    public MvtStkDtoBuilder id(final Integer id) {
        this.id = id;
        return this;
    }
    
    public MvtStkDtoBuilder dateMvt(final Instant dateMvt) {
        this.dateMvt = dateMvt;
        return this;
    }
    
    public MvtStkDtoBuilder quantite(final BigDecimal quantite) {
        this.quantite = quantite;
        return this;
    }
    
    public MvtStkDtoBuilder article(final ArticleDto article) {
        this.article = article;
        return this;
    }
    
    public MvtStkDtoBuilder typeMvt(final TypeMvtStk typeMvt) {
        this.typeMvt = typeMvt;
        return this;
    }
    
    public MvtStkDtoBuilder sourceMvt(final SourceMvtStk sourceMvt) {
        this.sourceMvt = sourceMvt;
        return this;
    }
    
    public MvtStkDtoBuilder idEntreprise(final Integer idEntreprise) {
        this.idEntreprise = idEntreprise;
        return this;
    }
    
    public MvtStkDto build() {
        return new MvtStkDto(this.id, this.dateMvt, this.quantite, this.article, this.typeMvt, this.sourceMvt, this.idEntreprise);
    }
    
    @Override
    public String toString() {
        return invokedynamic(makeConcatWithConstants:(Ljava/lang/Integer;Ljava/time/Instant;Ljava/math/BigDecimal;Lcom/bouali/gestiondestock/dto/ArticleDto;Lcom/bouali/gestiondestock/model/TypeMvtStk;Lcom/bouali/gestiondestock/model/SourceMvtStk;Ljava/lang/Integer;)Ljava/lang/String;, this.id, this.dateMvt, this.quantite, this.article, this.typeMvt, this.sourceMvt, this.idEntreprise);
    }
}