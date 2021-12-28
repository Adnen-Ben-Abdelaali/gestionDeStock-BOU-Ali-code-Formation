package com.bouali.gestiondestock.repository;

import org.springframework.data.jpa.repository.*;
import com.bouali.gestiondestock.model.*;
import java.util.*;

public interface CategoryRepository extends JpaRepository<Category, Integer>
{
    Optional<Category> findCategoryByCode(final String code);
}