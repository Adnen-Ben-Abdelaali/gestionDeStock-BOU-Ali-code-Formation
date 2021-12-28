package com.bouali.gestiondestock.controller;

import com.bouali.gestiondestock.controller.api.*;
import org.springframework.web.bind.annotation.*;
import com.bouali.gestiondestock.services.*;
import org.springframework.beans.factory.annotation.*;
import com.bouali.gestiondestock.dto.*;
import java.util.*;

@RestController
public class UtilisateurController implements UtilisateurApi
{
    private UtilisateurService utilisateurService;
    
    @Autowired
    public UtilisateurController(final UtilisateurService utilisateurService) {
        this.utilisateurService = utilisateurService;
    }
    
    @Override
    public UtilisateurDto save(final UtilisateurDto dto) {
        return this.utilisateurService.save(dto);
    }
    
    @Override
    public UtilisateurDto changerMotDePasse(final ChangerMotDePasseUtilisateurDto dto) {
        return this.utilisateurService.changerMotDePasse(dto);
    }
    
    @Override
    public UtilisateurDto findById(final Integer id) {
        return this.utilisateurService.findById(id);
    }
    
    @Override
    public UtilisateurDto findByEmail(final String email) {
        return this.utilisateurService.findByEmail(email);
    }
    
    @Override
    public List<UtilisateurDto> findAll() {
        return (List<UtilisateurDto>)this.utilisateurService.findAll();
    }
    
    @Override
    public void delete(final Integer id) {
        this.utilisateurService.delete(id);
    }
}