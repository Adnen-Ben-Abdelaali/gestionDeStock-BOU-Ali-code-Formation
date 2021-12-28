package com.bouali.gestiondestock.controller.api;

import io.swagger.annotations.*;
import com.bouali.gestiondestock.dto.*;
import java.util.*;
import org.springframework.web.bind.annotation.*;

@Api("clients")
public interface ClientApi
{
    @PostMapping(value = { "gestiondestock/v1/clients/create" }, consumes = { "application/json" }, produces = { "application/json" })
    ClientDto save(@RequestBody final ClientDto dto);
    
    @GetMapping(value = { "gestiondestock/v1/clients/{idClient}" }, produces = { "application/json" })
    ClientDto findById(@PathVariable("idClient") final Integer id);
    
    @GetMapping(value = { "gestiondestock/v1/clients/all" }, produces = { "application/json" })
    List<ClientDto> findAll();
    
    @DeleteMapping({ "gestiondestock/v1/clients/delete/{idClient}" })
    void delete(@PathVariable("idClient") final Integer id);
}