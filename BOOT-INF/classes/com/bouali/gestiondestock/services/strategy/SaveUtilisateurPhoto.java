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

@Service("utilisateurStrategy")
public class SaveUtilisateurPhoto implements Strategy<UtilisateurDto>
{
    private static final Logger log;
    private FlickrService flickrService;
    private UtilisateurService utilisateurService;
    
    @Autowired
    public SaveUtilisateurPhoto(final FlickrService flickrService, final UtilisateurService utilisateurService) {
        this.flickrService = flickrService;
        this.utilisateurService = utilisateurService;
    }
    
    public UtilisateurDto savePhoto(final Integer id, final InputStream photo, final String titre) throws FlickrException {
        final UtilisateurDto utilisateur = this.utilisateurService.findById(id);
        final String urlPhoto = this.flickrService.savePhoto(photo, titre);
        if (!StringUtils.hasLength(urlPhoto)) {
            throw new InvalidOperationException("Erreur lors de l'enregistrement de photo de l'utilisateur", ErrorCodes.UPDATE_PHOTO_EXCEPTION);
        }
        utilisateur.setPhoto(urlPhoto);
        return this.utilisateurService.save(utilisateur);
    }
    
    static {
        log = LoggerFactory.getLogger((Class)SaveUtilisateurPhoto.class);
    }
}