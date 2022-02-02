package com.example.superheroes.repository;


import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;
import org.springframework.stereotype.Repository;

@Repository
public interface PowersRepository extends JpaRepository<Powers, Long> {


}
