package com.example.superheroes.repository;


import com.example.superheroes.model.Powers;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;
import org.springframework.stereotype.Repository;

@Repository
public interface PowersRepository extends JpaRepository<Powers, Long> {


}
