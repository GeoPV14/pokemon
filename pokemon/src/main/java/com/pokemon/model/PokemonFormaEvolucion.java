package com.pokemon.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "POKEMON_FORMA_EVOLUCION")
public class PokemonFormaEvolucion {
	
	@Id
	@Column(name = "NUMERO_POKEDEX")
	private int numeroPokedex;
	
	@Column(name = "ID_FORMA_EVOLUCION")
	private int idFormaEvolucion;

	public PokemonFormaEvolucion() {
		super();
	}

	public PokemonFormaEvolucion(int numeroPokedex) {
		super();
		this.numeroPokedex = numeroPokedex;
	}

	public int getNumeroPokedex() {
		return numeroPokedex;
	}

	public void setNumeroPokedex(int numeroPokedex) {
		this.numeroPokedex = numeroPokedex;
	}

	public int getIdFormaEvolucion() {
		return idFormaEvolucion;
	}

	public void setIdFormaEvolucion(int idFormaEvolucion) {
		this.idFormaEvolucion = idFormaEvolucion;
	}
	
}
