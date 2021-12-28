package com.bouali.gestiondestock.controller;

import com.bouali.gestiondestock.controller.api.*;
import org.springframework.web.bind.annotation.*;
import com.bouali.gestiondestock.services.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.http.*;
import com.bouali.gestiondestock.model.*;
import java.math.*;
import java.util.*;
import com.bouali.gestiondestock.dto.*;

@RestController
public class CommandeClientController implements CommandeClientApi
{
    private CommandeClientService commandeClientService;
    
    @Autowired
    public CommandeClientController(final CommandeClientService commandeClientService) {
        this.commandeClientService = commandeClientService;
    }
    
    @Override
    public ResponseEntity<CommandeClientDto> save(final CommandeClientDto dto) {
        return (ResponseEntity<CommandeClientDto>)ResponseEntity.ok((Object)this.commandeClientService.save(dto));
    }
    
    @Override
    public ResponseEntity<CommandeClientDto> updateEtatCommande(final Integer idCommande, final EtatCommande etatCommande) {
        return (ResponseEntity<CommandeClientDto>)ResponseEntity.ok((Object)this.commandeClientService.updateEtatCommande(idCommande, etatCommande));
    }
    
    @Override
    public ResponseEntity<CommandeClientDto> updateQuantiteCommande(final Integer idCommande, final Integer idLigneCommande, final BigDecimal quantite) {
        return (ResponseEntity<CommandeClientDto>)ResponseEntity.ok((Object)this.commandeClientService.updateQuantiteCommande(idCommande, idLigneCommande, quantite));
    }
    
    @Override
    public ResponseEntity<CommandeClientDto> updateClient(final Integer idCommande, final Integer idClient) {
        return (ResponseEntity<CommandeClientDto>)ResponseEntity.ok((Object)this.commandeClientService.updateClient(idCommande, idClient));
    }
    
    @Override
    public ResponseEntity<CommandeClientDto> updateArticle(final Integer idCommande, final Integer idLigneCommande, final Integer idArticle) {
        return (ResponseEntity<CommandeClientDto>)ResponseEntity.ok((Object)this.commandeClientService.updateArticle(idCommande, idLigneCommande, idArticle));
    }
    
    @Override
    public ResponseEntity<CommandeClientDto> deleteArticle(final Integer idCommande, final Integer idLigneCommande) {
        return (ResponseEntity<CommandeClientDto>)ResponseEntity.ok((Object)this.commandeClientService.deleteArticle(idCommande, idLigneCommande));
    }
    
    @Override
    public ResponseEntity<CommandeClientDto> findById(final Integer id) {
        return (ResponseEntity<CommandeClientDto>)ResponseEntity.ok((Object)this.commandeClientService.findById(id));
    }
    
    @Override
    public ResponseEntity<CommandeClientDto> findByCode(final String code) {
        return (ResponseEntity<CommandeClientDto>)ResponseEntity.ok((Object)this.commandeClientService.findByCode(code));
    }
    
    @Override
    public ResponseEntity<List<CommandeClientDto>> findAll() {
        return (ResponseEntity<List<CommandeClientDto>>)ResponseEntity.ok((Object)this.commandeClientService.findAll());
    }
    
    @Override
    public ResponseEntity<List<LigneCommandeClientDto>> findAllLignesCommandesClientByCommandeClientId(final Integer idCommande) {
        return (ResponseEntity<List<LigneCommandeClientDto>>)ResponseEntity.ok((Object)this.commandeClientService.findAllLignesCommandesClientByCommandeClientId(idCommande));
    }
    
    @Override
    public ResponseEntity<Void> delete(final Integer id) {
        this.commandeClientService.delete(id);
        return (ResponseEntity<Void>)ResponseEntity.ok().build();
    }
}