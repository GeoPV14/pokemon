package com.pokemon.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tipo_piedra")
public class TipoPiedra {
	
	@Id
	@Column(name = "id_tipo_piedra")
	private int idTipoPiedra;
	
	@Column(name = "nombre_piedra", length = 50, nullable = false)
	private String nombrePiedra;

	public TipoPiedra() {
		super();
	}

	public TipoPiedra(int idTipoPiedra) {
		super();
		this.idTipoPiedra = idTipoPiedra;
	}

	public int getIdTipoPiedra() {
		return idTipoPiedra;
	}

	public void setIdTipoPiedra(int idTipoPiedra) {
		this.idTipoPiedra = idTipoPiedra;
	}

	public String getNombrePiedra() {
		return nombrePiedra;
	}

	public void setNombrePiedra(String nombrePiedra) {
		this.nombrePiedra = nombrePiedra;
	}
	
	

}
