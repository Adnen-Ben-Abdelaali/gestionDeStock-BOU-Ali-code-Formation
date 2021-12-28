package com.bouali.gestiondestock.dto;

public static class ChangerMotDePasseUtilisateurDtoBuilder
{
    private Integer id;
    private String motDePasse;
    private String confirmMotDePasse;
    
    ChangerMotDePasseUtilisateurDtoBuilder() {
    }
    
    public ChangerMotDePasseUtilisateurDtoBuilder id(final Integer id) {
        this.id = id;
        return this;
    }
    
    public ChangerMotDePasseUtilisateurDtoBuilder motDePasse(final String motDePasse) {
        this.motDePasse = motDePasse;
        return this;
    }
    
    public ChangerMotDePasseUtilisateurDtoBuilder confirmMotDePasse(final String confirmMotDePasse) {
        this.confirmMotDePasse = confirmMotDePasse;
        return this;
    }
    
    public ChangerMotDePasseUtilisateurDto build() {
        return new ChangerMotDePasseUtilisateurDto(this.id, this.motDePasse, this.confirmMotDePasse);
    }
    
    @Override
    public String toString() {
        return invokedynamic(makeConcatWithConstants:(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;, this.id, this.motDePasse, this.confirmMotDePasse);
    }
}