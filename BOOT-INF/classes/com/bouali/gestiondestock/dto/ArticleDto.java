package com.bouali.gestiondestock.dto;

import java.math.*;
import com.bouali.gestiondestock.model.*;

public class ArticleDto
{
    private Integer id;
    private String codeArticle;
    private String designation;
    private BigDecimal prixUnitaireHt;
    private BigDecimal tauxTva;
    private BigDecimal prixUnitaireTtc;
    private String photo;
    private CategoryDto category;
    private Integer idEntreprise;
    
    public static ArticleDto fromEntity(final Article article) {
        if (article == null) {
            return null;
        }
        return builder().id(article.getId()).codeArticle(article.getCodeArticle()).designation(article.getDesignation()).photo(article.getPhoto()).prixUnitaireHt(article.getPrixUnitaireHt()).prixUnitaireTtc(article.getPrixUnitaireTtc()).tauxTva(article.getTauxTva()).idEntreprise(article.getIdEntreprise()).category(CategoryDto.fromEntity(article.getCategory())).build();
    }
    
    public static Article toEntity(final ArticleDto articleDto) {
        if (articleDto == null) {
            return null;
        }
        final Article article = new Article();
        article.setId(articleDto.getId());
        article.setCodeArticle(articleDto.getCodeArticle());
        article.setDesignation(articleDto.getDesignation());
        article.setPhoto(articleDto.getPhoto());
        article.setPrixUnitaireHt(articleDto.getPrixUnitaireHt());
        article.setPrixUnitaireTtc(articleDto.getPrixUnitaireTtc());
        article.setTauxTva(articleDto.getTauxTva());
        article.setIdEntreprise(articleDto.getIdEntreprise());
        article.setCategory(CategoryDto.toEntity(articleDto.getCategory()));
        return article;
    }
    
    ArticleDto(final Integer id, final String codeArticle, final String designation, final BigDecimal prixUnitaireHt, final BigDecimal tauxTva, final BigDecimal prixUnitaireTtc, final String photo, final CategoryDto category, final Integer idEntreprise) {
        this.id = id;
        this.codeArticle = codeArticle;
        this.designation = designation;
        this.prixUnitaireHt = prixUnitaireHt;
        this.tauxTva = tauxTva;
        this.prixUnitaireTtc = prixUnitaireTtc;
        this.photo = photo;
        this.category = category;
        this.idEntreprise = idEntreprise;
    }
    
    public static ArticleDtoBuilder builder() {
        return new ArticleDtoBuilder();
    }
    
    public Integer getId() {
        return this.id;
    }
    
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
    
    public CategoryDto getCategory() {
        return this.category;
    }
    
    public Integer getIdEntreprise() {
        return this.idEntreprise;
    }
    
    public void setId(final Integer id) {
        this.id = id;
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
    
    public void setCategory(final CategoryDto category) {
        this.category = category;
    }
    
    public void setIdEntreprise(final Integer idEntreprise) {
        this.idEntreprise = idEntreprise;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof ArticleDto)) {
            return false;
        }
        final ArticleDto other = (ArticleDto)o;
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
        final Object this$codeArticle = this.getCodeArticle();
        final Object other$codeArticle = other.getCodeArticle();
        Label_0139: {
            if (this$codeArticle == null) {
                if (other$codeArticle == null) {
                    break Label_0139;
                }
            }
            else if (this$codeArticle.equals(other$codeArticle)) {
                break Label_0139;
            }
            return false;
        }
        final Object this$designation = this.getDesignation();
        final Object other$designation = other.getDesignation();
        Label_0176: {
            if (this$designation == null) {
                if (other$designation == null) {
                    break Label_0176;
                }
            }
            else if (this$designation.equals(other$designation)) {
                break Label_0176;
            }
            return false;
        }
        final Object this$prixUnitaireHt = this.getPrixUnitaireHt();
        final Object other$prixUnitaireHt = other.getPrixUnitaireHt();
        Label_0213: {
            if (this$prixUnitaireHt == null) {
                if (other$prixUnitaireHt == null) {
                    break Label_0213;
                }
            }
            else if (this$prixUnitaireHt.equals(other$prixUnitaireHt)) {
                break Label_0213;
            }
            return false;
        }
        final Object this$tauxTva = this.getTauxTva();
        final Object other$tauxTva = other.getTauxTva();
        Label_0250: {
            if (this$tauxTva == null) {
                if (other$tauxTva == null) {
                    break Label_0250;
                }
            }
            else if (this$tauxTva.equals(other$tauxTva)) {
                break Label_0250;
            }
            return false;
        }
        final Object this$prixUnitaireTtc = this.getPrixUnitaireTtc();
        final Object other$prixUnitaireTtc = other.getPrixUnitaireTtc();
        Label_0287: {
            if (this$prixUnitaireTtc == null) {
                if (other$prixUnitaireTtc == null) {
                    break Label_0287;
                }
            }
            else if (this$prixUnitaireTtc.equals(other$prixUnitaireTtc)) {
                break Label_0287;
            }
            return false;
        }
        final Object this$photo = this.getPhoto();
        final Object other$photo = other.getPhoto();
        Label_0324: {
            if (this$photo == null) {
                if (other$photo == null) {
                    break Label_0324;
                }
            }
            else if (this$photo.equals(other$photo)) {
                break Label_0324;
            }
            return false;
        }
        final Object this$category = this.getCategory();
        final Object other$category = other.getCategory();
        if (this$category == null) {
            if (other$category == null) {
                return true;
            }
        }
        else if (this$category.equals(other$category)) {
            return true;
        }
        return false;
    }
    
    protected boolean canEqual(final Object other) {
        return other instanceof ArticleDto;
    }
    
    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $id = this.getId();
        result = result * 59 + (($id == null) ? 43 : $id.hashCode());
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
        return result;
    }
    
    @Override
    public String toString() {
        return invokedynamic(makeConcatWithConstants:(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/String;Lcom/bouali/gestiondestock/dto/CategoryDto;Ljava/lang/Integer;)Ljava/lang/String;, this.getId(), this.getCodeArticle(), this.getDesignation(), this.getPrixUnitaireHt(), this.getTauxTva(), this.getPrixUnitaireTtc(), this.getPhoto(), this.getCategory(), this.getIdEntreprise());
    }
    
    public static class ArticleDtoBuilder
    {
        private Integer id;
        private String codeArticle;
        private String designation;
        private BigDecimal prixUnitaireHt;
        private BigDecimal tauxTva;
        private BigDecimal prixUnitaireTtc;
        private String photo;
        private CategoryDto category;
        private Integer idEntreprise;
        
        ArticleDtoBuilder() {
        }
        
        public ArticleDtoBuilder id(final Integer id) {
            this.id = id;
            return this;
        }
        
        public ArticleDtoBuilder codeArticle(final String codeArticle) {
            this.codeArticle = codeArticle;
            return this;
        }
        
        public ArticleDtoBuilder designation(final String designation) {
            this.designation = designation;
            return this;
        }
        
        public ArticleDtoBuilder prixUnitaireHt(final BigDecimal prixUnitaireHt) {
            this.prixUnitaireHt = prixUnitaireHt;
            return this;
        }
        
        public ArticleDtoBuilder tauxTva(final BigDecimal tauxTva) {
            this.tauxTva = tauxTva;
            return this;
        }
        
        public ArticleDtoBuilder prixUnitaireTtc(final BigDecimal prixUnitaireTtc) {
            this.prixUnitaireTtc = prixUnitaireTtc;
            return this;
        }
        
        public ArticleDtoBuilder photo(final String photo) {
            this.photo = photo;
            return this;
        }
        
        public ArticleDtoBuilder category(final CategoryDto category) {
            this.category = category;
            return this;
        }
        
        public ArticleDtoBuilder idEntreprise(final Integer idEntreprise) {
            this.idEntreprise = idEntreprise;
            return this;
        }
        
        public ArticleDto build() {
            return new ArticleDto(this.id, this.codeArticle, this.designation, this.prixUnitaireHt, this.tauxTva, this.prixUnitaireTtc, this.photo, this.category, this.idEntreprise);
        }
        
        @Override
        public String toString() {
            return invokedynamic(makeConcatWithConstants:(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/String;Lcom/bouali/gestiondestock/dto/CategoryDto;Ljava/lang/Integer;)Ljava/lang/String;, this.id, this.codeArticle, this.designation, this.prixUnitaireHt, this.tauxTva, this.prixUnitaireTtc, this.photo, this.category, this.idEntreprise);
        }
    }
}