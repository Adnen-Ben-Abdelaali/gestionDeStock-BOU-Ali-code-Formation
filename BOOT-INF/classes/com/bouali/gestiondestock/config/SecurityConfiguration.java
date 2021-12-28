package com.bouali.gestiondestock.config;

import org.springframework.security.config.annotation.web.configuration.*;
import com.bouali.gestiondestock.services.auth.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.security.config.annotation.authentication.builders.*;
import org.springframework.security.core.userdetails.*;
import org.springframework.security.config.annotation.web.builders.*;
import org.springframework.security.config.annotation.web.configurers.*;
import org.springframework.security.web.session.*;
import javax.servlet.*;
import org.springframework.security.config.http.*;
import org.springframework.security.web.authentication.*;
import org.springframework.web.filter.*;
import java.util.*;
import org.springframework.web.cors.*;
import org.springframework.context.annotation.*;
import org.springframework.security.authentication.*;
import org.springframework.security.crypto.password.*;
import org.springframework.security.crypto.bcrypt.*;

@EnableWebSecurity
public class SecurityConfiguration extends WebSecurityConfigurerAdapter
{
    @Autowired
    private ApplicationUserDetailsService applicationUserDetailsService;
    @Autowired
    private ApplicationRequestFilter applicationRequestFilter;
    
    protected void configure(final AuthenticationManagerBuilder auth) throws Exception {
        auth.userDetailsService((UserDetailsService)this.applicationUserDetailsService).passwordEncoder(this.passwordEncoder());
    }
    
    protected void configure(final HttpSecurity http) throws Exception {
        ((HttpSecurity)((ExpressionUrlAuthorizationConfigurer.AuthorizedUrl)((ExpressionUrlAuthorizationConfigurer.AuthorizedUrl)((HttpSecurity)http.addFilterBefore((Filter)this.corsFilter(), (Class)SessionManagementFilter.class).csrf().disable()).authorizeRequests().antMatchers(new String[] { "/**/authenticate", "/**/entreprises/create", "/v2/api-docs", "/swagger-resources", "/swagger-resources/**", "/configuration/ui", "/configuration/security", "/swagger-ui.html", "/webjars/**", "/v3/api-docs/**", "/swagger-ui/**" })).permitAll().anyRequest()).authenticated().and()).sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS);
        http.addFilterBefore((Filter)this.applicationRequestFilter, (Class)UsernamePasswordAuthenticationFilter.class);
    }
    
    @Bean
    public CorsFilter corsFilter() {
        final UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
        final CorsConfiguration config = new CorsConfiguration();
        config.setAllowCredentials(Boolean.valueOf(true));
        config.setAllowedOriginPatterns((List)Collections.singletonList("*"));
        config.setAllowedHeaders((List)Arrays.asList("Origin", "Content-Type", "Accept", "Authorization"));
        config.setAllowedMethods((List)Arrays.asList("GET", "POST", "PUT", "OPTIONS", "DELETE", "PATCH"));
        source.registerCorsConfiguration("/**", config);
        return new CorsFilter((CorsConfigurationSource)source);
    }
    
    @Bean
    public AuthenticationManager customAuthenticationManager() throws Exception {
        return this.authenticationManagerBean();
    }
    
    @Bean
    public PasswordEncoder passwordEncoder() {
        return (PasswordEncoder)new BCryptPasswordEncoder();
    }
}