package com.bouali.gestiondestock.services.impl;

import com.bouali.gestiondestock.services.*;
import org.springframework.stereotype.*;
import com.bouali.gestiondestock.repository.*;
import org.springframework.beans.factory.annotation.*;
import com.bouali.gestiondestock.validator.*;
import java.util.*;
import java.util.function.*;
import org.springframework.util.*;
import java.util.stream.*;
import com.bouali.gestiondestock.dto.*;
import com.bouali.gestiondestock.exception.*;
import com.bouali.gestiondestock.model.*;
import org.slf4j.*;

@Service
public class ArticleServiceImpl implements ArticleService
{
    private static final Logger log;
    private ArticleRepository articleRepository;
    private LigneVenteRepository venteRepository;
    private LigneCommandeFournisseurRepository commandeFournisseurRepository;
    private LigneCommandeClientRepository commandeClientRepository;
    
    @Autowired
    public ArticleServiceImpl(final ArticleRepository articleRepository, final LigneVenteRepository venteRepository, final LigneCommandeFournisseurRepository commandeFournisseurRepository, final LigneCommandeClientRepository commandeClientRepository) {
        this.articleRepository = articleRepository;
        this.venteRepository = venteRepository;
        this.commandeFournisseurRepository = commandeFournisseurRepository;
        this.commandeClientRepository = commandeClientRepository;
    }
    
    public ArticleDto save(final ArticleDto dto) {
        final List<String> errors = (List<String>)ArticleValidator.validate(dto);
        if (!errors.isEmpty()) {
            ArticleServiceImpl.log.error("Article is not valid {}", (Object)dto);
            throw new InvalidEntityException("L'article n'est pas valide", ErrorCodes.ARTICLE_NOT_VALID, errors);
        }
        return ArticleDto.fromEntity((Article)this.articleRepository.save((Object)ArticleDto.toEntity(dto)));
    }
    
    public ArticleDto findById(final Integer id) {
        if (id == null) {
            ArticleServiceImpl.log.error("Article ID is null");
            return null;
        }
        return this.articleRepository.findById((Object)id).map(ArticleDto::fromEntity).orElseThrow(() -> new EntityNotFoundException(invokedynamic(makeConcatWithConstants:(Ljava/lang/Integer;)Ljava/lang/String;, id), ErrorCodes.ARTICLE_NOT_FOUND));
    }
    
    public ArticleDto findByCodeArticle(final String codeArticle) {
        if (!StringUtils.hasLength(codeArticle)) {
            ArticleServiceImpl.log.error("Article CODE is null");
            return null;
        }
        return this.articleRepository.findArticleByCodeArticle(codeArticle).map((Function<? super Article, ? extends ArticleDto>)ArticleDto::fromEntity).orElseThrow(() -> new EntityNotFoundException(invokedynamic(makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;, codeArticle), ErrorCodes.ARTICLE_NOT_FOUND));
    }
    
    public List<ArticleDto> findAll() {
        return (List<ArticleDto>)this.articleRepository.findAll().stream().map(ArticleDto::fromEntity).collect(Collectors.toList());
    }
    
    public List<LigneVenteDto> findHistoriqueVentes(final Integer idArticle) {
        return this.venteRepository.findAllByArticleId(idArticle).stream().map((Function<? super Object, ?>)LigneVenteDto::fromEntity).collect((Collector<? super Object, ?, List<LigneVenteDto>>)Collectors.toList());
    }
    
    public List<LigneCommandeClientDto> findHistoriaueCommandeClient(final Integer idArticle) {
        return this.commandeClientRepository.findAllByArticleId(idArticle).stream().map((Function<? super Object, ?>)LigneCommandeClientDto::fromEntity).collect((Collector<? super Object, ?, List<LigneCommandeClientDto>>)Collectors.toList());
    }
    
    public List<LigneCommandeFournisseurDto> findHistoriqueCommandeFournisseur(final Integer idArticle) {
        return this.commandeFournisseurRepository.findAllByArticleId(idArticle).stream().map((Function<? super Object, ?>)LigneCommandeFournisseurDto::fromEntity).collect((Collector<? super Object, ?, List<LigneCommandeFournisseurDto>>)Collectors.toList());
    }
    
    public List<ArticleDto> findAllArticleByIdCategory(final Integer idCategory) {
        return this.articleRepository.findAllByCategoryId(idCategory).stream().map((Function<? super Object, ?>)ArticleDto::fromEntity).collect((Collector<? super Object, ?, List<ArticleDto>>)Collectors.toList());
    }
    
    public void delete(final Integer id) {
        if (id == null) {
            ArticleServiceImpl.log.error("Article ID is null");
            return;
        }
        final List<LigneCommandeClient> ligneCommandeClients = this.commandeClientRepository.findAllByArticleId(id);
        if (!ligneCommandeClients.isEmpty()) {
            throw new InvalidOperationException("Impossible de supprimer un article deja utilise dans des commandes client", ErrorCodes.ARTICLE_ALREADY_IN_USE);
        }
        final List<LigneCommandeFournisseur> ligneCommandeFournisseurs = this.commandeFournisseurRepository.findAllByArticleId(id);
        if (!ligneCommandeFournisseurs.isEmpty()) {
            throw new InvalidOperationException("Impossible de supprimer un article deja utilise dans des commandes fournisseur", ErrorCodes.ARTICLE_ALREADY_IN_USE);
        }
        final List<LigneVente> ligneVentes = this.venteRepository.findAllByArticleId(id);
        if (!ligneVentes.isEmpty()) {
            throw new InvalidOperationException("Impossible de supprimer un article deja utilise dans des ventes", ErrorCodes.ARTICLE_ALREADY_IN_USE);
        }
        this.articleRepository.deleteById((Object)id);
    }
    
    static {
        log = LoggerFactory.getLogger((Class)ArticleServiceImpl.class);
    }
}