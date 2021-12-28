package com.bouali.gestiondestock.controller;

import com.bouali.gestiondestock.controller.api.*;
import org.springframework.web.bind.annotation.*;
import com.bouali.gestiondestock.services.*;
import org.springframework.beans.factory.annotation.*;
import com.bouali.gestiondestock.model.*;
import java.math.*;
import java.util.*;
import com.bouali.gestiondestock.dto.*;

@RestController
public class CommandeFournisseurController implements CommandeFournisseurApi
{
    private CommandeFournisseurService commandeFournisseurService;
    
    @Autowired
    public CommandeFournisseurController(final CommandeFournisseurService commandeFournisseurService) {
        this.commandeFournisseurService = commandeFournisseurService;
    }
    
    @Override
    public CommandeFournisseurDto save(final CommandeFournisseurDto dto) {
        return this.commandeFournisseurService.save(dto);
    }
    
    @Override
    public CommandeFournisseurDto updateEtatCommande(final Integer idCommande, final EtatCommande etatCommande) {
        return this.commandeFournisseurService.updateEtatCommande(idCommande, etatCommande);
    }
    
    @Override
    public CommandeFournisseurDto updateQuantiteCommande(final Integer idCommande, final Integer idLigneCommande, final BigDecimal quantite) {
        return this.commandeFournisseurService.updateQuantiteCommande(idCommande, idLigneCommande, quantite);
    }
    
    @Override
    public CommandeFournisseurDto updateFournisseur(final Integer idCommande, final Integer idFournisseur) {
        return this.commandeFournisseurService.updateFournisseur(idCommande, idFournisseur);
    }
    
    @Override
    public CommandeFournisseurDto updateArticle(final Integer idCommande, final Integer idLigneCommande, final Integer idArticle) {
        return this.commandeFournisseurService.updateArticle(idCommande, idLigneCommande, idArticle);
    }
    
    @Override
    public CommandeFournisseurDto deleteArticle(final Integer idCommande, final Integer idLigneCommande) {
        return this.commandeFournisseurService.deleteArticle(idCommande, idLigneCommande);
    }
    
    @Override
    public CommandeFournisseurDto findById(final Integer id) {
        return this.commandeFournisseurService.findById(id);
    }
    
    @Override
    public CommandeFournisseurDto findByCode(final String code) {
        return this.commandeFournisseurService.findByCode(code);
    }
    
    @Override
    public List<CommandeFournisseurDto> findAll() {
        return (List<CommandeFournisseurDto>)this.commandeFournisseurService.findAll();
    }
    
    @Override
    public List<LigneCommandeFournisseurDto> findAllLignesCommandesFournisseurByCommandeFournisseurId(final Integer idCommande) {
        return (List<LigneCommandeFournisseurDto>)this.commandeFournisseurService.findAllLignesCommandesFournisseurByCommandeFournisseurId(idCommande);
    }
    
    @Override
    public void delete(final Integer id) {
        this.commandeFournisseurService.delete(id);
    }
}