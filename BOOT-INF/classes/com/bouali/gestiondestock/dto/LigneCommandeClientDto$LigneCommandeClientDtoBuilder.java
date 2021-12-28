package com.bouali.gestiondestock.dto;

import java.math.*;
import com.fasterxml.jackson.annotation.*;

public static class LigneCommandeClientDtoBuilder
{
    private Integer id;
    private ArticleDto article;
    private CommandeClientDto commandeClient;
    private BigDecimal quantite;
    private BigDecimal prixUnitaire;
    private Integer idEntreprise;
    
    LigneCommandeClientDtoBuilder() {
    }
    
    public LigneCommandeClientDtoBuilder id(final Integer id) {
        this.id = id;
        return this;
    }
    
    public LigneCommandeClientDtoBuilder article(final ArticleDto article) {
        this.article = article;
        return this;
    }
    
    @JsonIgnore
    public LigneCommandeClientDtoBuilder commandeClient(final CommandeClientDto commandeClient) {
        this.commandeClient = commandeClient;
        return this;
    }
    
    public LigneCommandeClientDtoBuilder quantite(final BigDecimal quantite) {
        this.quantite = quantite;
        return this;
    }
    
    public LigneCommandeClientDtoBuilder prixUnitaire(final BigDecimal prixUnitaire) {
        this.prixUnitaire = prixUnitaire;
        return this;
    }
    
    public LigneCommandeClientDtoBuilder idEntreprise(final Integer idEntreprise) {
        this.idEntreprise = idEntreprise;
        return this;
    }
    
    public LigneCommandeClientDto build() {
        return new LigneCommandeClientDto(this.id, this.article, this.commandeClient, this.quantite, this.prixUnitaire, this.idEntreprise);
    }
    
    @Override
    public String toString() {
        return invokedynamic(makeConcatWithConstants:(Ljava/lang/Integer;Lcom/bouali/gestiondestock/dto/ArticleDto;Lcom/bouali/gestiondestock/dto/CommandeClientDto;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/Integer;)Ljava/lang/String;, this.id, this.article, this.commandeClient, this.quantite, this.prixUnitaire, this.idEntreprise);
    }
}