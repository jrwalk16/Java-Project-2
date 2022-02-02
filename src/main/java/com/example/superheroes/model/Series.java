package com.example.superheroes.model;


import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

@Entity
@Table(name = "series")
public class Series {


    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String seriesName;

    @Column
    private Integer numberOfIssues;


    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "superhero_id")
    private Superhero superhero;

    public Series() {
    }

    public Series(Long id, String seriesName, Integer numberOfIssues) {
        this.id = id;
        this.seriesName = seriesName;
        this.numberOfIssues = numberOfIssues;
    }

    @Override
    public String toString() {
        return "Series{" +
                "id=" + id +
                ", seriesName='" + seriesName + '\'' +
                ", numberOfIssues=" + numberOfIssues +
                '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSeriesName() {
        return seriesName;
    }

    public void setSeriesName(String seriesName) {
        this.seriesName = seriesName;
    }

    public Integer getNumberOfIssues() {
        return numberOfIssues;
    }

    public void setNumberOfIssues(Integer numberOfIssues) {
        this.numberOfIssues = numberOfIssues;
    }

    public Superhero getSuperhero() {
        return superhero;
    }

    public void setSuperhero(Superhero superhero) {
        this.superhero = superhero;
    }
}
