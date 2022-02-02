package com.example.superheroes.Controller;

import com.example.superheroes.model.Superhero;
import com.example.superheroes.repository.SuperheroRepository;
import com.example.superheroes.service.SuperheroService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "/api")
public class SuperheroController {

    private SuperheroService superheroService;

    @Autowired
    public void setSuperheroService(SuperheroService superheroService){
        this.superheroService = superheroService;
    }

    @GetMapping("/superheroes")
    public List<Superhero> getAllSuperheroes(){
        return superheroService.getAllSuperheroes();
    }

    @PostMapping("/superheroes")
    public Superhero createSuperhero(@RequestBody Superhero superheroObject){
        return superheroService.createSuperhero(superheroObject);
    }

    @GetMapping("/superheroes/{heroId}/")
    public Optional<Superhero> getSuperhero(@PathVariable(value = "heroId") Long heroId){
        return superheroService.getSuperhero(heroId);
    }

    @PutMapping("/superheroes/{heroId}/")
    public Superhero updateSuperhero(@PathVariable(value = "heroId") Long heroId, @RequestBody Superhero superheroObject){
        return superheroService.updateSuperhero(heroId, superheroObject);
    }

    @DeleteMapping("/superheroes/{heroId}/")
    public Optional<Superhero> deleteSuperhero(@PathVariable(value = "heroId") Long heroId){
        return superheroService.deleteSuperhero(heroId);
    }

}
