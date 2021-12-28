package com.bouali.gestiondestock.services.strategy;

import org.springframework.stereotype.*;
import org.springframework.beans.factory.*;
import org.springframework.beans.factory.annotation.*;
import java.io.*;
import com.flickr4java.flickr.*;
import com.bouali.gestiondestock.exception.*;

@Service
public class StrategyPhotoContext
{
    private BeanFactory beanFactory;
    private Strategy strategy;
    private String context;
    
    @Autowired
    public StrategyPhotoContext(final BeanFactory beanFactory) {
        this.beanFactory = beanFactory;
    }
    
    public Object savePhoto(final String context, final Integer id, final InputStream photo, final String title) throws FlickrException {
        this.determinContext(context);
        return this.strategy.savePhoto(id, photo, title);
    }
    
    private void determinContext(final String context) {
        final String beanName = invokedynamic(makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;, context);
        switch (context) {
            case "article": {
                this.strategy = (Strategy)this.beanFactory.getBean(beanName, (Class)SaveArticlePhoto.class);
                break;
            }
            case "client": {
                this.strategy = (Strategy)this.beanFactory.getBean(beanName, (Class)SaveClientPhoto.class);
                break;
            }
            case "fournisseur": {
                this.strategy = (Strategy)this.beanFactory.getBean(beanName, (Class)SaveFournisseurPhoto.class);
                break;
            }
            case "entreprise": {
                this.strategy = (Strategy)this.beanFactory.getBean(beanName, (Class)SaveEntreprisePhoto.class);
                break;
            }
            case "utilisateur": {
                this.strategy = (Strategy)this.beanFactory.getBean(beanName, (Class)SaveUtilisateurPhoto.class);
                break;
            }
            default: {
                throw new InvalidOperationException("Contexte inconnue pour l'enregistrement de la photo", ErrorCodes.UNKNOWN_CONTEXT);
            }
        }
    }
    
    public void setContext(final String context) {
        this.context = context;
    }
}