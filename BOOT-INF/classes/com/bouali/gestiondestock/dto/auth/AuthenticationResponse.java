package com.bouali.gestiondestock.dto.auth;

public class AuthenticationResponse
{
    private String accessToken;
    
    AuthenticationResponse(final String accessToken) {
        this.accessToken = accessToken;
    }
    
    public static AuthenticationResponseBuilder builder() {
        return new AuthenticationResponseBuilder();
    }
    
    public String getAccessToken() {
        return this.accessToken;
    }
    
    public void setAccessToken(final String accessToken) {
        this.accessToken = accessToken;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof AuthenticationResponse)) {
            return false;
        }
        final AuthenticationResponse other = (AuthenticationResponse)o;
        if (!other.canEqual(this)) {
            return false;
        }
        final Object this$accessToken = this.getAccessToken();
        final Object other$accessToken = other.getAccessToken();
        if (this$accessToken == null) {
            if (other$accessToken == null) {
                return true;
            }
        }
        else if (this$accessToken.equals(other$accessToken)) {
            return true;
        }
        return false;
    }
    
    protected boolean canEqual(final Object other) {
        return other instanceof AuthenticationResponse;
    }
    
    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $accessToken = this.getAccessToken();
        result = result * 59 + (($accessToken == null) ? 43 : $accessToken.hashCode());
        return result;
    }
    
    @Override
    public String toString() {
        return invokedynamic(makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;, this.getAccessToken());
    }
    
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
}