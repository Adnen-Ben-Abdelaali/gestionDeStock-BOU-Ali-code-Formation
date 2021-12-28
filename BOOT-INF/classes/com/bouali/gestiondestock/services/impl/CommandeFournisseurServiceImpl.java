package com.bouali.gestiondestock.services.impl;

import org.springframework.stereotype.*;
import com.bouali.gestiondestock.repository.*;
import com.bouali.gestiondestock.services.*;
import org.springframework.beans.factory.annotation.*;
import com.bouali.gestiondestock.exception.*;
import java.util.*;
import java.util.function.*;
import org.springframework.util.*;
import java.util.stream.*;
import java.math.*;
import com.bouali.gestiondestock.validator.*;
import com.bouali.gestiondestock.dto.*;
import java.time.*;
import com.bouali.gestiondestock.model.*;
import org.slf4j.*;

@Service
public class CommandeClientServiceImpl implements CommandeClientService
{
    private static final Logger log;
    private CommandeClientRepository commandeClientRepository;
    private LigneCommandeClientRepository ligneCommandeClientRepository;
    private ClientRepository clientRepository;
    private ArticleRepository articleRepository;
    private MvtStkService mvtStkService;
    
    @Autowired
    public CommandeClientServiceImpl(final CommandeClientRepository commandeClientRepository, final ClientRepository clientRepository, final ArticleRepository articleRepository, final LigneCommandeClientRepository ligneCommandeClientRepository, final MvtStkService mvtStkService) {
        this.commandeClientRepository = commandeClientRepository;
        this.ligneCommandeClientRepository = ligneCommandeClientRepository;
        this.clientRepository = clientRepository;
        this.articleRepository = articleRepository;
        this.mvtStkService = mvtStkService;
    }
    
    public CommandeClientDto save(final CommandeClientDto dto) {
        final List<String> errors = (List<String>)CommandeClientValidator.validate(dto);
        if (!errors.isEmpty()) {
            CommandeClientServiceImpl.log.error("Commande client n'est pas valide");
            throw new InvalidEntityException("La commande client n'est pas valide", ErrorCodes.COMMANDE_CLIENT_NOT_VALID, errors);
        }
        if (dto.getId() != null && dto.isCommandeLivree()) {
            throw new InvalidOperationException("Impossible de modifier la commande lorsqu'elle est livree", ErrorCodes.COMMANDE_CLIENT_NON_MODIFIABLE);
        }
        final Optional<Client> client = (Optional<Client>)this.clientRepository.findById((Object)dto.getClient().getId());
        if (client.isEmpty()) {
            CommandeClientServiceImpl.log.warn("Client with ID {} was not found in the DB", (Object)dto.getClient().getId());
            throw new EntityNotFoundException(invokedynamic(makeConcatWithConstants:(Ljava/lang/Integer;)Ljava/lang/String;, dto.getClient().getId()), ErrorCodes.CLIENT_NOT_FOUND);
        }
        final List<String> articleErrors = new ArrayList<String>();
        if (dto.getLigneCommandeClients() != null) {
            Optional<Article> article;
            final List<String> list;
            dto.getLigneCommandeClients().forEach(ligCmdClt -> {
                if (ligCmdClt.getArticle() != null) {
                    article = (Optional<Article>)this.articleRepository.findById((Object)ligCmdClt.getArticle().getId());
                    if (article.isEmpty()) {
                        list.add(invokedynamic(makeConcatWithConstants:(Ljava/lang/Integer;)Ljava/lang/String;, ligCmdClt.getArticle().getId()));
                    }
                }
                else {
                    list.add("Impossible d'enregister une commande avec un aticle NULL");
                }
                return;
            });
        }
        if (!articleErrors.isEmpty()) {
            CommandeClientServiceImpl.log.warn("");
            throw new InvalidEntityException("Article n'existe pas dans la BDD", ErrorCodes.ARTICLE_NOT_FOUND, articleErrors);
        }
        final CommandeClient savedCmdClt = (CommandeClient)this.commandeClientRepository.save((Object)CommandeClientDto.toEntity(dto));
        if (dto.getLigneCommandeClients() != null) {
            final LigneCommandeClient ligneCommandeClient;
            final CommandeClient commandeClient;
            dto.getLigneCommandeClients().forEach(ligCmdClt -> {
                ligneCommandeClient = LigneCommandeClientDto.toEntity(ligCmdClt);
                ligneCommandeClient.setCommandeClient(commandeClient);
                this.ligneCommandeClientRepository.save((Object)ligneCommandeClient);
                return;
            });
        }
        return CommandeClientDto.fromEntity(savedCmdClt);
    }
    
    public CommandeClientDto findById(final Integer id) {
        if (id == null) {
            CommandeClientServiceImpl.log.error("Commande client ID is NULL");
            return null;
        }
        return this.commandeClientRepository.findById((Object)id).map(CommandeClientDto::fromEntity).orElseThrow(() -> new EntityNotFoundException(invokedynamic(makeConcatWithConstants:(Ljava/lang/Integer;)Ljava/lang/String;, id), ErrorCodes.COMMANDE_CLIENT_NOT_FOUND));
    }
    
    public CommandeClientDto findByCode(final String code) {
        if (!StringUtils.hasLength(code)) {
            CommandeClientServiceImpl.log.error("Commande client CODE is NULL");
            return null;
        }
        return this.commandeClientRepository.findCommandeClientByCode(code).map((Function<? super CommandeClient, ? extends CommandeClientDto>)CommandeClientDto::fromEntity).orElseThrow(() -> new EntityNotFoundException(invokedynamic(makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;, code), ErrorCodes.COMMANDE_CLIENT_NOT_FOUND));
    }
    
    public List<CommandeClientDto> findAll() {
        return (List<CommandeClientDto>)this.commandeClientRepository.findAll().stream().map(CommandeClientDto::fromEntity).collect(Collectors.toList());
    }
    
    public void delete(final Integer id) {
        if (id == null) {
            CommandeClientServiceImpl.log.error("Commande client ID is NULL");
            return;
        }
        final List<LigneCommandeClient> ligneCommandeClients = this.ligneCommandeClientRepository.findAllByCommandeClientId(id);
        if (!ligneCommandeClients.isEmpty()) {
            throw new InvalidOperationException("Impossible de supprimer une commande client deja utilisee", ErrorCodes.COMMANDE_CLIENT_ALREADY_IN_USE);
        }
        this.commandeClientRepository.deleteById((Object)id);
    }
    
    public List<LigneCommandeClientDto> findAllLignesCommandesClientByCommandeClientId(final Integer idCommande) {
        return this.ligneCommandeClientRepository.findAllByCommandeClientId(idCommande).stream().map((Function<? super Object, ?>)LigneCommandeClientDto::fromEntity).collect((Collector<? super Object, ?, List<LigneCommandeClientDto>>)Collectors.toList());
    }
    
    public CommandeClientDto updateEtatCommande(final Integer idCommande, final EtatCommande etatCommande) {
        this.checkIdCommande(idCommande);
        if (!StringUtils.hasLength(String.valueOf(etatCommande))) {
            CommandeClientServiceImpl.log.error("L'etat de la commande client is NULL");
            throw new InvalidOperationException("Impossible de modifier l'etat de la commande avec un etat null", ErrorCodes.COMMANDE_CLIENT_NON_MODIFIABLE);
        }
        final CommandeClientDto commandeClient = this.checkEtatCommande(idCommande);
        commandeClient.setEtatCommande(etatCommande);
        final CommandeClient savedCmdClt = (CommandeClient)this.commandeClientRepository.save((Object)CommandeClientDto.toEntity(commandeClient));
        if (commandeClient.isCommandeLivree()) {
            this.updateMvtStk(idCommande);
        }
        return CommandeClientDto.fromEntity(savedCmdClt);
    }
    
    public CommandeClientDto updateQuantiteCommande(final Integer idCommande, final Integer idLigneCommande, final BigDecimal quantite) {
        this.checkIdCommande(idCommande);
        this.checkIdLigneCommande(idLigneCommande);
        if (quantite == null || quantite.compareTo(BigDecimal.ZERO) == 0) {
            CommandeClientServiceImpl.log.error("L'ID de la ligne commande is NULL");
            throw new InvalidOperationException("Impossible de modifier l'etat de la commande avec une quantite null ou ZERO", ErrorCodes.COMMANDE_CLIENT_NON_MODIFIABLE);
        }
        final CommandeClientDto commandeClient = this.checkEtatCommande(idCommande);
        final Optional<LigneCommandeClient> ligneCommandeClientOptional = this.findLigneCommandeClient(idLigneCommande);
        final LigneCommandeClient ligneCommandeClient = ligneCommandeClientOptional.get();
        ligneCommandeClient.setQuantite(quantite);
        this.ligneCommandeClientRepository.save((Object)ligneCommandeClient);
        return commandeClient;
    }
    
    public CommandeClientDto updateClient(final Integer idCommande, final Integer idClient) {
        this.checkIdCommande(idCommande);
        if (idClient == null) {
            CommandeClientServiceImpl.log.error("L'ID du client is NULL");
            throw new InvalidOperationException("Impossible de modifier l'etat de la commande avec un ID client null", ErrorCodes.COMMANDE_CLIENT_NON_MODIFIABLE);
        }
        final CommandeClientDto commandeClient = this.checkEtatCommande(idCommande);
        final Optional<Client> clientOptional = (Optional<Client>)this.clientRepository.findById((Object)idClient);
        if (clientOptional.isEmpty()) {
            throw new EntityNotFoundException(invokedynamic(makeConcatWithConstants:(Ljava/lang/Integer;)Ljava/lang/String;, idClient), ErrorCodes.CLIENT_NOT_FOUND);
        }
        commandeClient.setClient(ClientDto.fromEntity(clientOptional.get()));
        return CommandeClientDto.fromEntity((CommandeClient)this.commandeClientRepository.save((Object)CommandeClientDto.toEntity(commandeClient)));
    }
    
    public CommandeClientDto updateArticle(final Integer idCommande, final Integer idLigneCommande, final Integer idArticle) {
        this.checkIdCommande(idCommande);
        this.checkIdLigneCommande(idLigneCommande);
        this.checkIdArticle(idArticle, "nouvel");
        final CommandeClientDto commandeClient = this.checkEtatCommande(idCommande);
        final Optional<LigneCommandeClient> ligneCommandeClient = this.findLigneCommandeClient(idLigneCommande);
        final Optional<Article> articleOptional = (Optional<Article>)this.articleRepository.findById((Object)idArticle);
        if (articleOptional.isEmpty()) {
            throw new EntityNotFoundException(invokedynamic(makeConcatWithConstants:(Ljava/lang/Integer;)Ljava/lang/String;, idArticle), ErrorCodes.ARTICLE_NOT_FOUND);
        }
        final List<String> errors = (List<String>)ArticleValidator.validate(ArticleDto.fromEntity(articleOptional.get()));
        if (!errors.isEmpty()) {
            throw new InvalidEntityException("Article invalid", ErrorCodes.ARTICLE_NOT_VALID, errors);
        }
        final LigneCommandeClient ligneCommandeClientToSaved = ligneCommandeClient.get();
        ligneCommandeClientToSaved.setArticle(articleOptional.get());
        this.ligneCommandeClientRepository.save((Object)ligneCommandeClientToSaved);
        return commandeClient;
    }
    
    public CommandeClientDto deleteArticle(final Integer idCommande, final Integer idLigneCommande) {
        this.checkIdCommande(idCommande);
        this.checkIdLigneCommande(idLigneCommande);
        final CommandeClientDto commandeClient = this.checkEtatCommande(idCommande);
        this.findLigneCommandeClient(idLigneCommande);
        this.ligneCommandeClientRepository.deleteById((Object)idLigneCommande);
        return commandeClient;
    }
    
    private CommandeClientDto checkEtatCommande(final Integer idCommande) {
        final CommandeClientDto commandeClient = this.findById(idCommande);
        if (commandeClient.isCommandeLivree()) {
            throw new InvalidOperationException("Impossible de modifier la commande lorsqu'elle est livree", ErrorCodes.COMMANDE_CLIENT_NON_MODIFIABLE);
        }
        return commandeClient;
    }
    
    private Optional<LigneCommandeClient> findLigneCommandeClient(final Integer idLigneCommande) {
        final Optional<LigneCommandeClient> ligneCommandeClientOptional = (Optional<LigneCommandeClient>)this.ligneCommandeClientRepository.findById((Object)idLigneCommande);
        if (ligneCommandeClientOptional.isEmpty()) {
            throw new EntityNotFoundException(invokedynamic(makeConcatWithConstants:(Ljava/lang/Integer;)Ljava/lang/String;, idLigneCommande), ErrorCodes.COMMANDE_CLIENT_NOT_FOUND);
        }
        return ligneCommandeClientOptional;
    }
    
    private void checkIdCommande(final Integer idCommande) {
        if (idCommande == null) {
            CommandeClientServiceImpl.log.error("Commande client ID is NULL");
            throw new InvalidOperationException("Impossible de modifier l'etat de la commande avec un ID null", ErrorCodes.COMMANDE_CLIENT_NON_MODIFIABLE);
        }
    }
    
    private void checkIdLigneCommande(final Integer idLigneCommande) {
        if (idLigneCommande == null) {
            CommandeClientServiceImpl.log.error("L'ID de la ligne commande is NULL");
            throw new InvalidOperationException("Impossible de modifier l'etat de la commande avec une ligne de commande null", ErrorCodes.COMMANDE_CLIENT_NON_MODIFIABLE);
        }
    }
    
    private void checkIdArticle(final Integer idArticle, final String msg) {
        if (idArticle == null) {
            CommandeClientServiceImpl.log.error(invokedynamic(makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;, msg));
            throw new InvalidOperationException(invokedynamic(makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;, msg), ErrorCodes.COMMANDE_CLIENT_NON_MODIFIABLE);
        }
    }
    
    private void updateMvtStk(final Integer idCommande) {
        final List<LigneCommandeClient> ligneCommandeClients = this.ligneCommandeClientRepository.findAllByCommandeClientId(idCommande);
        final MvtStkDto mvtStkDto;
        ligneCommandeClients.forEach(lig -> {
            mvtStkDto = MvtStkDto.builder().article(ArticleDto.fromEntity(lig.getArticle())).dateMvt(Instant.now()).typeMvt(TypeMvtStk.SORTIE).sourceMvt(SourceMvtStk.COMMANDE_CLIENT).quantite(lig.getQuantite()).idEntreprise(lig.getIdEntreprise()).build();
            this.mvtStkService.sortieStock(mvtStkDto);
        });
    }
    
    static {
        log = LoggerFactory.getLogger((Class)CommandeClientServiceImpl.class);
    }
}