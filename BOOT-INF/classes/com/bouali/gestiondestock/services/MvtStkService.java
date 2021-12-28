package com.bouali.gestiondestock.services;

import java.math.*;
import java.util.*;
import com.bouali.gestiondestock.dto.*;

public interface MvtStkService
{
    BigDecimal stockReelArticle(final Integer idArticle);
    
    List<MvtStkDto> mvtStkArticle(final Integer idArticle);
    
    MvtStkDto entreeStock(final MvtStkDto dto);
    
    MvtStkDto sortieStock(final MvtStkDto dto);
    
    MvtStkDto correctionStockPos(final MvtStkDto dto);
    
    MvtStkDto correctionStockNeg(final MvtStkDto dto);
}