package com.bouali.gestiondestock.model;

import java.math.*;
import java.util.*;
import javax.persistence.*;

@Entity
@Table(name = "article")
public class Article extends AbstractEntity
{
    @Column(name = "codearticle")
    private String codeArticle;
    @Column(name = "designation")
    private String designation;
    @Column(name = "prixunitaireht")
    private BigDecimal prixUnitaireHt;
    @Column(name = "tauxtva")
    private BigDecimal tauxTva;
    @Column(name = "prixunitairettc")
    private BigDecimal prixUnitaireTtc;
    @Column(name = "photo")
    private String photo;
    @Column(name = "identreprise")
    private Integer idEntreprise;
    @ManyToOne
    @JoinColumn(name = "idcategory")
    private Category category;
    @OneToMany(mappedBy = "article")
    private List<LigneVente> ligneVentes;
    @OneToMany(mappedBy = "article")
    private List<LigneCommandeClient> ligneCommandeClients;
    @OneToMany(mappedBy = "article")
    private List<LigneCommandeFournisseur> ligneCommandeFournisseurs;
    @OneToMany(mappedBy = "article")
    private List<MvtStk> mvtStks;
    
    public String getCodeArticle() {
        return this.codeArticle;
    }
    
    public String getDesignation() {
        return this.designation;
    }
    
    public BigDecimal getPrixUnitaireHt() {
        return this.prixUnitaireHt;
    }
    
    public BigDecimal getTauxTva() {
        return this.tauxTva;
    }
    
    public BigDecimal getPrixUnitaireTtc() {
        return this.prixUnitaireTtc;
    }
    
    public String getPhoto() {
        return this.photo;
    }
    
    public Integer getIdEntreprise() {
        return this.idEntreprise;
    }
    
    public Category getCategory() {
        return this.category;
    }
    
    public List<LigneVente> getLigneVentes() {
        return this.ligneVentes;
    }
    
    public List<LigneCommandeClient> getLigneCommandeClients() {
        return this.ligneCommandeClients;
    }
    
    public List<LigneCommandeFournisseur> getLigneCommandeFournisseurs() {
        return this.ligneCommandeFournisseurs;
    }
    
    public List<MvtStk> getMvtStks() {
        return this.mvtStks;
    }
    
    public void setCodeArticle(final String codeArticle) {
        this.codeArticle = codeArticle;
    }
    
    public void setDesignation(final String designation) {
        this.designation = designation;
    }
    
    public void setPrixUnitaireHt(final BigDecimal prixUnitaireHt) {
        this.prixUnitaireHt = prixUnitaireHt;
    }
    
    public void setTauxTva(final BigDecimal tauxTva) {
        this.tauxTva = tauxTva;
    }
    
    public void setPrixUnitaireTtc(final BigDecimal prixUnitaireTtc) {
        this.prixUnitaireTtc = prixUnitaireTtc;
    }
    
    public void setPhoto(final String photo) {
        this.photo = photo;
    }
    
    public void setIdEntreprise(final Integer idEntreprise) {
        this.idEntreprise = idEntreprise;
    }
    
    public void setCategory(final Category category) {
        this.category = category;
    }
    
    public void setLigneVentes(final List<LigneVente> ligneVentes) {
        this.ligneVentes = ligneVentes;
    }
    
    public void setLigneCommandeClients(final List<LigneCommandeClient> ligneCommandeClients) {
        this.ligneCommandeClients = ligneCommandeClients;
    }
    
    public void setLigneCommandeFournisseurs(final List<LigneCommandeFournisseur> ligneCommandeFournisseurs) {
        this.ligneCommandeFournisseurs = ligneCommandeFournisseurs;
    }
    
    public void setMvtStks(final List<MvtStk> mvtStks) {
        this.mvtStks = mvtStks;
    }
    
    @Override
    public String toString() {
        return invokedynamic(makeConcatWithConstants:(Ljava/lang/String;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/lang/Integer;Lcom/bouali/gestiondestock/model/Category;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;)Ljava/lang/String;, this.getCodeArticle(), this.getDesignation(), this.getPrixUnitaireHt(), this.getTauxTva(), this.getPrixUnitaireTtc(), this.getPhoto(), this.getIdEntreprise(), this.getCategory(), this.getLigneVentes(), this.getLigneCommandeClients(), this.getLigneCommandeFournisseurs(), this.getMvtStks());
    }
    
    public Article() {
    }
    
    public Article(final String codeArticle, final String designation, final BigDecimal prixUnitaireHt, final BigDecimal tauxTva, final BigDecimal prixUnitaireTtc, final String photo, final Integer idEntreprise, final Category category, final List<LigneVente> ligneVentes, final List<LigneCommandeClient> ligneCommandeClients, final List<LigneCommandeFournisseur> ligneCommandeFournisseurs, final List<MvtStk> mvtStks) {
        this.codeArticle = codeArticle;
        this.designation = designation;
        this.prixUnitaireHt = prixUnitaireHt;
        this.tauxTva = tauxTva;
        this.prixUnitaireTtc = prixUnitaireTtc;
        this.photo = photo;
        this.idEntreprise = idEntreprise;
        this.category = category;
        this.ligneVentes = ligneVentes;
        this.ligneCommandeClients = ligneCommandeClients;
        this.ligneCommandeFournisseurs = ligneCommandeFournisseurs;
        this.mvtStks = mvtStks;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof Article)) {
            return false;
        }
        final Article other = (Article)o;
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
        final Object this$codeArticle = this.getCodeArticle();
        final Object other$codeArticle = other.getCodeArticle();
        Label_0112: {
            if (this$codeArticle == null) {
                if (other$codeArticle == null) {
                    break Label_0112;
                }
            }
            else if (this$codeArticle.equals(other$codeArticle)) {
                break Label_0112;
            }
            return false;
        }
        final Object this$designation = this.getDesignation();
        final Object other$designation = other.getDesignation();
        Label_0149: {
            if (this$designation == null) {
                if (other$designation == null) {
                    break Label_0149;
                }
            }
            else if (this$designation.equals(other$designation)) {
                break Label_0149;
            }
            return false;
        }
        final Object this$prixUnitaireHt = this.getPrixUnitaireHt();
        final Object other$prixUnitaireHt = other.getPrixUnitaireHt();
        Label_0186: {
            if (this$prixUnitaireHt == null) {
                if (other$prixUnitaireHt == null) {
                    break Label_0186;
                }
            }
            else if (this$prixUnitaireHt.equals(other$prixUnitaireHt)) {
                break Label_0186;
            }
            return false;
        }
        final Object this$tauxTva = this.getTauxTva();
        final Object other$tauxTva = other.getTauxTva();
        Label_0223: {
            if (this$tauxTva == null) {
                if (other$tauxTva == null) {
                    break Label_0223;
                }
            }
            else if (this$tauxTva.equals(other$tauxTva)) {
                break Label_0223;
            }
            return false;
        }
        final Object this$prixUnitaireTtc = this.getPrixUnitaireTtc();
        final Object other$prixUnitaireTtc = other.getPrixUnitaireTtc();
        Label_0260: {
            if (this$prixUnitaireTtc == null) {
                if (other$prixUnitaireTtc == null) {
                    break Label_0260;
                }
            }
            else if (this$prixUnitaireTtc.equals(other$prixUnitaireTtc)) {
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
        final Object this$category = this.getCategory();
        final Object other$category = other.getCategory();
        Label_0334: {
            if (this$category == null) {
                if (other$category == null) {
                    break Label_0334;
                }
            }
            else if (this$category.equals(other$category)) {
                break Label_0334;
            }
            return false;
        }
        final Object this$ligneVentes = this.getLigneVentes();
        final Object other$ligneVentes = other.getLigneVentes();
        Label_0371: {
            if (this$ligneVentes == null) {
                if (other$ligneVentes == null) {
                    break Label_0371;
                }
            }
            else if (this$ligneVentes.equals(other$ligneVentes)) {
                break Label_0371;
            }
            return false;
        }
        final Object this$ligneCommandeClients = this.getLigneCommandeClients();
        final Object other$ligneCommandeClients = other.getLigneCommandeClients();
        Label_0408: {
            if (this$ligneCommandeClients == null) {
                if (other$ligneCommandeClients == null) {
                    break Label_0408;
                }
            }
            else if (this$ligneCommandeClients.equals(other$ligneCommandeClients)) {
                break Label_0408;
            }
            return false;
        }
        final Object this$ligneCommandeFournisseurs = this.getLigneCommandeFournisseurs();
        final Object other$ligneCommandeFournisseurs = other.getLigneCommandeFournisseurs();
        Label_0445: {
            if (this$ligneCommandeFournisseurs == null) {
                if (other$ligneCommandeFournisseurs == null) {
                    break Label_0445;
                }
            }
            else if (this$ligneCommandeFournisseurs.equals(other$ligneCommandeFournisseurs)) {
                break Label_0445;
            }
            return false;
        }
        final Object this$mvtStks = this.getMvtStks();
        final Object other$mvtStks = other.getMvtStks();
        if (this$mvtStks == null) {
            if (other$mvtStks == null) {
                return true;
            }
        }
        else if (this$mvtStks.equals(other$mvtStks)) {
            return true;
        }
        return false;
    }
    
    @Override
    protected boolean canEqual(final Object other) {
        return other instanceof Article;
    }
    
    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        final Object $idEntreprise = this.getIdEntreprise();
        result = result * 59 + (($idEntreprise == null) ? 43 : $idEntreprise.hashCode());
        final Object $codeArticle = this.getCodeArticle();
        result = result * 59 + (($codeArticle == null) ? 43 : $codeArticle.hashCode());
        final Object $designation = this.getDesignation();
        result = result * 59 + (($designation == null) ? 43 : $designation.hashCode());
        final Object $prixUnitaireHt = this.getPrixUnitaireHt();
        result = result * 59 + (($prixUnitaireHt == null) ? 43 : $prixUnitaireHt.hashCode());
        final Object $tauxTva = this.getTauxTva();
        result = result * 59 + (($tauxTva == null) ? 43 : $tauxTva.hashCode());
        final Object $prixUnitaireTtc = this.getPrixUnitaireTtc();
        result = result * 59 + (($prixUnitaireTtc == null) ? 43 : $prixUnitaireTtc.hashCode());
        final Object $photo = this.getPhoto();
        result = result * 59 + (($photo == null) ? 43 : $photo.hashCode());
        final Object $category = this.getCategory();
        result = result * 59 + (($category == null) ? 43 : $category.hashCode());
        final Object $ligneVentes = this.getLigneVentes();
        result = result * 59 + (($ligneVentes == null) ? 43 : $ligneVentes.hashCode());
        final Object $ligneCommandeClients = this.getLigneCommandeClients();
        result = result * 59 + (($ligneCommandeClients == null) ? 43 : $ligneCommandeClients.hashCode());
        final Object $ligneCommandeFournisseurs = this.getLigneCommandeFournisseurs();
        result = result * 59 + (($ligneCommandeFournisseurs == null) ? 43 : $ligneCommandeFournisseurs.hashCode());
        final Object $mvtStks = this.getMvtStks();
        result = result * 59 + (($mvtStks == null) ? 43 : $mvtStks.hashCode());
        return result;
    }
}