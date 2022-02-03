package com.example.superheroes.repository;


import com.example.superheroes.model.SupportingCharacters;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SupportingCharactersRepository extends JpaRepository<SupportingCharacters, Long> {


    SupportingCharacters findByCharacterName(String characterName);
}
