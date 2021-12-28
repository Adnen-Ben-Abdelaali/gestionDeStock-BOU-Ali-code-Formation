package com.bouali.gestiondestock.controller.api;

import io.swagger.annotations.*;
import org.springframework.http.*;
import com.bouali.gestiondestock.dto.auth.*;
import org.springframework.web.bind.annotation.*;

@Api("authentication")
public interface AuthenticationApi
{
    @PostMapping({ "gestiondestock/v1/auth/authenticate" })
    ResponseEntity<AuthenticationResponse> authenticate(@RequestBody final AuthenticationRequest request);
}