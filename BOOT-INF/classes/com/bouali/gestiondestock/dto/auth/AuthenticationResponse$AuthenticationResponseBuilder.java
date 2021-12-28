package com.bouali.gestiondestock.dto.auth;

public static class AuthenticationResponseBuilder
{
    private String accessToken;
    
    AuthenticationResponseBuilder() {
    }
    
    public AuthenticationResponseBuilder accessToken(final String accessToken) {
        this.accessToken = accessToken;
        return this;
    }
    
    public AuthenticationResponse build() {
        return new AuthenticationResponse(this.accessToken);
    }
    
    @Override
    public String toString() {
        return invokedynamic(makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;, this.accessToken);
    }
}