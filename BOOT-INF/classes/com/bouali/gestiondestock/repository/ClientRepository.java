package com.bouali.gestiondestock.repository;

import org.springframework.data.jpa.repository.*;
import com.bouali.gestiondestock.model.*;

public interface ClientRepository extends JpaRepository<Client, Integer>
{
}