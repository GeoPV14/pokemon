package com.pokemon.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pokemon.model.Piedra;

@Repository
public interface PiedraRepository extends JpaRepository<Piedra, Integer>{

}
