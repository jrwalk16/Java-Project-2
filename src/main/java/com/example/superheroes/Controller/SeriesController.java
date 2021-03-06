package com.example.superheroes.Controller;

import com.example.superheroes.model.Series;
import com.example.superheroes.service.SupportingCharactersService;
import com.example.superheroes.service.SecretIdentityService;
import com.example.superheroes.service.SeriesService;
import com.example.superheroes.service.SuperheroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping(path = "/api")
public class SeriesController {

    private SeriesService seriesService;

    @Autowired
    public void setSeriesService(SeriesService seriesService) {
        this.seriesService = seriesService;
    }

    private SupportingCharactersService powersService;

    @Autowired
    public void setPowersService(SupportingCharactersService powersService) {
        this.powersService = powersService;
    }

    private SecretIdentityService secretIdentityService;

    @Autowired
    public void setSecretIdentityService(SecretIdentityService secretIdentityService) {
        this.secretIdentityService = secretIdentityService;
    }

    private SuperheroService superheroService;

    @Autowired
    public void setSuperheroService(SuperheroService superheroService) {
        this.superheroService = superheroService;
    }

    @PostMapping("/superheroes/{heroId}/series/")
    public Series createSeries(@PathVariable(value = "heroId") Long heroId, @RequestBody Series seriesObject) {
        return seriesService.createSeries(heroId, seriesObject);
    }

    @GetMapping("/superheroes/{heroId}/series/")
    public List<Series> getAllSeries(@PathVariable(value = "heroId")Long heroId){
        return seriesService.getAllSeries(heroId);
    }

    @GetMapping("/superheroes/{heroId}/series/{seriesId}")
    public Series getSeries(@PathVariable(value = "heroId") Long heroId, @PathVariable(value = "seriesId") Long seriesId){
        return seriesService.getSeries(heroId, seriesId);
    }
}
