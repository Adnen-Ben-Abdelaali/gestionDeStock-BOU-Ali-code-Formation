package com.bouali.gestiondestock.dto;

import java.util.*;
import com.fasterxml.jackson.annotation.*;
import com.bouali.gestiondestock.model.*;

public class FournisseurDto
{
    private Integer id;
    private String nom;
    private String prenom;
    private AdresseDto adresse;
    private String photo;
    private String mail;
    private String numTel;
    private Integer idEntreprise;
    @JsonIgnore
    private List<CommandeFournisseurDto> commandeFournisseurs;
    
    public static FournisseurDto fromEntity(final Fournisseur fournisseur) {
        if (fournisseur == null) {
            return null;
        }
        return builder().id(fournisseur.getId()).nom(fournisseur.getNom()).prenom(fournisseur.getPrenom()).adresse(AdresseDto.fromEntity(fournisseur.getAdresse())).photo(fournisseur.getPhoto()).mail(fournisseur.getMail()).numTel(fournisseur.getNumTel()).idEntreprise(fournisseur.getIdEntreprise()).build();
    }
    
    public static Fournisseur toEntity(final FournisseurDto dto) {
        if (dto == null) {
            return null;
        }
        final Fournisseur fournisseur = new Fournisseur();
        fournisseur.setId(dto.getId());
        fournisseur.setNom(dto.getNom());
        fournisseur.setPrenom(dto.getPrenom());
        fournisseur.setAdresse(AdresseDto.toEntity(dto.getAdresse()));
        fournisseur.setPhoto(dto.getPhoto());
        fournisseur.setMail(dto.getMail());
        fournisseur.setNumTel(dto.getNumTel());
        fournisseur.setIdEntreprise(dto.getIdEntreprise());
        return fournisseur;
    }
    
    FournisseurDto(final Integer id, final String nom, final String prenom, final AdresseDto adresse, final String photo, final String mail, final String numTel, final Integer idEntreprise, final List<CommandeFournisseurDto> commandeFournisseurs) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.adresse = adresse;
        this.photo = photo;
        this.mail = mail;
        this.numTel = numTel;
        this.idEntreprise = idEntreprise;
        this.commandeFournisseurs = commandeFournisseurs;
    }
    
    public static FournisseurDtoBuilder builder() {
        return new FournisseurDtoBuilder();
    }
    
    public Integer getId() {
        return this.id;
    }
    
    public String getNom() {
        return this.nom;
    }
    
    public String getPrenom() {
        return this.prenom;
    }
    
    public AdresseDto getAdresse() {
        return this.adresse;
    }
    
    public String getPhoto() {
        return this.photo;
    }
    
    public String getMail() {
        return this.mail;
    }
    
    public String getNumTel() {
        return this.numTel;
    }
    
    public Integer getIdEntreprise() {
        return this.idEntreprise;
    }
    
    public List<CommandeFournisseurDto> getCommandeFournisseurs() {
        return this.commandeFournisseurs;
    }
    
    public void setId(final Integer id) {
        this.id = id;
    }
    
    public void setNom(final String nom) {
        this.nom = nom;
    }
    
    public void setPrenom(final String prenom) {
        this.prenom = prenom;
    }
    
    public void setAdresse(final AdresseDto adresse) {
        this.adresse = adresse;
    }
    
    public void setPhoto(final String photo) {
        this.photo = photo;
    }
    
    public void setMail(final String mail) {
        this.mail = mail;
    }
    
    public void setNumTel(final String numTel) {
        this.numTel = numTel;
    }
    
    public void setIdEntreprise(final Integer idEntreprise) {
        this.idEntreprise = idEntreprise;
    }
    
    @JsonIgnore
    public void setCommandeFournisseurs(final List<CommandeFournisseurDto> commandeFournisseurs) {
        this.commandeFournisseurs = commandeFournisseurs;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof FournisseurDto)) {
            return false;
        }
        final FournisseurDto other = (FournisseurDto)o;
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
        final Object this$nom = this.getNom();
        final Object other$nom = other.getNom();
        Label_0139: {
            if (this$nom == null) {
                if (other$nom == null) {
                    break Label_0139;
                }
            }
            else if (this$nom.equals(other$nom)) {
                break Label_0139;
            }
            return false;
        }
        final Object this$prenom = this.getPrenom();
        final Object other$prenom = other.getPrenom();
        Label_0176: {
            if (this$prenom == null) {
                if (other$prenom == null) {
                    break Label_0176;
                }
            }
            else if (this$prenom.equals(other$prenom)) {
                break Label_0176;
            }
            return false;
        }
        final Object this$adresse = this.getAdresse();
        final Object other$adresse = other.getAdresse();
        Label_0213: {
            if (this$adresse == null) {
                if (other$adresse == null) {
                    break Label_0213;
                }
            }
            else if (this$adresse.equals(other$adresse)) {
                break Label_0213;
            }
            return false;
        }
        final Object this$photo = this.getPhoto();
        final Object other$photo = other.getPhoto();
        Label_0250: {
            if (this$photo == null) {
                if (other$photo == null) {
                    break Label_0250;
                }
            }
            else if (this$photo.equals(other$photo)) {
                break Label_0250;
            }
            return false;
        }
        final Object this$mail = this.getMail();
        final Object other$mail = other.getMail();
        Label_0287: {
            if (this$mail == null) {
                if (other$mail == null) {
                    break Label_0287;
                }
            }
            else if (this$mail.equals(other$mail)) {
                break Label_0287;
            }
            return false;
        }
        final Object this$numTel = this.getNumTel();
        final Object other$numTel = other.getNumTel();
        Label_0324: {
            if (this$numTel == null) {
                if (other$numTel == null) {
                    break Label_0324;
                }
            }
            else if (this$numTel.equals(other$numTel)) {
                break Label_0324;
            }
            return false;
        }
        final Object this$commandeFournisseurs = this.getCommandeFournisseurs();
        final Object other$commandeFournisseurs = other.getCommandeFournisseurs();
        if (this$commandeFournisseurs == null) {
            if (other$commandeFournisseurs == null) {
                return true;
            }
        }
        else if (this$commandeFournisseurs.equals(other$commandeFournisseurs)) {
            return true;
        }
        return false;
    }
    
    protected boolean canEqual(final Object other) {
        return other instanceof FournisseurDto;
    }
    
    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $id = this.getId();
        result = result * 59 + (($id == null) ? 43 : $id.hashCode());
        final Object $idEntreprise = this.getIdEntreprise();
        result = result * 59 + (($idEntreprise == null) ? 43 : $idEntreprise.hashCode());
        final Object $nom = this.getNom();
        result = result * 59 + (($nom == null) ? 43 : $nom.hashCode());
        final Object $prenom = this.getPrenom();
        result = result * 59 + (($prenom == null) ? 43 : $prenom.hashCode());
        final Object $adresse = this.getAdresse();
        result = result * 59 + (($adresse == null) ? 43 : $adresse.hashCode());
        final Object $photo = this.getPhoto();
        result = result * 59 + (($photo == null) ? 43 : $photo.hashCode());
        final Object $mail = this.getMail();
        result = result * 59 + (($mail == null) ? 43 : $mail.hashCode());
        final Object $numTel = this.getNumTel();
        result = result * 59 + (($numTel == null) ? 43 : $numTel.hashCode());
        final Object $commandeFournisseurs = this.getCommandeFournisseurs();
        result = result * 59 + (($commandeFournisseurs == null) ? 43 : $commandeFournisseurs.hashCode());
        return result;
    }
    
    @Override
    public String toString() {
        return invokedynamic(makeConcatWithConstants:(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Lcom/bouali/gestiondestock/dto/AdresseDto;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/util/List;)Ljava/lang/String;, this.getId(), this.getNom(), this.getPrenom(), this.getAdresse(), this.getPhoto(), this.getMail(), this.getNumTel(), this.getIdEntreprise(), this.getCommandeFournisseurs());
    }
    
    public static class FournisseurDtoBuilder
    {
        private Integer id;
        private String nom;
        private String prenom;
        private AdresseDto adresse;
        private String photo;
        private String mail;
        private String numTel;
        private Integer idEntreprise;
        private List<CommandeFournisseurDto> commandeFournisseurs;
        
        FournisseurDtoBuilder() {
        }
        
        public FournisseurDtoBuilder id(final Integer id) {
            this.id = id;
            return this;
        }
        
        public FournisseurDtoBuilder nom(final String nom) {
            this.nom = nom;
            return this;
        }
        
        public FournisseurDtoBuilder prenom(final String prenom) {
            this.prenom = prenom;
            return this;
        }
        
        public FournisseurDtoBuilder adresse(final AdresseDto adresse) {
            this.adresse = adresse;
            return this;
        }
        
        public FournisseurDtoBuilder photo(final String photo) {
            this.photo = photo;
            return this;
        }
        
        public FournisseurDtoBuilder mail(final String mail) {
            this.mail = mail;
            return this;
        }
        
        public FournisseurDtoBuilder numTel(final String numTel) {
            this.numTel = numTel;
            return this;
        }
        
        public FournisseurDtoBuilder idEntreprise(final Integer idEntreprise) {
            this.idEntreprise = idEntreprise;
            return this;
        }
        
        @JsonIgnore
        public FournisseurDtoBuilder commandeFournisseurs(final List<CommandeFournisseurDto> commandeFournisseurs) {
            this.commandeFournisseurs = commandeFournisseurs;
            return this;
        }
        
        public FournisseurDto build() {
            return new FournisseurDto(this.id, this.nom, this.prenom, this.adresse, this.photo, this.mail, this.numTel, this.idEntreprise, this.commandeFournisseurs);
        }
        
        @Override
        public String toString() {
            return invokedynamic(makeConcatWithConstants:(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Lcom/bouali/gestiondestock/dto/AdresseDto;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/util/List;)Ljava/lang/String;, this.id, this.nom, this.prenom, this.adresse, this.photo, this.mail, this.numTel, this.idEntreprise, this.commandeFournisseurs);
        }
    }
}