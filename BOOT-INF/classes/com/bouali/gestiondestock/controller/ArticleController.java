package com.bouali.gestiondestock.controller;

import com.bouali.gestiondestock.controller.api.*;
import org.springframework.web.bind.annotation.*;
import com.bouali.gestiondestock.services.*;
import org.springframework.beans.factory.annotation.*;
import java.util.*;
import com.bouali.gestiondestock.dto.*;

@RestController
public class ArticleController implements ArticleApi
{
    private ArticleService articleService;
    
    @Autowired
    public ArticleController(final ArticleService articleService) {
        this.articleService = articleService;
    }
    
    @Override
    public ArticleDto save(final ArticleDto dto) {
        return this.articleService.save(dto);
    }
    
    @Override
    public ArticleDto findById(final Integer id) {
        return this.articleService.findById(id);
    }
    
    @Override
    public ArticleDto findByCodeArticle(final String codeArticle) {
        return this.articleService.findByCodeArticle(codeArticle);
    }
    
    @Override
    public List<ArticleDto> findAll() {
        return (List<ArticleDto>)this.articleService.findAll();
    }
    
    @Override
    public List<LigneVenteDto> findHistoriqueVentes(final Integer idArticle) {
        return (List<LigneVenteDto>)this.articleService.findHistoriqueVentes(idArticle);
    }
    
    @Override
    public List<LigneCommandeClientDto> findHistoriaueCommandeClient(final Integer idArticle) {
        return (List<LigneCommandeClientDto>)this.articleService.findHistoriaueCommandeClient(idArticle);
    }
    
    @Override
    public List<LigneCommandeFournisseurDto> findHistoriqueCommandeFournisseur(final Integer idArticle) {
        return (List<LigneCommandeFournisseurDto>)this.articleService.findHistoriqueCommandeFournisseur(idArticle);
    }
    
    @Override
    public List<ArticleDto> findAllArticleByIdCategory(final Integer idCategory) {
        return (List<ArticleDto>)this.articleService.findAllArticleByIdCategory(idCategory);
    }
    
    @Override
    public void delete(final Integer id) {
        this.articleService.delete(id);
    }
}