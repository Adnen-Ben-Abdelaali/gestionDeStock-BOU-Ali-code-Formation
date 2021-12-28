package com.bouali.gestiondestock.services;

import java.io.*;

public interface FlickrService
{
    String savePhoto(final InputStream photo, final String title);
}