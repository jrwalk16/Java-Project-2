package com.example.superheroes.service;

import com.example.superheroes.exceptions.InformationExistException;
import com.example.superheroes.model.Superhero;
import com.example.superheroes.repository.SuperheroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class SuperheroService {

    private SuperheroRepository superheroRepository;

    @Autowired
    public void setSuperheroRepository(SuperheroRepository superheroRepository){
        this.superheroRepository = superheroRepository;
    }

    public List<Superhero> getAllSuperheroes(){
        return superheroRepository.findAll();
    }

    public Superhero createSuperhero(Superhero superheroObject){
        Superhero superhero = superheroRepository.findByName(superheroObject.getHeroName());
        if(superhero != null){
            throw new InformationExistException("superhero with name " + superhero.getHeroName() + "already exists");
        } else {
            return superheroRepository.save(superheroObject);
        }
    }
}
