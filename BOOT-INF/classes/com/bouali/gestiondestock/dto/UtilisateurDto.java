package com.bouali.gestiondestock.dto;

import java.time.*;
import java.util.*;
import com.bouali.gestiondestock.model.*;
import java.util.function.*;
import java.util.stream.*;

public class UtilisateurDto
{
    private Integer id;
    private String nom;
    private String prenom;
    private String email;
    private Instant dateDeNaissance;
    private String moteDePasse;
    private AdresseDto adresse;
    private String photo;
    private EntrepriseDto entreprise;
    private List<RolesDto> roles;
    
    public static UtilisateurDto fromEntity(final Utilisateur utilisateur) {
        if (utilisateur == null) {
            return null;
        }
        return builder().id(utilisateur.getId()).nom(utilisateur.getNom()).prenom(utilisateur.getPrenom()).email(utilisateur.getEmail()).moteDePasse(utilisateur.getMoteDePasse()).dateDeNaissance(utilisateur.getDateDeNaissance()).adresse(AdresseDto.fromEntity(utilisateur.getAdresse())).photo(utilisateur.getPhoto()).entreprise(EntrepriseDto.fromEntity(utilisateur.getEntreprise())).roles((utilisateur.getRoles() != null) ? ((List)utilisateur.getRoles().stream().map(RolesDto::fromEntity).collect(Collectors.toList())) : null).build();
    }
    
    public static Utilisateur toEntity(final UtilisateurDto dto) {
        if (dto == null) {
            return null;
        }
        final Utilisateur utilisateur = new Utilisateur();
        utilisateur.setId(dto.getId());
        utilisateur.setNom(dto.getNom());
        utilisateur.setPrenom(dto.getPrenom());
        utilisateur.setEmail(dto.getEmail());
        utilisateur.setMoteDePasse(dto.getMoteDePasse());
        utilisateur.setDateDeNaissance(dto.getDateDeNaissance());
        utilisateur.setAdresse(AdresseDto.toEntity(dto.getAdresse()));
        utilisateur.setPhoto(dto.getPhoto());
        utilisateur.setEntreprise(EntrepriseDto.toEntity(dto.getEntreprise()));
        return utilisateur;
    }
    
    UtilisateurDto(final Integer id, final String nom, final String prenom, final String email, final Instant dateDeNaissance, final String moteDePasse, final AdresseDto adresse, final String photo, final EntrepriseDto entreprise, final List<RolesDto> roles) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
        this.dateDeNaissance = dateDeNaissance;
        this.moteDePasse = moteDePasse;
        this.adresse = adresse;
        this.photo = photo;
        this.entreprise = entreprise;
        this.roles = roles;
    }
    
    public static UtilisateurDtoBuilder builder() {
        return new UtilisateurDtoBuilder();
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
    
    public String getEmail() {
        return this.email;
    }
    
    public Instant getDateDeNaissance() {
        return this.dateDeNaissance;
    }
    
    public String getMoteDePasse() {
        return this.moteDePasse;
    }
    
    public AdresseDto getAdresse() {
        return this.adresse;
    }
    
    public String getPhoto() {
        return this.photo;
    }
    
    public EntrepriseDto getEntreprise() {
        return this.entreprise;
    }
    
    public List<RolesDto> getRoles() {
        return this.roles;
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
    
    public void setEmail(final String email) {
        this.email = email;
    }
    
    public void setDateDeNaissance(final Instant dateDeNaissance) {
        this.dateDeNaissance = dateDeNaissance;
    }
    
    public void setMoteDePasse(final String moteDePasse) {
        this.moteDePasse = moteDePasse;
    }
    
    public void setAdresse(final AdresseDto adresse) {
        this.adresse = adresse;
    }
    
    public void setPhoto(final String photo) {
        this.photo = photo;
    }
    
    public void setEntreprise(final EntrepriseDto entreprise) {
        this.entreprise = entreprise;
    }
    
    public void setRoles(final List<RolesDto> roles) {
        this.roles = roles;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof UtilisateurDto)) {
            return false;
        }
        final UtilisateurDto other = (UtilisateurDto)o;
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
        final Object this$prenom = this.getPrenom();
        final Object other$prenom = other.getPrenom();
        Label_0139: {
            if (this$prenom == null) {
                if (other$prenom == null) {
                    break Label_0139;
                }
            }
            else if (this$prenom.equals(other$prenom)) {
                break Label_0139;
            }
            return false;
        }
        final Object this$email = this.getEmail();
        final Object other$email = other.getEmail();
        Label_0176: {
            if (this$email == null) {
                if (other$email == null) {
                    break Label_0176;
                }
            }
            else if (this$email.equals(other$email)) {
                break Label_0176;
            }
            return false;
        }
        final Object this$dateDeNaissance = this.getDateDeNaissance();
        final Object other$dateDeNaissance = other.getDateDeNaissance();
        Label_0213: {
            if (this$dateDeNaissance == null) {
                if (other$dateDeNaissance == null) {
                    break Label_0213;
                }
            }
            else if (this$dateDeNaissance.equals(other$dateDeNaissance)) {
                break Label_0213;
            }
            return false;
        }
        final Object this$moteDePasse = this.getMoteDePasse();
        final Object other$moteDePasse = other.getMoteDePasse();
        Label_0250: {
            if (this$moteDePasse == null) {
                if (other$moteDePasse == null) {
                    break Label_0250;
                }
            }
            else if (this$moteDePasse.equals(other$moteDePasse)) {
                break Label_0250;
            }
            return false;
        }
        final Object this$adresse = this.getAdresse();
        final Object other$adresse = other.getAdresse();
        Label_0287: {
            if (this$adresse == null) {
                if (other$adresse == null) {
                    break Label_0287;
                }
            }
            else if (this$adresse.equals(other$adresse)) {
                break Label_0287;
            }
            return false;
        }
        final Object this$photo = this.getPhoto();
        final Object other$photo = other.getPhoto();
        Label_0324: {
            if (this$photo == null) {
                if (other$photo == null) {
                    break Label_0324;
                }
            }
            else if (this$photo.equals(other$photo)) {
                break Label_0324;
            }
            return false;
        }
        final Object this$entreprise = this.getEntreprise();
        final Object other$entreprise = other.getEntreprise();
        Label_0361: {
            if (this$entreprise == null) {
                if (other$entreprise == null) {
                    break Label_0361;
                }
            }
            else if (this$entreprise.equals(other$entreprise)) {
                break Label_0361;
            }
            return false;
        }
        final Object this$roles = this.getRoles();
        final Object other$roles = other.getRoles();
        if (this$roles == null) {
            if (other$roles == null) {
                return true;
            }
        }
        else if (this$roles.equals(other$roles)) {
            return true;
        }
        return false;
    }
    
    protected boolean canEqual(final Object other) {
        return other instanceof UtilisateurDto;
    }
    
    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $id = this.getId();
        result = result * 59 + (($id == null) ? 43 : $id.hashCode());
        final Object $nom = this.getNom();
        result = result * 59 + (($nom == null) ? 43 : $nom.hashCode());
        final Object $prenom = this.getPrenom();
        result = result * 59 + (($prenom == null) ? 43 : $prenom.hashCode());
        final Object $email = this.getEmail();
        result = result * 59 + (($email == null) ? 43 : $email.hashCode());
        final Object $dateDeNaissance = this.getDateDeNaissance();
        result = result * 59 + (($dateDeNaissance == null) ? 43 : $dateDeNaissance.hashCode());
        final Object $moteDePasse = this.getMoteDePasse();
        result = result * 59 + (($moteDePasse == null) ? 43 : $moteDePasse.hashCode());
        final Object $adresse = this.getAdresse();
        result = result * 59 + (($adresse == null) ? 43 : $adresse.hashCode());
        final Object $photo = this.getPhoto();
        result = result * 59 + (($photo == null) ? 43 : $photo.hashCode());
        final Object $entreprise = this.getEntreprise();
        result = result * 59 + (($entreprise == null) ? 43 : $entreprise.hashCode());
        final Object $roles = this.getRoles();
        result = result * 59 + (($roles == null) ? 43 : $roles.hashCode());
        return result;
    }
    
    @Override
    public String toString() {
        return invokedynamic(makeConcatWithConstants:(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/time/Instant;Ljava/lang/String;Lcom/bouali/gestiondestock/dto/AdresseDto;Ljava/lang/String;Lcom/bouali/gestiondestock/dto/EntrepriseDto;Ljava/util/List;)Ljava/lang/String;, this.getId(), this.getNom(), this.getPrenom(), this.getEmail(), this.getDateDeNaissance(), this.getMoteDePasse(), this.getAdresse(), this.getPhoto(), this.getEntreprise(), this.getRoles());
    }
    
    public static class UtilisateurDtoBuilder
    {
        private Integer id;
        private String nom;
        private String prenom;
        private String email;
        private Instant dateDeNaissance;
        private String moteDePasse;
        private AdresseDto adresse;
        private String photo;
        private EntrepriseDto entreprise;
        private List<RolesDto> roles;
        
        UtilisateurDtoBuilder() {
        }
        
        public UtilisateurDtoBuilder id(final Integer id) {
            this.id = id;
            return this;
        }
        
        public UtilisateurDtoBuilder nom(final String nom) {
            this.nom = nom;
            return this;
        }
        
        public UtilisateurDtoBuilder prenom(final String prenom) {
            this.prenom = prenom;
            return this;
        }
        
        public UtilisateurDtoBuilder email(final String email) {
            this.email = email;
            return this;
        }
        
        public UtilisateurDtoBuilder dateDeNaissance(final Instant dateDeNaissance) {
            this.dateDeNaissance = dateDeNaissance;
            return this;
        }
        
        public UtilisateurDtoBuilder moteDePasse(final String moteDePasse) {
            this.moteDePasse = moteDePasse;
            return this;
        }
        
        public UtilisateurDtoBuilder adresse(final AdresseDto adresse) {
            this.adresse = adresse;
            return this;
        }
        
        public UtilisateurDtoBuilder photo(final String photo) {
            this.photo = photo;
            return this;
        }
        
        public UtilisateurDtoBuilder entreprise(final EntrepriseDto entreprise) {
            this.entreprise = entreprise;
            return this;
        }
        
        public UtilisateurDtoBuilder roles(final List<RolesDto> roles) {
            this.roles = roles;
            return this;
        }
        
        public UtilisateurDto build() {
            return new UtilisateurDto(this.id, this.nom, this.prenom, this.email, this.dateDeNaissance, this.moteDePasse, this.adresse, this.photo, this.entreprise, this.roles);
        }
        
        @Override
        public String toString() {
            return invokedynamic(makeConcatWithConstants:(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/time/Instant;Ljava/lang/String;Lcom/bouali/gestiondestock/dto/AdresseDto;Ljava/lang/String;Lcom/bouali/gestiondestock/dto/EntrepriseDto;Ljava/util/List;)Ljava/lang/String;, this.id, this.nom, this.prenom, this.email, this.dateDeNaissance, this.moteDePasse, this.adresse, this.photo, this.entreprise, this.roles);
        }
    }
}