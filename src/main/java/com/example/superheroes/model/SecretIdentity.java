//package com.example.superheroes.model;
//
//
//import javax.persistence.*;
//
//@Entity
//@Table(name = "names")
//public class SecretIdentity {
//
//    @Id
//    @Column
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long id;
//
//    @Column
//    private String secretName;
//
//    @Column
//    private String profession;
//
//
//    public SecretIdentity() {
//    }
//
//    public SecretIdentity(Long id, String secretName, String profession) {
//        this.id = id;
//        this.secretName = secretName;
//        this.profession = profession;
//    }
//
//    @Override
//    public String toString() {
//        return "SecretIdentity{" +
//                "id=" + id +
//                ", secretName='" + secretName + '\'' +
//                ", profession='" + profession + '\'' +
//                '}';
//    }
//
//    public Long getId() {
//        return id;
//    }
//
//    public void setId(Long id) {
//        this.id = id;
//    }
//
//    public String getSecretName() {
//        return secretName;
//    }
//
//    public void setSecretName(String secretName) {
//        this.secretName = secretName;
//    }
//
//    public String getProfession() {
//        return profession;
//    }
//
//    public void setProfession(String profession) {
//        this.profession = profession;
//    }
//}
