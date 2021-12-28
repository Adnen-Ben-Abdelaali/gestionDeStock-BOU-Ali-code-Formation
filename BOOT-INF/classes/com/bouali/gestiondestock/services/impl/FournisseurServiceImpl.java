package com.bouali.gestiondestock.services.impl;

import com.bouali.gestiondestock.services.*;
import org.springframework.stereotype.*;
import com.bouali.gestiondestock.repository.*;
import org.springframework.beans.factory.annotation.*;
import com.bouali.gestiondestock.dto.*;
import com.bouali.gestiondestock.validator.*;
import java.util.*;
import java.util.function.*;
import java.util.stream.*;
import com.bouali.gestiondestock.exception.*;
import com.bouali.gestiondestock.model.*;
import org.slf4j.*;

@Service
public class FournisseurServiceImpl implements FournisseurService
{
    private static final Logger log;
    private FournisseurRepository fournisseurRepository;
    private CommandeFournisseurRepository commandeFournisseurRepository;
    
    @Autowired
    public FournisseurServiceImpl(final FournisseurRepository fournisseurRepository, final CommandeFournisseurRepository commandeFournisseurRepository) {
        this.fournisseurRepository = fournisseurRepository;
        this.commandeFournisseurRepository = commandeFournisseurRepository;
    }
    
    public FournisseurDto save(final FournisseurDto dto) {
        final List<String> errors = (List<String>)FournisseurValidator.validate(dto);
        if (!errors.isEmpty()) {
            FournisseurServiceImpl.log.error("Fournisseur is not valid {}", (Object)dto);
            throw new InvalidEntityException("Le fournisseur n'est pas valide", ErrorCodes.FOURNISSEUR_NOT_VALID, errors);
        }
        return FournisseurDto.fromEntity((Fournisseur)this.fournisseurRepository.save((Object)FournisseurDto.toEntity(dto)));
    }
    
    public FournisseurDto findById(final Integer id) {
        if (id == null) {
            FournisseurServiceImpl.log.error("Fournisseur ID is null");
            return null;
        }
        return this.fournisseurRepository.findById((Object)id).map(FournisseurDto::fromEntity).orElseThrow(() -> new EntityNotFoundException(invokedynamic(makeConcatWithConstants:(Ljava/lang/Integer;)Ljava/lang/String;, id), ErrorCodes.FOURNISSEUR_NOT_FOUND));
    }
    
    public List<FournisseurDto> findAll() {
        return (List<FournisseurDto>)this.fournisseurRepository.findAll().stream().map(FournisseurDto::fromEntity).collect(Collectors.toList());
    }
    
    public void delete(final Integer id) {
        if (id == null) {
            FournisseurServiceImpl.log.error("Fournisseur ID is null");
            return;
        }
        final List<CommandeClient> commandeFournisseur = this.commandeFournisseurRepository.findAllByFournisseurId(id);
        if (!commandeFournisseur.isEmpty()) {
            throw new InvalidOperationException("Impossible de supprimer un fournisseur qui a deja des commandes", ErrorCodes.FOURNISSEUR_ALREADY_IN_USE);
        }
        this.fournisseurRepository.deleteById((Object)id);
    }
    
    static {
        log = LoggerFactory.getLogger((Class)FournisseurServiceImpl.class);
    }
}