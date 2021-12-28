package com.bouali.gestiondestock.services.impl;

import javax.transaction.*;
import org.springframework.stereotype.*;
import com.bouali.gestiondestock.services.*;
import com.bouali.gestiondestock.repository.*;
import org.springframework.beans.factory.annotation.*;
import com.bouali.gestiondestock.validator.*;
import com.bouali.gestiondestock.model.*;
import java.util.*;
import com.bouali.gestiondestock.dto.*;
import java.time.*;
import java.util.function.*;
import com.bouali.gestiondestock.exception.*;
import java.util.stream.*;
import org.slf4j.*;

@Transactional(rollbackOn = { Exception.class })
@Service
public class EntrepriseServiceImpl implements EntrepriseService
{
    private static final Logger log;
    private EntrepriseRepository entrepriseRepository;
    private UtilisateurService utilisateurService;
    private RolesRepository rolesRepository;
    
    @Autowired
    public EntrepriseServiceImpl(final EntrepriseRepository entrepriseRepository, final UtilisateurService utilisateurService, final RolesRepository rolesRepository) {
        this.entrepriseRepository = entrepriseRepository;
        this.utilisateurService = utilisateurService;
        this.rolesRepository = rolesRepository;
    }
    
    public EntrepriseDto save(final EntrepriseDto dto) {
        final List<String> errors = (List<String>)EntrepriseValidator.validate(dto);
        if (!errors.isEmpty()) {
            EntrepriseServiceImpl.log.error("Entreprise is not valid {}", (Object)dto);
            throw new InvalidEntityException("L'entreprise n'est pas valide", ErrorCodes.ENTREPRISE_NOT_VALID, errors);
        }
        final EntrepriseDto savedEntreprise = EntrepriseDto.fromEntity((Entreprise)this.entrepriseRepository.save((Object)EntrepriseDto.toEntity(dto)));
        final UtilisateurDto utilisateur = this.fromEntreprise(savedEntreprise);
        final UtilisateurDto savedUser = this.utilisateurService.save(utilisateur);
        final RolesDto rolesDto = RolesDto.builder().roleName("ADMIN").utilisateur(savedUser).build();
        this.rolesRepository.save((Object)RolesDto.toEntity(rolesDto));
        return savedEntreprise;
    }
    
    private UtilisateurDto fromEntreprise(final EntrepriseDto dto) {
        return UtilisateurDto.builder().adresse(dto.getAdresse()).nom(dto.getNom()).prenom(dto.getCodeFiscal()).email(dto.getEmail()).moteDePasse(this.generateRandomPassword()).entreprise(dto).dateDeNaissance(Instant.now()).photo(dto.getPhoto()).build();
    }
    
    private String generateRandomPassword() {
        return "som3R@nd0mP@$$word";
    }
    
    public EntrepriseDto findById(final Integer id) {
        if (id == null) {
            EntrepriseServiceImpl.log.error("Entreprise ID is null");
            return null;
        }
        return this.entrepriseRepository.findById((Object)id).map(EntrepriseDto::fromEntity).orElseThrow(() -> new EntityNotFoundException(invokedynamic(makeConcatWithConstants:(Ljava/lang/Integer;)Ljava/lang/String;, id), ErrorCodes.ENTREPRISE_NOT_FOUND));
    }
    
    public List<EntrepriseDto> findAll() {
        return (List<EntrepriseDto>)this.entrepriseRepository.findAll().stream().map(EntrepriseDto::fromEntity).collect(Collectors.toList());
    }
    
    public void delete(final Integer id) {
        if (id == null) {
            EntrepriseServiceImpl.log.error("Entreprise ID is null");
            return;
        }
        this.entrepriseRepository.deleteById((Object)id);
    }
    
    static {
        log = LoggerFactory.getLogger((Class)EntrepriseServiceImpl.class);
    }
}