package com.bouali.gestiondestock.dto;

import java.time.*;
import com.bouali.gestiondestock.model.*;
import java.util.*;

public static class CommandeClientDtoBuilder
{
    private Integer id;
    private String code;
    private Instant dateCommande;
    private EtatCommande etatCommande;
    private ClientDto client;
    private Integer idEntreprise;
    private List<LigneCommandeClientDto> ligneCommandeClients;
    
    CommandeClientDtoBuilder() {
    }
    
    public CommandeClientDtoBuilder id(final Integer id) {
        this.id = id;
        return this;
    }
    
    public CommandeClientDtoBuilder code(final String code) {
        this.code = code;
        return this;
    }
    
    public CommandeClientDtoBuilder dateCommande(final Instant dateCommande) {
        this.dateCommande = dateCommande;
        return this;
    }
    
    public CommandeClientDtoBuilder etatCommande(final EtatCommande etatCommande) {
        this.etatCommande = etatCommande;
        return this;
    }
    
    public CommandeClientDtoBuilder client(final ClientDto client) {
        this.client = client;
        return this;
    }
    
    public CommandeClientDtoBuilder idEntreprise(final Integer idEntreprise) {
        this.idEntreprise = idEntreprise;
        return this;
    }
    
    public CommandeClientDtoBuilder ligneCommandeClients(final List<LigneCommandeClientDto> ligneCommandeClients) {
        this.ligneCommandeClients = ligneCommandeClients;
        return this;
    }
    
    public CommandeClientDto build() {
        return new CommandeClientDto(this.id, this.code, this.dateCommande, this.etatCommande, this.client, this.idEntreprise, this.ligneCommandeClients);
    }
    
    @Override
    public String toString() {
        return invokedynamic(makeConcatWithConstants:(Ljava/lang/Integer;Ljava/lang/String;Ljava/time/Instant;Lcom/bouali/gestiondestock/model/EtatCommande;Lcom/bouali/gestiondestock/dto/ClientDto;Ljava/lang/Integer;Ljava/util/List;)Ljava/lang/String;, this.id, this.code, this.dateCommande, this.etatCommande, this.client, this.idEntreprise, this.ligneCommandeClients);
    }
}