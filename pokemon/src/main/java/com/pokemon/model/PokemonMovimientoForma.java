package com.pokemon.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "POKEMON_MOVIMIENTO_FORMA")
public class PokemonMovimientoForma {
	
	@Id
	@Column(name = "NUMERO_POKEDEX")
	private int numeroPokedex;
	
	@Column(name = "ID_MOVIMIENTO")
	private int idMovimiento;
	
	@Column(name = "ID_FORMA_APRENDIZAJE")
	private int idFormaAprendizaje;

	public PokemonMovimientoForma() {
		super();
	}

	public PokemonMovimientoForma(int numeroPokedex) {
		super();
		this.numeroPokedex = numeroPokedex;
	}

	public int getNumeroPokedex() {
		return numeroPokedex;
	}

	public void setNumeroPokedex(int numeroPokedex) {
		this.numeroPokedex = numeroPokedex;
	}

	public int getIdMovimiento() {
		return idMovimiento;
	}

	public void setIdMovimiento(int idMovimiento) {
		this.idMovimiento = idMovimiento;
	}

	public int getIdFormaAprendizaje() {
		return idFormaAprendizaje;
	}

	public void setIdFormaAprendizaje(int idFormaAprendizaje) {
		this.idFormaAprendizaje = idFormaAprendizaje;
	}
	
}
