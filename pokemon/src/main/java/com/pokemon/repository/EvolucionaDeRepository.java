package com.pokemon.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pokemon.model.EvolucionaDe;

@Repository
public interface EvolucionaDeRepository extends JpaRepository<EvolucionaDe, Integer>{
	
}
