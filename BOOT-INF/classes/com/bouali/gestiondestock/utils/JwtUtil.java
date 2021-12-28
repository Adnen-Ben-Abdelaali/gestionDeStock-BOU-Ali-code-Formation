package com.bouali.gestiondestock.utils;

import org.springframework.stereotype.*;
import java.util.function.*;
import com.bouali.gestiondestock.model.auth.*;
import java.util.*;
import io.jsonwebtoken.*;
import org.springframework.security.core.userdetails.*;

@Service
public class JwtUtil
{
    private String SECRET_KEY;
    
    public JwtUtil() {
        this.SECRET_KEY = "secret";
    }
    
    public String extractUsername(final String token) {
        return this.extractClaim(token, Claims::getSubject);
    }
    
    public Date extractExpiration(final String token) {
        return this.extractClaim(token, Claims::getExpiration);
    }
    
    public String extractIdEntreprise(final String token) {
        final Claims claims = this.extractAllClaims(token);
        return (String)claims.get("idEntreprise", (Class)String.class);
    }
    
    public <T> T extractClaim(final String token, final Function<Claims, T> claimsResolver) {
        final Claims claims = this.extractAllClaims(token);
        return claimsResolver.apply(claims);
    }
    
    private Claims extractAllClaims(final String token) {
        return (Claims)Jwts.parser().setSigningKey(this.SECRET_KEY).parseClaimsJws(token).getBody();
    }
    
    private Boolean isTokenExpired(final String token) {
        return this.extractExpiration(token).before(new Date());
    }
    
    public String generateToken(final ExtendedUser userDetails) {
        final Map<String, Object> claims = new HashMap<String, Object>();
        return this.createToken(claims, userDetails);
    }
    
    private String createToken(final Map<String, Object> claims, final ExtendedUser userDetails) {
        return Jwts.builder().setClaims((Map)claims).setSubject(userDetails.getUsername()).setIssuedAt(new Date(System.currentTimeMillis())).setExpiration(new Date(System.currentTimeMillis() + 36000000L)).claim("idEntreprise", (Object)userDetails.getIdEntreprise().toString()).signWith(SignatureAlgorithm.HS256, this.SECRET_KEY).compact();
    }
    
    public Boolean validateToken(final String token, final UserDetails userDetails) {
        final String username = this.extractUsername(token);
        return username.equals(userDetails.getUsername()) && !this.isTokenExpired(token);
    }
}