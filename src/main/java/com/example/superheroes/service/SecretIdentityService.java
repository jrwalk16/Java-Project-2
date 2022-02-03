package com.example.superheroes.service;


import com.example.superheroes.exceptions.InformationExistException;
import com.example.superheroes.exceptions.InformationNotFoundException;
import com.example.superheroes.model.SecretIdentity;
import com.example.superheroes.model.Series;
import com.example.superheroes.model.Superhero;
import com.example.superheroes.model.SupportingCharacters;
import com.example.superheroes.repository.SecretIdentityRepository;
import com.example.superheroes.repository.SuperheroRepository;
import net.bytebuddy.implementation.bind.annotation.Super;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

@Service
public class SecretIdentityService {

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

    public SecretIdentity createSecretIdentity(Long heroId, SecretIdentity secretIdentityObject){
        Optional<Superhero> superhero = superheroRepository.findById(heroId);
       if (superhero.isEmpty()){
           throw new InformationNotFoundException("hero with id " + heroId + " does not exist");
       }
       SecretIdentity secretIdentity = secretIdentityRepository.findBySecretName(secretIdentityObject.getSecretName());
       if(secretIdentity != null) {
           throw new InformationExistException("secret identity with name " +secretIdentity.getSecretName() + " already exists");
       }
       secretIdentityObject.setSuperhero(superhero.get());
       return secretIdentityRepository.save(secretIdentityObject);
    }



    public SecretIdentity getSecretIdentity(Long heroId, Long seriesId){
        Optional<Superhero> superhero = superheroRepository.findById(heroId);
        if(superhero == null) {
            throw new InformationNotFoundException("superhero with id " + heroId + " does not exist");
        }
        Optional<SecretIdentity> secretIdentity = secretIdentityRepository.findById(seriesId);
        if(!secretIdentity.isPresent()){
            throw new InformationNotFoundException("series with id " + seriesId + " does not exist");
        }
        return secretIdentity.get();
    }




}
