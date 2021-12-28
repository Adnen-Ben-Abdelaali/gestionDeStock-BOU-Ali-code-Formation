package com.bouali.gestiondestock.model;

import java.time.*;
import java.util.*;
import javax.persistence.*;
import com.fasterxml.jackson.annotation.*;

@Entity
@Table(name = "utilisateur")
public class Utilisateur extends AbstractEntity
{
    @Column(name = "nom")
    private String nom;
    @Column(name = "prenom")
    private String prenom;
    @Column(name = "email")
    private String email;
    @Column(name = "datedenaissance")
    private Instant dateDeNaissance;
    @Column(name = "motdepasse")
    private String moteDePasse;
    @Embedded
    private Adresse adresse;
    @Column(name = "photo")
    private String photo;
    @ManyToOne
    @JoinColumn(name = "identreprise")
    private Entreprise entreprise;
    @OneToMany(fetch = FetchType.EAGER, mappedBy = "utilisateur")
    @JsonIgnore
    private List<Roles> roles;
    
    public String getNom() {
        return this.nom;
    }
    
    public String getPrenom() {
        return this.prenom;
    }
    
    public String getEmail() {
        return this.email;
    }
    
    public Instant getDateDeNaissance() {
        return this.dateDeNaissance;
    }
    
    public String getMoteDePasse() {
        return this.moteDePasse;
    }
    
    public Adresse getAdresse() {
        return this.adresse;
    }
    
    public String getPhoto() {
        return this.photo;
    }
    
    public Entreprise getEntreprise() {
        return this.entreprise;
    }
    
    public List<Roles> getRoles() {
        return this.roles;
    }
    
    public void setNom(final String nom) {
        this.nom = nom;
    }
    
    public void setPrenom(final String prenom) {
        this.prenom = prenom;
    }
    
    public void setEmail(final String email) {
        this.email = email;
    }
    
    public void setDateDeNaissance(final Instant dateDeNaissance) {
        this.dateDeNaissance = dateDeNaissance;
    }
    
    public void setMoteDePasse(final String moteDePasse) {
        this.moteDePasse = moteDePasse;
    }
    
    public void setAdresse(final Adresse adresse) {
        this.adresse = adresse;
    }
    
    public void setPhoto(final String photo) {
        this.photo = photo;
    }
    
    public void setEntreprise(final Entreprise entreprise) {
        this.entreprise = entreprise;
    }
    
    @JsonIgnore
    public void setRoles(final List<Roles> roles) {
        this.roles = roles;
    }
    
    @Override
    public String toString() {
        return invokedynamic(makeConcatWithConstants:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/time/Instant;Ljava/lang/String;Lcom/bouali/gestiondestock/model/Adresse;Ljava/lang/String;Lcom/bouali/gestiondestock/model/Entreprise;Ljava/util/List;)Ljava/lang/String;, this.getNom(), this.getPrenom(), this.getEmail(), this.getDateDeNaissance(), this.getMoteDePasse(), this.getAdresse(), this.getPhoto(), this.getEntreprise(), this.getRoles());
    }
    
    public Utilisateur() {
    }
    
    public Utilisateur(final String nom, final String prenom, final String email, final Instant dateDeNaissance, final String moteDePasse, final Adresse adresse, final String photo, final Entreprise entreprise, final List<Roles> roles) {
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
        this.dateDeNaissance = dateDeNaissance;
        this.moteDePasse = moteDePasse;
        this.adresse = adresse;
        this.photo = photo;
        this.entreprise = entreprise;
        this.roles = roles;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof Utilisateur)) {
            return false;
        }
        final Utilisateur other = (Utilisateur)o;
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
        final Object this$prenom = this.getPrenom();
        final Object other$prenom = other.getPrenom();
        Label_0112: {
            if (this$prenom == null) {
                if (other$prenom == null) {
                    break Label_0112;
                }
            }
            else if (this$prenom.equals(other$prenom)) {
                break Label_0112;
            }
            return false;
        }
        final Object this$email = this.getEmail();
        final Object other$email = other.getEmail();
        Label_0149: {
            if (this$email == null) {
                if (other$email == null) {
                    break Label_0149;
                }
            }
            else if (this$email.equals(other$email)) {
                break Label_0149;
            }
            return false;
        }
        final Object this$dateDeNaissance = this.getDateDeNaissance();
        final Object other$dateDeNaissance = other.getDateDeNaissance();
        Label_0186: {
            if (this$dateDeNaissance == null) {
                if (other$dateDeNaissance == null) {
                    break Label_0186;
                }
            }
            else if (this$dateDeNaissance.equals(other$dateDeNaissance)) {
                break Label_0186;
            }
            return false;
        }
        final Object this$moteDePasse = this.getMoteDePasse();
        final Object other$moteDePasse = other.getMoteDePasse();
        Label_0223: {
            if (this$moteDePasse == null) {
                if (other$moteDePasse == null) {
                    break Label_0223;
                }
            }
            else if (this$moteDePasse.equals(other$moteDePasse)) {
                break Label_0223;
            }
            return false;
        }
        final Object this$adresse = this.getAdresse();
        final Object other$adresse = other.getAdresse();
        Label_0260: {
            if (this$adresse == null) {
                if (other$adresse == null) {
                    break Label_0260;
                }
            }
            else if (this$adresse.equals(other$adresse)) {
                break Label_0260;
            }
            return false;
        }
        final Object this$photo = this.getPhoto();
        final Object other$photo = other.getPhoto();
        Label_0297: {
            if (this$photo == null) {
                if (other$photo == null) {
                    break Label_0297;
                }
            }
            else if (this$photo.equals(other$photo)) {
                break Label_0297;
            }
            return false;
        }
        final Object this$entreprise = this.getEntreprise();
        final Object other$entreprise = other.getEntreprise();
        Label_0334: {
            if (this$entreprise == null) {
                if (other$entreprise == null) {
                    break Label_0334;
                }
            }
            else if (this$entreprise.equals(other$entreprise)) {
                break Label_0334;
            }
            return false;
        }
        final Object this$roles = this.getRoles();
        final Object other$roles = other.getRoles();
        if (this$roles == null) {
            if (other$roles == null) {
                return true;
            }
        }
        else if (this$roles.equals(other$roles)) {
            return true;
        }
        return false;
    }
    
    @Override
    protected boolean canEqual(final Object other) {
        return other instanceof Utilisateur;
    }
    
    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        final Object $nom = this.getNom();
        result = result * 59 + (($nom == null) ? 43 : $nom.hashCode());
        final Object $prenom = this.getPrenom();
        result = result * 59 + (($prenom == null) ? 43 : $prenom.hashCode());
        final Object $email = this.getEmail();
        result = result * 59 + (($email == null) ? 43 : $email.hashCode());
        final Object $dateDeNaissance = this.getDateDeNaissance();
        result = result * 59 + (($dateDeNaissance == null) ? 43 : $dateDeNaissance.hashCode());
        final Object $moteDePasse = this.getMoteDePasse();
        result = result * 59 + (($moteDePasse == null) ? 43 : $moteDePasse.hashCode());
        final Object $adresse = this.getAdresse();
        result = result * 59 + (($adresse == null) ? 43 : $adresse.hashCode());
        final Object $photo = this.getPhoto();
        result = result * 59 + (($photo == null) ? 43 : $photo.hashCode());
        final Object $entreprise = this.getEntreprise();
        result = result * 59 + (($entreprise == null) ? 43 : $entreprise.hashCode());
        final Object $roles = this.getRoles();
        result = result * 59 + (($roles == null) ? 43 : $roles.hashCode());
        return result;
    }
}