package com.bouali.gestiondestock.controller.api;

import io.swagger.annotations.*;
import java.math.*;
import java.util.*;
import com.bouali.gestiondestock.dto.*;
import org.springframework.web.bind.annotation.*;

@Api("mvtstk")
public interface MvtStkApi
{
    @GetMapping({ "gestiondestock/v1/mvtstk/stockreel/{idArticle}" })
    BigDecimal stockReelArticle(@PathVariable("idArticle") final Integer idArticle);
    
    @GetMapping({ "gestiondestock/v1/mvtstk/filter/article/{idArticle}" })
    List<MvtStkDto> mvtStkArticle(@PathVariable("idArticle") final Integer idArticle);
    
    @PostMapping({ "gestiondestock/v1/mvtstk/entree" })
    MvtStkDto entreeStock(@RequestBody final MvtStkDto dto);
    
    @PostMapping({ "gestiondestock/v1/mvtstk/sortie" })
    MvtStkDto sortieStock(@RequestBody final MvtStkDto dto);
    
    @PostMapping({ "gestiondestock/v1/mvtstk/correctionpos" })
    MvtStkDto correctionStockPos(@RequestBody final MvtStkDto dto);
    
    @PostMapping({ "gestiondestock/v1/mvtstk/correctionneg" })
    MvtStkDto correctionStockNeg(@RequestBody final MvtStkDto dto);
}