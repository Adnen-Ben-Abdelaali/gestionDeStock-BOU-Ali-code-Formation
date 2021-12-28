package com.bouali.gestiondestock.controller.api;

import io.swagger.annotations.*;
import com.bouali.gestiondestock.dto.*;
import java.util.*;
import org.springframework.web.bind.annotation.*;

@Api("ventes")
public interface VentesApi
{
    @PostMapping({ "gestiondestock/v1/ventes/create" })
    VentesDto save(@RequestBody final VentesDto dto);
    
    @GetMapping({ "gestiondestock/v1/ventes/{idVente}" })
    VentesDto findById(@PathVariable("idVente") final Integer id);
    
    @GetMapping({ "gestiondestock/v1/ventes/{codeVente}" })
    VentesDto findByCode(@PathVariable("codeVente") final String code);
    
    @GetMapping({ "gestiondestock/v1/ventes/all" })
    List<VentesDto> findAll();
    
    @DeleteMapping({ "gestiondestock/v1/ventes/delete/{idVente}" })
    void delete(@PathVariable("idVente") final Integer id);
}