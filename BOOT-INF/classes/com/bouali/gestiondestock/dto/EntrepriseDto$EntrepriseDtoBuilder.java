package com.bouali.gestiondestock.dto;

import java.util.*;
import com.fasterxml.jackson.annotation.*;

public static class EntrepriseDtoBuilder
{
    private Integer id;
    private String nom;
    private String description;
    private AdresseDto adresse;
    private String codeFiscal;
    private String photo;
    private String email;
    private String numTel;
    private String steWeb;
    private List<UtilisateurDto> utilisateurs;
    
    EntrepriseDtoBuilder() {
    }
    
    public EntrepriseDtoBuilder id(final Integer id) {
        this.id = id;
        return this;
    }
    
    public EntrepriseDtoBuilder nom(final String nom) {
        this.nom = nom;
        return this;
    }
    
    public EntrepriseDtoBuilder description(final String description) {
        this.description = description;
        return this;
    }
    
    public EntrepriseDtoBuilder adresse(final AdresseDto adresse) {
        this.adresse = adresse;
        return this;
    }
    
    public EntrepriseDtoBuilder codeFiscal(final String codeFiscal) {
        this.codeFiscal = codeFiscal;
        return this;
    }
    
    public EntrepriseDtoBuilder photo(final String photo) {
        this.photo = photo;
        return this;
    }
    
    public EntrepriseDtoBuilder email(final String email) {
        this.email = email;
        return this;
    }
    
    public EntrepriseDtoBuilder numTel(final String numTel) {
        this.numTel = numTel;
        return this;
    }
    
    public EntrepriseDtoBuilder steWeb(final String steWeb) {
        this.steWeb = steWeb;
        return this;
    }
    
    @JsonIgnore
    public EntrepriseDtoBuilder utilisateurs(final List<UtilisateurDto> utilisateurs) {
        this.utilisateurs = utilisateurs;
        return this;
    }
    
    public EntrepriseDto build() {
        return new EntrepriseDto(this.id, this.nom, this.description, this.adresse, this.codeFiscal, this.photo, this.email, this.numTel, this.steWeb, this.utilisateurs);
    }
    
    @Override
    public String toString() {
        return invokedynamic(makeConcatWithConstants:(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Lcom/bouali/gestiondestock/dto/AdresseDto;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Ljava/lang/String;, this.id, this.nom, this.description, this.adresse, this.codeFiscal, this.photo, this.email, this.numTel, this.steWeb, this.utilisateurs);
    }
}