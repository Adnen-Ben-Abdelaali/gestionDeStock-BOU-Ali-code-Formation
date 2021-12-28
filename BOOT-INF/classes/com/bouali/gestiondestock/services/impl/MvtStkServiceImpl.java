package com.bouali.gestiondestock.services.impl;

import org.springframework.stereotype.*;
import com.bouali.gestiondestock.repository.*;
import com.bouali.gestiondestock.services.*;
import org.springframework.beans.factory.annotation.*;
import java.math.*;
import java.util.*;
import com.bouali.gestiondestock.dto.*;
import java.util.function.*;
import java.util.stream.*;
import com.bouali.gestiondestock.validator.*;
import com.bouali.gestiondestock.exception.*;
import com.bouali.gestiondestock.model.*;
import org.slf4j.*;

@Service
public class MvtStkServiceImpl implements MvtStkService
{
    private static final Logger log;
    private MvtStkRepository repository;
    private ArticleService articleService;
    
    @Autowired
    public MvtStkServiceImpl(final MvtStkRepository repository, final ArticleService articleService) {
        this.repository = repository;
        this.articleService = articleService;
    }
    
    public BigDecimal stockReelArticle(final Integer idArticle) {
        if (idArticle == null) {
            MvtStkServiceImpl.log.warn("ID article is NULL");
            return BigDecimal.valueOf(-1L);
        }
        this.articleService.findById(idArticle);
        return this.repository.stockReelArticle(idArticle);
    }
    
    public List<MvtStkDto> mvtStkArticle(final Integer idArticle) {
        return this.repository.findAllByArticleId(idArticle).stream().map((Function<? super Object, ?>)MvtStkDto::fromEntity).collect((Collector<? super Object, ?, List<MvtStkDto>>)Collectors.toList());
    }
    
    public MvtStkDto entreeStock(final MvtStkDto dto) {
        return this.entreePositive(dto, TypeMvtStk.ENTREE);
    }
    
    public MvtStkDto sortieStock(final MvtStkDto dto) {
        return this.sortieNegative(dto, TypeMvtStk.SORTIE);
    }
    
    public MvtStkDto correctionStockPos(final MvtStkDto dto) {
        return this.entreePositive(dto, TypeMvtStk.CORRECTION_POS);
    }
    
    public MvtStkDto correctionStockNeg(final MvtStkDto dto) {
        return this.sortieNegative(dto, TypeMvtStk.CORRECTION_NEG);
    }
    
    private MvtStkDto entreePositive(final MvtStkDto dto, final TypeMvtStk typeMvtStk) {
        final List<String> errors = (List<String>)MvtStkValidator.validate(dto);
        if (!errors.isEmpty()) {
            MvtStkServiceImpl.log.error("Article is not valid {}", (Object)dto);
            throw new InvalidEntityException("Le mouvement du stock n'est pas valide", ErrorCodes.MVT_STK_NOT_VALID, errors);
        }
        dto.setQuantite(BigDecimal.valueOf(Math.abs(dto.getQuantite().doubleValue())));
        dto.setTypeMvt(typeMvtStk);
        return MvtStkDto.fromEntity((MvtStk)this.repository.save((Object)MvtStkDto.toEntity(dto)));
    }
    
    private MvtStkDto sortieNegative(final MvtStkDto dto, final TypeMvtStk typeMvtStk) {
        final List<String> errors = (List<String>)MvtStkValidator.validate(dto);
        if (!errors.isEmpty()) {
            MvtStkServiceImpl.log.error("Article is not valid {}", (Object)dto);
            throw new InvalidEntityException("Le mouvement du stock n'est pas valide", ErrorCodes.MVT_STK_NOT_VALID, errors);
        }
        dto.setQuantite(BigDecimal.valueOf(Math.abs(dto.getQuantite().doubleValue()) * -1.0));
        dto.setTypeMvt(typeMvtStk);
        return MvtStkDto.fromEntity((MvtStk)this.repository.save((Object)MvtStkDto.toEntity(dto)));
    }
    
    static {
        log = LoggerFactory.getLogger((Class)MvtStkServiceImpl.class);
    }
}