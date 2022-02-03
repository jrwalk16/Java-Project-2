package com.example.superheroes.model;


import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

@Entity
@Table(name = "characters")
public class SupportingCharacters {


    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    @Column
    private String characterName;

    @Column
    private String characterRelation;

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "superhero_id")
    private Superhero superhero;

    public SupportingCharacters() {
    }

    public SupportingCharacters(Long id, String characterName, String characterRelation) {
        Id = id;
        this.characterName = characterName;
        this.characterRelation = characterRelation;
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getCharacterName() {
        return characterName;
    }

    public void setCharacterName(String characterName) {
        this.characterName = characterName;
    }

    public String getCharacterRelation() {
        return characterRelation;
    }

    public void setCharacterRelation(String characterRelation) {
        this.characterRelation = characterRelation;
    }

    @Override
    public String toString() {
        return "SupportingCharacters{" +
                "Id=" + Id +
                ", characterName='" + characterName + '\'' +
                ", characterRelation='" + characterRelation + '\'' +
                '}';
    }

    public void setSuperhero(Superhero superhero) {
        this.superhero = superhero;
    }

    public Superhero getSuperhero() {
        return superhero;
    }
}
