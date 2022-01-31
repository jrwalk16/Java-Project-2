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
    private String heroName;

    @Column
    private String hometown;

    public Superhero() {
    }

    public Superhero(Long id, String heroName, String hometown) {
        this.id = id;
        this.heroName = heroName;
        this.hometown = hometown;
    }

    public Long getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Superhero{" +
                "id=" + id +
                ", heroName='" + heroName + '\'' +
                ", hometown='" + hometown + '\'' +
                '}';
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getHeroName() {
        return heroName;
    }

    public void setHeroName(String heroName) {
        this.heroName = heroName;
    }

    public String getHometown() {
        return hometown;
    }

    public void setHometown(String hometown) {
        this.hometown = hometown;
    }
}
