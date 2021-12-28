package com.bouali.gestiondestock.repository;

import org.springframework.data.jpa.repository.*;
import com.bouali.gestiondestock.model.*;
import java.util.*;

public interface ArticleRepository extends JpaRepository<Article, Integer>
{
    Optional<Article> findArticleByCodeArticle(final String codeArticle);
    
    List<Article> findAllByCategoryId(final Integer idCategory);
}