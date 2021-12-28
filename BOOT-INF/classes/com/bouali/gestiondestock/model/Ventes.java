package com.bouali.gestiondestock.model;

import java.time.*;
import java.util.*;
import javax.persistence.*;

@Entity
@Table(name = "ventes")
public class Ventes extends AbstractEntity
{
    @Column(name = "code")
    private String code;
    @Column(name = "datevente")
    private Instant dateVente;
    @Column(name = "commentaire")
    private String commentaire;
    @Column(name = "identreprise")
    private Integer idEntreprise;
    @OneToMany(mappedBy = "vente")
    private List<LigneVente> ligneVentes;
    
    public String getCode() {
        return this.code;
    }
    
    public Instant getDateVente() {
        return this.dateVente;
    }
    
    public String getCommentaire() {
        return this.commentaire;
    }
    
    public Integer getIdEntreprise() {
        return this.idEntreprise;
    }
    
    public List<LigneVente> getLigneVentes() {
        return this.ligneVentes;
    }
    
    public void setCode(final String code) {
        this.code = code;
    }
    
    public void setDateVente(final Instant dateVente) {
        this.dateVente = dateVente;
    }
    
    public void setCommentaire(final String commentaire) {
        this.commentaire = commentaire;
    }
    
    public void setIdEntreprise(final Integer idEntreprise) {
        this.idEntreprise = idEntreprise;
    }
    
    public void setLigneVentes(final List<LigneVente> ligneVentes) {
        this.ligneVentes = ligneVentes;
    }
    
    @Override
    public String toString() {
        return invokedynamic(makeConcatWithConstants:(Ljava/lang/String;Ljava/time/Instant;Ljava/lang/String;Ljava/lang/Integer;Ljava/util/List;)Ljava/lang/String;, this.getCode(), this.getDateVente(), this.getCommentaire(), this.getIdEntreprise(), this.getLigneVentes());
    }
    
    public Ventes() {
    }
    
    public Ventes(final String code, final Instant dateVente, final String commentaire, final Integer idEntreprise, final List<LigneVente> ligneVentes) {
        this.code = code;
        this.dateVente = dateVente;
        this.commentaire = commentaire;
        this.idEntreprise = idEntreprise;
        this.ligneVentes = ligneVentes;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof Ventes)) {
            return false;
        }
        final Ventes other = (Ventes)o;
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
        final Object this$dateVente = this.getDateVente();
        final Object other$dateVente = other.getDateVente();
        Label_0149: {
            if (this$dateVente == null) {
                if (other$dateVente == null) {
                    break Label_0149;
                }
            }
            else if (this$dateVente.equals(other$dateVente)) {
                break Label_0149;
            }
            return false;
        }
        final Object this$commentaire = this.getCommentaire();
        final Object other$commentaire = other.getCommentaire();
        Label_0186: {
            if (this$commentaire == null) {
                if (other$commentaire == null) {
                    break Label_0186;
                }
            }
            else if (this$commentaire.equals(other$commentaire)) {
                break Label_0186;
            }
            return false;
        }
        final Object this$ligneVentes = this.getLigneVentes();
        final Object other$ligneVentes = other.getLigneVentes();
        if (this$ligneVentes == null) {
            if (other$ligneVentes == null) {
                return true;
            }
        }
        else if (this$ligneVentes.equals(other$ligneVentes)) {
            return true;
        }
        return false;
    }
    
    @Override
    protected boolean canEqual(final Object other) {
        return other instanceof Ventes;
    }
    
    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        final Object $idEntreprise = this.getIdEntreprise();
        result = result * 59 + (($idEntreprise == null) ? 43 : $idEntreprise.hashCode());
        final Object $code = this.getCode();
        result = result * 59 + (($code == null) ? 43 : $code.hashCode());
        final Object $dateVente = this.getDateVente();
        result = result * 59 + (($dateVente == null) ? 43 : $dateVente.hashCode());
        final Object $commentaire = this.getCommentaire();
        result = result * 59 + (($commentaire == null) ? 43 : $commentaire.hashCode());
        final Object $ligneVentes = this.getLigneVentes();
        result = result * 59 + (($ligneVentes == null) ? 43 : $ligneVentes.hashCode());
        return result;
    }
}