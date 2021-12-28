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

@Service("clientStrategy")
public class SaveClientPhoto implements Strategy<ClientDto>
{
    private static final Logger log;
    private FlickrService flickrService;
    private ClientService clientService;
    
    @Autowired
    public SaveClientPhoto(final FlickrService flickrService, final ClientService clientService) {
        this.flickrService = flickrService;
        this.clientService = clientService;
    }
    
    public ClientDto savePhoto(final Integer id, final InputStream photo, final String titre) throws FlickrException {
        final ClientDto client = this.clientService.findById(id);
        final String urlPhoto = this.flickrService.savePhoto(photo, titre);
        if (!StringUtils.hasLength(urlPhoto)) {
            throw new InvalidOperationException("Erreur lors de l'enregistrement de photo du client", ErrorCodes.UPDATE_PHOTO_EXCEPTION);
        }
        client.setPhoto(urlPhoto);
        return this.clientService.save(client);
    }
    
    static {
        log = LoggerFactory.getLogger((Class)SaveClientPhoto.class);
    }
}