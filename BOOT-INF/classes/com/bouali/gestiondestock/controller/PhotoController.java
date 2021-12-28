package com.bouali.gestiondestock.controller;

import com.bouali.gestiondestock.controller.api.*;
import org.springframework.web.bind.annotation.*;
import com.bouali.gestiondestock.services.strategy.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.web.multipart.*;
import java.io.*;
import com.flickr4java.flickr.*;

@RestController
public class PhotoController implements PhotoApi
{
    private StrategyPhotoContext strategyPhotoContext;
    
    @Autowired
    public PhotoController(final StrategyPhotoContext strategyPhotoContext) {
        this.strategyPhotoContext = strategyPhotoContext;
    }
    
    @Override
    public Object savePhoto(final String context, final Integer id, final MultipartFile photo, final String title) throws IOException, FlickrException {
        return this.strategyPhotoContext.savePhoto(context, id, photo.getInputStream(), title);
    }
}