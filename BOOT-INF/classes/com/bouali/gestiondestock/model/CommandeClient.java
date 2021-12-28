package com.bouali.gestiondestock.model;

import java.time.*;
import java.util.*;
import javax.persistence.*;

@Entity
@Table(name = "commandeclient")
public class CommandeClient extends AbstractEntity
{
    @Column(name = "code")
    private String code;
    @Column(name = "datecommande")
    private Instant dateCommande;
    @Column(name = "etatcommande")
    private EtatCommande etatCommande;
    @Column(name = "identreprise")
    private Integer idEntreprise;
    @ManyToOne
    @JoinColumn(name = "idclient")
    private Client client;
    @OneToMany(mappedBy = "commandeClient")
    private List<LigneCommandeClient> ligneCommandeClients;
    
    public String getCode() {
        return this.code;
    }
    
    public Instant getDateCommande() {
        return this.dateCommande;
    }
    
    public EtatCommande getEtatCommande() {
        return this.etatCommande;
    }
    
    public Integer getIdEntreprise() {
        return this.idEntreprise;
    }
    
    public Client getClient() {
        return this.client;
    }
    
    public List<LigneCommandeClient> getLigneCommandeClients() {
        return this.ligneCommandeClients;
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
    
    public void setIdEntreprise(final Integer idEntreprise) {
        this.idEntreprise = idEntreprise;
    }
    
    public void setClient(final Client client) {
        this.client = client;
    }
    
    public void setLigneCommandeClients(final List<LigneCommandeClient> ligneCommandeClients) {
        this.ligneCommandeClients = ligneCommandeClients;
    }
    
    @Override
    public String toString() {
        return invokedynamic(makeConcatWithConstants:(Ljava/lang/String;Ljava/time/Instant;Lcom/bouali/gestiondestock/model/EtatCommande;Ljava/lang/Integer;Lcom/bouali/gestiondestock/model/Client;Ljava/util/List;)Ljava/lang/String;, this.getCode(), this.getDateCommande(), this.getEtatCommande(), this.getIdEntreprise(), this.getClient(), this.getLigneCommandeClients());
    }
    
    public CommandeClient() {
    }
    
    public CommandeClient(final String code, final Instant dateCommande, final EtatCommande etatCommande, final Integer idEntreprise, final Client client, final List<LigneCommandeClient> ligneCommandeClients) {
        this.code = code;
        this.dateCommande = dateCommande;
        this.etatCommande = etatCommande;
        this.idEntreprise = idEntreprise;
        this.client = client;
        this.ligneCommandeClients = ligneCommandeClients;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof CommandeClient)) {
            return false;
        }
        final CommandeClient other = (CommandeClient)o;
        if (!other.canEqual(this)) {
            return false;
        }
        if (!super.equals(o)) {
            return false;
        }
        final Object this$idEntreprise = this.getIdEntreprise();
        final Object other$idEntreprise = other.getIdEntreprise();
        Label_0075: {
            if (this$idEntreprise == null) {
                if (other$idEntreprise == null) {
                    break Label_0075;
                }
            }
            else if (this$idEntreprise.equals(other$idEntreprise)) {
                break Label_0075;
            }
            return false;
        }
        final Object this$code = this.getCode();
        final Object other$code = other.getCode();
        Label_0112: {
            if (this$code == null) {
                if (other$code == null) {
                    break Label_0112;
                }
            }
            else if (this$code.equals(other$code)) {
                break Label_0112;
            }
            return false;
        }
        final Object this$dateCommande = this.getDateCommande();
        final Object other$dateCommande = other.getDateCommande();
        Label_0149: {
            if (this$dateCommande == null) {
                if (other$dateCommande == null) {
                    break Label_0149;
                }
            }
            else if (this$dateCommande.equals(other$dateCommande)) {
                break Label_0149;
            }
            return false;
        }
        final Object this$etatCommande = this.getEtatCommande();
        final Object other$etatCommande = other.getEtatCommande();
        Label_0186: {
            if (this$etatCommande == null) {
                if (other$etatCommande == null) {
                    break Label_0186;
                }
            }
            else if (this$etatCommande.equals(other$etatCommande)) {
                break Label_0186;
            }
            return false;
        }
        final Object this$client = this.getClient();
        final Object other$client = other.getClient();
        Label_0223: {
            if (this$client == null) {
                if (other$client == null) {
                    break Label_0223;
                }
            }
            else if (this$client.equals(other$client)) {
                break Label_0223;
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
    
    @Override
    protected boolean canEqual(final Object other) {
        return other instanceof CommandeClient;
    }
    
    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
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
}