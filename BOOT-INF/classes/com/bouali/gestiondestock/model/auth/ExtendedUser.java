package com.bouali.gestiondestock.model.auth;

import org.springframework.security.core.userdetails.*;
import java.util.*;
import org.springframework.security.core.*;

public class ExtendedUser extends User
{
    private Integer idEntreprise;
    
    public ExtendedUser(final String username, final String password, final Collection<? extends GrantedAuthority> authorities) {
        super(username, password, (Collection)authorities);
    }
    
    public ExtendedUser(final String username, final String password, final Integer idEntreprise, final Collection<? extends GrantedAuthority> authorities) {
        super(username, password, (Collection)authorities);
        this.idEntreprise = idEntreprise;
    }
    
    public Integer getIdEntreprise() {
        return this.idEntreprise;
    }
    
    public void setIdEntreprise(final Integer idEntreprise) {
        this.idEntreprise = idEntreprise;
    }
}