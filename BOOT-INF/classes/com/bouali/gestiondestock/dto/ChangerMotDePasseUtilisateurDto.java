package com.bouali.gestiondestock.dto;

public class ChangerMotDePasseUtilisateurDto
{
    private Integer id;
    private String motDePasse;
    private String confirmMotDePasse;
    
    ChangerMotDePasseUtilisateurDto(final Integer id, final String motDePasse, final String confirmMotDePasse) {
        this.id = id;
        this.motDePasse = motDePasse;
        this.confirmMotDePasse = confirmMotDePasse;
    }
    
    public static ChangerMotDePasseUtilisateurDtoBuilder builder() {
        return new ChangerMotDePasseUtilisateurDtoBuilder();
    }
    
    public Integer getId() {
        return this.id;
    }
    
    public String getMotDePasse() {
        return this.motDePasse;
    }
    
    public String getConfirmMotDePasse() {
        return this.confirmMotDePasse;
    }
    
    public void setId(final Integer id) {
        this.id = id;
    }
    
    public void setMotDePasse(final String motDePasse) {
        this.motDePasse = motDePasse;
    }
    
    public void setConfirmMotDePasse(final String confirmMotDePasse) {
        this.confirmMotDePasse = confirmMotDePasse;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof ChangerMotDePasseUtilisateurDto)) {
            return false;
        }
        final ChangerMotDePasseUtilisateurDto other = (ChangerMotDePasseUtilisateurDto)o;
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
        final Object this$motDePasse = this.getMotDePasse();
        final Object other$motDePasse = other.getMotDePasse();
        Label_0102: {
            if (this$motDePasse == null) {
                if (other$motDePasse == null) {
                    break Label_0102;
                }
            }
            else if (this$motDePasse.equals(other$motDePasse)) {
                break Label_0102;
            }
            return false;
        }
        final Object this$confirmMotDePasse = this.getConfirmMotDePasse();
        final Object other$confirmMotDePasse = other.getConfirmMotDePasse();
        if (this$confirmMotDePasse == null) {
            if (other$confirmMotDePasse == null) {
                return true;
            }
        }
        else if (this$confirmMotDePasse.equals(other$confirmMotDePasse)) {
            return true;
        }
        return false;
    }
    
    protected boolean canEqual(final Object other) {
        return other instanceof ChangerMotDePasseUtilisateurDto;
    }
    
    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $id = this.getId();
        result = result * 59 + (($id == null) ? 43 : $id.hashCode());
        final Object $motDePasse = this.getMotDePasse();
        result = result * 59 + (($motDePasse == null) ? 43 : $motDePasse.hashCode());
        final Object $confirmMotDePasse = this.getConfirmMotDePasse();
        result = result * 59 + (($confirmMotDePasse == null) ? 43 : $confirmMotDePasse.hashCode());
        return result;
    }
    
    @Override
    public String toString() {
        return invokedynamic(makeConcatWithConstants:(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;, this.getId(), this.getMotDePasse(), this.getConfirmMotDePasse());
    }
    
    public static class ChangerMotDePasseUtilisateurDtoBuilder
    {
        private Integer id;
        private String motDePasse;
        private String confirmMotDePasse;
        
        ChangerMotDePasseUtilisateurDtoBuilder() {
        }
        
        public ChangerMotDePasseUtilisateurDtoBuilder id(final Integer id) {
            this.id = id;
            return this;
        }
        
        public ChangerMotDePasseUtilisateurDtoBuilder motDePasse(final String motDePasse) {
            this.motDePasse = motDePasse;
            return this;
        }
        
        public ChangerMotDePasseUtilisateurDtoBuilder confirmMotDePasse(final String confirmMotDePasse) {
            this.confirmMotDePasse = confirmMotDePasse;
            return this;
        }
        
        public ChangerMotDePasseUtilisateurDto build() {
            return new ChangerMotDePasseUtilisateurDto(this.id, this.motDePasse, this.confirmMotDePasse);
        }
        
        @Override
        public String toString() {
            return invokedynamic(makeConcatWithConstants:(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;, this.id, this.motDePasse, this.confirmMotDePasse);
        }
    }
}