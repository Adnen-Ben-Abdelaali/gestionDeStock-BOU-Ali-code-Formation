package com.bouali.gestiondestock.dto;

import java.time.*;
import java.util.*;

public static class VentesDtoBuilder
{
    private Integer id;
    private String code;
    private Instant dateVente;
    private String commentaire;
    private List<LigneVenteDto> ligneVentes;
    private Integer idEntreprise;
    
    VentesDtoBuilder() {
    }
    
    public VentesDtoBuilder id(final Integer id) {
        this.id = id;
        return this;
    }
    
    public VentesDtoBuilder code(final String code) {
        this.code = code;
        return this;
    }
    
    public VentesDtoBuilder dateVente(final Instant dateVente) {
        this.dateVente = dateVente;
        return this;
    }
    
    public VentesDtoBuilder commentaire(final String commentaire) {
        this.commentaire = commentaire;
        return this;
    }
    
    public VentesDtoBuilder ligneVentes(final List<LigneVenteDto> ligneVentes) {
        this.ligneVentes = ligneVentes;
        return this;
    }
    
    public VentesDtoBuilder idEntreprise(final Integer idEntreprise) {
        this.idEntreprise = idEntreprise;
        return this;
    }
    
    public VentesDto build() {
        return new VentesDto(this.id, this.code, this.dateVente, this.commentaire, this.ligneVentes, this.idEntreprise);
    }
    
    @Override
    public String toString() {
        return invokedynamic(makeConcatWithConstants:(Ljava/lang/Integer;Ljava/lang/String;Ljava/time/Instant;Ljava/lang/String;Ljava/util/List;Ljava/lang/Integer;)Ljava/lang/String;, this.id, this.code, this.dateVente, this.commentaire, this.ligneVentes, this.idEntreprise);
    }
}