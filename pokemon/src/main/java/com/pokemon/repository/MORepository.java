package com.pokemon.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pokemon.model.MO;

@Repository
public interface MORepository extends JpaRepository<MO, String>{

}
