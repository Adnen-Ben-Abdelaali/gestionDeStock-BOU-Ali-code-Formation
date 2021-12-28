package com.bouali.gestiondestock.controller.api;

import com.bouali.gestiondestock.dto.*;
import io.swagger.annotations.*;
import java.util.*;
import org.springframework.web.bind.annotation.*;

@Api("categories")
public interface CategoryApi
{
    @PostMapping(value = { "gestiondestock/v1/categories/create" }, consumes = { "application/json" }, produces = { "application/json" })
    @ApiOperation(value = "Enregistrer une categorie", notes = "Cette methode permet d'enregistrer ou modifier une categorie", response = CategoryDto.class)
    @ApiResponses({ @ApiResponse(code = 200, message = "L'objet category cree / modifie"), @ApiResponse(code = 400, message = "L'objet category n'est pas valide") })
    CategoryDto save(@RequestBody final CategoryDto dto);
    
    @GetMapping(value = { "gestiondestock/v1/categories/{idCategory}" }, produces = { "application/json" })
    @ApiOperation(value = "Rechercher une categorie par ID", notes = "Cette methode permet de chercher une categorie par son ID", response = CategoryDto.class)
    @ApiResponses({ @ApiResponse(code = 200, message = "La categorie a ete trouve dans la BDD"), @ApiResponse(code = 404, message = "Aucune categorie n'existe dans la BDD avec l'ID fourni") })
    CategoryDto findById(@PathVariable("idCategory") final Integer idCategory);
    
    @GetMapping(value = { "gestiondestock/v1/categories/filter/{codeCategory}" }, produces = { "application/json" })
    @ApiOperation(value = "Rechercher une categorie par CODE", notes = "Cette methode permet de chercher une categorie par son CODE", response = CategoryDto.class)
    @ApiResponses({ @ApiResponse(code = 200, message = "L'article a ete trouve dans la BDD"), @ApiResponse(code = 404, message = "Aucun article n'existe dans la BDD avec le CODE fourni") })
    CategoryDto findByCode(@PathVariable("codeCategory") final String codeCategory);
    
    @GetMapping(value = { "gestiondestock/v1/categories/all" }, produces = { "application/json" })
    @ApiOperation(value = "Renvoi la liste des categories", notes = "Cette methode permet de chercher et renvoyer la liste des categories qui existent dans la BDD", responseContainer = "List<CategoryDto>")
    @ApiResponses({ @ApiResponse(code = 200, message = "La liste des article / Une liste vide") })
    List<CategoryDto> findAll();
    
    @DeleteMapping({ "gestiondestock/v1/categories/delete/{idCategory}" })
    @ApiOperation(value = "Supprimer un article", notes = "Cette methode permet de supprimer une categorie par ID")
    @ApiResponses({ @ApiResponse(code = 200, message = "La categorie a ete supprime") })
    void delete(@PathVariable("idCategory") final Integer id);
}