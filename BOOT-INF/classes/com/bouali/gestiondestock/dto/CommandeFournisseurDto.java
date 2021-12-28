package com.bouali.gestiondestock.dto;

import java.time.*;
import java.util.*;
import com.bouali.gestiondestock.model.*;

public class CommandeFournisseurDto
{
    private Integer id;
    private String code;
    private Instant dateCommande;
    private EtatCommande etatCommande;
    private FournisseurDto fournisseur;
    private Integer idEntreprise;
    private List<LigneCommandeFournisseurDto> ligneCommandeFournisseurs;
    
    public static CommandeFournisseurDto fromEntity(final CommandeFournisseur commandeFournisseur) {
        if (commandeFournisseur == null) {
            return null;
        }
        return builder().id(commandeFournisseur.getId()).code(commandeFournisseur.getCode()).dateCommande(commandeFournisseur.getDateCommande()).fournisseur(FournisseurDto.fromEntity(commandeFournisseur.getFournisseur())).etatCommande(commandeFournisseur.getEtatCommande()).idEntreprise(commandeFournisseur.getIdEntreprise()).build();
    }
    
    public static CommandeFournisseur toEntity(final CommandeFournisseurDto dto) {
        if (dto == null) {
            return null;
        }
        final CommandeFournisseur commandeFournisseur = new CommandeFournisseur();
        commandeFournisseur.setId(dto.getId());
        commandeFournisseur.setCode(dto.getCode());
        commandeFournisseur.setDateCommande(dto.getDateCommande());
        commandeFournisseur.setFournisseur(FournisseurDto.toEntity(dto.getFournisseur()));
        commandeFournisseur.setIdEntreprise(dto.getIdEntreprise());
        commandeFournisseur.setEtatCommande(dto.getEtatCommande());
        return commandeFournisseur;
    }
    
    public boolean isCommandeLivree() {
        return EtatCommande.LIVREE.equals((Object)this.etatCommande);
    }
    
    CommandeFournisseurDto(final Integer id, final String code, final Instant dateCommande, final EtatCommande etatCommande, final FournisseurDto fournisseur, final Integer idEntreprise, final List<LigneCommandeFournisseurDto> ligneCommandeFournisseurs) {
        this.id = id;
        this.code = code;
        this.dateCommande = dateCommande;
        this.etatCommande = etatCommande;
        this.fournisseur = fournisseur;
        this.idEntreprise = idEntreprise;
        this.ligneCommandeFournisseurs = ligneCommandeFournisseurs;
    }
    
    public static CommandeFournisseurDtoBuilder builder() {
        return new CommandeFournisseurDtoBuilder();
    }
    
    public Integer getId() {
        return this.id;
    }
    
    public String getCode() {
        return this.code;
    }
    
    public Instant getDateCommande() {
        return this.dateCommande;
    }
    
    public EtatCommande getEtatCommande() {
        return this.etatCommande;
    }
    
    public FournisseurDto getFournisseur() {
        return this.fournisseur;
    }
    
    public Integer getIdEntreprise() {
        return this.idEntreprise;
    }
    
    public List<LigneCommandeFournisseurDto> getLigneCommandeFournisseurs() {
        return this.ligneCommandeFournisseurs;
    }
    
    public void setId(final Integer id) {
        this.id = id;
    }
    
    public void setCode(final String code) {
        this.code = code;
    }
    
    public void setDateCommande(final Instant dateCommande) {
        this.dateCommande = dateCommande;
    }
    
    public void setEtatCommande(final EtatCommande etatCommande) {
        this.etatCommande = etatCommande;
    }
    
    public void setFournisseur(final FournisseurDto fournisseur) {
        this.fournisseur = fournisseur;
    }
    
    public void setIdEntreprise(final Integer idEntreprise) {
        this.idEntreprise = idEntreprise;
    }
    
    public void setLigneCommandeFournisseurs(final List<LigneCommandeFournisseurDto> ligneCommandeFournisseurs) {
        this.ligneCommandeFournisseurs = ligneCommandeFournisseurs;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof CommandeFournisseurDto)) {
            return false;
        }
        final CommandeFournisseurDto other = (CommandeFournisseurDto)o;
        if (!other.canEqual(this)) {
            return false;
        }
        final Object this$id = this.getId();
        final Object other$id = other.getId();
        Label_0065: {
            if (this$id == null) {
                if (other$id == null) {
                    break Label_0065;
                }
            }
            else if (this$id.equals(other$id)) {
                break Label_0065;
            }
            return false;
        }
        final Object this$idEntreprise = this.getIdEntreprise();
        final Object other$idEntreprise = other.getIdEntreprise();
        Label_0102: {
            if (this$idEntreprise == null) {
                if (other$idEntreprise == null) {
                    break Label_0102;
                }
            }
            else if (this$idEntreprise.equals(other$idEntreprise)) {
                break Label_0102;
            }
            return false;
        }
        final Object this$code = this.getCode();
        final Object other$code = other.getCode();
        Label_0139: {
            if (this$code == null) {
                if (other$code == null) {
                    break Label_0139;
                }
            }
            else if (this$code.equals(other$code)) {
                break Label_0139;
            }
            return false;
        }
        final Object this$dateCommande = this.getDateCommande();
        final Object other$dateCommande = other.getDateCommande();
        Label_0176: {
            if (this$dateCommande == null) {
                if (other$dateCommande == null) {
                    break Label_0176;
                }
            }
            else if (this$dateCommande.equals(other$dateCommande)) {
                break Label_0176;
            }
            return false;
        }
        final Object this$etatCommande = this.getEtatCommande();
        final Object other$etatCommande = other.getEtatCommande();
        Label_0213: {
            if (this$etatCommande == null) {
                if (other$etatCommande == null) {
                    break Label_0213;
                }
            }
            else if (this$etatCommande.equals(other$etatCommande)) {
                break Label_0213;
            }
            return false;
        }
        final Object this$fournisseur = this.getFournisseur();
        final Object other$fournisseur = other.getFournisseur();
        Label_0250: {
            if (this$fournisseur == null) {
                if (other$fournisseur == null) {
                    break Label_0250;
                }
            }
            else if (this$fournisseur.equals(other$fournisseur)) {
                break Label_0250;
            }
            return false;
        }
        final Object this$ligneCommandeFournisseurs = this.getLigneCommandeFournisseurs();
        final Object other$ligneCommandeFournisseurs = other.getLigneCommandeFournisseurs();
        if (this$ligneCommandeFournisseurs == null) {
            if (other$ligneCommandeFournisseurs == null) {
                return true;
            }
        }
        else if (this$ligneCommandeFournisseurs.equals(other$ligneCommandeFournisseurs)) {
            return true;
        }
        return false;
    }
    
    protected boolean canEqual(final Object other) {
        return other instanceof CommandeFournisseurDto;
    }
    
    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $id = this.getId();
        result = result * 59 + (($id == null) ? 43 : $id.hashCode());
        final Object $idEntreprise = this.getIdEntreprise();
        result = result * 59 + (($idEntreprise == null) ? 43 : $idEntreprise.hashCode());
        final Object $code = this.getCode();
        result = result * 59 + (($code == null) ? 43 : $code.hashCode());
        final Object $dateCommande = this.getDateCommande();
        result = result * 59 + (($dateCommande == null) ? 43 : $dateCommande.hashCode());
        final Object $etatCommande = this.getEtatCommande();
        result = result * 59 + (($etatCommande == null) ? 43 : $etatCommande.hashCode());
        final Object $fournisseur = this.getFournisseur();
        result = result * 59 + (($fournisseur == null) ? 43 : $fournisseur.hashCode());
        final Object $ligneCommandeFournisseurs = this.getLigneCommandeFournisseurs();
        result = result * 59 + (($ligneCommandeFournisseurs == null) ? 43 : $ligneCommandeFournisseurs.hashCode());
        return result;
    }
    
    @Override
    public String toString() {
        return invokedynamic(makeConcatWithConstants:(Ljava/lang/Integer;Ljava/lang/String;Ljava/time/Instant;Lcom/bouali/gestiondestock/model/EtatCommande;Lcom/bouali/gestiondestock/dto/FournisseurDto;Ljava/lang/Integer;Ljava/util/List;)Ljava/lang/String;, this.getId(), this.getCode(), this.getDateCommande(), this.getEtatCommande(), this.getFournisseur(), this.getIdEntreprise(), this.getLigneCommandeFournisseurs());
    }
    
    public static class CommandeFournisseurDtoBuilder
    {
        private Integer id;
        private String code;
        private Instant dateCommande;
        private EtatCommande etatCommande;
        private FournisseurDto fournisseur;
        private Integer idEntreprise;
        private List<LigneCommandeFournisseurDto> ligneCommandeFournisseurs;
        
        CommandeFournisseurDtoBuilder() {
        }
        
        public CommandeFournisseurDtoBuilder id(final Integer id) {
            this.id = id;
            return this;
        }
        
        public CommandeFournisseurDtoBuilder code(final String code) {
            this.code = code;
            return this;
        }
        
        public CommandeFournisseurDtoBuilder dateCommande(final Instant dateCommande) {
            this.dateCommande = dateCommande;
            return this;
        }
        
        public CommandeFournisseurDtoBuilder etatCommande(final EtatCommande etatCommande) {
            this.etatCommande = etatCommande;
            return this;
        }
        
        public CommandeFournisseurDtoBuilder fournisseur(final FournisseurDto fournisseur) {
            this.fournisseur = fournisseur;
            return this;
        }
        
        public CommandeFournisseurDtoBuilder idEntreprise(final Integer idEntreprise) {
            this.idEntreprise = idEntreprise;
            return this;
        }
        
        public CommandeFournisseurDtoBuilder ligneCommandeFournisseurs(final List<LigneCommandeFournisseurDto> ligneCommandeFournisseurs) {
            this.ligneCommandeFournisseurs = ligneCommandeFournisseurs;
            return this;
        }
        
        public CommandeFournisseurDto build() {
            return new CommandeFournisseurDto(this.id, this.code, this.dateCommande, this.etatCommande, this.fournisseur, this.idEntreprise, this.ligneCommandeFournisseurs);
        }
        
        @Override
        public String toString() {
            return invokedynamic(makeConcatWithConstants:(Ljava/lang/Integer;Ljava/lang/String;Ljava/time/Instant;Lcom/bouali/gestiondestock/model/EtatCommande;Lcom/bouali/gestiondestock/dto/FournisseurDto;Ljava/lang/Integer;Ljava/util/List;)Ljava/lang/String;, this.id, this.code, this.dateCommande, this.etatCommande, this.fournisseur, this.idEntreprise, this.ligneCommandeFournisseurs);
        }
    }
}