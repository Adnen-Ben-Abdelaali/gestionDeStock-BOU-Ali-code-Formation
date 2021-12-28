package com.bouali.gestiondestock.utils;

public interface Constants
{
    public static final String APP_ROOT = "gestiondestock/v1";
    public static final String COMMANDE_FOURNISSEUR_ENDPOINT = "gestiondestock/v1/commandesfournisseurs";
    public static final String CREATE_COMMANDE_FOURNISSEUR_ENDPOINT = "gestiondestock/v1/commandesfournisseurs/create";
    public static final String FIND_COMMANDE_FOURNISSEUR_BY_ID_ENDPOINT = "gestiondestock/v1/commandesfournisseurs/{idCommandeFournisseur}";
    public static final String FIND_COMMANDE_FOURNISSEUR_BY_CODE_ENDPOINT = "gestiondestock/v1/commandesfournisseurs/filter/{codeCommandeFournisseur}";
    public static final String FIND_ALL_COMMANDE_FOURNISSEUR_ENDPOINT = "gestiondestock/v1/commandesfournisseurs/all";
    public static final String DELETE_COMMANDE_FOURNISSEUR_ENDPOINT = "gestiondestock/v1/commandesfournisseurs/delete/{idCommandeFournisseur}";
    public static final String ENTREPRISE_ENDPOINT = "gestiondestock/v1/entreprises";
    public static final String FOURNISSEUR_ENDPOINT = "gestiondestock/v1/fournisseurs";
    public static final String UTILISATEUR_ENDPOINT = "gestiondestock/v1/utilisateurs";
    public static final String VENTES_ENDPOINT = "gestiondestock/v1/ventes";
    public static final String AUTHENTICATION_ENDPOINT = "gestiondestock/v1/auth";
}