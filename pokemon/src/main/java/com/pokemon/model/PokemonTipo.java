package com.pokemon.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "pokemon_tipo")
public class PokemonTipo {
	
	@Id
	@Column(name = "numero_pokedex", nullable = false)
	private int numeroPokedex;
	
	@Column(name = "id_tipo", nullable = false)
	private int idTipo;

	public PokemonTipo() {
		super();
	}

	public PokemonTipo(int numeroPokedex, int idTipo) {
		super();
		this.numeroPokedex = numeroPokedex;
		this.idTipo = idTipo;
	}

	public int getNumeroPokedex() {
		return numeroPokedex;
	}

	public void setNumeroPokedex(int numeroPokedex) {
		this.numeroPokedex = numeroPokedex;
	}

	public int getIdTipo() {
		return idTipo;
	}

	public void setIdTipo(int idTipo) {
		this.idTipo = idTipo;
	}
	
	
	

}
