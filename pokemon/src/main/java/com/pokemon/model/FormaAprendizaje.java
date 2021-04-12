package com.pokemon.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "forma_aprendizaje")
public class FormaAprendizaje {
	
	@Id
	@Column(name = "id_forma_aprendizaje")
	private int idFormaAprendizaje;
	
	@Column(name = "id_tipo_aprendizaje", nullable = false)
	private int idTipoAprendizaje;

	public FormaAprendizaje() {
		super();
	}

	public FormaAprendizaje(int idFormaAprendizaje) {
		super();
		this.idFormaAprendizaje = idFormaAprendizaje;
	}

	public int getIdFormaAprendizaje() {
		return idFormaAprendizaje;
	}

	public void setIdFormaAprendizaje(int idFormaAprendizaje) {
		this.idFormaAprendizaje = idFormaAprendizaje;
	}

	public int getIdTipoAprendizaje() {
		return idTipoAprendizaje;
	}

	public void setIdTipoAprendizaje(int idTipoAprendizaje) {
		this.idTipoAprendizaje = idTipoAprendizaje;
	}
	
	
}
