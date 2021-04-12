package com.pokemon.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tipo_forma_aprendizaje")
public class TipoFormaAprendizaje {
	
	@Id
	@Column(name = "id_tipo_aprendizaje")
	private int idTipoAprendizaje;
	
	@Column(name = "tipo_aprendizaje", length = 50, nullable = false)
	private String tipoAprendizaje;

	public TipoFormaAprendizaje() {
		super();
	}

	public TipoFormaAprendizaje(int idTipoAprendizaje, String tipoAprendizaje) {
		super();
		this.idTipoAprendizaje = idTipoAprendizaje;
		this.tipoAprendizaje = tipoAprendizaje;
	}

	public int getIdTipoAprendizaje() {
		return idTipoAprendizaje;
	}

	public void setIdTipoAprendizaje(int idTipoAprendizaje) {
		this.idTipoAprendizaje = idTipoAprendizaje;
	}

	public String getTipoAprendizaje() {
		return tipoAprendizaje;
	}

	public void setTipoAprendizaje(String tipoAprendizaje) {
		this.tipoAprendizaje = tipoAprendizaje;
	}
	
	

}
