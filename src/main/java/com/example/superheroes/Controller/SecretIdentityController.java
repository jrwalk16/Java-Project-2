package com.example.superheroes.Controller;


import com.example.superheroes.model.SecretIdentity;
import com.example.superheroes.service.SecretIdentityService;
import com.example.superheroes.service.SuperheroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/api")
public class SecretIdentityController {

    private SecretIdentityService secretIdentityService;

    @Autowired
    public void setSecretIdentityService(SecretIdentityService secretIdentityService){
        this.secretIdentityService = secretIdentityService;
    }

    private SuperheroService superheroService;

    @Autowired
    public void setSuperheroService(SuperheroService superheroService){
        this.superheroService = superheroService;
    }

    @PostMapping("/superheroes/{heroId}/secretidentity/")
    public SecretIdentity createSecretIdentity(@PathVariable(value = "heroId") Long heroId, @RequestBody SecretIdentity secretIdentityObject){
        return secretIdentityService.createSecretIdentity(heroId, secretIdentityObject);
    }
}
