package com.pokemon.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pokemon.model.FormaEvolucion;

@Repository
public interface FormaEvolucionRepository extends JpaRepository<FormaEvolucion, String>{

}
