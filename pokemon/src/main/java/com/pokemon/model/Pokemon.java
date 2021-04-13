package com.pokemon.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "POKEMON")
public class Pokemon {
	
	@Id
	@Column(name = "NUMERO_POKEDEX")
	private int numeroPokedex;
	
	@Column(name = "NOMBRE", length = 15)
	private String nombre;
	
	@Column(name = "PESO")
	private double peso;
	
	@Column(name = "ALTURA")
	private double altura;

	public Pokemon() {
		super();
	}

	public Pokemon(int numeroPokedex) {
		super();
		this.numeroPokedex = numeroPokedex;
	}

	public int getNumeroPokedex() {
		return numeroPokedex;
	}

	public void setNumeroPokedex(int numeroPokedex) {
		this.numeroPokedex = numeroPokedex;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

}
