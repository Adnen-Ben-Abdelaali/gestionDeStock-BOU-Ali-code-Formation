package com.bouali.gestiondestock.model;

import java.util.*;
import javax.persistence.*;

@Entity
@Table(name = "entreprise")
public class Entreprise extends AbstractEntity
{
    @Column(name = "nom")
    private String nom;
    @Column(name = "description")
    private String description;
    @Embedded
    private Adresse adresse;
    @Column(name = "codefiscal")
    private String codeFiscal;
    @Column(name = "photo")
    private String photo;
    @Column(name = "email")
    private String email;
    @Column(name = "numtel")
    private String numTel;
    @Column(name = "siteweb")
    private String steWeb;
    @OneToMany(mappedBy = "entreprise")
    private List<Utilisateur> utilisateurs;
    
    public String getNom() {
        return this.nom;
    }
    
    public String getDescription() {
        return this.description;
    }
    
    public Adresse getAdresse() {
        return this.adresse;
    }
    
    public String getCodeFiscal() {
        return this.codeFiscal;
    }
    
    public String getPhoto() {
        return this.photo;
    }
    
    public String getEmail() {
        return this.email;
    }
    
    public String getNumTel() {
        return this.numTel;
    }
    
    public String getSteWeb() {
        return this.steWeb;
    }
    
    public List<Utilisateur> getUtilisateurs() {
        return this.utilisateurs;
    }
    
    public void setNom(final String nom) {
        this.nom = nom;
    }
    
    public void setDescription(final String description) {
        this.description = description;
    }
    
    public void setAdresse(final Adresse adresse) {
        this.adresse = adresse;
    }
    
    public void setCodeFiscal(final String codeFiscal) {
        this.codeFiscal = codeFiscal;
    }
    
    public void setPhoto(final String photo) {
        this.photo = photo;
    }
    
    public void setEmail(final String email) {
        this.email = email;
    }
    
    public void setNumTel(final String numTel) {
        this.numTel = numTel;
    }
    
    public void setSteWeb(final String steWeb) {
        this.steWeb = steWeb;
    }
    
    public void setUtilisateurs(final List<Utilisateur> utilisateurs) {
        this.utilisateurs = utilisateurs;
    }
    
    @Override
    public String toString() {
        return invokedynamic(makeConcatWithConstants:(Ljava/lang/String;Ljava/lang/String;Lcom/bouali/gestiondestock/model/Adresse;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Ljava/lang/String;, this.getNom(), this.getDescription(), this.getAdresse(), this.getCodeFiscal(), this.getPhoto(), this.getEmail(), this.getNumTel(), this.getSteWeb(), this.getUtilisateurs());
    }
    
    public Entreprise() {
    }
    
    public Entreprise(final String nom, final String description, final Adresse adresse, final String codeFiscal, final String photo, final String email, final String numTel, final String steWeb, final List<Utilisateur> utilisateurs) {
        this.nom = nom;
        this.description = description;
        this.adresse = adresse;
        this.codeFiscal = codeFiscal;
        this.photo = photo;
        this.email = email;
        this.numTel = numTel;
        this.steWeb = steWeb;
        this.utilisateurs = utilisateurs;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof Entreprise)) {
            return false;
        }
        final Entreprise other = (Entreprise)o;
        if (!other.canEqual(this)) {
            return false;
        }
        if (!super.equals(o)) {
            return false;
        }
        final Object this$nom = this.getNom();
        final Object other$nom = other.getNom();
        Label_0075: {
            if (this$nom == null) {
                if (other$nom == null) {
                    break Label_0075;
                }
            }
            else if (this$nom.equals(other$nom)) {
                break Label_0075;
            }
            return false;
        }
        final Object this$description = this.getDescription();
        final Object other$description = other.getDescription();
        Label_0112: {
            if (this$description == null) {
                if (other$description == null) {
                    break Label_0112;
                }
            }
            else if (this$description.equals(other$description)) {
                break Label_0112;
            }
            return false;
        }
        final Object this$adresse = this.getAdresse();
        final Object other$adresse = other.getAdresse();
        Label_0149: {
            if (this$adresse == null) {
                if (other$adresse == null) {
                    break Label_0149;
                }
            }
            else if (this$adresse.equals(other$adresse)) {
                break Label_0149;
            }
            return false;
        }
        final Object this$codeFiscal = this.getCodeFiscal();
        final Object other$codeFiscal = other.getCodeFiscal();
        Label_0186: {
            if (this$codeFiscal == null) {
                if (other$codeFiscal == null) {
                    break Label_0186;
                }
            }
            else if (this$codeFiscal.equals(other$codeFiscal)) {
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
        final Object this$email = this.getEmail();
        final Object other$email = other.getEmail();
        Label_0260: {
            if (this$email == null) {
                if (other$email == null) {
                    break Label_0260;
                }
            }
            else if (this$email.equals(other$email)) {
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
        final Object this$steWeb = this.getSteWeb();
        final Object other$steWeb = other.getSteWeb();
        Label_0334: {
            if (this$steWeb == null) {
                if (other$steWeb == null) {
                    break Label_0334;
                }
            }
            else if (this$steWeb.equals(other$steWeb)) {
                break Label_0334;
            }
            return false;
        }
        final Object this$utilisateurs = this.getUtilisateurs();
        final Object other$utilisateurs = other.getUtilisateurs();
        if (this$utilisateurs == null) {
            if (other$utilisateurs == null) {
                return true;
            }
        }
        else if (this$utilisateurs.equals(other$utilisateurs)) {
            return true;
        }
        return false;
    }
    
    @Override
    protected boolean canEqual(final Object other) {
        return other instanceof Entreprise;
    }
    
    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        final Object $nom = this.getNom();
        result = result * 59 + (($nom == null) ? 43 : $nom.hashCode());
        final Object $description = this.getDescription();
        result = result * 59 + (($description == null) ? 43 : $description.hashCode());
        final Object $adresse = this.getAdresse();
        result = result * 59 + (($adresse == null) ? 43 : $adresse.hashCode());
        final Object $codeFiscal = this.getCodeFiscal();
        result = result * 59 + (($codeFiscal == null) ? 43 : $codeFiscal.hashCode());
        final Object $photo = this.getPhoto();
        result = result * 59 + (($photo == null) ? 43 : $photo.hashCode());
        final Object $email = this.getEmail();
        result = result * 59 + (($email == null) ? 43 : $email.hashCode());
        final Object $numTel = this.getNumTel();
        result = result * 59 + (($numTel == null) ? 43 : $numTel.hashCode());
        final Object $steWeb = this.getSteWeb();
        result = result * 59 + (($steWeb == null) ? 43 : $steWeb.hashCode());
        final Object $utilisateurs = this.getUtilisateurs();
        result = result * 59 + (($utilisateurs == null) ? 43 : $utilisateurs.hashCode());
        return result;
    }
}