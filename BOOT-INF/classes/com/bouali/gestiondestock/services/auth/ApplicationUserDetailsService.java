package com.bouali.gestiondestock.services.auth;

import org.springframework.stereotype.*;
import com.bouali.gestiondestock.services.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.security.core.authority.*;
import com.bouali.gestiondestock.model.auth.*;
import org.springframework.security.core.*;
import java.util.*;
import org.springframework.security.core.userdetails.*;
import com.bouali.gestiondestock.dto.*;

@Service
public class ApplicationUserDetailsService implements UserDetailsService
{
    @Autowired
    private UtilisateurService service;
    
    public UserDetails loadUserByUsername(final String email) throws UsernameNotFoundException {
        final UtilisateurDto utilisateur = this.service.findByEmail(email);
        final List<SimpleGrantedAuthority> authorities = new ArrayList<SimpleGrantedAuthority>();
        utilisateur.getRoles().forEach(role -> authorities.add(new SimpleGrantedAuthority(role.getRoleName())));
        return (UserDetails)new ExtendedUser(utilisateur.getEmail(), utilisateur.getMoteDePasse(), utilisateur.getEntreprise().getId(), (Collection<? extends GrantedAuthority>)authorities);
    }
}