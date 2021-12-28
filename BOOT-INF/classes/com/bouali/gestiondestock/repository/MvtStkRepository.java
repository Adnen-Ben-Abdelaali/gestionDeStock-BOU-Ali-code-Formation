package com.bouali.gestiondestock.repository;

import com.bouali.gestiondestock.model.*;
import org.springframework.data.repository.query.*;
import java.math.*;
import org.springframework.data.jpa.repository.*;
import java.util.*;

public interface MvtStkRepository extends JpaRepository<MvtStk, Integer>
{
    @Query("select sum(m.quantite) from MvtStk m where m.article.id = :idArticle")
    BigDecimal stockReelArticle(@Param("idArticle") final Integer idArticle);
    
    List<MvtStk> findAllByArticleId(final Integer idArticle);
}