package com.pokemon.bean;

public class PokemonTipoBean {
	private int numeroPokedex;
	private int idTipo;
	
	public PokemonTipoBean() {
		super();
	}

	public PokemonTipoBean(int numeroPokedex, int idTipo) {
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
