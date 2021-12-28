package com.bouali.gestiondestock.repository;

import org.springframework.data.jpa.repository.*;
import com.bouali.gestiondestock.model.*;
import java.util.*;

public interface LigneCommandeFournisseurRepository extends JpaRepository<LigneCommandeFournisseur, Integer>
{
    List<LigneCommandeFournisseur> findAllByCommandeFournisseurId(final Integer idCommande);
    
    List<LigneCommandeFournisseur> findAllByArticleId(final Integer idCommande);
}