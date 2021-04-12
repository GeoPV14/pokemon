package com.pokemon.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pokemon.model.NivelAprendizaje;

@Repository
public interface NivelAprendizajeRepository extends JpaRepository<NivelAprendizaje, Integer>{

}
