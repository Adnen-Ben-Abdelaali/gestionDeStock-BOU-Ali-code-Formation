package com.bouali.gestiondestock.services;

import java.util.*;
import com.bouali.gestiondestock.dto.*;

public interface ArticleService
{
    ArticleDto save(final ArticleDto dto);
    
    ArticleDto findById(final Integer id);
    
    ArticleDto findByCodeArticle(final String codeArticle);
    
    List<ArticleDto> findAll();
    
    List<LigneVenteDto> findHistoriqueVentes(final Integer idArticle);
    
    List<LigneCommandeClientDto> findHistoriaueCommandeClient(final Integer idArticle);
    
    List<LigneCommandeFournisseurDto> findHistoriqueCommandeFournisseur(final Integer idArticle);
    
    List<ArticleDto> findAllArticleByIdCategory(final Integer idCategory);
    
    void delete(final Integer id);
}