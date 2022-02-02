package com.example.superheroes.Controller;


import com.example.superheroes.service.PowersService;
import com.example.superheroes.service.SecretIdentityService;
import com.example.superheroes.service.SeriesService;
import com.example.superheroes.service.SuperheroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api")
public class PowersController {


    private SeriesService seriesService;

    @Autowired
    public void setSeriesService(SeriesService seriesService){
        this.seriesService = seriesService;
    }

    private PowersService powersService;

    @Autowired
    public void setPowersService(PowersService powersService){
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



}
