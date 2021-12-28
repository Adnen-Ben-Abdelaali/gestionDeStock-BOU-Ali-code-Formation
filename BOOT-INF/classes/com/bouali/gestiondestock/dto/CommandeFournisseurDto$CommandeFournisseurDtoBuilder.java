package com.bouali.gestiondestock.dto;

import java.time.*;
import com.bouali.gestiondestock.model.*;
import java.util.*;

public static class CommandeFournisseurDtoBuilder
{
    private Integer id;
    private String code;
    private Instant dateCommande;
    private EtatCommande etatCommande;
    private FournisseurDto fournisseur;
    private Integer idEntreprise;
    private List<LigneCommandeFournisseurDto> ligneCommandeFournisseurs;
    
    CommandeFournisseurDtoBuilder() {
    }
    
    public CommandeFournisseurDtoBuilder id(final Integer id) {
        this.id = id;
        return this;
    }
    
    public CommandeFournisseurDtoBuilder code(final String code) {
        this.code = code;
        return this;
    }
    
    public CommandeFournisseurDtoBuilder dateCommande(final Instant dateCommande) {
        this.dateCommande = dateCommande;
        return this;
    }
    
    public CommandeFournisseurDtoBuilder etatCommande(final EtatCommande etatCommande) {
        this.etatCommande = etatCommande;
        return this;
    }
    
    public CommandeFournisseurDtoBuilder fournisseur(final FournisseurDto fournisseur) {
        this.fournisseur = fournisseur;
        return this;
    }
    
    public CommandeFournisseurDtoBuilder idEntreprise(final Integer idEntreprise) {
        this.idEntreprise = idEntreprise;
        return this;
    }
    
    public CommandeFournisseurDtoBuilder ligneCommandeFournisseurs(final List<LigneCommandeFournisseurDto> ligneCommandeFournisseurs) {
        this.ligneCommandeFournisseurs = ligneCommandeFournisseurs;
        return this;
    }
    
    public CommandeFournisseurDto build() {
        return new CommandeFournisseurDto(this.id, this.code, this.dateCommande, this.etatCommande, this.fournisseur, this.idEntreprise, this.ligneCommandeFournisseurs);
    }
    
    @Override
    public String toString() {
        return invokedynamic(makeConcatWithConstants:(Ljava/lang/Integer;Ljava/lang/String;Ljava/time/Instant;Lcom/bouali/gestiondestock/model/EtatCommande;Lcom/bouali/gestiondestock/dto/FournisseurDto;Ljava/lang/Integer;Ljava/util/List;)Ljava/lang/String;, this.id, this.code, this.dateCommande, this.etatCommande, this.fournisseur, this.idEntreprise, this.ligneCommandeFournisseurs);
    }
}