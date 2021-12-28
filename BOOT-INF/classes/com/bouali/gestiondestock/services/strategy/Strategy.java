package com.bouali.gestiondestock.services.strategy;

import java.io.*;
import com.flickr4java.flickr.*;

public interface Strategy<T>
{
    T savePhoto(final Integer id, final InputStream photo, final String titre) throws FlickrException;
}