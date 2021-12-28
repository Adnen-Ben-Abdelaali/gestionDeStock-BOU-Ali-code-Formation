package com.bouali.gestiondestock.services;

import com.bouali.gestiondestock.dto.*;
import java.util.*;

public interface EntrepriseService
{
    EntrepriseDto save(final EntrepriseDto dto);
    
    EntrepriseDto findById(final Integer id);
    
    List<EntrepriseDto> findAll();
    
    void delete(final Integer id);
}