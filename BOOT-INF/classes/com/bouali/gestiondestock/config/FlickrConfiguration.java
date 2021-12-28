package com.bouali.gestiondestock.config;

import org.springframework.beans.factory.annotation.*;
import com.flickr4java.flickr.auth.*;
import com.flickr4java.flickr.*;
import org.springframework.context.annotation.*;

public class FlickrConfiguration
{
    @Value("${flickr.apiKey}")
    private String apiKey;
    @Value("${flickr.apiSecret}")
    private String apiSecret;
    @Value("${flickr.appKey}")
    private String appKey;
    @Value("${flickr.appSecret}")
    private String appSecret;
    
    @Bean
    public Flickr getFlickr2() {
        final Flickr flickr = new Flickr(this.apiKey, this.apiSecret, (Transport)new REST());
        final Auth auth = new Auth();
        auth.setPermission(Permission.READ);
        auth.setToken(this.appKey);
        auth.setTokenSecret(this.appSecret);
        final RequestContext requestContext = RequestContext.getRequestContext();
        requestContext.setAuth(auth);
        flickr.setAuth(auth);
        return flickr;
    }
}