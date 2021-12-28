package com.bouali.gestiondestock.dto.auth;

public class AuthenticationRequest
{
    private String login;
    private String password;
    
    AuthenticationRequest(final String login, final String password) {
        this.login = login;
        this.password = password;
    }
    
    public static AuthenticationRequestBuilder builder() {
        return new AuthenticationRequestBuilder();
    }
    
    public String getLogin() {
        return this.login;
    }
    
    public String getPassword() {
        return this.password;
    }
    
    public void setLogin(final String login) {
        this.login = login;
    }
    
    public void setPassword(final String password) {
        this.password = password;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof AuthenticationRequest)) {
            return false;
        }
        final AuthenticationRequest other = (AuthenticationRequest)o;
        if (!other.canEqual(this)) {
            return false;
        }
        final Object this$login = this.getLogin();
        final Object other$login = other.getLogin();
        Label_0065: {
            if (this$login == null) {
                if (other$login == null) {
                    break Label_0065;
                }
            }
            else if (this$login.equals(other$login)) {
                break Label_0065;
            }
            return false;
        }
        final Object this$password = this.getPassword();
        final Object other$password = other.getPassword();
        if (this$password == null) {
            if (other$password == null) {
                return true;
            }
        }
        else if (this$password.equals(other$password)) {
            return true;
        }
        return false;
    }
    
    protected boolean canEqual(final Object other) {
        return other instanceof AuthenticationRequest;
    }
    
    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $login = this.getLogin();
        result = result * 59 + (($login == null) ? 43 : $login.hashCode());
        final Object $password = this.getPassword();
        result = result * 59 + (($password == null) ? 43 : $password.hashCode());
        return result;
    }
    
    @Override
    public String toString() {
        return invokedynamic(makeConcatWithConstants:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;, this.getLogin(), this.getPassword());
    }
    
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
}