package com.example.superheroes.service;


import com.example.superheroes.exceptions.InformationExistException;
import com.example.superheroes.exceptions.InformationNotFoundException;
import com.example.superheroes.model.SecretIdentity;
import com.example.superheroes.model.Series;
import com.example.superheroes.model.Superhero;
import com.example.superheroes.repository.SecretIdentityRepository;
import com.example.superheroes.repository.SeriesRepository;
import com.example.superheroes.repository.SuperheroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class SeriesService {



    private SeriesRepository seriesRepository;

    @Autowired
    public void setSeriesRepository(SeriesRepository seriesRepository){
        this.seriesRepository = seriesRepository;
    }

    private SuperheroRepository superheroRepository;

    @Autowired
    public void setSuperheroRepository(SuperheroRepository superheroRepository){
        this.superheroRepository = superheroRepository;
    }

    private SecretIdentityRepository secretIdentityRepository;

    @Autowired
    public void setSecretIdentityRepository(SecretIdentityRepository secretIdentityRepository){
        this.secretIdentityRepository = secretIdentityRepository;
    }

    public Series createSeries(Long heroId, Series seriesObject){

        Optional<Superhero> superhero = superheroRepository.findById(heroId);
        if(superhero.isEmpty()){
            throw new InformationNotFoundException("hero with id " + heroId + " does not exist");
        }
        Series series = seriesRepository.findBySeriesName(seriesObject.getSeriesName());
        if(series != null){
            throw new InformationExistException("series with name " + series.getSeriesName() + " already exists");
        }
        seriesObject.setSuperhero(superhero.get());
        return seriesRepository.save(seriesObject);
    }



}
