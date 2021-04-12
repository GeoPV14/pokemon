package com.pokemon.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pokemon.model.TipoFormaAprendizaje;

@Repository
public interface TipoFormaAprendizajeRepository extends JpaRepository<TipoFormaAprendizaje, Integer>{

}
