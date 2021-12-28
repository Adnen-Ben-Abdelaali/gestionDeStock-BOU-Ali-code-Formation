package com.bouali.gestiondestock.controller;

import com.bouali.gestiondestock.controller.api.*;
import org.springframework.web.bind.annotation.*;
import com.bouali.gestiondestock.services.*;
import org.springframework.beans.factory.annotation.*;
import com.bouali.gestiondestock.dto.*;
import java.util.*;

@RestController
public class EntrepriseController implements EntrepriseApi
{
    private EntrepriseService entrepriseService;
    
    @Autowired
    public EntrepriseController(final EntrepriseService entrepriseService) {
        this.entrepriseService = entrepriseService;
    }
    
    @Override
    public EntrepriseDto save(final EntrepriseDto dto) {
        return this.entrepriseService.save(dto);
    }
    
    @Override
    public EntrepriseDto findById(final Integer id) {
        return this.entrepriseService.findById(id);
    }
    
    @Override
    public List<EntrepriseDto> findAll() {
        return (List<EntrepriseDto>)this.entrepriseService.findAll();
    }
    
    @Override
    public void delete(final Integer id) {
        this.entrepriseService.delete(id);
    }
}