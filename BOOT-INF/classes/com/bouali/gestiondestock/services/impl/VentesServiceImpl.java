package com.bouali.gestiondestock.services.impl;

import com.bouali.gestiondestock.services.*;
import org.springframework.stereotype.*;
import com.bouali.gestiondestock.repository.*;
import org.springframework.security.crypto.password.*;
import org.springframework.beans.factory.annotation.*;
import com.bouali.gestiondestock.validator.*;
import com.bouali.gestiondestock.model.*;
import java.util.*;
import java.util.function.*;
import java.util.stream.*;
import com.bouali.gestiondestock.dto.*;
import com.bouali.gestiondestock.exception.*;
import org.springframework.util.*;
import org.slf4j.*;

@Service
public class UtilisateurServiceImpl implements UtilisateurService
{
    private static final Logger log;
    private UtilisateurRepository utilisateurRepository;
    private PasswordEncoder passwordEncoder;
    
    @Autowired
    public UtilisateurServiceImpl(final UtilisateurRepository utilisateurRepository, final PasswordEncoder passwordEncoder) {
        this.utilisateurRepository = utilisateurRepository;
        this.passwordEncoder = passwordEncoder;
    }
    
    public UtilisateurDto save(final UtilisateurDto dto) {
        final List<String> errors = (List<String>)UtilisateurValidator.validate(dto);
        if (!errors.isEmpty()) {
            UtilisateurServiceImpl.log.error("Utilisateur is not valid {}", (Object)dto);
            throw new InvalidEntityException("L'utilisateur n'est pas valide", ErrorCodes.UTILISATEUR_NOT_VALID, errors);
        }
        if (this.userAlreadyExists(dto.getEmail())) {
            throw new InvalidEntityException("Un autre utilisateur avec le meme email existe deja", ErrorCodes.UTILISATEUR_ALREADY_EXISTS, Collections.singletonList("Un autre utilisateur avec le meme email existe deja dans la BDD"));
        }
        dto.setMoteDePasse(this.passwordEncoder.encode((CharSequence)dto.getMoteDePasse()));
        return UtilisateurDto.fromEntity((Utilisateur)this.utilisateurRepository.save((Object)UtilisateurDto.toEntity(dto)));
    }
    
    private boolean userAlreadyExists(final String email) {
        final Optional<Utilisateur> user = this.utilisateurRepository.findUtilisateurByEmail(email);
        return user.isPresent();
    }
    
    public UtilisateurDto findById(final Integer id) {
        if (id == null) {
            UtilisateurServiceImpl.log.error("Utilisateur ID is null");
            return null;
        }
        return this.utilisateurRepository.findById((Object)id).map(UtilisateurDto::fromEntity).orElseThrow(() -> new EntityNotFoundException(invokedynamic(makeConcatWithConstants:(Ljava/lang/Integer;)Ljava/lang/String;, id), ErrorCodes.UTILISATEUR_NOT_FOUND));
    }
    
    public List<UtilisateurDto> findAll() {
        return (List<UtilisateurDto>)this.utilisateurRepository.findAll().stream().map(UtilisateurDto::fromEntity).collect(Collectors.toList());
    }
    
    public void delete(final Integer id) {
        if (id == null) {
            UtilisateurServiceImpl.log.error("Utilisateur ID is null");
            return;
        }
        this.utilisateurRepository.deleteById((Object)id);
    }
    
    public UtilisateurDto findByEmail(final String email) {
        return this.utilisateurRepository.findUtilisateurByEmail(email).map((Function<? super Utilisateur, ? extends UtilisateurDto>)UtilisateurDto::fromEntity).orElseThrow(() -> new EntityNotFoundException(invokedynamic(makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;, email), ErrorCodes.UTILISATEUR_NOT_FOUND));
    }
    
    public UtilisateurDto changerMotDePasse(final ChangerMotDePasseUtilisateurDto dto) {
        this.validate(dto);
        final Optional<Utilisateur> utilisateurOptional = (Optional<Utilisateur>)this.utilisateurRepository.findById((Object)dto.getId());
        if (utilisateurOptional.isEmpty()) {
            UtilisateurServiceImpl.log.warn(invokedynamic(makeConcatWithConstants:(Ljava/lang/Integer;)Ljava/lang/String;, dto.getId()));
            throw new EntityNotFoundException(invokedynamic(makeConcatWithConstants:(Ljava/lang/Integer;)Ljava/lang/String;, dto.getId()), ErrorCodes.UTILISATEUR_NOT_FOUND);
        }
        final Utilisateur utilisateur = utilisateurOptional.get();
        utilisateur.setMoteDePasse(this.passwordEncoder.encode((CharSequence)dto.getMotDePasse()));
        return UtilisateurDto.fromEntity((Utilisateur)this.utilisateurRepository.save((Object)utilisateur));
    }
    
    private void validate(final ChangerMotDePasseUtilisateurDto dto) {
        if (dto == null) {
            UtilisateurServiceImpl.log.warn("Impossible de modifier le mot de passe avec un objet NULL");
            throw new InvalidOperationException("Aucune information n'a ete fourni pour pouvoir changer le mot de passe", ErrorCodes.UTILISATEUR_CHANGE_PASSWORD_OBJECT_NOT_VALID);
        }
        if (dto.getId() == null) {
            UtilisateurServiceImpl.log.warn("Impossible de modifier le mot de passe avec un ID NULL");
            throw new InvalidOperationException("ID utilisateur null:: Impossible de modifier le mote de passe", ErrorCodes.UTILISATEUR_CHANGE_PASSWORD_OBJECT_NOT_VALID);
        }
        if (!StringUtils.hasLength(dto.getMotDePasse()) || !StringUtils.hasLength(dto.getConfirmMotDePasse())) {
            UtilisateurServiceImpl.log.warn("Impossible de modifier le mot de passe avec un mot de passe NULL");
            throw new InvalidOperationException("Mot de passe utilisateur null:: Impossible de modifier le mote de passe", ErrorCodes.UTILISATEUR_CHANGE_PASSWORD_OBJECT_NOT_VALID);
        }
        if (!dto.getMotDePasse().equals(dto.getConfirmMotDePasse())) {
            UtilisateurServiceImpl.log.warn("Impossible de modifier le mot de passe avec deux mots de passe different");
            throw new InvalidOperationException("Mots de passe utilisateur non conformes:: Impossible de modifier le mote de passe", ErrorCodes.UTILISATEUR_CHANGE_PASSWORD_OBJECT_NOT_VALID);
        }
    }
    
    static {
        log = LoggerFactory.getLogger((Class)UtilisateurServiceImpl.class);
    }
}