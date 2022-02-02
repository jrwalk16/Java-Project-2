package com.example.superheroes.model;


import javax.persistence.*;

@Entity
@Table(name = "powers")
public class Powers {


    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    @Column
    private String powerName;

    @Column
    private String powerType;

    public Powers(Long id, String powerName, String powerType) {
        Id = id;
        this.powerName = powerName;
        this.powerType = powerType;
    }

    public Powers() {
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getPowerName() {
        return powerName;
    }

    public void setPowerName(String powerName) {
        this.powerName = powerName;
    }

    public String getPowerType() {
        return powerType;
    }

    public void setPowerType(String powerType) {
        this.powerType = powerType;
    }

    @Override
    public String toString() {
        return "Powers{" +
                "Id=" + Id +
                ", powerName='" + powerName + '\'' +
                ", powerType='" + powerType + '\'' +
                '}';
    }
}
