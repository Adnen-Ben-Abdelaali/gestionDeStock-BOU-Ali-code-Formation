package com.bouali.gestiondestock.model;

import javax.persistence.*;

@Entity
@Table(name = "roles")
public class Roles extends AbstractEntity
{
    @Column(name = "rolename")
    private String roleName;
    @ManyToOne
    @JoinColumn(name = "idutilisateur")
    private Utilisateur utilisateur;
    
    public String getRoleName() {
        return this.roleName;
    }
    
    public Utilisateur getUtilisateur() {
        return this.utilisateur;
    }
    
    public void setRoleName(final String roleName) {
        this.roleName = roleName;
    }
    
    public void setUtilisateur(final Utilisateur utilisateur) {
        this.utilisateur = utilisateur;
    }
    
    @Override
    public String toString() {
        return invokedynamic(makeConcatWithConstants:(Ljava/lang/String;Lcom/bouali/gestiondestock/model/Utilisateur;)Ljava/lang/String;, this.getRoleName(), this.getUtilisateur());
    }
    
    public Roles() {
    }
    
    public Roles(final String roleName, final Utilisateur utilisateur) {
        this.roleName = roleName;
        this.utilisateur = utilisateur;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof Roles)) {
            return false;
        }
        final Roles other = (Roles)o;
        if (!other.canEqual(this)) {
            return false;
        }
        if (!super.equals(o)) {
            return false;
        }
        final Object this$roleName = this.getRoleName();
        final Object other$roleName = other.getRoleName();
        Label_0075: {
            if (this$roleName == null) {
                if (other$roleName == null) {
                    break Label_0075;
                }
            }
            else if (this$roleName.equals(other$roleName)) {
                break Label_0075;
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
    
    @Override
    protected boolean canEqual(final Object other) {
        return other instanceof Roles;
    }
    
    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        final Object $roleName = this.getRoleName();
        result = result * 59 + (($roleName == null) ? 43 : $roleName.hashCode());
        final Object $utilisateur = this.getUtilisateur();
        result = result * 59 + (($utilisateur == null) ? 43 : $utilisateur.hashCode());
        return result;
    }
}