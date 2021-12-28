package com.bouali.gestiondestock.dto;

import java.time.*;
import java.util.*;
import com.bouali.gestiondestock.model.*;

public class VentesDto
{
    private Integer id;
    private String code;
    private Instant dateVente;
    private String commentaire;
    private List<LigneVenteDto> ligneVentes;
    private Integer idEntreprise;
    
    public static VentesDto fromEntity(final Ventes vente) {
        if (vente == null) {
            return null;
        }
        return builder().id(vente.getId()).code(vente.getCode()).commentaire(vente.getCommentaire()).idEntreprise(vente.getIdEntreprise()).build();
    }
    
    public static Ventes toEntity(final VentesDto dto) {
        if (dto == null) {
            return null;
        }
        final Ventes ventes = new Ventes();
        ventes.setId(dto.getId());
        ventes.setCode(ventes.getCode());
        ventes.setCommentaire(dto.getCommentaire());
        ventes.setIdEntreprise(dto.getIdEntreprise());
        return ventes;
    }
    
    VentesDto(final Integer id, final String code, final Instant dateVente, final String commentaire, final List<LigneVenteDto> ligneVentes, final Integer idEntreprise) {
        this.id = id;
        this.code = code;
        this.dateVente = dateVente;
        this.commentaire = commentaire;
        this.ligneVentes = ligneVentes;
        this.idEntreprise = idEntreprise;
    }
    
    public static VentesDtoBuilder builder() {
        return new VentesDtoBuilder();
    }
    
    public Integer getId() {
        return this.id;
    }
    
    public String getCode() {
        return this.code;
    }
    
    public Instant getDateVente() {
        return this.dateVente;
    }
    
    public String getCommentaire() {
        return this.commentaire;
    }
    
    public List<LigneVenteDto> getLigneVentes() {
        return this.ligneVentes;
    }
    
    public Integer getIdEntreprise() {
        return this.idEntreprise;
    }
    
    public void setId(final Integer id) {
        this.id = id;
    }
    
    public void setCode(final String code) {
        this.code = code;
    }
    
    public void setDateVente(final Instant dateVente) {
        this.dateVente = dateVente;
    }
    
    public void setCommentaire(final String commentaire) {
        this.commentaire = commentaire;
    }
    
    public void setLigneVentes(final List<LigneVenteDto> ligneVentes) {
        this.ligneVentes = ligneVentes;
    }
    
    public void setIdEntreprise(final Integer idEntreprise) {
        this.idEntreprise = idEntreprise;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof VentesDto)) {
            return false;
        }
        final VentesDto other = (VentesDto)o;
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
        final Object this$dateVente = this.getDateVente();
        final Object other$dateVente = other.getDateVente();
        Label_0176: {
            if (this$dateVente == null) {
                if (other$dateVente == null) {
                    break Label_0176;
                }
            }
            else if (this$dateVente.equals(other$dateVente)) {
                break Label_0176;
            }
            return false;
        }
        final Object this$commentaire = this.getCommentaire();
        final Object other$commentaire = other.getCommentaire();
        Label_0213: {
            if (this$commentaire == null) {
                if (other$commentaire == null) {
                    break Label_0213;
                }
            }
            else if (this$commentaire.equals(other$commentaire)) {
                break Label_0213;
            }
            return false;
        }
        final Object this$ligneVentes = this.getLigneVentes();
        final Object other$ligneVentes = other.getLigneVentes();
        if (this$ligneVentes == null) {
            if (other$ligneVentes == null) {
                return true;
            }
        }
        else if (this$ligneVentes.equals(other$ligneVentes)) {
            return true;
        }
        return false;
    }
    
    protected boolean canEqual(final Object other) {
        return other instanceof VentesDto;
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
        final Object $dateVente = this.getDateVente();
        result = result * 59 + (($dateVente == null) ? 43 : $dateVente.hashCode());
        final Object $commentaire = this.getCommentaire();
        result = result * 59 + (($commentaire == null) ? 43 : $commentaire.hashCode());
        final Object $ligneVentes = this.getLigneVentes();
        result = result * 59 + (($ligneVentes == null) ? 43 : $ligneVentes.hashCode());
        return result;
    }
    
    @Override
    public String toString() {
        return invokedynamic(makeConcatWithConstants:(Ljava/lang/Integer;Ljava/lang/String;Ljava/time/Instant;Ljava/lang/String;Ljava/util/List;Ljava/lang/Integer;)Ljava/lang/String;, this.getId(), this.getCode(), this.getDateVente(), this.getCommentaire(), this.getLigneVentes(), this.getIdEntreprise());
    }
    
    public static class VentesDtoBuilder
    {
        private Integer id;
        private String code;
        private Instant dateVente;
        private String commentaire;
        private List<LigneVenteDto> ligneVentes;
        private Integer idEntreprise;
        
        VentesDtoBuilder() {
        }
        
        public VentesDtoBuilder id(final Integer id) {
            this.id = id;
            return this;
        }
        
        public VentesDtoBuilder code(final String code) {
            this.code = code;
            return this;
        }
        
        public VentesDtoBuilder dateVente(final Instant dateVente) {
            this.dateVente = dateVente;
            return this;
        }
        
        public VentesDtoBuilder commentaire(final String commentaire) {
            this.commentaire = commentaire;
            return this;
        }
        
        public VentesDtoBuilder ligneVentes(final List<LigneVenteDto> ligneVentes) {
            this.ligneVentes = ligneVentes;
            return this;
        }
        
        public VentesDtoBuilder idEntreprise(final Integer idEntreprise) {
            this.idEntreprise = idEntreprise;
            return this;
        }
        
        public VentesDto build() {
            return new VentesDto(this.id, this.code, this.dateVente, this.commentaire, this.ligneVentes, this.idEntreprise);
        }
        
        @Override
        public String toString() {
            return invokedynamic(makeConcatWithConstants:(Ljava/lang/Integer;Ljava/lang/String;Ljava/time/Instant;Ljava/lang/String;Ljava/util/List;Ljava/lang/Integer;)Ljava/lang/String;, this.id, this.code, this.dateVente, this.commentaire, this.ligneVentes, this.idEntreprise);
        }
    }
}