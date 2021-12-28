package com.bouali.gestiondestock.dto;

import java.time.*;
import java.util.*;

public static class UtilisateurDtoBuilder
{
    private Integer id;
    private String nom;
    private String prenom;
    private String email;
    private Instant dateDeNaissance;
    private String moteDePasse;
    private AdresseDto adresse;
    private String photo;
    private EntrepriseDto entreprise;
    private List<RolesDto> roles;
    
    UtilisateurDtoBuilder() {
    }
    
    public UtilisateurDtoBuilder id(final Integer id) {
        this.id = id;
        return this;
    }
    
    public UtilisateurDtoBuilder nom(final String nom) {
        this.nom = nom;
        return this;
    }
    
    public UtilisateurDtoBuilder prenom(final String prenom) {
        this.prenom = prenom;
        return this;
    }
    
    public UtilisateurDtoBuilder email(final String email) {
        this.email = email;
        return this;
    }
    
    public UtilisateurDtoBuilder dateDeNaissance(final Instant dateDeNaissance) {
        this.dateDeNaissance = dateDeNaissance;
        return this;
    }
    
    public UtilisateurDtoBuilder moteDePasse(final String moteDePasse) {
        this.moteDePasse = moteDePasse;
        return this;
    }
    
    public UtilisateurDtoBuilder adresse(final AdresseDto adresse) {
        this.adresse = adresse;
        return this;
    }
    
    public UtilisateurDtoBuilder photo(final String photo) {
        this.photo = photo;
        return this;
    }
    
    public UtilisateurDtoBuilder entreprise(final EntrepriseDto entreprise) {
        this.entreprise = entreprise;
        return this;
    }
    
    public UtilisateurDtoBuilder roles(final List<RolesDto> roles) {
        this.roles = roles;
        return this;
    }
    
    public UtilisateurDto build() {
        return new UtilisateurDto(this.id, this.nom, this.prenom, this.email, this.dateDeNaissance, this.moteDePasse, this.adresse, this.photo, this.entreprise, this.roles);
    }
    
    @Override
    public String toString() {
        return invokedynamic(makeConcatWithConstants:(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/time/Instant;Ljava/lang/String;Lcom/bouali/gestiondestock/dto/AdresseDto;Ljava/lang/String;Lcom/bouali/gestiondestock/dto/EntrepriseDto;Ljava/util/List;)Ljava/lang/String;, this.id, this.nom, this.prenom, this.email, this.dateDeNaissance, this.moteDePasse, this.adresse, this.photo, this.entreprise, this.roles);
    }
}