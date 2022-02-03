package com.example.superheroes.Controller;


import com.example.superheroes.model.Series;
import com.example.superheroes.model.SupportingCharacters;
import com.example.superheroes.service.SupportingCharactersService;
import com.example.superheroes.service.SecretIdentityService;
import com.example.superheroes.service.SeriesService;
import com.example.superheroes.service.SuperheroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/api")
public class SupportingCharactersController {


    private SeriesService seriesService;

    @Autowired
    public void setSeriesService(SeriesService seriesService){
        this.seriesService = seriesService;
    }

    private SupportingCharactersService supportingCharactersService;

    @Autowired
    public void setSupportingCharactersService(SupportingCharactersService supportingCharactersService){
        this.supportingCharactersService = supportingCharactersService;
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

    @PostMapping("/superheroes/{heroId}/characters/")
    public SupportingCharacters createSupportingCharacter(@PathVariable(value = "heroId") Long heroId, @RequestBody SupportingCharacters supportingCharactersObject) {
        return supportingCharactersService.createSupportingCharacter(heroId, supportingCharactersObject);
    }

    @GetMapping("/superheroes/{heroId}/characters/")
    public List<SupportingCharacters> getSupportingCharacters(@PathVariable(value = "heroId")Long heroId){
        return supportingCharactersService.getSupportingCharacters(heroId);
    }

}
