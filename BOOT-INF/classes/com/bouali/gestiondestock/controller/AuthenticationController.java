package com.bouali.gestiondestock.controller;

import com.bouali.gestiondestock.controller.api.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.*;
import com.bouali.gestiondestock.services.auth.*;
import com.bouali.gestiondestock.utils.*;
import org.springframework.http.*;
import com.bouali.gestiondestock.dto.auth.*;
import org.springframework.security.authentication.*;
import org.springframework.security.core.*;
import com.bouali.gestiondestock.model.auth.*;
import org.springframework.security.core.userdetails.*;

@RestController
public class AuthenticationController implements AuthenticationApi
{
    @Autowired
    private AuthenticationManager authenticationManager;
    @Autowired
    private ApplicationUserDetailsService userDetailsService;
    @Autowired
    private JwtUtil jwtUtil;
    
    @Override
    public ResponseEntity<AuthenticationResponse> authenticate(final AuthenticationRequest request) {
        this.authenticationManager.authenticate((Authentication)new UsernamePasswordAuthenticationToken((Object)request.getLogin(), (Object)request.getPassword()));
        final UserDetails userDetails = this.userDetailsService.loadUserByUsername(request.getLogin());
        final String jwt = this.jwtUtil.generateToken((ExtendedUser)userDetails);
        return (ResponseEntity<AuthenticationResponse>)ResponseEntity.ok((Object)AuthenticationResponse.builder().accessToken(jwt).build());
    }
}