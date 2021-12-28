package com.bouali.gestiondestock.services.impl;

import com.bouali.gestiondestock.services.*;
import org.springframework.stereotype.*;
import com.bouali.gestiondestock.repository.*;
import org.springframework.beans.factory.annotation.*;
import com.bouali.gestiondestock.dto.*;
import com.bouali.gestiondestock.validator.*;
import java.util.*;
import java.util.function.*;
import java.util.stream.*;
import com.bouali.gestiondestock.exception.*;
import com.bouali.gestiondestock.model.*;
import org.slf4j.*;

@Service
public class ClientServiceImpl implements ClientService
{
    private static final Logger log;
    private ClientRepository clientRepository;
    private CommandeClientRepository commandeClientRepository;
    
    @Autowired
    public ClientServiceImpl(final ClientRepository clientRepository, final CommandeClientRepository commandeClientRepository) {
        this.clientRepository = clientRepository;
        this.commandeClientRepository = commandeClientRepository;
    }
    
    public ClientDto save(final ClientDto dto) {
        final List<String> errors = (List<String>)ClientValidator.validate(dto);
        if (!errors.isEmpty()) {
            ClientServiceImpl.log.error("Client is not valid {}", (Object)dto);
            throw new InvalidEntityException("Le client n'est pas valide", ErrorCodes.CLIENT_NOT_VALID, errors);
        }
        return ClientDto.fromEntity((Client)this.clientRepository.save((Object)ClientDto.toEntity(dto)));
    }
    
    public ClientDto findById(final Integer id) {
        if (id == null) {
            ClientServiceImpl.log.error("Client ID is null");
            return null;
        }
        return this.clientRepository.findById((Object)id).map(ClientDto::fromEntity).orElseThrow(() -> new EntityNotFoundException(invokedynamic(makeConcatWithConstants:(Ljava/lang/Integer;)Ljava/lang/String;, id), ErrorCodes.CLIENT_NOT_FOUND));
    }
    
    public List<ClientDto> findAll() {
        return (List<ClientDto>)this.clientRepository.findAll().stream().map(ClientDto::fromEntity).collect(Collectors.toList());
    }
    
    public void delete(final Integer id) {
        if (id == null) {
            ClientServiceImpl.log.error("Client ID is null");
            return;
        }
        final List<CommandeClient> commandeClients = this.commandeClientRepository.findAllByClientId(id);
        if (!commandeClients.isEmpty()) {
            throw new InvalidOperationException("Impossible de supprimer un client qui a deja des commande clients", ErrorCodes.CLIENT_ALREADY_IN_USE);
        }
        this.clientRepository.deleteById((Object)id);
    }
    
    static {
        log = LoggerFactory.getLogger((Class)ClientServiceImpl.class);
    }
}