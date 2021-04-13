package com.pokemon.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "EVOLUCIONA_DE")
public class EvolucionaDe {
	
	@Id
	@Column(name = "POKEMON_EVOLUCIONADO")
	private int pokemonEvolucionado;
	
	@Column(name = "POKEMON_ORIGEN")
	private int pokemonOrigen;

	public EvolucionaDe() {
		super();
	}

	public EvolucionaDe(int pokemonEvolucionado) {
		super();
		this.pokemonEvolucionado = pokemonEvolucionado;
	}

	public int getPokemonEvolucionado() {
		return pokemonEvolucionado;
	}

	public void setPokemonEvolucionado(int pokemonEvolucionado) {
		this.pokemonEvolucionado = pokemonEvolucionado;
	}

	public int getPokemonOrigen() {
		return pokemonOrigen;
	}

	public void setPokemonOrigen(int pokemonOrigen) {
		this.pokemonOrigen = pokemonOrigen;
	}
	
}
