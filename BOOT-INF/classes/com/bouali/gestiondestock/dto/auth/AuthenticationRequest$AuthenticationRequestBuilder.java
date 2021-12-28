package com.bouali.gestiondestock.dto.auth;

public static class AuthenticationRequestBuilder
{
    private String login;
    private String password;
    
    AuthenticationRequestBuilder() {
    }
    
    public AuthenticationRequestBuilder login(final String login) {
        this.login = login;
        return this;
    }
    
    public AuthenticationRequestBuilder password(final String password) {
        this.password = password;
        return this;
    }
    
    public AuthenticationRequest build() {
        return new AuthenticationRequest(this.login, this.password);
    }
    
    @Override
    public String toString() {
        return invokedynamic(makeConcatWithConstants:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;, this.login, this.password);
    }
}