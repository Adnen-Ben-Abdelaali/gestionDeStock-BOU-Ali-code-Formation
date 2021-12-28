package com.bouali.gestiondestock.config;

import org.springframework.web.filter.*;
import org.springframework.stereotype.*;
import com.bouali.gestiondestock.utils.*;
import org.springframework.beans.factory.annotation.*;
import com.bouali.gestiondestock.services.auth.*;
import javax.servlet.http.*;
import org.springframework.security.core.context.*;
import org.springframework.security.authentication.*;
import org.springframework.security.web.authentication.*;
import org.springframework.security.core.*;
import org.slf4j.*;
import org.springframework.security.core.userdetails.*;
import javax.servlet.*;
import java.io.*;

@Component
public class ApplicationRequestFilter extends OncePerRequestFilter
{
    @Autowired
    private JwtUtil jwtUtil;
    @Autowired
    private ApplicationUserDetailsService userDetailsService;
    
    protected void doFilterInternal(final HttpServletRequest request, final HttpServletResponse response, final FilterChain chain) throws ServletException, IOException {
        final String authHeader = request.getHeader("Authorization");
        String userEmail = null;
        String jwt = null;
        String idEntreprise = null;
        if (authHeader != null && authHeader.startsWith("Bearer ")) {
            jwt = authHeader.substring(7);
            userEmail = this.jwtUtil.extractUsername(jwt);
            idEntreprise = this.jwtUtil.extractIdEntreprise(jwt);
        }
        if (userEmail != null && SecurityContextHolder.getContext().getAuthentication() == null) {
            final UserDetails userDetails = this.userDetailsService.loadUserByUsername(userEmail);
            if (this.jwtUtil.validateToken(jwt, userDetails)) {
                final UsernamePasswordAuthenticationToken usernamePasswordAuthenticationToken = new UsernamePasswordAuthenticationToken((Object)userDetails, (Object)null, userDetails.getAuthorities());
                usernamePasswordAuthenticationToken.setDetails((Object)new WebAuthenticationDetailsSource().buildDetails(request));
                SecurityContextHolder.getContext().setAuthentication((Authentication)usernamePasswordAuthenticationToken);
            }
        }
        MDC.put("idEntreprise", idEntreprise);
        chain.doFilter((ServletRequest)request, (ServletResponse)response);
    }
}