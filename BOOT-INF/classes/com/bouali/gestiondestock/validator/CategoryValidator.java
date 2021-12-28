package com.bouali.gestiondestock.validator;

import com.bouali.gestiondestock.dto.*;
import java.util.*;
import org.springframework.util.*;

public class CategoryValidator
{
    public static List<String> validate(final CategoryDto categoryDto) {
        final List<String> errors = new ArrayList<String>();
        if (categoryDto == null || !StringUtils.hasLength(categoryDto.getCode())) {
            errors.add("Veuillez renseigner le code de la categorie");
        }
        return errors;
    }
}