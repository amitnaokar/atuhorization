package com.demo.authorization.web;

import com.demo.authorization.entity.Authorization;
import com.demo.authorization.repository.AuthorizationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
import java.util.List;
import java.util.Optional;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;
import static org.springframework.http.MediaType.APPLICATION_XML;

@RestController
public class AuthorizationController {

    @Autowired
    AuthorizationRepository repository;

    @GetMapping(value = "/authorization",
            produces = APPLICATION_JSON_VALUE,consumes = APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.OK)
    public List<Authorization> getAllAuthorizations(){
        return repository.findAll();
    }

    @GetMapping(value = "/authorization/{authorizationId}",
            produces = APPLICATION_JSON_VALUE,consumes = APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.OK)
    public Authorization getAuthorizationById(@PathVariable Integer authorizationId){
        Optional<Authorization> optionalAuthorization = repository.findById(authorizationId);
        return optionalAuthorization.orElse(null);
    }

    @PostMapping(value = "/authorization",
            produces = {APPLICATION_JSON_VALUE},consumes = APPLICATION_JSON_VALUE)
    public Integer saveAuthorization(@RequestBody Authorization authorization){
        Authorization saveAuthorization = repository.save(authorization);
        return  saveAuthorization.getId();
    }
}
