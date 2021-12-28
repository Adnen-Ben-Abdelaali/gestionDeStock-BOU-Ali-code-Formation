package com.bouali.gestiondestock.dto;

import java.util.*;
import com.fasterxml.jackson.annotation.*;
import com.bouali.gestiondestock.model.*;

public class ClientDto
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
    private List<CommandeClientDto> commandeClients;
    
    public static ClientDto fromEntity(final Client client) {
        if (client == null) {
            return null;
        }
        return builder().id(client.getId()).nom(client.getNom()).prenom(client.getPrenom()).adresse(AdresseDto.fromEntity(client.getAdresse())).photo(client.getPhoto()).mail(client.getMail()).numTel(client.getNumTel()).idEntreprise(client.getIdEntreprise()).build();
    }
    
    public static Client toEntity(final ClientDto dto) {
        if (dto == null) {
            return null;
        }
        final Client client = new Client();
        client.setId(dto.getId());
        client.setNom(dto.getNom());
        client.setPrenom(dto.getPrenom());
        client.setAdresse(AdresseDto.toEntity(dto.getAdresse()));
        client.setPhoto(dto.getPhoto());
        client.setMail(dto.getMail());
        client.setNumTel(dto.getNumTel());
        client.setIdEntreprise(dto.getIdEntreprise());
        return client;
    }
    
    ClientDto(final Integer id, final String nom, final String prenom, final AdresseDto adresse, final String photo, final String mail, final String numTel, final Integer idEntreprise, final List<CommandeClientDto> commandeClients) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.adresse = adresse;
        this.photo = photo;
        this.mail = mail;
        this.numTel = numTel;
        this.idEntreprise = idEntreprise;
        this.commandeClients = commandeClients;
    }
    
    public static ClientDtoBuilder builder() {
        return new ClientDtoBuilder();
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
    
    public List<CommandeClientDto> getCommandeClients() {
        return this.commandeClients;
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
    public void setCommandeClients(final List<CommandeClientDto> commandeClients) {
        this.commandeClients = commandeClients;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof ClientDto)) {
            return false;
        }
        final ClientDto other = (ClientDto)o;
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
        final Object this$commandeClients = this.getCommandeClients();
        final Object other$commandeClients = other.getCommandeClients();
        if (this$commandeClients == null) {
            if (other$commandeClients == null) {
                return true;
            }
        }
        else if (this$commandeClients.equals(other$commandeClients)) {
            return true;
        }
        return false;
    }
    
    protected boolean canEqual(final Object other) {
        return other instanceof ClientDto;
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
        final Object $commandeClients = this.getCommandeClients();
        result = result * 59 + (($commandeClients == null) ? 43 : $commandeClients.hashCode());
        return result;
    }
    
    @Override
    public String toString() {
        return invokedynamic(makeConcatWithConstants:(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Lcom/bouali/gestiondestock/dto/AdresseDto;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/util/List;)Ljava/lang/String;, this.getId(), this.getNom(), this.getPrenom(), this.getAdresse(), this.getPhoto(), this.getMail(), this.getNumTel(), this.getIdEntreprise(), this.getCommandeClients());
    }
    
    public static class ClientDtoBuilder
    {
        private Integer id;
        private String nom;
        private String prenom;
        private AdresseDto adresse;
        private String photo;
        private String mail;
        private String numTel;
        private Integer idEntreprise;
        private List<CommandeClientDto> commandeClients;
        
        ClientDtoBuilder() {
        }
        
        public ClientDtoBuilder id(final Integer id) {
            this.id = id;
            return this;
        }
        
        public ClientDtoBuilder nom(final String nom) {
            this.nom = nom;
            return this;
        }
        
        public ClientDtoBuilder prenom(final String prenom) {
            this.prenom = prenom;
            return this;
        }
        
        public ClientDtoBuilder adresse(final AdresseDto adresse) {
            this.adresse = adresse;
            return this;
        }
        
        public ClientDtoBuilder photo(final String photo) {
            this.photo = photo;
            return this;
        }
        
        public ClientDtoBuilder mail(final String mail) {
            this.mail = mail;
            return this;
        }
        
        public ClientDtoBuilder numTel(final String numTel) {
            this.numTel = numTel;
            return this;
        }
        
        public ClientDtoBuilder idEntreprise(final Integer idEntreprise) {
            this.idEntreprise = idEntreprise;
            return this;
        }
        
        @JsonIgnore
        public ClientDtoBuilder commandeClients(final List<CommandeClientDto> commandeClients) {
            this.commandeClients = commandeClients;
            return this;
        }
        
        public ClientDto build() {
            return new ClientDto(this.id, this.nom, this.prenom, this.adresse, this.photo, this.mail, this.numTel, this.idEntreprise, this.commandeClients);
        }
        
        @Override
        public String toString() {
            return invokedynamic(makeConcatWithConstants:(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Lcom/bouali/gestiondestock/dto/AdresseDto;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/util/List;)Ljava/lang/String;, this.id, this.nom, this.prenom, this.adresse, this.photo, this.mail, this.numTel, this.idEntreprise, this.commandeClients);
        }
    }
}