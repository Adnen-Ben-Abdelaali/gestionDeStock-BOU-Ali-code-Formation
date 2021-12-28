package com.bouali.gestiondestock.model;

import java.util.*;
import javax.persistence.*;

@Entity
@Table(name = "category")
public class Category extends AbstractEntity
{
    @Column(name = "code")
    private String code;
    @Column(name = "designation")
    private String designation;
    @Column(name = "identreprise")
    private Integer idEntreprise;
    @OneToMany(mappedBy = "category")
    private List<Article> articles;
    
    public String getCode() {
        return this.code;
    }
    
    public String getDesignation() {
        return this.designation;
    }
    
    public Integer getIdEntreprise() {
        return this.idEntreprise;
    }
    
    public List<Article> getArticles() {
        return this.articles;
    }
    
    public void setCode(final String code) {
        this.code = code;
    }
    
    public void setDesignation(final String designation) {
        this.designation = designation;
    }
    
    public void setIdEntreprise(final Integer idEntreprise) {
        this.idEntreprise = idEntreprise;
    }
    
    public void setArticles(final List<Article> articles) {
        this.articles = articles;
    }
    
    @Override
    public String toString() {
        return invokedynamic(makeConcatWithConstants:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/util/List;)Ljava/lang/String;, this.getCode(), this.getDesignation(), this.getIdEntreprise(), this.getArticles());
    }
    
    public Category() {
    }
    
    public Category(final String code, final String designation, final Integer idEntreprise, final List<Article> articles) {
        this.code = code;
        this.designation = designation;
        this.idEntreprise = idEntreprise;
        this.articles = articles;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof Category)) {
            return false;
        }
        final Category other = (Category)o;
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
        final Object this$articles = this.getArticles();
        final Object other$articles = other.getArticles();
        if (this$articles == null) {
            if (other$articles == null) {
                return true;
            }
        }
        else if (this$articles.equals(other$articles)) {
            return true;
        }
        return false;
    }
    
    @Override
    protected boolean canEqual(final Object other) {
        return other instanceof Category;
    }
    
    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        final Object $idEntreprise = this.getIdEntreprise();
        result = result * 59 + (($idEntreprise == null) ? 43 : $idEntreprise.hashCode());
        final Object $code = this.getCode();
        result = result * 59 + (($code == null) ? 43 : $code.hashCode());
        final Object $designation = this.getDesignation();
        result = result * 59 + (($designation == null) ? 43 : $designation.hashCode());
        final Object $articles = this.getArticles();
        result = result * 59 + (($articles == null) ? 43 : $articles.hashCode());
        return result;
    }
}