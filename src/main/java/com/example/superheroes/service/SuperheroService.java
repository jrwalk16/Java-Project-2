package com.example.superheroes.service;
import com.example.superheroes.exceptions.InformationNotFoundException;
import com.example.superheroes.service.SuperheroService;
import com.example.superheroes.exceptions.InformationExistException;
import com.example.superheroes.model.Superhero;
import com.example.superheroes.repository.SuperheroRepository;
import net.bytebuddy.implementation.bind.annotation.Super;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;


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
        Superhero superhero = superheroRepository.findByHeroName(superheroObject.getHeroName());
        if(superhero != null){
            throw new InformationExistException("superhero with name " + superhero.getHeroName() + "already exists");
        } else {
            return superheroRepository.save(superheroObject);
        }
    }

    public Optional<Superhero> getSuperhero(Long heroId){
        Optional<Superhero> superhero = superheroRepository.findById(heroId);
        if(superhero.isPresent()){
            return superhero;
        } else {
            throw new InformationNotFoundException("category with id " + heroId + " not found");
        }
    }

    public Superhero updateSuperhero(Long heroId, Superhero superheroObject){
        Optional<Superhero> superhero = superheroRepository.findById(heroId);
        if(superhero.isPresent()){
            Superhero updateSuperhero = superheroRepository.findById(heroId).get();
            updateSuperhero.setHeroName(superheroObject.getHeroName());
            updateSuperhero.setHometown(superheroObject.getHometown());
            return superheroRepository.save(updateSuperhero);
        } else {
            throw new InformationNotFoundException("superhero with id " + heroId + " not found");
        }
    }

    public Optional<Superhero> deleteSuperhero(Long heroId){
        Optional<Superhero> superhero = superheroRepository.findById(heroId);
        if(superhero.isPresent()){
            superheroRepository.deleteById(heroId);
            return superhero;
        } else {
            throw new InformationNotFoundException("superhero with id " + heroId + " not found");
        }
    }
}
