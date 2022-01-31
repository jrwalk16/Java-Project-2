package com.example.superheroes.Controller;

import com.example.superheroes.model.Superhero;
import com.example.superheroes.repository.SuperheroRepository;
import com.example.superheroes.service.SuperheroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/api")
public class SuperheroController {

    private SuperheroService superheroService;

    @Autowired
    public void setSuperheroService(SuperheroService superheroService){
        this.superheroService = superheroService;
    }

    @GetMapping("/superheroes/")
    public List<Superhero> getAllSuperheroes(){
        return superheroService.getAllSuperheroes();
    }

    @PostMapping("/superheroes/")
    public Superhero createSuperhero(@RequestBody Superhero superheroObject){
        return superheroService.createSuperhero(superheroObject);
    }

}
