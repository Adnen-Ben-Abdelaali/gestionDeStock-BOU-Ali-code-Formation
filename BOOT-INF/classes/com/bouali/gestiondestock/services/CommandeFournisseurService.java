package com.bouali.gestiondestock.services;

import com.bouali.gestiondestock.model.*;
import java.math.*;
import java.util.*;
import com.bouali.gestiondestock.dto.*;

public interface CommandeFournisseurService
{
    CommandeFournisseurDto save(final CommandeFournisseurDto dto);
    
    CommandeFournisseurDto updateEtatCommande(final Integer idCommande, final EtatCommande etatCommande);
    
    CommandeFournisseurDto updateQuantiteCommande(final Integer idCommande, final Integer idLigneCommande, final BigDecimal quantite);
    
    CommandeFournisseurDto updateFournisseur(final Integer idCommande, final Integer idFournisseur);
    
    CommandeFournisseurDto updateArticle(final Integer idCommande, final Integer idLigneCommande, final Integer idArticle);
    
    CommandeFournisseurDto deleteArticle(final Integer idCommande, final Integer idLigneCommande);
    
    CommandeFournisseurDto findById(final Integer id);
    
    CommandeFournisseurDto findByCode(final String code);
    
    List<CommandeFournisseurDto> findAll();
    
    List<LigneCommandeFournisseurDto> findAllLignesCommandesFournisseurByCommandeFournisseurId(final Integer idCommande);
    
    void delete(final Integer id);
}