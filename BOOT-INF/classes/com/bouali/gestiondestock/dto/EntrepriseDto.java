package com.bouali.gestiondestock.dto;

import java.util.*;
import com.fasterxml.jackson.annotation.*;
import com.bouali.gestiondestock.model.*;

public class EntrepriseDto
{
    private Integer id;
    private String nom;
    private String description;
    private AdresseDto adresse;
    private String codeFiscal;
    private String photo;
    private String email;
    private String numTel;
    private String steWeb;
    @JsonIgnore
    private List<UtilisateurDto> utilisateurs;
    
    public static EntrepriseDto fromEntity(final Entreprise entreprise) {
        if (entreprise == null) {
            return null;
        }
        return builder().id(entreprise.getId()).nom(entreprise.getNom()).description(entreprise.getDescription()).adresse(AdresseDto.fromEntity(entreprise.getAdresse())).codeFiscal(entreprise.getCodeFiscal()).photo(entreprise.getPhoto()).email(entreprise.getEmail()).numTel(entreprise.getNumTel()).steWeb(entreprise.getSteWeb()).build();
    }
    
    public static Entreprise toEntity(final EntrepriseDto dto) {
        if (dto == null) {
            return null;
        }
        final Entreprise entreprise = new Entreprise();
        entreprise.setId(dto.getId());
        entreprise.setNom(dto.getNom());
        entreprise.setDescription(dto.getDescription());
        entreprise.setAdresse(AdresseDto.toEntity(dto.getAdresse()));
        entreprise.setCodeFiscal(dto.getCodeFiscal());
        entreprise.setPhoto(dto.getPhoto());
        entreprise.setEmail(dto.getEmail());
        entreprise.setNumTel(dto.getNumTel());
        entreprise.setSteWeb(dto.getSteWeb());
        return entreprise;
    }
    
    EntrepriseDto(final Integer id, final String nom, final String description, final AdresseDto adresse, final String codeFiscal, final String photo, final String email, final String numTel, final String steWeb, final List<UtilisateurDto> utilisateurs) {
        this.id = id;
        this.nom = nom;
        this.description = description;
        this.adresse = adresse;
        this.codeFiscal = codeFiscal;
        this.photo = photo;
        this.email = email;
        this.numTel = numTel;
        this.steWeb = steWeb;
        this.utilisateurs = utilisateurs;
    }
    
    public static EntrepriseDtoBuilder builder() {
        return new EntrepriseDtoBuilder();
    }
    
    public Integer getId() {
        return this.id;
    }
    
    public String getNom() {
        return this.nom;
    }
    
    public String getDescription() {
        return this.description;
    }
    
    public AdresseDto getAdresse() {
        return this.adresse;
    }
    
    public String getCodeFiscal() {
        return this.codeFiscal;
    }
    
    public String getPhoto() {
        return this.photo;
    }
    
    public String getEmail() {
        return this.email;
    }
    
    public String getNumTel() {
        return this.numTel;
    }
    
    public String getSteWeb() {
        return this.steWeb;
    }
    
    public List<UtilisateurDto> getUtilisateurs() {
        return this.utilisateurs;
    }
    
    public void setId(final Integer id) {
        this.id = id;
    }
    
    public void setNom(final String nom) {
        this.nom = nom;
    }
    
    public void setDescription(final String description) {
        this.description = description;
    }
    
    public void setAdresse(final AdresseDto adresse) {
        this.adresse = adresse;
    }
    
    public void setCodeFiscal(final String codeFiscal) {
        this.codeFiscal = codeFiscal;
    }
    
    public void setPhoto(final String photo) {
        this.photo = photo;
    }
    
    public void setEmail(final String email) {
        this.email = email;
    }
    
    public void setNumTel(final String numTel) {
        this.numTel = numTel;
    }
    
    public void setSteWeb(final String steWeb) {
        this.steWeb = steWeb;
    }
    
    @JsonIgnore
    public void setUtilisateurs(final List<UtilisateurDto> utilisateurs) {
        this.utilisateurs = utilisateurs;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof EntrepriseDto)) {
            return false;
        }
        final EntrepriseDto other = (EntrepriseDto)o;
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
        final Object this$nom = this.getNom();
        final Object other$nom = other.getNom();
        Label_0102: {
            if (this$nom == null) {
                if (other$nom == null) {
                    break Label_0102;
                }
            }
            else if (this$nom.equals(other$nom)) {
                break Label_0102;
            }
            return false;
        }
        final Object this$description = this.getDescription();
        final Object other$description = other.getDescription();
        Label_0139: {
            if (this$description == null) {
                if (other$description == null) {
                    break Label_0139;
                }
            }
            else if (this$description.equals(other$description)) {
                break Label_0139;
            }
            return false;
        }
        final Object this$adresse = this.getAdresse();
        final Object other$adresse = other.getAdresse();
        Label_0176: {
            if (this$adresse == null) {
                if (other$adresse == null) {
                    break Label_0176;
                }
            }
            else if (this$adresse.equals(other$adresse)) {
                break Label_0176;
            }
            return false;
        }
        final Object this$codeFiscal = this.getCodeFiscal();
        final Object other$codeFiscal = other.getCodeFiscal();
        Label_0213: {
            if (this$codeFiscal == null) {
                if (other$codeFiscal == null) {
                    break Label_0213;
                }
            }
            else if (this$codeFiscal.equals(other$codeFiscal)) {
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
        final Object this$email = this.getEmail();
        final Object other$email = other.getEmail();
        Label_0287: {
            if (this$email == null) {
                if (other$email == null) {
                    break Label_0287;
                }
            }
            else if (this$email.equals(other$email)) {
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
        final Object this$steWeb = this.getSteWeb();
        final Object other$steWeb = other.getSteWeb();
        Label_0361: {
            if (this$steWeb == null) {
                if (other$steWeb == null) {
                    break Label_0361;
                }
            }
            else if (this$steWeb.equals(other$steWeb)) {
                break Label_0361;
            }
            return false;
        }
        final Object this$utilisateurs = this.getUtilisateurs();
        final Object other$utilisateurs = other.getUtilisateurs();
        if (this$utilisateurs == null) {
            if (other$utilisateurs == null) {
                return true;
            }
        }
        else if (this$utilisateurs.equals(other$utilisateurs)) {
            return true;
        }
        return false;
    }
    
    protected boolean canEqual(final Object other) {
        return other instanceof EntrepriseDto;
    }
    
    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $id = this.getId();
        result = result * 59 + (($id == null) ? 43 : $id.hashCode());
        final Object $nom = this.getNom();
        result = result * 59 + (($nom == null) ? 43 : $nom.hashCode());
        final Object $description = this.getDescription();
        result = result * 59 + (($description == null) ? 43 : $description.hashCode());
        final Object $adresse = this.getAdresse();
        result = result * 59 + (($adresse == null) ? 43 : $adresse.hashCode());
        final Object $codeFiscal = this.getCodeFiscal();
        result = result * 59 + (($codeFiscal == null) ? 43 : $codeFiscal.hashCode());
        final Object $photo = this.getPhoto();
        result = result * 59 + (($photo == null) ? 43 : $photo.hashCode());
        final Object $email = this.getEmail();
        result = result * 59 + (($email == null) ? 43 : $email.hashCode());
        final Object $numTel = this.getNumTel();
        result = result * 59 + (($numTel == null) ? 43 : $numTel.hashCode());
        final Object $steWeb = this.getSteWeb();
        result = result * 59 + (($steWeb == null) ? 43 : $steWeb.hashCode());
        final Object $utilisateurs = this.getUtilisateurs();
        result = result * 59 + (($utilisateurs == null) ? 43 : $utilisateurs.hashCode());
        return result;
    }
    
    @Override
    public String toString() {
        return invokedynamic(makeConcatWithConstants:(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Lcom/bouali/gestiondestock/dto/AdresseDto;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Ljava/lang/String;, this.getId(), this.getNom(), this.getDescription(), this.getAdresse(), this.getCodeFiscal(), this.getPhoto(), this.getEmail(), this.getNumTel(), this.getSteWeb(), this.getUtilisateurs());
    }
    
    public static class EntrepriseDtoBuilder
    {
        private Integer id;
        private String nom;
        private String description;
        private AdresseDto adresse;
        private String codeFiscal;
        private String photo;
        private String email;
        private String numTel;
        private String steWeb;
        private List<UtilisateurDto> utilisateurs;
        
        EntrepriseDtoBuilder() {
        }
        
        public EntrepriseDtoBuilder id(final Integer id) {
            this.id = id;
            return this;
        }
        
        public EntrepriseDtoBuilder nom(final String nom) {
            this.nom = nom;
            return this;
        }
        
        public EntrepriseDtoBuilder description(final String description) {
            this.description = description;
            return this;
        }
        
        public EntrepriseDtoBuilder adresse(final AdresseDto adresse) {
            this.adresse = adresse;
            return this;
        }
        
        public EntrepriseDtoBuilder codeFiscal(final String codeFiscal) {
            this.codeFiscal = codeFiscal;
            return this;
        }
        
        public EntrepriseDtoBuilder photo(final String photo) {
            this.photo = photo;
            return this;
        }
        
        public EntrepriseDtoBuilder email(final String email) {
            this.email = email;
            return this;
        }
        
        public EntrepriseDtoBuilder numTel(final String numTel) {
            this.numTel = numTel;
            return this;
        }
        
        public EntrepriseDtoBuilder steWeb(final String steWeb) {
            this.steWeb = steWeb;
            return this;
        }
        
        @JsonIgnore
        public EntrepriseDtoBuilder utilisateurs(final List<UtilisateurDto> utilisateurs) {
            this.utilisateurs = utilisateurs;
            return this;
        }
        
        public EntrepriseDto build() {
            return new EntrepriseDto(this.id, this.nom, this.description, this.adresse, this.codeFiscal, this.photo, this.email, this.numTel, this.steWeb, this.utilisateurs);
        }
        
        @Override
        public String toString() {
            return invokedynamic(makeConcatWithConstants:(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Lcom/bouali/gestiondestock/dto/AdresseDto;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Ljava/lang/String;, this.id, this.nom, this.description, this.adresse, this.codeFiscal, this.photo, this.email, this.numTel, this.steWeb, this.utilisateurs);
        }
    }
}