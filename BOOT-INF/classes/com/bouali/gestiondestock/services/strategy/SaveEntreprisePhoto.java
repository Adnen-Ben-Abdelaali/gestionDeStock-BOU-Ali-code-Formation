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

@Service("entrepriseStrategy")
public class SaveEntreprisePhoto implements Strategy<EntrepriseDto>
{
    private static final Logger log;
    private FlickrService flickrService;
    private EntrepriseService entrepriseService;
    
    @Autowired
    public SaveEntreprisePhoto(final FlickrService flickrService, final EntrepriseService entrepriseService) {
        this.flickrService = flickrService;
        this.entrepriseService = entrepriseService;
    }
    
    public EntrepriseDto savePhoto(final Integer id, final InputStream photo, final String titre) throws FlickrException {
        final EntrepriseDto entreprise = this.entrepriseService.findById(id);
        final String urlPhoto = this.flickrService.savePhoto(photo, titre);
        if (!StringUtils.hasLength(urlPhoto)) {
            throw new InvalidOperationException("Erreur lors de l'enregistrement de photo de l'entreprise", ErrorCodes.UPDATE_PHOTO_EXCEPTION);
        }
        entreprise.setPhoto(urlPhoto);
        return this.entrepriseService.save(entreprise);
    }
    
    static {
        log = LoggerFactory.getLogger((Class)SaveEntreprisePhoto.class);
    }
}