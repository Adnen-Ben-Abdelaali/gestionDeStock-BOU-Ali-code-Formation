package com.bouali.gestiondestock.controller.api;

import io.swagger.annotations.*;
import com.bouali.gestiondestock.dto.*;
import java.util.*;
import org.springframework.web.bind.annotation.*;

@Api("fournisseur")
public interface FournisseurApi
{
    @PostMapping({ "gestiondestock/v1/fournisseurs/create" })
    FournisseurDto save(@RequestBody final FournisseurDto dto);
    
    @GetMapping({ "gestiondestock/v1/fournisseurs/{idFournisseur}" })
    FournisseurDto findById(@PathVariable("idFournisseur") final Integer id);
    
    @GetMapping({ "gestiondestock/v1/fournisseurs/all" })
    List<FournisseurDto> findAll();
    
    @DeleteMapping({ "gestiondestock/v1/fournisseurs/delete/{idFournisseur}" })
    void delete(@PathVariable("idFournisseur") final Integer id);
}