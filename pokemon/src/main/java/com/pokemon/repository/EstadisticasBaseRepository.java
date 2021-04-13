package com.pokemon.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pokemon.model.EstadisticasBase;

@Repository
public interface EstadisticasBaseRepository extends JpaRepository<EstadisticasBase, Integer>{

}
