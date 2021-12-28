package com.bouali.gestiondestock.dto;

import java.math.*;
import com.bouali.gestiondestock.model.*;

public class LigneVenteDto
{
    private Integer id;
    private VentesDto vente;
    private ArticleDto article;
    private BigDecimal quantite;
    private BigDecimal prixUnitaire;
    private Integer idEntreprise;
    
    public static LigneVenteDto fromEntity(final LigneVente ligneVente) {
        if (ligneVente == null) {
            return null;
        }
        return builder().id(ligneVente.getId()).vente(VentesDto.fromEntity(ligneVente.getVente())).article(ArticleDto.fromEntity(ligneVente.getArticle())).quantite(ligneVente.getQuantite()).prixUnitaire(ligneVente.getPrixUnitaire()).idEntreprise(ligneVente.getIdEntreprise()).build();
    }
    
    public static LigneVente toEntity(final LigneVenteDto dto) {
        if (dto == null) {
            return null;
        }
        final LigneVente ligneVente = new LigneVente();
        ligneVente.setId(dto.getId());
        ligneVente.setVente(VentesDto.toEntity(dto.getVente()));
        ligneVente.setArticle(ArticleDto.toEntity(dto.getArticle()));
        ligneVente.setQuantite(dto.getQuantite());
        ligneVente.setPrixUnitaire(dto.getPrixUnitaire());
        ligneVente.setIdEntreprise(dto.getIdEntreprise());
        return ligneVente;
    }
    
    LigneVenteDto(final Integer id, final VentesDto vente, final ArticleDto article, final BigDecimal quantite, final BigDecimal prixUnitaire, final Integer idEntreprise) {
        this.id = id;
        this.vente = vente;
        this.article = article;
        this.quantite = quantite;
        this.prixUnitaire = prixUnitaire;
        this.idEntreprise = idEntreprise;
    }
    
    public static LigneVenteDtoBuilder builder() {
        return new LigneVenteDtoBuilder();
    }
    
    public Integer getId() {
        return this.id;
    }
    
    public VentesDto getVente() {
        return this.vente;
    }
    
    public ArticleDto getArticle() {
        return this.article;
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
    
    public void setId(final Integer id) {
        this.id = id;
    }
    
    public void setVente(final VentesDto vente) {
        this.vente = vente;
    }
    
    public void setArticle(final ArticleDto article) {
        this.article = article;
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
    public boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof LigneVenteDto)) {
            return false;
        }
        final LigneVenteDto other = (LigneVenteDto)o;
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
        final Object this$idEntreprise = this.getIdEntreprise();
        final Object other$idEntreprise = other.getIdEntreprise();
        Label_0102: {
            if (this$idEntreprise == null) {
                if (other$idEntreprise == null) {
                    break Label_0102;
                }
            }
            else if (this$idEntreprise.equals(other$idEntreprise)) {
                break Label_0102;
            }
            return false;
        }
        final Object this$vente = this.getVente();
        final Object other$vente = other.getVente();
        Label_0139: {
            if (this$vente == null) {
                if (other$vente == null) {
                    break Label_0139;
                }
            }
            else if (this$vente.equals(other$vente)) {
                break Label_0139;
            }
            return false;
        }
        final Object this$article = this.getArticle();
        final Object other$article = other.getArticle();
        Label_0176: {
            if (this$article == null) {
                if (other$article == null) {
                    break Label_0176;
                }
            }
            else if (this$article.equals(other$article)) {
                break Label_0176;
            }
            return false;
        }
        final Object this$quantite = this.getQuantite();
        final Object other$quantite = other.getQuantite();
        Label_0213: {
            if (this$quantite == null) {
                if (other$quantite == null) {
                    break Label_0213;
                }
            }
            else if (this$quantite.equals(other$quantite)) {
                break Label_0213;
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
    
    protected boolean canEqual(final Object other) {
        return other instanceof LigneVenteDto;
    }
    
    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $id = this.getId();
        result = result * 59 + (($id == null) ? 43 : $id.hashCode());
        final Object $idEntreprise = this.getIdEntreprise();
        result = result * 59 + (($idEntreprise == null) ? 43 : $idEntreprise.hashCode());
        final Object $vente = this.getVente();
        result = result * 59 + (($vente == null) ? 43 : $vente.hashCode());
        final Object $article = this.getArticle();
        result = result * 59 + (($article == null) ? 43 : $article.hashCode());
        final Object $quantite = this.getQuantite();
        result = result * 59 + (($quantite == null) ? 43 : $quantite.hashCode());
        final Object $prixUnitaire = this.getPrixUnitaire();
        result = result * 59 + (($prixUnitaire == null) ? 43 : $prixUnitaire.hashCode());
        return result;
    }
    
    @Override
    public String toString() {
        return invokedynamic(makeConcatWithConstants:(Ljava/lang/Integer;Lcom/bouali/gestiondestock/dto/VentesDto;Lcom/bouali/gestiondestock/dto/ArticleDto;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/Integer;)Ljava/lang/String;, this.getId(), this.getVente(), this.getArticle(), this.getQuantite(), this.getPrixUnitaire(), this.getIdEntreprise());
    }
    
    public static class LigneVenteDtoBuilder
    {
        private Integer id;
        private VentesDto vente;
        private ArticleDto article;
        private BigDecimal quantite;
        private BigDecimal prixUnitaire;
        private Integer idEntreprise;
        
        LigneVenteDtoBuilder() {
        }
        
        public LigneVenteDtoBuilder id(final Integer id) {
            this.id = id;
            return this;
        }
        
        public LigneVenteDtoBuilder vente(final VentesDto vente) {
            this.vente = vente;
            return this;
        }
        
        public LigneVenteDtoBuilder article(final ArticleDto article) {
            this.article = article;
            return this;
        }
        
        public LigneVenteDtoBuilder quantite(final BigDecimal quantite) {
            this.quantite = quantite;
            return this;
        }
        
        public LigneVenteDtoBuilder prixUnitaire(final BigDecimal prixUnitaire) {
            this.prixUnitaire = prixUnitaire;
            return this;
        }
        
        public LigneVenteDtoBuilder idEntreprise(final Integer idEntreprise) {
            this.idEntreprise = idEntreprise;
            return this;
        }
        
        public LigneVenteDto build() {
            return new LigneVenteDto(this.id, this.vente, this.article, this.quantite, this.prixUnitaire, this.idEntreprise);
        }
        
        @Override
        public String toString() {
            return invokedynamic(makeConcatWithConstants:(Ljava/lang/Integer;Lcom/bouali/gestiondestock/dto/VentesDto;Lcom/bouali/gestiondestock/dto/ArticleDto;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/Integer;)Ljava/lang/String;, this.id, this.vente, this.article, this.quantite, this.prixUnitaire, this.idEntreprise);
        }
    }
}