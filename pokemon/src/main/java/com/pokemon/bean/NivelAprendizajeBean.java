package com.pokemon.bean;

public class NivelAprendizajeBean {
	private int idFormaAprendizaje;
	private int nivel;
	
	public NivelAprendizajeBean() {
		super();
	}

	public NivelAprendizajeBean(int idFormaAprendizaje, int nivel) {
		super();
		this.idFormaAprendizaje = idFormaAprendizaje;
		this.nivel = nivel;
	}

	public int getIdFormaAprendizaje() {
		return idFormaAprendizaje;
	}

	public void setIdFormaAprendizaje(int idFormaAprendizaje) {
		this.idFormaAprendizaje = idFormaAprendizaje;
	}

	public int getNivel() {
		return nivel;
	}

	public void setNivel(int nivel) {
		this.nivel = nivel;
	}
	
	

}
