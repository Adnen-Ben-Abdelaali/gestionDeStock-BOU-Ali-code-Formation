package com.bouali.gestiondestock.dto;

import com.fasterxml.jackson.annotation.*;

public static class RolesDtoBuilder
{
    private Integer id;
    private String roleName;
    private UtilisateurDto utilisateur;
    
    RolesDtoBuilder() {
    }
    
    public RolesDtoBuilder id(final Integer id) {
        this.id = id;
        return this;
    }
    
    public RolesDtoBuilder roleName(final String roleName) {
        this.roleName = roleName;
        return this;
    }
    
    @JsonIgnore
    public RolesDtoBuilder utilisateur(final UtilisateurDto utilisateur) {
        this.utilisateur = utilisateur;
        return this;
    }
    
    public RolesDto build() {
        return new RolesDto(this.id, this.roleName, this.utilisateur);
    }
    
    @Override
    public String toString() {
        return invokedynamic(makeConcatWithConstants:(Ljava/lang/Integer;Ljava/lang/String;Lcom/bouali/gestiondestock/dto/UtilisateurDto;)Ljava/lang/String;, this.id, this.roleName, this.utilisateur);
    }
}