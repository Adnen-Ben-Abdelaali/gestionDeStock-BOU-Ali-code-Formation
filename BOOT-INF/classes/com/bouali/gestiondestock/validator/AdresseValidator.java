package com.bouali.gestiondestock.validator;

import com.bouali.gestiondestock.dto.*;
import java.util.*;
import org.springframework.util.*;

public class AdresseValidator
{
    public static List<String> validate(final AdresseDto adresseDto) {
        final List<String> errors = new ArrayList<String>();
        if (adresseDto == null) {
            errors.add("Veuillez renseigner l'adresse 1'");
            errors.add("Veuillez renseigner la ville'");
            errors.add("Veuillez renseigner le pays'");
            errors.add("Veuillez renseigner le code postal'");
            return errors;
        }
        if (!StringUtils.hasLength(adresseDto.getAdresse1())) {
            errors.add("Veuillez renseigner l'adresse 1'");
        }
        if (!StringUtils.hasLength(adresseDto.getVille())) {
            errors.add("Veuillez renseigner la ville'");
        }
        if (!StringUtils.hasLength(adresseDto.getPays())) {
            errors.add("Veuillez renseigner le pays'");
        }
        if (!StringUtils.hasLength(adresseDto.getAdresse1())) {
            errors.add("Veuillez renseigner le code postal'");
        }
        return errors;
    }
}