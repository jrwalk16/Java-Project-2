package com.example.superheroes.model;

import javax.persistence.*;
import com.example.superheroes.service.SuperheroService;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

import java.util.List;

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


    public SecretIdentity getSecretIdentity() {
        return secretIdentity;
    }

    public void setSecretIdentity(SecretIdentity secretIdentity) {
        this.secretIdentity = secretIdentity;
    }
//(mappedBy = "superhero", orphanRemoval = true)
    @OneToMany(mappedBy = "superhero", orphanRemoval = true)
    @LazyCollection(LazyCollectionOption.FALSE)
    private List<Series> seriesList;

    public List<Series> getSeriesList(){
        return seriesList;
    }

    public void setSeriesList(List<Series> seriesList){
        this.seriesList = seriesList;
    }

    @OneToMany(mappedBy = "superhero", orphanRemoval = true)
    @LazyCollection(LazyCollectionOption.FALSE)
    private List<SupportingCharacters> supportingCharactersList;

    public List<SupportingCharacters> getSupportingCharactersList() {
        return supportingCharactersList;
    }

    public void setSupportingCharactersList(List<SupportingCharacters> supportingCharactersList){
        this.supportingCharactersList = supportingCharactersList;
    }

    @OneToOne(cascade = CascadeType.ALL)
    @LazyCollection(LazyCollectionOption.FALSE)
    private SecretIdentity secretIdentity;

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
