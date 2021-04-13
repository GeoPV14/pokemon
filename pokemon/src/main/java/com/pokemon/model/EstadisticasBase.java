package com.pokemon.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ESTADISTICAS_BASE")
public class EstadisticasBase {
	
	@Id
	@Column(name = "NUMERO_POKEDEX")
	private int numeroPokedex;
	
	@Column(name = "PS")
	private int ps;
	
	@Column(name = "ATAQUE")
	private int ataque;
	
	@Column(name = "DEFENSA")
	private int defensa;
	
	@Column(name = "ESPECIAL")
	private int especial;
	
	@Column(name = "VELOCIDAD")
	private int velocidad;

	public EstadisticasBase() {
		super();
	}

	public EstadisticasBase(int numeroPokedex) {
		super();
		this.numeroPokedex = numeroPokedex;
	}

	public int getNumeroPokedex() {
		return numeroPokedex;
	}

	public void setNumeroPokedex(int numeroPokedex) {
		this.numeroPokedex = numeroPokedex;
	}

	public int getPs() {
		return ps;
	}

	public void setPs(int ps) {
		this.ps = ps;
	}

	public int getAtaque() {
		return ataque;
	}

	public void setAtaque(int ataque) {
		this.ataque = ataque;
	}

	public int getDefensa() {
		return defensa;
	}

	public void setDefensa(int defensa) {
		this.defensa = defensa;
	}

	public int getEspecial() {
		return especial;
	}

	public void setEspecial(int especial) {
		this.especial = especial;
	}

	public int getVelocidad() {
		return velocidad;
	}

	public void setVelocidad(int velocidad) {
		this.velocidad = velocidad;
	}
}
