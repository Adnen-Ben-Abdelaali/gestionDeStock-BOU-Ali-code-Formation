package com.bouali.gestiondestock.controller.api;

import io.swagger.annotations.*;
import com.bouali.gestiondestock.model.*;
import java.math.*;
import org.springframework.web.bind.annotation.*;
import java.util.*;
import com.bouali.gestiondestock.dto.*;

@Api("commandefournisseur")
public interface CommandeFournisseurApi
{
    @PostMapping({ "gestiondestock/v1/commandesfournisseurs/create" })
    CommandeFournisseurDto save(@RequestBody final CommandeFournisseurDto dto);
    
    @PatchMapping({ "gestiondestock/v1/commandesfournisseurs/update/etat/{idCommande}/{etatCommande}" })
    CommandeFournisseurDto updateEtatCommande(@PathVariable("idCommande") final Integer idCommande, @PathVariable("etatCommande") final EtatCommande etatCommande);
    
    @PatchMapping({ "gestiondestock/v1/commandesfournisseurs/update/quantite/{idCommande}/{idLigneCommande}/{quantite}" })
    CommandeFournisseurDto updateQuantiteCommande(@PathVariable("idCommande") final Integer idCommande, @PathVariable("idLigneCommande") final Integer idLigneCommande, @PathVariable("quantite") final BigDecimal quantite);
    
    @PatchMapping({ "gestiondestock/v1/commandesfournisseurs/update/fournisseur/{idCommande}/{idFournisseur}" })
    CommandeFournisseurDto updateFournisseur(@PathVariable("idCommande") final Integer idCommande, @PathVariable("idFournisseur") final Integer idFournisseur);
    
    @PatchMapping({ "gestiondestock/v1/commandesfournisseurs/update/article/{idCommande}/{idLigneCommande}/{idArticle}" })
    CommandeFournisseurDto updateArticle(@PathVariable("idCommande") final Integer idCommande, @PathVariable("idLigneCommande") final Integer idLigneCommande, @PathVariable("idArticle") final Integer idArticle);
    
    @DeleteMapping({ "gestiondestock/v1/commandesfournisseurs/delete/article/{idCommande}/{idLigneCommande}" })
    CommandeFournisseurDto deleteArticle(@PathVariable("idCommande") final Integer idCommande, @PathVariable("idLigneCommande") final Integer idLigneCommande);
    
    @GetMapping({ "gestiondestock/v1/commandesfournisseurs/{idCommandeFournisseur}" })
    CommandeFournisseurDto findById(@PathVariable("idCommandeFournisseur") final Integer id);
    
    @GetMapping({ "gestiondestock/v1/commandesfournisseurs/filter/{codeCommandeFournisseur}" })
    CommandeFournisseurDto findByCode(@PathVariable("codeCommandeFournisseur") final String code);
    
    @GetMapping({ "gestiondestock/v1/commandesfournisseurs/all" })
    List<CommandeFournisseurDto> findAll();
    
    @GetMapping({ "gestiondestock/v1/commandesfournisseurs/lignesCommande/{idCommande}" })
    List<LigneCommandeFournisseurDto> findAllLignesCommandesFournisseurByCommandeFournisseurId(@PathVariable("idCommande") final Integer idCommande);
    
    @DeleteMapping({ "gestiondestock/v1/commandesfournisseurs/delete/{idCommandeFournisseur}" })
    void delete(@PathVariable("idCommandeFournisseur") final Integer id);
}