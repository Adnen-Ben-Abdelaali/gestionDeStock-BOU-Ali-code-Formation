package com.bouali.gestiondestock.repository;

import org.springframework.data.jpa.repository.*;
import com.bouali.gestiondestock.model.*;
import java.util.*;

public interface LigneVenteRepository extends JpaRepository<LigneVente, Integer>
{
    List<LigneVente> findAllByArticleId(final Integer idArticle);
    
    List<LigneVente> findAllByVenteId(final Integer id);
}