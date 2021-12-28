package com.bouali.gestiondestock.validator;

import com.bouali.gestiondestock.dto.*;
import java.util.*;
import org.springframework.util.*;

public class VentesValidator
{
    public static List<String> validate(final VentesDto dto) {
        final List<String> errors = new ArrayList<String>();
        if (dto == null) {
            errors.add("Veuillez renseigner le code de la commande");
            errors.add("Veuillez renseigner la date de la commande");
            return errors;
        }
        if (!StringUtils.hasLength(dto.getCode())) {
            errors.add("Veuillez renseigner le code de la commande");
        }
        if (dto.getDateVente() == null) {
            errors.add("Veuillez renseigner la date de la commande");
        }
        return errors;
    }
}