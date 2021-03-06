package com.pokemon.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "piedra")
public class Piedra {
	
	@Id
	@Column(name = "id_forma_evolucion")
	private int idFormaEvolucion;
	
	@Column(name = "id_tipo_piedra")
	private int idTipoPiedra;

	public Piedra() {
		super();
	}

	public Piedra(int idFormaEvolucion) {
		super();
		this.idFormaEvolucion = idFormaEvolucion;
	}

	public int getIdFormaEvolucion() {
		return idFormaEvolucion;
	}

	public void setIdFormaEvolucion(int idFormaEvolucion) {
		this.idFormaEvolucion = idFormaEvolucion;
	}

	public int getIdTipoPiedra() {
		return idTipoPiedra;
	}

	public void setIdTipoPiedra(int idTipoPiedra) {
		this.idTipoPiedra = idTipoPiedra;
	}
	
	

}
