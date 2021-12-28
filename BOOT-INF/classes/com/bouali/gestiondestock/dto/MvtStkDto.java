package com.bouali.gestiondestock.dto;

import java.time.*;
import java.math.*;
import com.bouali.gestiondestock.model.*;

public class MvtStkDto
{
    private Integer id;
    private Instant dateMvt;
    private BigDecimal quantite;
    private ArticleDto article;
    private TypeMvtStk typeMvt;
    private SourceMvtStk sourceMvt;
    private Integer idEntreprise;
    
    public static MvtStkDto fromEntity(final MvtStk mvtStk) {
        if (mvtStk == null) {
            return null;
        }
        return builder().id(mvtStk.getId()).dateMvt(mvtStk.getDateMvt()).quantite(mvtStk.getQuantite()).article(ArticleDto.fromEntity(mvtStk.getArticle())).typeMvt(mvtStk.getTypeMvt()).sourceMvt(mvtStk.getSourceMvt()).idEntreprise(mvtStk.getIdEntreprise()).build();
    }
    
    public static MvtStk toEntity(final MvtStkDto dto) {
        if (dto == null) {
            return null;
        }
        final MvtStk mvtStk = new MvtStk();
        mvtStk.setId(dto.getId());
        mvtStk.setDateMvt(dto.getDateMvt());
        mvtStk.setQuantite(dto.getQuantite());
        mvtStk.setArticle(ArticleDto.toEntity(dto.getArticle()));
        mvtStk.setTypeMvt(dto.getTypeMvt());
        mvtStk.setSourceMvt(dto.getSourceMvt());
        mvtStk.setIdEntreprise(dto.getIdEntreprise());
        return mvtStk;
    }
    
    MvtStkDto(final Integer id, final Instant dateMvt, final BigDecimal quantite, final ArticleDto article, final TypeMvtStk typeMvt, final SourceMvtStk sourceMvt, final Integer idEntreprise) {
        this.id = id;
        this.dateMvt = dateMvt;
        this.quantite = quantite;
        this.article = article;
        this.typeMvt = typeMvt;
        this.sourceMvt = sourceMvt;
        this.idEntreprise = idEntreprise;
    }
    
    public static MvtStkDtoBuilder builder() {
        return new MvtStkDtoBuilder();
    }
    
    public Integer getId() {
        return this.id;
    }
    
    public Instant getDateMvt() {
        return this.dateMvt;
    }
    
    public BigDecimal getQuantite() {
        return this.quantite;
    }
    
    public ArticleDto getArticle() {
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
    
    public void setId(final Integer id) {
        this.id = id;
    }
    
    public void setDateMvt(final Instant dateMvt) {
        this.dateMvt = dateMvt;
    }
    
    public void setQuantite(final BigDecimal quantite) {
        this.quantite = quantite;
    }
    
    public void setArticle(final ArticleDto article) {
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
    public boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof MvtStkDto)) {
            return false;
        }
        final MvtStkDto other = (MvtStkDto)o;
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
        final Object this$dateMvt = this.getDateMvt();
        final Object other$dateMvt = other.getDateMvt();
        Label_0139: {
            if (this$dateMvt == null) {
                if (other$dateMvt == null) {
                    break Label_0139;
                }
            }
            else if (this$dateMvt.equals(other$dateMvt)) {
                break Label_0139;
            }
            return false;
        }
        final Object this$quantite = this.getQuantite();
        final Object other$quantite = other.getQuantite();
        Label_0176: {
            if (this$quantite == null) {
                if (other$quantite == null) {
                    break Label_0176;
                }
            }
            else if (this$quantite.equals(other$quantite)) {
                break Label_0176;
            }
            return false;
        }
        final Object this$article = this.getArticle();
        final Object other$article = other.getArticle();
        Label_0213: {
            if (this$article == null) {
                if (other$article == null) {
                    break Label_0213;
                }
            }
            else if (this$article.equals(other$article)) {
                break Label_0213;
            }
            return false;
        }
        final Object this$typeMvt = this.getTypeMvt();
        final Object other$typeMvt = other.getTypeMvt();
        Label_0250: {
            if (this$typeMvt == null) {
                if (other$typeMvt == null) {
                    break Label_0250;
                }
            }
            else if (this$typeMvt.equals(other$typeMvt)) {
                break Label_0250;
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
    
    protected boolean canEqual(final Object other) {
        return other instanceof MvtStkDto;
    }
    
    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $id = this.getId();
        result = result * 59 + (($id == null) ? 43 : $id.hashCode());
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
    
    @Override
    public String toString() {
        return invokedynamic(makeConcatWithConstants:(Ljava/lang/Integer;Ljava/time/Instant;Ljava/math/BigDecimal;Lcom/bouali/gestiondestock/dto/ArticleDto;Lcom/bouali/gestiondestock/model/TypeMvtStk;Lcom/bouali/gestiondestock/model/SourceMvtStk;Ljava/lang/Integer;)Ljava/lang/String;, this.getId(), this.getDateMvt(), this.getQuantite(), this.getArticle(), this.getTypeMvt(), this.getSourceMvt(), this.getIdEntreprise());
    }
    
    public static class MvtStkDtoBuilder
    {
        private Integer id;
        private Instant dateMvt;
        private BigDecimal quantite;
        private ArticleDto article;
        private TypeMvtStk typeMvt;
        private SourceMvtStk sourceMvt;
        private Integer idEntreprise;
        
        MvtStkDtoBuilder() {
        }
        
        public MvtStkDtoBuilder id(final Integer id) {
            this.id = id;
            return this;
        }
        
        public MvtStkDtoBuilder dateMvt(final Instant dateMvt) {
            this.dateMvt = dateMvt;
            return this;
        }
        
        public MvtStkDtoBuilder quantite(final BigDecimal quantite) {
            this.quantite = quantite;
            return this;
        }
        
        public MvtStkDtoBuilder article(final ArticleDto article) {
            this.article = article;
            return this;
        }
        
        public MvtStkDtoBuilder typeMvt(final TypeMvtStk typeMvt) {
            this.typeMvt = typeMvt;
            return this;
        }
        
        public MvtStkDtoBuilder sourceMvt(final SourceMvtStk sourceMvt) {
            this.sourceMvt = sourceMvt;
            return this;
        }
        
        public MvtStkDtoBuilder idEntreprise(final Integer idEntreprise) {
            this.idEntreprise = idEntreprise;
            return this;
        }
        
        public MvtStkDto build() {
            return new MvtStkDto(this.id, this.dateMvt, this.quantite, this.article, this.typeMvt, this.sourceMvt, this.idEntreprise);
        }
        
        @Override
        public String toString() {
            return invokedynamic(makeConcatWithConstants:(Ljava/lang/Integer;Ljava/time/Instant;Ljava/math/BigDecimal;Lcom/bouali/gestiondestock/dto/ArticleDto;Lcom/bouali/gestiondestock/model/TypeMvtStk;Lcom/bouali/gestiondestock/model/SourceMvtStk;Ljava/lang/Integer;)Ljava/lang/String;, this.id, this.dateMvt, this.quantite, this.article, this.typeMvt, this.sourceMvt, this.idEntreprise);
        }
    }
}