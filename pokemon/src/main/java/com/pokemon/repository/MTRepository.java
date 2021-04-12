package com.pokemon.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pokemon.model.MT;

@Repository
public interface MTRepository extends JpaRepository<MT, String>{

}
