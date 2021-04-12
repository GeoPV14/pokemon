package com.pokemon.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pokemon.model.NivelEvolucion;

@Repository
public interface NivelEvolucionRepository extends JpaRepository<NivelEvolucion, String>{

}
