package com.bouali.gestiondestock.dto;

import java.util.*;
import com.fasterxml.jackson.annotation.*;

public static class FournisseurDtoBuilder
{
    private Integer id;
    private String nom;
    private String prenom;
    private AdresseDto adresse;
    private String photo;
    private String mail;
    private String numTel;
    private Integer idEntreprise;
    private List<CommandeFournisseurDto> commandeFournisseurs;
    
    FournisseurDtoBuilder() {
    }
    
    public FournisseurDtoBuilder id(final Integer id) {
        this.id = id;
        return this;
    }
    
    public FournisseurDtoBuilder nom(final String nom) {
        this.nom = nom;
        return this;
    }
    
    public FournisseurDtoBuilder prenom(final String prenom) {
        this.prenom = prenom;
        return this;
    }
    
    public FournisseurDtoBuilder adresse(final AdresseDto adresse) {
        this.adresse = adresse;
        return this;
    }
    
    public FournisseurDtoBuilder photo(final String photo) {
        this.photo = photo;
        return this;
    }
    
    public FournisseurDtoBuilder mail(final String mail) {
        this.mail = mail;
        return this;
    }
    
    public FournisseurDtoBuilder numTel(final String numTel) {
        this.numTel = numTel;
        return this;
    }
    
    public FournisseurDtoBuilder idEntreprise(final Integer idEntreprise) {
        this.idEntreprise = idEntreprise;
        return this;
    }
    
    @JsonIgnore
    public FournisseurDtoBuilder commandeFournisseurs(final List<CommandeFournisseurDto> commandeFournisseurs) {
        this.commandeFournisseurs = commandeFournisseurs;
        return this;
    }
    
    public FournisseurDto build() {
        return new FournisseurDto(this.id, this.nom, this.prenom, this.adresse, this.photo, this.mail, this.numTel, this.idEntreprise, this.commandeFournisseurs);
    }
    
    @Override
    public String toString() {
        return invokedynamic(makeConcatWithConstants:(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Lcom/bouali/gestiondestock/dto/AdresseDto;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/util/List;)Ljava/lang/String;, this.id, this.nom, this.prenom, this.adresse, this.photo, this.mail, this.numTel, this.idEntreprise, this.commandeFournisseurs);
    }
}