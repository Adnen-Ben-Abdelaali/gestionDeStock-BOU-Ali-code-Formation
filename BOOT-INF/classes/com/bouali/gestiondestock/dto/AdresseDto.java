package com.bouali.gestiondestock.dto;

import com.bouali.gestiondestock.model.*;

public class AdresseDto
{
    private String adresse1;
    private String adresse2;
    private String ville;
    private String codePostale;
    private String pays;
    
    public static AdresseDto fromEntity(final Adresse adresse) {
        if (adresse == null) {
            return null;
        }
        return builder().adresse1(adresse.getAdresse1()).adresse2(adresse.getAdresse2()).codePostale(adresse.getCodePostale()).ville(adresse.getVille()).pays(adresse.getPays()).build();
    }
    
    public static Adresse toEntity(final AdresseDto adresseDto) {
        if (adresseDto == null) {
            return null;
        }
        final Adresse adresse = new Adresse();
        adresse.setAdresse1(adresseDto.getAdresse1());
        adresse.setAdresse2(adresseDto.getAdresse2());
        adresse.setCodePostale(adresseDto.getCodePostale());
        adresse.setVille(adresseDto.getVille());
        adresse.setPays(adresseDto.getPays());
        return adresse;
    }
    
    AdresseDto(final String adresse1, final String adresse2, final String ville, final String codePostale, final String pays) {
        this.adresse1 = adresse1;
        this.adresse2 = adresse2;
        this.ville = ville;
        this.codePostale = codePostale;
        this.pays = pays;
    }
    
    public static AdresseDtoBuilder builder() {
        return new AdresseDtoBuilder();
    }
    
    public String getAdresse1() {
        return this.adresse1;
    }
    
    public String getAdresse2() {
        return this.adresse2;
    }
    
    public String getVille() {
        return this.ville;
    }
    
    public String getCodePostale() {
        return this.codePostale;
    }
    
    public String getPays() {
        return this.pays;
    }
    
    public void setAdresse1(final String adresse1) {
        this.adresse1 = adresse1;
    }
    
    public void setAdresse2(final String adresse2) {
        this.adresse2 = adresse2;
    }
    
    public void setVille(final String ville) {
        this.ville = ville;
    }
    
    public void setCodePostale(final String codePostale) {
        this.codePostale = codePostale;
    }
    
    public void setPays(final String pays) {
        this.pays = pays;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof AdresseDto)) {
            return false;
        }
        final AdresseDto other = (AdresseDto)o;
        if (!other.canEqual(this)) {
            return false;
        }
        final Object this$adresse1 = this.getAdresse1();
        final Object other$adresse1 = other.getAdresse1();
        Label_0065: {
            if (this$adresse1 == null) {
                if (other$adresse1 == null) {
                    break Label_0065;
                }
            }
            else if (this$adresse1.equals(other$adresse1)) {
                break Label_0065;
            }
            return false;
        }
        final Object this$adresse2 = this.getAdresse2();
        final Object other$adresse2 = other.getAdresse2();
        Label_0102: {
            if (this$adresse2 == null) {
                if (other$adresse2 == null) {
                    break Label_0102;
                }
            }
            else if (this$adresse2.equals(other$adresse2)) {
                break Label_0102;
            }
            return false;
        }
        final Object this$ville = this.getVille();
        final Object other$ville = other.getVille();
        Label_0139: {
            if (this$ville == null) {
                if (other$ville == null) {
                    break Label_0139;
                }
            }
            else if (this$ville.equals(other$ville)) {
                break Label_0139;
            }
            return false;
        }
        final Object this$codePostale = this.getCodePostale();
        final Object other$codePostale = other.getCodePostale();
        Label_0176: {
            if (this$codePostale == null) {
                if (other$codePostale == null) {
                    break Label_0176;
                }
            }
            else if (this$codePostale.equals(other$codePostale)) {
                break Label_0176;
            }
            return false;
        }
        final Object this$pays = this.getPays();
        final Object other$pays = other.getPays();
        if (this$pays == null) {
            if (other$pays == null) {
                return true;
            }
        }
        else if (this$pays.equals(other$pays)) {
            return true;
        }
        return false;
    }
    
    protected boolean canEqual(final Object other) {
        return other instanceof AdresseDto;
    }
    
    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $adresse1 = this.getAdresse1();
        result = result * 59 + (($adresse1 == null) ? 43 : $adresse1.hashCode());
        final Object $adresse2 = this.getAdresse2();
        result = result * 59 + (($adresse2 == null) ? 43 : $adresse2.hashCode());
        final Object $ville = this.getVille();
        result = result * 59 + (($ville == null) ? 43 : $ville.hashCode());
        final Object $codePostale = this.getCodePostale();
        result = result * 59 + (($codePostale == null) ? 43 : $codePostale.hashCode());
        final Object $pays = this.getPays();
        result = result * 59 + (($pays == null) ? 43 : $pays.hashCode());
        return result;
    }
    
    @Override
    public String toString() {
        return invokedynamic(makeConcatWithConstants:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;, this.getAdresse1(), this.getAdresse2(), this.getVille(), this.getCodePostale(), this.getPays());
    }
    
    public static class AdresseDtoBuilder
    {
        private String adresse1;
        private String adresse2;
        private String ville;
        private String codePostale;
        private String pays;
        
        AdresseDtoBuilder() {
        }
        
        public AdresseDtoBuilder adresse1(final String adresse1) {
            this.adresse1 = adresse1;
            return this;
        }
        
        public AdresseDtoBuilder adresse2(final String adresse2) {
            this.adresse2 = adresse2;
            return this;
        }
        
        public AdresseDtoBuilder ville(final String ville) {
            this.ville = ville;
            return this;
        }
        
        public AdresseDtoBuilder codePostale(final String codePostale) {
            this.codePostale = codePostale;
            return this;
        }
        
        public AdresseDtoBuilder pays(final String pays) {
            this.pays = pays;
            return this;
        }
        
        public AdresseDto build() {
            return new AdresseDto(this.adresse1, this.adresse2, this.ville, this.codePostale, this.pays);
        }
        
        @Override
        public String toString() {
            return invokedynamic(makeConcatWithConstants:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;, this.adresse1, this.adresse2, this.ville, this.codePostale, this.pays);
        }
    }
}