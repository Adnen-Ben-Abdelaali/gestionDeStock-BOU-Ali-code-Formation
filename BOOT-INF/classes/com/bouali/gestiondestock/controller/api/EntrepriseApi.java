package com.bouali.gestiondestock.controller.api;

import io.swagger.annotations.*;
import com.bouali.gestiondestock.dto.*;
import java.util.*;
import org.springframework.web.bind.annotation.*;

@Api("entreprises")
public interface EntrepriseApi
{
    @PostMapping({ "gestiondestock/v1/entreprises/create" })
    EntrepriseDto save(@RequestBody final EntrepriseDto dto);
    
    @GetMapping({ "gestiondestock/v1/entreprises/{idEntreprise}" })
    EntrepriseDto findById(@PathVariable("idEntreprise") final Integer id);
    
    @GetMapping({ "gestiondestock/v1/entreprises/all" })
    List<EntrepriseDto> findAll();
    
    @DeleteMapping({ "gestiondestock/v1/entreprises/delete/{idEntreprise}" })
    void delete(@PathVariable("idEntreprise") final Integer id);
}