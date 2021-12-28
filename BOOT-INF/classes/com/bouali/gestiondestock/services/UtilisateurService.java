package com.bouali.gestiondestock.services;

import java.util.*;
import com.bouali.gestiondestock.dto.*;

public interface UtilisateurService
{
    UtilisateurDto save(final UtilisateurDto dto);
    
    UtilisateurDto findById(final Integer id);
    
    List<UtilisateurDto> findAll();
    
    void delete(final Integer id);
    
    UtilisateurDto findByEmail(final String email);
    
    UtilisateurDto changerMotDePasse(final ChangerMotDePasseUtilisateurDto dto);
}