package com.bouali.gestiondestock.services;

import com.bouali.gestiondestock.dto.*;
import java.util.*;

public interface VentesService
{
    VentesDto save(final VentesDto dto);
    
    VentesDto findById(final Integer id);
    
    VentesDto findByCode(final String code);
    
    List<VentesDto> findAll();
    
    void delete(final Integer id);
}