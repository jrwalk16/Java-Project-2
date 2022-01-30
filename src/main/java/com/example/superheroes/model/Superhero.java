package com.example.superheroes.model;

import javax.persistence.*;

@Entity
@Table(name = "superheroes")
public class Superhero {


    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String hero_name;

    @Column
    private String supporting_character;

    public Superhero(Long id, String hero_name, String supporting_character) {
        this.id = id;
        this.hero_name = hero_name;
        this.supporting_character = supporting_character;
    }

    public Superhero() {
    }

    @Override
    public String toString() {
        return "Superhero{" +
                "id=" + id +
                ", hero_name='" + hero_name + '\'' +
                ", supporting_character='" + supporting_character + '\'' +
                '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getHero_name() {
        return hero_name;
    }

    public void setHero_name(String hero_name) {
        this.hero_name = hero_name;
    }

    public String getSupporting_character() {
        return supporting_character;
    }

    public void setSupporting_character(String supporting_character) {
        this.supporting_character = supporting_character;
    }
}
