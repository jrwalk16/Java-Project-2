package com.example.superheroes.service;


import com.example.superheroes.exceptions.InformationExistException;
import com.example.superheroes.exceptions.InformationNotFoundException;
import com.example.superheroes.model.Series;
import com.example.superheroes.model.Superhero;
import com.example.superheroes.model.SupportingCharacters;
import com.example.superheroes.repository.SupportingCharactersRepository;
import com.example.superheroes.repository.SecretIdentityRepository;
import com.example.superheroes.repository.SeriesRepository;
import com.example.superheroes.repository.SuperheroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SupportingCharactersService {

    private SupportingCharactersRepository supportingCharactersRepository;

    @Autowired
    public void setSupportingCharactersRepository(SupportingCharactersRepository supportingCharactersRepository){
        this.supportingCharactersRepository = supportingCharactersRepository;
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

    public SupportingCharacters createSupportingCharacter(Long heroId, SupportingCharacters supportingCharactersObject) {
        Optional<Superhero> superhero = superheroRepository.findById(heroId);
        if(superhero.isEmpty()){
            throw new InformationNotFoundException("hero with id " + heroId + " does not exist");
        }
        SupportingCharacters supportingCharacters = supportingCharactersRepository.findByCharacterName(supportingCharactersObject.getCharacterName());
        if(supportingCharacters != null){
            throw new InformationExistException("series with name " + supportingCharacters.getCharacterName() + " already exists");
        }
        supportingCharactersObject.setSuperhero(superhero.get());
        return supportingCharactersRepository.save(supportingCharactersObject);
    }

    public List<SupportingCharacters> getSupportingCharacters(Long heroId) {
        Optional<Superhero> superhero = superheroRepository.findById(heroId);
        if (superhero.isPresent()) {
            return superhero.get().getSupportingCharactersList();
        } else {
            throw new InformationNotFoundException("hero with id " + heroId + " does not exist");
        }
    }

    public SupportingCharacters getSupportingCharacter(Long heroId, Long characterId){
        Optional<Superhero> superhero = superheroRepository.findById(heroId);
        if(superhero == null) {
            throw new InformationNotFoundException("superhero with id " + heroId + " does not exist");
        }
        Optional<SupportingCharacters> supportingCharacters = supportingCharactersRepository.findById(characterId);
        if(!supportingCharacters.isPresent()){
            throw new InformationNotFoundException("character with id " + characterId + " does not exist");
        }
        return supportingCharacters.get();
    }
}
