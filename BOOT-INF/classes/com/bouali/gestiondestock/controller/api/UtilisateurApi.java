package com.bouali.gestiondestock.controller.api;

import io.swagger.annotations.*;
import com.bouali.gestiondestock.dto.*;
import java.util.*;
import org.springframework.web.bind.annotation.*;

@Api("utilisateurs")
public interface UtilisateurApi
{
    @PostMapping({ "gestiondestock/v1/utilisateurs/create" })
    UtilisateurDto save(@RequestBody final UtilisateurDto dto);
    
    @PostMapping({ "gestiondestock/v1/utilisateurs/update/password" })
    UtilisateurDto changerMotDePasse(@RequestBody final ChangerMotDePasseUtilisateurDto dto);
    
    @GetMapping({ "gestiondestock/v1/utilisateurs/{idUtilisateur}" })
    UtilisateurDto findById(@PathVariable("idUtilisateur") final Integer id);
    
    @GetMapping({ "gestiondestock/v1/utilisateurs/find/{email}" })
    UtilisateurDto findByEmail(@PathVariable("email") final String email);
    
    @GetMapping({ "gestiondestock/v1/utilisateurs/all" })
    List<UtilisateurDto> findAll();
    
    @DeleteMapping({ "gestiondestock/v1/utilisateurs/delete/{idUtilisateur}" })
    void delete(@PathVariable("idUtilisateur") final Integer id);
}