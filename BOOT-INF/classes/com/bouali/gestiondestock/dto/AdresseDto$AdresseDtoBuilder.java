package com.bouali.gestiondestock.dto;

public static class AdresseDtoBuilder
{
    private String adresse1;
    private String adresse2;
    private String ville;
    private String codePostale;
    private String pays;
    
    AdresseDtoBuilder() {
    }
    
    public AdresseDtoBuilder adresse1(final String adresse1) {
        this.adresse1 = adresse1;
        return this;
    }
    
    public AdresseDtoBuilder adresse2(final String adresse2) {
        this.adresse2 = adresse2;
        return this;
    }
    
    public AdresseDtoBuilder ville(final String ville) {
        this.ville = ville;
        return this;
    }
    
    public AdresseDtoBuilder codePostale(final String codePostale) {
        this.codePostale = codePostale;
        return this;
    }
    
    public AdresseDtoBuilder pays(final String pays) {
        this.pays = pays;
        return this;
    }
    
    public AdresseDto build() {
        return new AdresseDto(this.adresse1, this.adresse2, this.ville, this.codePostale, this.pays);
    }
    
    @Override
    public String toString() {
        return invokedynamic(makeConcatWithConstants:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;, this.adresse1, this.adresse2, this.ville, this.codePostale, this.pays);
    }
}