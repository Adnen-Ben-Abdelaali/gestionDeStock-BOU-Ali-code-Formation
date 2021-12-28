package com.bouali.gestiondestock.controller;

import com.bouali.gestiondestock.controller.api.*;
import org.springframework.web.bind.annotation.*;
import com.bouali.gestiondestock.services.*;
import org.springframework.beans.factory.annotation.*;
import com.bouali.gestiondestock.dto.*;
import java.util.*;

@RestController
public class VentesController implements VentesApi
{
    private VentesService ventesService;
    
    @Autowired
    public VentesController(final VentesService ventesService) {
        this.ventesService = ventesService;
    }
    
    @Override
    public VentesDto save(final VentesDto dto) {
        return this.ventesService.save(dto);
    }
    
    @Override
    public VentesDto findById(final Integer id) {
        return this.ventesService.findById(id);
    }
    
    @Override
    public VentesDto findByCode(final String code) {
        return this.ventesService.findByCode(code);
    }
    
    @Override
    public List<VentesDto> findAll() {
        return (List<VentesDto>)this.ventesService.findAll();
    }
    
    @Override
    public void delete(final Integer id) {
        this.ventesService.delete(id);
    }
}