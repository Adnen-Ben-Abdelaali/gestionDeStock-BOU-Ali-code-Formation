package com.bouali.gestiondestock.controller;

import com.bouali.gestiondestock.controller.api.*;
import org.springframework.web.bind.annotation.*;
import com.bouali.gestiondestock.services.*;
import org.springframework.beans.factory.annotation.*;
import java.math.*;
import java.util.*;
import com.bouali.gestiondestock.dto.*;

@RestController
public class MvtStkController implements MvtStkApi
{
    private MvtStkService service;
    
    @Autowired
    public MvtStkController(final MvtStkService service) {
        this.service = service;
    }
    
    @Override
    public BigDecimal stockReelArticle(final Integer idArticle) {
        return this.service.stockReelArticle(idArticle);
    }
    
    @Override
    public List<MvtStkDto> mvtStkArticle(final Integer idArticle) {
        return (List<MvtStkDto>)this.service.mvtStkArticle(idArticle);
    }
    
    @Override
    public MvtStkDto entreeStock(final MvtStkDto dto) {
        return this.service.entreeStock(dto);
    }
    
    @Override
    public MvtStkDto sortieStock(final MvtStkDto dto) {
        return this.service.sortieStock(dto);
    }
    
    @Override
    public MvtStkDto correctionStockPos(final MvtStkDto dto) {
        return this.service.correctionStockPos(dto);
    }
    
    @Override
    public MvtStkDto correctionStockNeg(final MvtStkDto dto) {
        return this.service.correctionStockNeg(dto);
    }
}