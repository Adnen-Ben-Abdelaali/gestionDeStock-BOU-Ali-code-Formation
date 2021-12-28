package com.bouali.gestiondestock.model;

import java.time.*;
import java.util.*;
import javax.persistence.*;

@Entity
@Table(name = "commandefournisseur")
public class CommandeFournisseur extends AbstractEntity
{
    @Column(name = "code")
    private String code;
    @Column(name = "datecommande")
    private Instant dateCommande;
    @Column(name = "etatcommande")
    private EtatCommande etatCommande;
    @Column(name = "identreprise")
    private Integer idEntreprise;
    @ManyToOne
    @JoinColumn(name = "idfournisseur")
    private Fournisseur fournisseur;
    @OneToMany(mappedBy = "commandeFournisseur")
    private List<LigneCommandeFournisseur> ligneCommandeFournisseurs;
    
    public String getCode() {
        return this.code;
    }
    
    public Instant getDateCommande() {
        return this.dateCommande;
    }
    
    public EtatCommande getEtatCommande() {
        return this.etatCommande;
    }
    
    public Integer getIdEntreprise() {
        return this.idEntreprise;
    }
    
    public Fournisseur getFournisseur() {
        return this.fournisseur;
    }
    
    public List<LigneCommandeFournisseur> getLigneCommandeFournisseurs() {
        return this.ligneCommandeFournisseurs;
    }
    
    public void setCode(final String code) {
        this.code = code;
    }
    
    public void setDateCommande(final Instant dateCommande) {
        this.dateCommande = dateCommande;
    }
    
    public void setEtatCommande(final EtatCommande etatCommande) {
        this.etatCommande = etatCommande;
    }
    
    public void setIdEntreprise(final Integer idEntreprise) {
        this.idEntreprise = idEntreprise;
    }
    
    public void setFournisseur(final Fournisseur fournisseur) {
        this.fournisseur = fournisseur;
    }
    
    public void setLigneCommandeFournisseurs(final List<LigneCommandeFournisseur> ligneCommandeFournisseurs) {
        this.ligneCommandeFournisseurs = ligneCommandeFournisseurs;
    }
    
    @Override
    public String toString() {
        return invokedynamic(makeConcatWithConstants:(Ljava/lang/String;Ljava/time/Instant;Lcom/bouali/gestiondestock/model/EtatCommande;Ljava/lang/Integer;Lcom/bouali/gestiondestock/model/Fournisseur;Ljava/util/List;)Ljava/lang/String;, this.getCode(), this.getDateCommande(), this.getEtatCommande(), this.getIdEntreprise(), this.getFournisseur(), this.getLigneCommandeFournisseurs());
    }
    
    public CommandeFournisseur() {
    }
    
    public CommandeFournisseur(final String code, final Instant dateCommande, final EtatCommande etatCommande, final Integer idEntreprise, final Fournisseur fournisseur, final List<LigneCommandeFournisseur> ligneCommandeFournisseurs) {
        this.code = code;
        this.dateCommande = dateCommande;
        this.etatCommande = etatCommande;
        this.idEntreprise = idEntreprise;
        this.fournisseur = fournisseur;
        this.ligneCommandeFournisseurs = ligneCommandeFournisseurs;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof CommandeFournisseur)) {
            return false;
        }
        final CommandeFournisseur other = (CommandeFournisseur)o;
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
        final Object this$code = this.getCode();
        final Object other$code = other.getCode();
        Label_0112: {
            if (this$code == null) {
                if (other$code == null) {
                    break Label_0112;
                }
            }
            else if (this$code.equals(other$code)) {
                break Label_0112;
            }
            return false;
        }
        final Object this$dateCommande = this.getDateCommande();
        final Object other$dateCommande = other.getDateCommande();
        Label_0149: {
            if (this$dateCommande == null) {
                if (other$dateCommande == null) {
                    break Label_0149;
                }
            }
            else if (this$dateCommande.equals(other$dateCommande)) {
                break Label_0149;
            }
            return false;
        }
        final Object this$etatCommande = this.getEtatCommande();
        final Object other$etatCommande = other.getEtatCommande();
        Label_0186: {
            if (this$etatCommande == null) {
                if (other$etatCommande == null) {
                    break Label_0186;
                }
            }
            else if (this$etatCommande.equals(other$etatCommande)) {
                break Label_0186;
            }
            return false;
        }
        final Object this$fournisseur = this.getFournisseur();
        final Object other$fournisseur = other.getFournisseur();
        Label_0223: {
            if (this$fournisseur == null) {
                if (other$fournisseur == null) {
                    break Label_0223;
                }
            }
            else if (this$fournisseur.equals(other$fournisseur)) {
                break Label_0223;
            }
            return false;
        }
        final Object this$ligneCommandeFournisseurs = this.getLigneCommandeFournisseurs();
        final Object other$ligneCommandeFournisseurs = other.getLigneCommandeFournisseurs();
        if (this$ligneCommandeFournisseurs == null) {
            if (other$ligneCommandeFournisseurs == null) {
                return true;
            }
        }
        else if (this$ligneCommandeFournisseurs.equals(other$ligneCommandeFournisseurs)) {
            return true;
        }
        return false;
    }
    
    @Override
    protected boolean canEqual(final Object other) {
        return other instanceof CommandeFournisseur;
    }
    
    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        final Object $idEntreprise = this.getIdEntreprise();
        result = result * 59 + (($idEntreprise == null) ? 43 : $idEntreprise.hashCode());
        final Object $code = this.getCode();
        result = result * 59 + (($code == null) ? 43 : $code.hashCode());
        final Object $dateCommande = this.getDateCommande();
        result = result * 59 + (($dateCommande == null) ? 43 : $dateCommande.hashCode());
        final Object $etatCommande = this.getEtatCommande();
        result = result * 59 + (($etatCommande == null) ? 43 : $etatCommande.hashCode());
        final Object $fournisseur = this.getFournisseur();
        result = result * 59 + (($fournisseur == null) ? 43 : $fournisseur.hashCode());
        final Object $ligneCommandeFournisseurs = this.getLigneCommandeFournisseurs();
        result = result * 59 + (($ligneCommandeFournisseurs == null) ? 43 : $ligneCommandeFournisseurs.hashCode());
        return result;
    }
}