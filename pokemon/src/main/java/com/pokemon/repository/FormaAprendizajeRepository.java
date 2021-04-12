package com.pokemon.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pokemon.model.FormaAprendizaje;

@Repository
public interface FormaAprendizajeRepository extends JpaRepository<FormaAprendizaje, Integer>{

}
