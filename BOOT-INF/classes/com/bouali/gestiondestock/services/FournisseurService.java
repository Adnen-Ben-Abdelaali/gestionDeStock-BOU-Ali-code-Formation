package com.bouali.gestiondestock.services;

import com.bouali.gestiondestock.dto.*;
import java.util.*;

public interface FournisseurService
{
    FournisseurDto save(final FournisseurDto dto);
    
    FournisseurDto findById(final Integer id);
    
    List<FournisseurDto> findAll();
    
    void delete(final Integer id);
}