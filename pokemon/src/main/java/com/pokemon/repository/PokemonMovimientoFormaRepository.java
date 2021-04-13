package com.pokemon.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pokemon.model.PokemonMovimientoForma;

@Repository
public interface PokemonMovimientoFormaRepository extends JpaRepository<PokemonMovimientoForma, Integer>{

}
