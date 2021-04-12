package com.pokemon.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pokemon.model.TipoPiedra;

@Repository
public interface TipoPiedraRepository extends JpaRepository<TipoPiedra, Integer>{

}
