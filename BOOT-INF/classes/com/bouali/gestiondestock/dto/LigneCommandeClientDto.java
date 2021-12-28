package com.bouali.gestiondestock.dto;

import com.fasterxml.jackson.annotation.*;
import java.math.*;
import com.bouali.gestiondestock.model.*;

public class LigneCommandeClientDto
{
    private Integer id;
    private ArticleDto article;
    @JsonIgnore
    private CommandeClientDto commandeClient;
    private BigDecimal quantite;
    private BigDecimal prixUnitaire;
    private Integer idEntreprise;
    
    public static LigneCommandeClientDto fromEntity(final LigneCommandeClient ligneCommandeClient) {
        if (ligneCommandeClient == null) {
            return null;
        }
        return builder().id(ligneCommandeClient.getId()).article(ArticleDto.fromEntity(ligneCommandeClient.getArticle())).quantite(ligneCommandeClient.getQuantite()).prixUnitaire(ligneCommandeClient.getPrixUnitaire()).idEntreprise(ligneCommandeClient.getIdEntreprise()).build();
    }
    
    public static LigneCommandeClient toEntity(final LigneCommandeClientDto dto) {
        if (dto == null) {
            return null;
        }
        final LigneCommandeClient ligneCommandeClient = new LigneCommandeClient();
        ligneCommandeClient.setId(dto.getId());
        ligneCommandeClient.setArticle(ArticleDto.toEntity(dto.getArticle()));
        ligneCommandeClient.setPrixUnitaire(dto.getPrixUnitaire());
        ligneCommandeClient.setQuantite(dto.getQuantite());
        ligneCommandeClient.setIdEntreprise(dto.getIdEntreprise());
        return ligneCommandeClient;
    }
    
    LigneCommandeClientDto(final Integer id, final ArticleDto article, final CommandeClientDto commandeClient, final BigDecimal quantite, final BigDecimal prixUnitaire, final Integer idEntreprise) {
        this.id = id;
        this.article = article;
        this.commandeClient = commandeClient;
        this.quantite = quantite;
        this.prixUnitaire = prixUnitaire;
        this.idEntreprise = idEntreprise;
    }
    
    public static LigneCommandeClientDtoBuilder builder() {
        return new LigneCommandeClientDtoBuilder();
    }
    
    public Integer getId() {
        return this.id;
    }
    
    public ArticleDto getArticle() {
        return this.article;
    }
    
    public CommandeClientDto getCommandeClient() {
        return this.commandeClient;
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
    
    public void setArticle(final ArticleDto article) {
        this.article = article;
    }
    
    @JsonIgnore
    public void setCommandeClient(final CommandeClientDto commandeClient) {
        this.commandeClient = commandeClient;
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
        if (!(o instanceof LigneCommandeClientDto)) {
            return false;
        }
        final LigneCommandeClientDto other = (LigneCommandeClientDto)o;
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
        final Object this$article = this.getArticle();
        final Object other$article = other.getArticle();
        Label_0139: {
            if (this$article == null) {
                if (other$article == null) {
                    break Label_0139;
                }
            }
            else if (this$article.equals(other$article)) {
                break Label_0139;
            }
            return false;
        }
        final Object this$commandeClient = this.getCommandeClient();
        final Object other$commandeClient = other.getCommandeClient();
        Label_0176: {
            if (this$commandeClient == null) {
                if (other$commandeClient == null) {
                    break Label_0176;
                }
            }
            else if (this$commandeClient.equals(other$commandeClient)) {
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
        return other instanceof LigneCommandeClientDto;
    }
    
    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $id = this.getId();
        result = result * 59 + (($id == null) ? 43 : $id.hashCode());
        final Object $idEntreprise = this.getIdEntreprise();
        result = result * 59 + (($idEntreprise == null) ? 43 : $idEntreprise.hashCode());
        final Object $article = this.getArticle();
        result = result * 59 + (($article == null) ? 43 : $article.hashCode());
        final Object $commandeClient = this.getCommandeClient();
        result = result * 59 + (($commandeClient == null) ? 43 : $commandeClient.hashCode());
        final Object $quantite = this.getQuantite();
        result = result * 59 + (($quantite == null) ? 43 : $quantite.hashCode());
        final Object $prixUnitaire = this.getPrixUnitaire();
        result = result * 59 + (($prixUnitaire == null) ? 43 : $prixUnitaire.hashCode());
        return result;
    }
    
    @Override
    public String toString() {
        return invokedynamic(makeConcatWithConstants:(Ljava/lang/Integer;Lcom/bouali/gestiondestock/dto/ArticleDto;Lcom/bouali/gestiondestock/dto/CommandeClientDto;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/Integer;)Ljava/lang/String;, this.getId(), this.getArticle(), this.getCommandeClient(), this.getQuantite(), this.getPrixUnitaire(), this.getIdEntreprise());
    }
    
    public static class LigneCommandeClientDtoBuilder
    {
        private Integer id;
        private ArticleDto article;
        private CommandeClientDto commandeClient;
        private BigDecimal quantite;
        private BigDecimal prixUnitaire;
        private Integer idEntreprise;
        
        LigneCommandeClientDtoBuilder() {
        }
        
        public LigneCommandeClientDtoBuilder id(final Integer id) {
            this.id = id;
            return this;
        }
        
        public LigneCommandeClientDtoBuilder article(final ArticleDto article) {
            this.article = article;
            return this;
        }
        
        @JsonIgnore
        public LigneCommandeClientDtoBuilder commandeClient(final CommandeClientDto commandeClient) {
            this.commandeClient = commandeClient;
            return this;
        }
        
        public LigneCommandeClientDtoBuilder quantite(final BigDecimal quantite) {
            this.quantite = quantite;
            return this;
        }
        
        public LigneCommandeClientDtoBuilder prixUnitaire(final BigDecimal prixUnitaire) {
            this.prixUnitaire = prixUnitaire;
            return this;
        }
        
        public LigneCommandeClientDtoBuilder idEntreprise(final Integer idEntreprise) {
            this.idEntreprise = idEntreprise;
            return this;
        }
        
        public LigneCommandeClientDto build() {
            return new LigneCommandeClientDto(this.id, this.article, this.commandeClient, this.quantite, this.prixUnitaire, this.idEntreprise);
        }
        
        @Override
        public String toString() {
            return invokedynamic(makeConcatWithConstants:(Ljava/lang/Integer;Lcom/bouali/gestiondestock/dto/ArticleDto;Lcom/bouali/gestiondestock/dto/CommandeClientDto;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/Integer;)Ljava/lang/String;, this.id, this.article, this.commandeClient, this.quantite, this.prixUnitaire, this.idEntreprise);
        }
    }
}