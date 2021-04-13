package com.pokemon.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TIPO_EVOLUCION")
public class TipoEvolucion {
	
	@Id
	@Column(name = "ID_TIPO_EVOLUCION")
	private int idTipoEvolucion;
	
	@Column(name = "TIPO_EVOLUCION", length = 15)
	private String tipoEvolucion;

	public TipoEvolucion() {
		super();
	}

	public TipoEvolucion(int idTipoEvolucion) {
		super();
		this.idTipoEvolucion = idTipoEvolucion;
	}

	public int getIdTipoEvolucion() {
		return idTipoEvolucion;
	}

	public void setIdTipoEvolucion(int idTipoEvolucion) {
		this.idTipoEvolucion = idTipoEvolucion;
	}

	public String getTipoEvolucion() {
		return tipoEvolucion;
	}

	public void setTipoEvolucion(String tipoEvolucion) {
		this.tipoEvolucion = tipoEvolucion;
	}
	
}
