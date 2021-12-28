package com.bouali.gestiondestock.dto;

import java.time.*;
import java.util.*;
import com.bouali.gestiondestock.model.*;

public class CommandeClientDto
{
    private Integer id;
    private String code;
    private Instant dateCommande;
    private EtatCommande etatCommande;
    private ClientDto client;
    private Integer idEntreprise;
    private List<LigneCommandeClientDto> ligneCommandeClients;
    
    public static CommandeClientDto fromEntity(final CommandeClient commandeClient) {
        if (commandeClient == null) {
            return null;
        }
        return builder().id(commandeClient.getId()).code(commandeClient.getCode()).dateCommande(commandeClient.getDateCommande()).etatCommande(commandeClient.getEtatCommande()).client(ClientDto.fromEntity(commandeClient.getClient())).idEntreprise(commandeClient.getIdEntreprise()).build();
    }
    
    public static CommandeClient toEntity(final CommandeClientDto dto) {
        if (dto == null) {
            return null;
        }
        final CommandeClient commandeClient = new CommandeClient();
        commandeClient.setId(dto.getId());
        commandeClient.setCode(dto.getCode());
        commandeClient.setDateCommande(dto.getDateCommande());
        commandeClient.setEtatCommande(dto.getEtatCommande());
        commandeClient.setIdEntreprise(dto.getIdEntreprise());
        return commandeClient;
    }
    
    public boolean isCommandeLivree() {
        return EtatCommande.LIVREE.equals((Object)this.etatCommande);
    }
    
    CommandeClientDto(final Integer id, final String code, final Instant dateCommande, final EtatCommande etatCommande, final ClientDto client, final Integer idEntreprise, final List<LigneCommandeClientDto> ligneCommandeClients) {
        this.id = id;
        this.code = code;
        this.dateCommande = dateCommande;
        this.etatCommande = etatCommande;
        this.client = client;
        this.idEntreprise = idEntreprise;
        this.ligneCommandeClients = ligneCommandeClients;
    }
    
    public static CommandeClientDtoBuilder builder() {
        return new CommandeClientDtoBuilder();
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
    
    public ClientDto getClient() {
        return this.client;
    }
    
    public Integer getIdEntreprise() {
        return this.idEntreprise;
    }
    
    public List<LigneCommandeClientDto> getLigneCommandeClients() {
        return this.ligneCommandeClients;
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
    
    public void setClient(final ClientDto client) {
        this.client = client;
    }
    
    public void setIdEntreprise(final Integer idEntreprise) {
        this.idEntreprise = idEntreprise;
    }
    
    public void setLigneCommandeClients(final List<LigneCommandeClientDto> ligneCommandeClients) {
        this.ligneCommandeClients = ligneCommandeClients;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof CommandeClientDto)) {
            return false;
        }
        final CommandeClientDto other = (CommandeClientDto)o;
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
        final Object this$client = this.getClient();
        final Object other$client = other.getClient();
        Label_0250: {
            if (this$client == null) {
                if (other$client == null) {
                    break Label_0250;
                }
            }
            else if (this$client.equals(other$client)) {
                break Label_0250;
            }
            return false;
        }
        final Object this$ligneCommandeClients = this.getLigneCommandeClients();
        final Object other$ligneCommandeClients = other.getLigneCommandeClients();
        if (this$ligneCommandeClients == null) {
            if (other$ligneCommandeClients == null) {
                return true;
            }
        }
        else if (this$ligneCommandeClients.equals(other$ligneCommandeClients)) {
            return true;
        }
        return false;
    }
    
    protected boolean canEqual(final Object other) {
        return other instanceof CommandeClientDto;
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
        final Object $client = this.getClient();
        result = result * 59 + (($client == null) ? 43 : $client.hashCode());
        final Object $ligneCommandeClients = this.getLigneCommandeClients();
        result = result * 59 + (($ligneCommandeClients == null) ? 43 : $ligneCommandeClients.hashCode());
        return result;
    }
    
    @Override
    public String toString() {
        return invokedynamic(makeConcatWithConstants:(Ljava/lang/Integer;Ljava/lang/String;Ljava/time/Instant;Lcom/bouali/gestiondestock/model/EtatCommande;Lcom/bouali/gestiondestock/dto/ClientDto;Ljava/lang/Integer;Ljava/util/List;)Ljava/lang/String;, this.getId(), this.getCode(), this.getDateCommande(), this.getEtatCommande(), this.getClient(), this.getIdEntreprise(), this.getLigneCommandeClients());
    }
    
    public static class CommandeClientDtoBuilder
    {
        private Integer id;
        private String code;
        private Instant dateCommande;
        private EtatCommande etatCommande;
        private ClientDto client;
        private Integer idEntreprise;
        private List<LigneCommandeClientDto> ligneCommandeClients;
        
        CommandeClientDtoBuilder() {
        }
        
        public CommandeClientDtoBuilder id(final Integer id) {
            this.id = id;
            return this;
        }
        
        public CommandeClientDtoBuilder code(final String code) {
            this.code = code;
            return this;
        }
        
        public CommandeClientDtoBuilder dateCommande(final Instant dateCommande) {
            this.dateCommande = dateCommande;
            return this;
        }
        
        public CommandeClientDtoBuilder etatCommande(final EtatCommande etatCommande) {
            this.etatCommande = etatCommande;
            return this;
        }
        
        public CommandeClientDtoBuilder client(final ClientDto client) {
            this.client = client;
            return this;
        }
        
        public CommandeClientDtoBuilder idEntreprise(final Integer idEntreprise) {
            this.idEntreprise = idEntreprise;
            return this;
        }
        
        public CommandeClientDtoBuilder ligneCommandeClients(final List<LigneCommandeClientDto> ligneCommandeClients) {
            this.ligneCommandeClients = ligneCommandeClients;
            return this;
        }
        
        public CommandeClientDto build() {
            return new CommandeClientDto(this.id, this.code, this.dateCommande, this.etatCommande, this.client, this.idEntreprise, this.ligneCommandeClients);
        }
        
        @Override
        public String toString() {
            return invokedynamic(makeConcatWithConstants:(Ljava/lang/Integer;Ljava/lang/String;Ljava/time/Instant;Lcom/bouali/gestiondestock/model/EtatCommande;Lcom/bouali/gestiondestock/dto/ClientDto;Ljava/lang/Integer;Ljava/util/List;)Ljava/lang/String;, this.id, this.code, this.dateCommande, this.etatCommande, this.client, this.idEntreprise, this.ligneCommandeClients);
        }
    }
}