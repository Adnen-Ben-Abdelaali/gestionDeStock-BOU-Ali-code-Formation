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

@Service("articleStrategy")
public class SaveArticlePhoto implements Strategy<ArticleDto>
{
    private static final Logger log;
    private FlickrService flickrService;
    private ArticleService articleService;
    
    @Autowired
    public SaveArticlePhoto(final FlickrService flickrService, final ArticleService articleService) {
        this.flickrService = flickrService;
        this.articleService = articleService;
    }
    
    public ArticleDto savePhoto(final Integer id, final InputStream photo, final String titre) throws FlickrException {
        final ArticleDto article = this.articleService.findById(id);
        final String urlPhoto = this.flickrService.savePhoto(photo, titre);
        if (!StringUtils.hasLength(urlPhoto)) {
            throw new InvalidOperationException("Erreur lors de l'enregistrement de photo de l'article", ErrorCodes.UPDATE_PHOTO_EXCEPTION);
        }
        article.setPhoto(urlPhoto);
        return this.articleService.save(article);
    }
    
    static {
        log = LoggerFactory.getLogger((Class)SaveArticlePhoto.class);
    }
}