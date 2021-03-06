package com.example.superheroes.Controller;


import com.example.superheroes.model.SecretIdentity;
import com.example.superheroes.service.SupportingCharactersService;
import com.example.superheroes.service.SecretIdentityService;
import com.example.superheroes.service.SeriesService;
import com.example.superheroes.service.SuperheroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/api")
public class SecretIdentityController {

    private SeriesService seriesService;

    @Autowired
    public void setSeriesService(SeriesService seriesService){
        this.seriesService = seriesService;
    }


    private SupportingCharactersService powersService;

    @Autowired
    public void setPowersService(SupportingCharactersService powersService){
        this.powersService = powersService;
    }

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

    @GetMapping("/superheroes/{heroId}/secretidentity/{nameId}")
    public SecretIdentity getSecretIdentity(@PathVariable(value = "heroId") Long heroId, @PathVariable(value = "nameId") Long nameId){
        return secretIdentityService.getSecretIdentity(heroId, nameId);
    }



}
