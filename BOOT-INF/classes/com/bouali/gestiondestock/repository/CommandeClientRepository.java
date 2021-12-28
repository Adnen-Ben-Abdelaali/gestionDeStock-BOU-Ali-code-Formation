package com.bouali.gestiondestock.repository;

import org.springframework.data.jpa.repository.*;
import com.bouali.gestiondestock.model.*;
import java.util.*;

public interface CommandeClientRepository extends JpaRepository<CommandeClient, Integer>
{
    Optional<CommandeClient> findCommandeClientByCode(final String code);
    
    List<CommandeClient> findAllByClientId(final Integer id);
}