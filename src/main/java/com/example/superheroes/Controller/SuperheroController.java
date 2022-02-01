package com.example.superheroes.Controller;

import com.example.superheroes.model.Superhero;
import com.example.superheroes.repository.SuperheroRepository;
import com.example.superheroes.service.SuperheroService;
import net.bytebuddy.implementation.bind.annotation.Super;
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

}
