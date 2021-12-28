package com.bouali.gestiondestock.controller.api;

import io.swagger.annotations.*;
import org.springframework.http.*;
import com.bouali.gestiondestock.model.*;
import java.math.*;
import org.springframework.web.bind.annotation.*;
import java.util.*;
import com.bouali.gestiondestock.dto.*;

@Api("commandesclients")
public interface CommandeClientApi
{
    @PostMapping({ "gestiondestock/v1/commandesclients/create" })
    ResponseEntity<CommandeClientDto> save(@RequestBody final CommandeClientDto dto);
    
    @PatchMapping({ "gestiondestock/v1/commandesclients/update/etat/{idCommande}/{etatCommande}" })
    ResponseEntity<CommandeClientDto> updateEtatCommande(@PathVariable("idCommande") final Integer idCommande, @PathVariable("etatCommande") final EtatCommande etatCommande);
    
    @PatchMapping({ "gestiondestock/v1/commandesclients/update/quantite/{idCommande}/{idLigneCommande}/{quantite}" })
    ResponseEntity<CommandeClientDto> updateQuantiteCommande(@PathVariable("idCommande") final Integer idCommande, @PathVariable("idLigneCommande") final Integer idLigneCommande, @PathVariable("quantite") final BigDecimal quantite);
    
    @PatchMapping({ "gestiondestock/v1/commandesclients/update/client/{idCommande}/{idClient}" })
    ResponseEntity<CommandeClientDto> updateClient(@PathVariable("idCommande") final Integer idCommande, @PathVariable("idClient") final Integer idClient);
    
    @PatchMapping({ "gestiondestock/v1/commandesclients/update/article/{idCommande}/{idLigneCommande}/{idArticle}" })
    ResponseEntity<CommandeClientDto> updateArticle(@PathVariable("idCommande") final Integer idCommande, @PathVariable("idLigneCommande") final Integer idLigneCommande, @PathVariable("idArticle") final Integer idArticle);
    
    @DeleteMapping({ "gestiondestock/v1/commandesclients/delete/article/{idCommande}/{idLigneCommande}" })
    ResponseEntity<CommandeClientDto> deleteArticle(@PathVariable("idCommande") final Integer idCommande, @PathVariable("idLigneCommande") final Integer idLigneCommande);
    
    @GetMapping({ "gestiondestock/v1/commandesclients/{idCommandeClient}" })
    ResponseEntity<CommandeClientDto> findById(@PathVariable final Integer idCommandeClient);
    
    @GetMapping({ "gestiondestock/v1/commandesclients/filter/{codeCommandeClient}" })
    ResponseEntity<CommandeClientDto> findByCode(@PathVariable("codeCommandeClient") final String code);
    
    @GetMapping({ "gestiondestock/v1/commandesclients/all" })
    ResponseEntity<List<CommandeClientDto>> findAll();
    
    @GetMapping({ "gestiondestock/v1/commandesclients/lignesCommande/{idCommande}" })
    ResponseEntity<List<LigneCommandeClientDto>> findAllLignesCommandesClientByCommandeClientId(@PathVariable("idCommande") final Integer idCommande);
    
    @DeleteMapping({ "gestiondestock/v1/commandesclients/delete/{idCommandeClient}" })
    ResponseEntity<Void> delete(@PathVariable("idCommandeClient") final Integer id);
}