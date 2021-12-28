package com.bouali.gestiondestock.controller;

import com.bouali.gestiondestock.controller.api.*;
import org.springframework.web.bind.annotation.*;
import com.bouali.gestiondestock.services.*;
import org.springframework.beans.factory.annotation.*;
import com.bouali.gestiondestock.dto.*;
import java.util.*;

@RestController
public class ClientController implements ClientApi
{
    private ClientService clientService;
    
    @Autowired
    public ClientController(final ClientService clientService) {
        this.clientService = clientService;
    }
    
    @Override
    public ClientDto save(final ClientDto dto) {
        return this.clientService.save(dto);
    }
    
    @Override
    public ClientDto findById(final Integer id) {
        return this.clientService.findById(id);
    }
    
    @Override
    public List<ClientDto> findAll() {
        return (List<ClientDto>)this.clientService.findAll();
    }
    
    @Override
    public void delete(final Integer id) {
        this.clientService.delete(id);
    }
}