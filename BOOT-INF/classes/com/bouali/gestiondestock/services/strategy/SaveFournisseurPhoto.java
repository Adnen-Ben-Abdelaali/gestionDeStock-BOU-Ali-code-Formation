package com.bouali.gestiondestock.services.strategy;

import com.bouali.gestiondestock.dto.*;
import org.springframework.stereotype.*;
import com.bouali.gestiondestock.services.*;
import org.springframework.beans.factory.annotation.*;
import java.io.*;
import org.springframework.util.*;
import com.bouali.gestiondestock.exception.*;
import com.flickr4java.flickr.*;
import org.slf4j.*;

@Service("fournisseurStrategy")
public class SaveFournisseurPhoto implements Strategy<FournisseurDto>
{
    private static final Logger log;
    private FlickrService flickrService;
    private FournisseurService fournisseurService;
    
    @Autowired
    public SaveFournisseurPhoto(final FlickrService flickrService, final FournisseurService fournisseurService) {
        this.flickrService = flickrService;
        this.fournisseurService = fournisseurService;
    }
    
    public FournisseurDto savePhoto(final Integer id, final InputStream photo, final String titre) throws FlickrException {
        final FournisseurDto fournisseur = this.fournisseurService.findById(id);
        final String urlPhoto = this.flickrService.savePhoto(photo, titre);
        if (!StringUtils.hasLength(urlPhoto)) {
            throw new InvalidOperationException("Erreur lors de l'enregistrement de photo du fournisseur", ErrorCodes.UPDATE_PHOTO_EXCEPTION);
        }
        fournisseur.setPhoto(urlPhoto);
        return this.fournisseurService.save(fournisseur);
    }
    
    static {
        log = LoggerFactory.getLogger((Class)SaveFournisseurPhoto.class);
    }
}