package com.bouali.gestiondestock.controller.api;

import io.swagger.annotations.*;
import java.util.*;
import com.bouali.gestiondestock.dto.*;
import org.springframework.web.bind.annotation.*;

@Api("articles")
public interface ArticleApi
{
    @PostMapping(value = { "gestiondestock/v1/articles/create" }, consumes = { "application/json" }, produces = { "application/json" })
    @ApiOperation(value = "Enregistrer un article", notes = "Cette methode permet d'enregistrer ou modifier un article", response = ArticleDto.class)
    @ApiResponses({ @ApiResponse(code = 200, message = "L'objet article cree / modifie"), @ApiResponse(code = 400, message = "L'objet article n'est pas valide") })
    ArticleDto save(@RequestBody final ArticleDto dto);
    
    @GetMapping(value = { "gestiondestock/v1/articles/{idArticle}" }, produces = { "application/json" })
    @ApiOperation(value = "Rechercher un article par ID", notes = "Cette methode permet de chercher un article par son ID", response = ArticleDto.class)
    @ApiResponses({ @ApiResponse(code = 200, message = "L'article a ete trouve dans la BDD"), @ApiResponse(code = 404, message = "Aucun article n'existe dans la BDD avec l'ID fourni") })
    ArticleDto findById(@PathVariable("idArticle") final Integer id);
    
    @GetMapping(value = { "gestiondestock/v1/articles/filter/{codeArticle}" }, produces = { "application/json" })
    @ApiOperation(value = "Rechercher un article par CODE", notes = "Cette methode permet de chercher un article par son CODE", response = ArticleDto.class)
    @ApiResponses({ @ApiResponse(code = 200, message = "L'article a ete trouve dans la BDD"), @ApiResponse(code = 404, message = "Aucun article n'existe dans la BDD avec le CODE fourni") })
    ArticleDto findByCodeArticle(@PathVariable("codeArticle") final String codeArticle);
    
    @GetMapping(value = { "gestiondestock/v1/articles/all" }, produces = { "application/json" })
    @ApiOperation(value = "Renvoi la liste des articles", notes = "Cette methode permet de chercher et renvoyer la liste des articles qui existent dans la BDD", responseContainer = "List<ArticleDto>")
    @ApiResponses({ @ApiResponse(code = 200, message = "La liste des article / Une liste vide") })
    List<ArticleDto> findAll();
    
    @GetMapping(value = { "gestiondestock/v1/articles/historique/vente/{idArticle}" }, produces = { "application/json" })
    List<LigneVenteDto> findHistoriqueVentes(@PathVariable("idArticle") final Integer idArticle);
    
    @GetMapping(value = { "gestiondestock/v1/articles/historique/commandeclient/{idArticle}" }, produces = { "application/json" })
    List<LigneCommandeClientDto> findHistoriaueCommandeClient(@PathVariable("idArticle") final Integer idArticle);
    
    @GetMapping(value = { "gestiondestock/v1/articles/historique/commandefournisseur/{idArticle}" }, produces = { "application/json" })
    List<LigneCommandeFournisseurDto> findHistoriqueCommandeFournisseur(@PathVariable("idArticle") final Integer idArticle);
    
    @GetMapping(value = { "gestiondestock/v1/articles/filter/category/{idCategory}" }, produces = { "application/json" })
    List<ArticleDto> findAllArticleByIdCategory(@PathVariable("idCategory") final Integer idCategory);
    
    @DeleteMapping({ "gestiondestock/v1/articles/delete/{idArticle}" })
    @ApiOperation(value = "Supprimer un article", notes = "Cette methode permet de supprimer un article par ID")
    @ApiResponses({ @ApiResponse(code = 200, message = "L'article a ete supprime") })
    void delete(@PathVariable("idArticle") final Integer id);
}