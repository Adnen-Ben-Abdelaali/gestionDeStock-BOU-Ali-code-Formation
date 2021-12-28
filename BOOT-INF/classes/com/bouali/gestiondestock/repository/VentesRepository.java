package com.bouali.gestiondestock.repository;

import org.springframework.data.jpa.repository.*;
import com.bouali.gestiondestock.model.*;
import java.util.*;

public interface VentesRepository extends JpaRepository<Ventes, Integer>
{
    Optional<Ventes> findVentesByCode(final String code);
}