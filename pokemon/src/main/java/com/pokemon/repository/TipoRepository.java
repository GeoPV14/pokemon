package com.pokemon.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pokemon.model.Tipo;

@Repository
public interface TipoRepository extends JpaRepository<Tipo, String>{

}
