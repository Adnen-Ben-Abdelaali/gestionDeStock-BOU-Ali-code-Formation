package com.bouali.gestiondestock.model;

import java.math.*;
import javax.persistence.*;

@Entity
@Table(name = "lignecommandefournisseur")
public class LigneCommandeFournisseur extends AbstractEntity
{
    @ManyToOne
    @JoinColumn(name = "idarticle")
    private Article article;
    @ManyToOne
    @JoinColumn(name = "idcommandefournisseur")
    private CommandeFournisseur commandeFournisseur;
    @Column(name = "quantite")
    private BigDecimal quantite;
    @Column(name = "prixunitaire")
    private BigDecimal prixUnitaire;
    @Column(name = "identreprise")
    private Integer idEntreprise;
    
    public Article getArticle() {
        return this.article;
    }
    
    public CommandeFournisseur getCommandeFournisseur() {
        return this.commandeFournisseur;
    }
    
    public BigDecimal getQuantite() {
        return this.quantite;
    }
    
    public BigDecimal getPrixUnitaire() {
        return this.prixUnitaire;
    }
    
    public Integer getIdEntreprise() {
        return this.idEntreprise;
    }
    
    public void setArticle(final Article article) {
        this.article = article;
    }
    
    public void setCommandeFournisseur(final CommandeFournisseur commandeFournisseur) {
        this.commandeFournisseur = commandeFournisseur;
    }
    
    public void setQuantite(final BigDecimal quantite) {
        this.quantite = quantite;
    }
    
    public void setPrixUnitaire(final BigDecimal prixUnitaire) {
        this.prixUnitaire = prixUnitaire;
    }
    
    public void setIdEntreprise(final Integer idEntreprise) {
        this.idEntreprise = idEntreprise;
    }
    
    @Override
    public String toString() {
        return invokedynamic(makeConcatWithConstants:(Lcom/bouali/gestiondestock/model/Article;Lcom/bouali/gestiondestock/model/CommandeFournisseur;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/Integer;)Ljava/lang/String;, this.getArticle(), this.getCommandeFournisseur(), this.getQuantite(), this.getPrixUnitaire(), this.getIdEntreprise());
    }
    
    public LigneCommandeFournisseur() {
    }
    
    public LigneCommandeFournisseur(final Article article, final CommandeFournisseur commandeFournisseur, final BigDecimal quantite, final BigDecimal prixUnitaire, final Integer idEntreprise) {
        this.article = article;
        this.commandeFournisseur = commandeFournisseur;
        this.quantite = quantite;
        this.prixUnitaire = prixUnitaire;
        this.idEntreprise = idEntreprise;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof LigneCommandeFournisseur)) {
            return false;
        }
        final LigneCommandeFournisseur other = (LigneCommandeFournisseur)o;
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
        final Object this$article = this.getArticle();
        final Object other$article = other.getArticle();
        Label_0112: {
            if (this$article == null) {
                if (other$article == null) {
                    break Label_0112;
                }
            }
            else if (this$article.equals(other$article)) {
                break Label_0112;
            }
            return false;
        }
        final Object this$commandeFournisseur = this.getCommandeFournisseur();
        final Object other$commandeFournisseur = other.getCommandeFournisseur();
        Label_0149: {
            if (this$commandeFournisseur == null) {
                if (other$commandeFournisseur == null) {
                    break Label_0149;
                }
            }
            else if (this$commandeFournisseur.equals(other$commandeFournisseur)) {
                break Label_0149;
            }
            return false;
        }
        final Object this$quantite = this.getQuantite();
        final Object other$quantite = other.getQuantite();
        Label_0186: {
            if (this$quantite == null) {
                if (other$quantite == null) {
                    break Label_0186;
                }
            }
            else if (this$quantite.equals(other$quantite)) {
                break Label_0186;
            }
            return false;
        }
        final Object this$prixUnitaire = this.getPrixUnitaire();
        final Object other$prixUnitaire = other.getPrixUnitaire();
        if (this$prixUnitaire == null) {
            if (other$prixUnitaire == null) {
                return true;
            }
        }
        else if (this$prixUnitaire.equals(other$prixUnitaire)) {
            return true;
        }
        return false;
    }
    
    @Override
    protected boolean canEqual(final Object other) {
        return other instanceof LigneCommandeFournisseur;
    }
    
    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        final Object $idEntreprise = this.getIdEntreprise();
        result = result * 59 + (($idEntreprise == null) ? 43 : $idEntreprise.hashCode());
        final Object $article = this.getArticle();
        result = result * 59 + (($article == null) ? 43 : $article.hashCode());
        final Object $commandeFournisseur = this.getCommandeFournisseur();
        result = result * 59 + (($commandeFournisseur == null) ? 43 : $commandeFournisseur.hashCode());
        final Object $quantite = this.getQuantite();
        result = result * 59 + (($quantite == null) ? 43 : $quantite.hashCode());
        final Object $prixUnitaire = this.getPrixUnitaire();
        result = result * 59 + (($prixUnitaire == null) ? 43 : $prixUnitaire.hashCode());
        return result;
    }
}