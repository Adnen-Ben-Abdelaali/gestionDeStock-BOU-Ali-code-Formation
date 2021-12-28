package com.bouali.gestiondestock.model;

import java.time.*;
import java.math.*;
import javax.persistence.*;

@Entity
@Table(name = "mvtstk")
public class MvtStk extends AbstractEntity
{
    @Column(name = "datemvt")
    private Instant dateMvt;
    @Column(name = "quantite")
    private BigDecimal quantite;
    @ManyToOne
    @JoinColumn(name = "idarticle")
    private Article article;
    @Column(name = "typemvt")
    private TypeMvtStk typeMvt;
    @Column(name = "sourcemvt")
    private SourceMvtStk sourceMvt;
    @Column(name = "identreprise")
    private Integer idEntreprise;
    
    public Instant getDateMvt() {
        return this.dateMvt;
    }
    
    public BigDecimal getQuantite() {
        return this.quantite;
    }
    
    public Article getArticle() {
        return this.article;
    }
    
    public TypeMvtStk getTypeMvt() {
        return this.typeMvt;
    }
    
    public SourceMvtStk getSourceMvt() {
        return this.sourceMvt;
    }
    
    public Integer getIdEntreprise() {
        return this.idEntreprise;
    }
    
    public void setDateMvt(final Instant dateMvt) {
        this.dateMvt = dateMvt;
    }
    
    public void setQuantite(final BigDecimal quantite) {
        this.quantite = quantite;
    }
    
    public void setArticle(final Article article) {
        this.article = article;
    }
    
    public void setTypeMvt(final TypeMvtStk typeMvt) {
        this.typeMvt = typeMvt;
    }
    
    public void setSourceMvt(final SourceMvtStk sourceMvt) {
        this.sourceMvt = sourceMvt;
    }
    
    public void setIdEntreprise(final Integer idEntreprise) {
        this.idEntreprise = idEntreprise;
    }
    
    @Override
    public String toString() {
        return invokedynamic(makeConcatWithConstants:(Ljava/time/Instant;Ljava/math/BigDecimal;Lcom/bouali/gestiondestock/model/Article;Lcom/bouali/gestiondestock/model/TypeMvtStk;Lcom/bouali/gestiondestock/model/SourceMvtStk;Ljava/lang/Integer;)Ljava/lang/String;, this.getDateMvt(), this.getQuantite(), this.getArticle(), this.getTypeMvt(), this.getSourceMvt(), this.getIdEntreprise());
    }
    
    public MvtStk() {
    }
    
    public MvtStk(final Instant dateMvt, final BigDecimal quantite, final Article article, final TypeMvtStk typeMvt, final SourceMvtStk sourceMvt, final Integer idEntreprise) {
        this.dateMvt = dateMvt;
        this.quantite = quantite;
        this.article = article;
        this.typeMvt = typeMvt;
        this.sourceMvt = sourceMvt;
        this.idEntreprise = idEntreprise;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof MvtStk)) {
            return false;
        }
        final MvtStk other = (MvtStk)o;
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
        final Object this$dateMvt = this.getDateMvt();
        final Object other$dateMvt = other.getDateMvt();
        Label_0112: {
            if (this$dateMvt == null) {
                if (other$dateMvt == null) {
                    break Label_0112;
                }
            }
            else if (this$dateMvt.equals(other$dateMvt)) {
                break Label_0112;
            }
            return false;
        }
        final Object this$quantite = this.getQuantite();
        final Object other$quantite = other.getQuantite();
        Label_0149: {
            if (this$quantite == null) {
                if (other$quantite == null) {
                    break Label_0149;
                }
            }
            else if (this$quantite.equals(other$quantite)) {
                break Label_0149;
            }
            return false;
        }
        final Object this$article = this.getArticle();
        final Object other$article = other.getArticle();
        Label_0186: {
            if (this$article == null) {
                if (other$article == null) {
                    break Label_0186;
                }
            }
            else if (this$article.equals(other$article)) {
                break Label_0186;
            }
            return false;
        }
        final Object this$typeMvt = this.getTypeMvt();
        final Object other$typeMvt = other.getTypeMvt();
        Label_0223: {
            if (this$typeMvt == null) {
                if (other$typeMvt == null) {
                    break Label_0223;
                }
            }
            else if (this$typeMvt.equals(other$typeMvt)) {
                break Label_0223;
            }
            return false;
        }
        final Object this$sourceMvt = this.getSourceMvt();
        final Object other$sourceMvt = other.getSourceMvt();
        if (this$sourceMvt == null) {
            if (other$sourceMvt == null) {
                return true;
            }
        }
        else if (this$sourceMvt.equals(other$sourceMvt)) {
            return true;
        }
        return false;
    }
    
    @Override
    protected boolean canEqual(final Object other) {
        return other instanceof MvtStk;
    }
    
    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        final Object $idEntreprise = this.getIdEntreprise();
        result = result * 59 + (($idEntreprise == null) ? 43 : $idEntreprise.hashCode());
        final Object $dateMvt = this.getDateMvt();
        result = result * 59 + (($dateMvt == null) ? 43 : $dateMvt.hashCode());
        final Object $quantite = this.getQuantite();
        result = result * 59 + (($quantite == null) ? 43 : $quantite.hashCode());
        final Object $article = this.getArticle();
        result = result * 59 + (($article == null) ? 43 : $article.hashCode());
        final Object $typeMvt = this.getTypeMvt();
        result = result * 59 + (($typeMvt == null) ? 43 : $typeMvt.hashCode());
        final Object $sourceMvt = this.getSourceMvt();
        result = result * 59 + (($sourceMvt == null) ? 43 : $sourceMvt.hashCode());
        return result;
    }
}