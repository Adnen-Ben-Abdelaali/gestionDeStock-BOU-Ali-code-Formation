package com.bouali.gestiondestock.repository;

import com.bouali.gestiondestock.model.*;
import org.springframework.data.repository.query.*;
import java.util.*;
import org.springframework.data.jpa.repository.*;

public interface UtilisateurRepository extends JpaRepository<Utilisateur, Integer>
{
    @Query("select u from Utilisateur u where u.email = :email")
    Optional<Utilisateur> findUtilisateurByEmail(@Param("email") final String email);
}