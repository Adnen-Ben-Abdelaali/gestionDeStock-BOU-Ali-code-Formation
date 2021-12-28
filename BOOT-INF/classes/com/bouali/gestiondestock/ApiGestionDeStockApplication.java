package com.bouali.gestiondestock;

import org.springframework.boot.autoconfigure.*;
import org.springframework.data.jpa.repository.config.*;
import org.springframework.boot.*;

@SpringBootApplication
@EnableJpaAuditing
public class ApiGestionDeStockApplication
{
    public static void main(final String[] args) {
        SpringApplication.run((Class)ApiGestionDeStockApplication.class, args);
    }
}