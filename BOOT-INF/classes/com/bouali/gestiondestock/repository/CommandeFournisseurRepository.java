package com.bouali.gestiondestock.repository;

import org.springframework.data.jpa.repository.*;
import java.util.*;
import com.bouali.gestiondestock.model.*;

public interface CommandeFournisseurRepository extends JpaRepository<CommandeFournisseur, Integer>
{
    Optional<CommandeFournisseur> findCommandeFournisseurByCode(final String code);
    
    List<CommandeClient> findAllByFournisseurId(final Integer id);
}