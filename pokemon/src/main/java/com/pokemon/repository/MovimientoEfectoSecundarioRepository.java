package com.pokemon.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pokemon.model.MovimientoEfectoSecundario;

@Repository
public interface MovimientoEfectoSecundarioRepository extends JpaRepository<MovimientoEfectoSecundario, Integer>{
	
}
