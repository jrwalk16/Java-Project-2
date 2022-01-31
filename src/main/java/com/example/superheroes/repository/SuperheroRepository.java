package com.example.superheroes.repository;


import com.example.superheroes.model.Superhero;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.superheroes.service.SuperheroService;


import java.util.List;

@Repository
public interface SuperheroRepository extends JpaRepository<Superhero, Long> {



    Superhero findByHeroName(String heroName);


}
