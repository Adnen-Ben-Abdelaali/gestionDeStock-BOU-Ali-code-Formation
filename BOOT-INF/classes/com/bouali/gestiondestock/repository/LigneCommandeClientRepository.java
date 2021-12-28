package com.bouali.gestiondestock.repository;

import org.springframework.data.jpa.repository.*;
import com.bouali.gestiondestock.model.*;
import java.util.*;

public interface LigneCommandeClientRepository extends JpaRepository<LigneCommandeClient, Integer>
{
    List<LigneCommandeClient> findAllByCommandeClientId(final Integer id);
    
    List<LigneCommandeClient> findAllByArticleId(final Integer id);
}