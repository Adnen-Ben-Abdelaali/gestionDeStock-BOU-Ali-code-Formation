package com.bouali.gestiondestock.controller.api;

import io.swagger.annotations.*;
import org.springframework.web.multipart.*;
import java.io.*;
import com.flickr4java.flickr.*;
import org.springframework.web.bind.annotation.*;

@Api("photos")
public interface PhotoApi
{
    @PostMapping({ "gestiondestock/v1/save/{id}/{title}/{context}" })
    Object savePhoto(@PathVariable("context") final String context, @PathVariable("id") final Integer id, @RequestPart("file") final MultipartFile photo, @PathVariable("title") final String title) throws IOException, FlickrException;
}