package com.pokemon.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "FORMA_EVOLUCION")
public class FormaEvolucion {
	
	@Id
	@Column(name = "ID_FORMA_EVOLUCION", length = 2, nullable = false)
	private String idFormaEvol;
	
	@Column(name = "TIPO_EVOLUCION", length = 2, nullable = false)
	private String tipoEvol;
	
	/* * Relaciones * */
	
	
	
	/* * Contructores_Getters&Setters * */
	
	public FormaEvolucion() {
	}
	
	public FormaEvolucion(String idFormaEvol, String tipoEvol) {
		this.idFormaEvol = idFormaEvol;
		this.tipoEvol = tipoEvol;
	}

	public String getIdFormaEvol() {
		return idFormaEvol;
	}

	public void setIdFormaEvol(String idFormaEvol) {
		this.idFormaEvol = idFormaEvol;
	}

	public String getTipoEvol() {
		return tipoEvol;
	}

	public void setTipoEvol(String tipoEvol) {
		this.tipoEvol = tipoEvol;
	}

	

}
