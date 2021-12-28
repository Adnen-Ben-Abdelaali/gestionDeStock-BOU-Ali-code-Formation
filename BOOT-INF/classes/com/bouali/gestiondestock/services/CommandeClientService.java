package com.bouali.gestiondestock.services;

import com.bouali.gestiondestock.model.*;
import java.math.*;
import java.util.*;
import com.bouali.gestiondestock.dto.*;

public interface CommandeClientService
{
    CommandeClientDto save(final CommandeClientDto dto);
    
    CommandeClientDto updateEtatCommande(final Integer idCommande, final EtatCommande etatCommande);
    
    CommandeClientDto updateQuantiteCommande(final Integer idCommande, final Integer idLigneCommande, final BigDecimal quantite);
    
    CommandeClientDto updateClient(final Integer idCommande, final Integer idClient);
    
    CommandeClientDto updateArticle(final Integer idCommande, final Integer idLigneCommande, final Integer newIdArticle);
    
    CommandeClientDto deleteArticle(final Integer idCommande, final Integer idLigneCommande);
    
    CommandeClientDto findById(final Integer id);
    
    CommandeClientDto findByCode(final String code);
    
    List<CommandeClientDto> findAll();
    
    List<LigneCommandeClientDto> findAllLignesCommandesClientByCommandeClientId(final Integer idCommande);
    
    void delete(final Integer id);
}