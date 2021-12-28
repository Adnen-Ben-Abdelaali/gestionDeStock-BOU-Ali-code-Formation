package com.bouali.gestiondestock.dto;

import com.fasterxml.jackson.annotation.*;
import com.bouali.gestiondestock.model.*;

public class RolesDto
{
    private Integer id;
    private String roleName;
    @JsonIgnore
    private UtilisateurDto utilisateur;
    
    public static RolesDto fromEntity(final Roles roles) {
        if (roles == null) {
            return null;
        }
        return builder().id(roles.getId()).roleName(roles.getRoleName()).build();
    }
    
    public static Roles toEntity(final RolesDto dto) {
        if (dto == null) {
            return null;
        }
        final Roles roles = new Roles();
        roles.setId(dto.getId());
        roles.setRoleName(dto.getRoleName());
        roles.setUtilisateur(UtilisateurDto.toEntity(dto.getUtilisateur()));
        return roles;
    }
    
    RolesDto(final Integer id, final String roleName, final UtilisateurDto utilisateur) {
        this.id = id;
        this.roleName = roleName;
        this.utilisateur = utilisateur;
    }
    
    public static RolesDtoBuilder builder() {
        return new RolesDtoBuilder();
    }
    
    public Integer getId() {
        return this.id;
    }
    
    public String getRoleName() {
        return this.roleName;
    }
    
    public UtilisateurDto getUtilisateur() {
        return this.utilisateur;
    }
    
    public void setId(final Integer id) {
        this.id = id;
    }
    
    public void setRoleName(final String roleName) {
        this.roleName = roleName;
    }
    
    @JsonIgnore
    public void setUtilisateur(final UtilisateurDto utilisateur) {
        this.utilisateur = utilisateur;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof RolesDto)) {
            return false;
        }
        final RolesDto other = (RolesDto)o;
        if (!other.canEqual(this)) {
            return false;
        }
        final Object this$id = this.getId();
        final Object other$id = other.getId();
        Label_0065: {
            if (this$id == null) {
                if (other$id == null) {
                    break Label_0065;
                }
            }
            else if (this$id.equals(other$id)) {
                break Label_0065;
            }
            return false;
        }
        final Object this$roleName = this.getRoleName();
        final Object other$roleName = other.getRoleName();
        Label_0102: {
            if (this$roleName == null) {
                if (other$roleName == null) {
                    break Label_0102;
                }
            }
            else if (this$roleName.equals(other$roleName)) {
                break Label_0102;
            }
            return false;
        }
        final Object this$utilisateur = this.getUtilisateur();
        final Object other$utilisateur = other.getUtilisateur();
        if (this$utilisateur == null) {
            if (other$utilisateur == null) {
                return true;
            }
        }
        else if (this$utilisateur.equals(other$utilisateur)) {
            return true;
        }
        return false;
    }
    
    protected boolean canEqual(final Object other) {
        return other instanceof RolesDto;
    }
    
    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $id = this.getId();
        result = result * 59 + (($id == null) ? 43 : $id.hashCode());
        final Object $roleName = this.getRoleName();
        result = result * 59 + (($roleName == null) ? 43 : $roleName.hashCode());
        final Object $utilisateur = this.getUtilisateur();
        result = result * 59 + (($utilisateur == null) ? 43 : $utilisateur.hashCode());
        return result;
    }
    
    @Override
    public String toString() {
        return invokedynamic(makeConcatWithConstants:(Ljava/lang/Integer;Ljava/lang/String;Lcom/bouali/gestiondestock/dto/UtilisateurDto;)Ljava/lang/String;, this.getId(), this.getRoleName(), this.getUtilisateur());
    }
    
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
}