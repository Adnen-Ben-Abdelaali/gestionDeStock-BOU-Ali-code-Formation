package com.bouali.gestiondestock.dto;

import java.math.*;

public static class LigneVenteDtoBuilder
{
    private Integer id;
    private VentesDto vente;
    private ArticleDto article;
    private BigDecimal quantite;
    private BigDecimal prixUnitaire;
    private Integer idEntreprise;
    
    LigneVenteDtoBuilder() {
    }
    
    public LigneVenteDtoBuilder id(final Integer id) {
        this.id = id;
        return this;
    }
    
    public LigneVenteDtoBuilder vente(final VentesDto vente) {
        this.vente = vente;
        return this;
    }
    
    public LigneVenteDtoBuilder article(final ArticleDto article) {
        this.article = article;
        return this;
    }
    
    public LigneVenteDtoBuilder quantite(final BigDecimal quantite) {
        this.quantite = quantite;
        return this;
    }
    
    public LigneVenteDtoBuilder prixUnitaire(final BigDecimal prixUnitaire) {
        this.prixUnitaire = prixUnitaire;
        return this;
    }
    
    public LigneVenteDtoBuilder idEntreprise(final Integer idEntreprise) {
        this.idEntreprise = idEntreprise;
        return this;
    }
    
    public LigneVenteDto build() {
        return new LigneVenteDto(this.id, this.vente, this.article, this.quantite, this.prixUnitaire, this.idEntreprise);
    }
    
    @Override
    public String toString() {
        return invokedynamic(makeConcatWithConstants:(Ljava/lang/Integer;Lcom/bouali/gestiondestock/dto/VentesDto;Lcom/bouali/gestiondestock/dto/ArticleDto;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/Integer;)Ljava/lang/String;, this.id, this.vente, this.article, this.quantite, this.prixUnitaire, this.idEntreprise);
    }
}