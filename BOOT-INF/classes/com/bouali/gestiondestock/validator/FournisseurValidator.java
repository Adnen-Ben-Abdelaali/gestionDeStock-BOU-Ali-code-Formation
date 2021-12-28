package com.bouali.gestiondestock.validator;

import com.bouali.gestiondestock.dto.*;
import java.util.*;
import org.springframework.util.*;

public class FournisseurValidator
{
    public static List<String> validate(final FournisseurDto dto) {
        final List<String> errors = new ArrayList<String>();
        if (dto == null) {
            errors.add("Veuillez renseigner le nom du fournisseur");
            errors.add("Veuillez renseigner le prenom du fournisseur");
            errors.add("Veuillez renseigner le Mail du fournisseur");
            errors.add("Veuillez renseigner le numero de telephone du fournisseur");
            errors.addAll(AdresseValidator.validate(null));
            return errors;
        }
        if (!StringUtils.hasLength(dto.getNom())) {
            errors.add("Veuillez renseigner le nom du fournisseur");
        }
        if (!StringUtils.hasLength(dto.getPrenom())) {
            errors.add("Veuillez renseigner le prenom du fournisseur");
        }
        if (!StringUtils.hasLength(dto.getMail())) {
            errors.add("Veuillez renseigner le Mail du fournisseur");
        }
        if (!StringUtils.hasLength(dto.getNumTel())) {
            errors.add("Veuillez renseigner le numero de telephone du fournisseur");
        }
        errors.addAll(AdresseValidator.validate(dto.getAdresse()));
        return errors;
    }
}