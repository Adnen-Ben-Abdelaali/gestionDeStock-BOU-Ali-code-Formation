package com.bouali.gestiondestock.dto;

import java.util.*;
import com.fasterxml.jackson.annotation.*;

public static class ClientDtoBuilder
{
    private Integer id;
    private String nom;
    private String prenom;
    private AdresseDto adresse;
    private String photo;
    private String mail;
    private String numTel;
    private Integer idEntreprise;
    private List<CommandeClientDto> commandeClients;
    
    ClientDtoBuilder() {
    }
    
    public ClientDtoBuilder id(final Integer id) {
        this.id = id;
        return this;
    }
    
    public ClientDtoBuilder nom(final String nom) {
        this.nom = nom;
        return this;
    }
    
    public ClientDtoBuilder prenom(final String prenom) {
        this.prenom = prenom;
        return this;
    }
    
    public ClientDtoBuilder adresse(final AdresseDto adresse) {
        this.adresse = adresse;
        return this;
    }
    
    public ClientDtoBuilder photo(final String photo) {
        this.photo = photo;
        return this;
    }
    
    public ClientDtoBuilder mail(final String mail) {
        this.mail = mail;
        return this;
    }
    
    public ClientDtoBuilder numTel(final String numTel) {
        this.numTel = numTel;
        return this;
    }
    
    public ClientDtoBuilder idEntreprise(final Integer idEntreprise) {
        this.idEntreprise = idEntreprise;
        return this;
    }
    
    @JsonIgnore
    public ClientDtoBuilder commandeClients(final List<CommandeClientDto> commandeClients) {
        this.commandeClients = commandeClients;
        return this;
    }
    
    public ClientDto build() {
        return new ClientDto(this.id, this.nom, this.prenom, this.adresse, this.photo, this.mail, this.numTel, this.idEntreprise, this.commandeClients);
    }
    
    @Override
    public String toString() {
        return invokedynamic(makeConcatWithConstants:(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Lcom/bouali/gestiondestock/dto/AdresseDto;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/util/List;)Ljava/lang/String;, this.id, this.nom, this.prenom, this.adresse, this.photo, this.mail, this.numTel, this.idEntreprise, this.commandeClients);
    }
}