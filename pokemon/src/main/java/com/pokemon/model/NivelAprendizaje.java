package com.pokemon.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "nivel_aprendizaje")
public class NivelAprendizaje {
	
	@Id
	@Column(name = "id_forma_aprendizaje")
	private int idFormaAprendizaje;
	
	@Column(name = "nivel", nullable = false)
	private int nivel;

	public NivelAprendizaje() {
		super();
	}

	public NivelAprendizaje(int idFormaAprendizaje) {
		super();
		this.idFormaAprendizaje = idFormaAprendizaje;
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
