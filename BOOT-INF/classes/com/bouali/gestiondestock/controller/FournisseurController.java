package com.bouali.gestiondestock.controller;

import com.bouali.gestiondestock.controller.api.*;
import org.springframework.web.bind.annotation.*;
import com.bouali.gestiondestock.services.*;
import org.springframework.beans.factory.annotation.*;
import com.bouali.gestiondestock.dto.*;
import java.util.*;

@RestController
public class FournisseurController implements FournisseurApi
{
    private FournisseurService fournisseurService;
    
    @Autowired
    public FournisseurController(final FournisseurService fournisseurService) {
        this.fournisseurService = fournisseurService;
    }
    
    @Override
    public FournisseurDto save(final FournisseurDto dto) {
        return this.fournisseurService.save(dto);
    }
    
    @Override
    public FournisseurDto findById(final Integer id) {
        return this.fournisseurService.findById(id);
    }
    
    @Override
    public List<FournisseurDto> findAll() {
        return (List<FournisseurDto>)this.fournisseurService.findAll();
    }
    
    @Override
    public void delete(final Integer id) {
        this.fournisseurService.delete(id);
    }
}