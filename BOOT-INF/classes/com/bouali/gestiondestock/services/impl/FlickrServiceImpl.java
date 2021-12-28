package com.bouali.gestiondestock.services.impl;

import com.bouali.gestiondestock.services.*;
import org.springframework.stereotype.*;
import org.springframework.beans.factory.annotation.*;
import com.flickr4java.flickr.uploader.*;
import com.flickr4java.flickr.auth.*;
import java.util.concurrent.*;
import java.io.*;
import com.flickr4java.flickr.*;
import org.slf4j.*;

@Service
public class FlickrServiceImpl implements FlickrService
{
    private static final Logger log;
    @Value("${flickr.apiKey}")
    private String apiKey;
    @Value("${flickr.apiSecret}")
    private String apiSecret;
    @Value("${flickr.appKey}")
    private String appKey;
    @Value("${flickr.appSecret}")
    private String appSecret;
    private Flickr flickr;
    
    public String savePhoto(final InputStream photo, final String title) {
        try {
            this.connect();
            final UploadMetaData uploadMetaData = new UploadMetaData();
            uploadMetaData.setTitle(title);
            final String photoId = this.flickr.getUploader().upload(photo, uploadMetaData);
            return this.flickr.getPhotosInterface().getPhoto(photoId).getMedium640Url();
        }
        catch (Throwable $ex) {
            throw $ex;
        }
    }
    
    private void connect() throws InterruptedException, ExecutionException, IOException, FlickrException {
        this.flickr = new Flickr(this.apiKey, this.apiSecret, (Transport)new REST());
        final Auth auth = new Auth();
        auth.setPermission(Permission.READ);
        auth.setToken(this.appKey);
        auth.setTokenSecret(this.appSecret);
        final RequestContext requestContext = RequestContext.getRequestContext();
        requestContext.setAuth(auth);
        this.flickr.setAuth(auth);
    }
    
    static {
        log = LoggerFactory.getLogger((Class)FlickrServiceImpl.class);
    }
}