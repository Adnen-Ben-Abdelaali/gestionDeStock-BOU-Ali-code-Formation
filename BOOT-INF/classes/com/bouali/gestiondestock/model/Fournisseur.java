package com.bouali.gestiondestock.model;

import java.util.*;
import javax.persistence.*;

@Entity
@Table(name = "fournisseur")
public class Fournisseur extends AbstractEntity
{
    @Column(name = "nom")
    private String nom;
    @Column(name = "prenom")
    private String prenom;
    @Embedded
    private Adresse adresse;
    @Column(name = "photo")
    private String photo;
    @Column(name = "mail")
    private String mail;
    @Column(name = "numTel")
    private String numTel;
    @Column(name = "identreprise")
    private Integer idEntreprise;
    @OneToMany(mappedBy = "fournisseur")
    private List<CommandeFournisseur> commandeFournisseurs;
    
    public String getNom() {
        return this.nom;
    }
    
    public String getPrenom() {
        return this.prenom;
    }
    
    public Adresse getAdresse() {
        return this.adresse;
    }
    
    public String getPhoto() {
        return this.photo;
    }
    
    public String getMail() {
        return this.mail;
    }
    
    public String getNumTel() {
        return this.numTel;
    }
    
    public Integer getIdEntreprise() {
        return this.idEntreprise;
    }
    
    public List<CommandeFournisseur> getCommandeFournisseurs() {
        return this.commandeFournisseurs;
    }
    
    public void setNom(final String nom) {
        this.nom = nom;
    }
    
    public void setPrenom(final String prenom) {
        this.prenom = prenom;
    }
    
    public void setAdresse(final Adresse adresse) {
        this.adresse = adresse;
    }
    
    public void setPhoto(final String photo) {
        this.photo = photo;
    }
    
    public void setMail(final String mail) {
        this.mail = mail;
    }
    
    public void setNumTel(final String numTel) {
        this.numTel = numTel;
    }
    
    public void setIdEntreprise(final Integer idEntreprise) {
        this.idEntreprise = idEntreprise;
    }
    
    public void setCommandeFournisseurs(final List<CommandeFournisseur> commandeFournisseurs) {
        this.commandeFournisseurs = commandeFournisseurs;
    }
    
    @Override
    public String toString() {
        return invokedynamic(makeConcatWithConstants:(Ljava/lang/String;Ljava/lang/String;Lcom/bouali/gestiondestock/model/Adresse;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/util/List;)Ljava/lang/String;, this.getNom(), this.getPrenom(), this.getAdresse(), this.getPhoto(), this.getMail(), this.getNumTel(), this.getIdEntreprise(), this.getCommandeFournisseurs());
    }
    
    public Fournisseur() {
    }
    
    public Fournisseur(final String nom, final String prenom, final Adresse adresse, final String photo, final String mail, final String numTel, final Integer idEntreprise, final List<CommandeFournisseur> commandeFournisseurs) {
        this.nom = nom;
        this.prenom = prenom;
        this.adresse = adresse;
        this.photo = photo;
        this.mail = mail;
        this.numTel = numTel;
        this.idEntreprise = idEntreprise;
        this.commandeFournisseurs = commandeFournisseurs;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof Fournisseur)) {
            return false;
        }
        final Fournisseur other = (Fournisseur)o;
        if (!other.canEqual(this)) {
            return false;
        }
        if (!super.equals(o)) {
            return false;
        }
        final Object this$idEntreprise = this.getIdEntreprise();
        final Object other$idEntreprise = other.getIdEntreprise();
        Label_0075: {
            if (this$idEntreprise == null) {
                if (other$idEntreprise == null) {
                    break Label_0075;
                }
            }
            else if (this$idEntreprise.equals(other$idEntreprise)) {
                break Label_0075;
            }
            return false;
        }
        final Object this$nom = this.getNom();
        final Object other$nom = other.getNom();
        Label_0112: {
            if (this$nom == null) {
                if (other$nom == null) {
                    break Label_0112;
                }
            }
            else if (this$nom.equals(other$nom)) {
                break Label_0112;
            }
            return false;
        }
        final Object this$prenom = this.getPrenom();
        final Object other$prenom = other.getPrenom();
        Label_0149: {
            if (this$prenom == null) {
                if (other$prenom == null) {
                    break Label_0149;
                }
            }
            else if (this$prenom.equals(other$prenom)) {
                break Label_0149;
            }
            return false;
        }
        final Object this$adresse = this.getAdresse();
        final Object other$adresse = other.getAdresse();
        Label_0186: {
            if (this$adresse == null) {
                if (other$adresse == null) {
                    break Label_0186;
                }
            }
            else if (this$adresse.equals(other$adresse)) {
                break Label_0186;
            }
            return false;
        }
        final Object this$photo = this.getPhoto();
        final Object other$photo = other.getPhoto();
        Label_0223: {
            if (this$photo == null) {
                if (other$photo == null) {
                    break Label_0223;
                }
            }
            else if (this$photo.equals(other$photo)) {
                break Label_0223;
            }
            return false;
        }
        final Object this$mail = this.getMail();
        final Object other$mail = other.getMail();
        Label_0260: {
            if (this$mail == null) {
                if (other$mail == null) {
                    break Label_0260;
                }
            }
            else if (this$mail.equals(other$mail)) {
                break Label_0260;
            }
            return false;
        }
        final Object this$numTel = this.getNumTel();
        final Object other$numTel = other.getNumTel();
        Label_0297: {
            if (this$numTel == null) {
                if (other$numTel == null) {
                    break Label_0297;
                }
            }
            else if (this$numTel.equals(other$numTel)) {
                break Label_0297;
            }
            return false;
        }
        final Object this$commandeFournisseurs = this.getCommandeFournisseurs();
        final Object other$commandeFournisseurs = other.getCommandeFournisseurs();
        if (this$commandeFournisseurs == null) {
            if (other$commandeFournisseurs == null) {
                return true;
            }
        }
        else if (this$commandeFournisseurs.equals(other$commandeFournisseurs)) {
            return true;
        }
        return false;
    }
    
    @Override
    protected boolean canEqual(final Object other) {
        return other instanceof Fournisseur;
    }
    
    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        final Object $idEntreprise = this.getIdEntreprise();
        result = result * 59 + (($idEntreprise == null) ? 43 : $idEntreprise.hashCode());
        final Object $nom = this.getNom();
        result = result * 59 + (($nom == null) ? 43 : $nom.hashCode());
        final Object $prenom = this.getPrenom();
        result = result * 59 + (($prenom == null) ? 43 : $prenom.hashCode());
        final Object $adresse = this.getAdresse();
        result = result * 59 + (($adresse == null) ? 43 : $adresse.hashCode());
        final Object $photo = this.getPhoto();
        result = result * 59 + (($photo == null) ? 43 : $photo.hashCode());
        final Object $mail = this.getMail();
        result = result * 59 + (($mail == null) ? 43 : $mail.hashCode());
        final Object $numTel = this.getNumTel();
        result = result * 59 + (($numTel == null) ? 43 : $numTel.hashCode());
        final Object $commandeFournisseurs = this.getCommandeFournisseurs();
        result = result * 59 + (($commandeFournisseurs == null) ? 43 : $commandeFournisseurs.hashCode());
        return result;
    }
}