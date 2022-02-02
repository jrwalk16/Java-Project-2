package com.example.superheroes.service;


import com.example.superheroes.repository.PowersRepository;
import com.example.superheroes.repository.SecretIdentityRepository;
import com.example.superheroes.repository.SeriesRepository;
import com.example.superheroes.repository.SuperheroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PowersService {

    private PowersRepository powersRepository;

    @Autowired
    public void setPowersRepository(PowersRepository powersRepository){
        this.powersRepository = powersRepository;
    }

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

}
