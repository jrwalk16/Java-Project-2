package com.example.superheroes.repository;


import com.example.superheroes.model.SecretIdentity;
import com.example.superheroes.model.Superhero;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SecretIdentityRepository extends JpaRepository<SecretIdentity, Long> {


    SecretIdentity findBySecretName(String secretName);


    List<SecretIdentity> findByCategoryId(Long nameId);
}
