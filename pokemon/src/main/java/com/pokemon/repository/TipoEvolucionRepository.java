package com.pokemon.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pokemon.model.TipoEvolucion;

@Repository
public interface TipoEvolucionRepository extends JpaRepository<TipoEvolucion, Integer>{

}
