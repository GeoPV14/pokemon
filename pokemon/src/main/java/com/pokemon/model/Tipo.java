package com.pokemon.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TIPO")
public class Tipo {
	
	@Id
	@Column(name = "ID_TIPO", length = 3, nullable = false)	
	private String idTipo;
	
	@Column(name = "NOMBRE", length = 10, nullable = false)
	private String nombreTipo;

	
	/* * Relaciones * */



	/* * Contructores_Getters&Setters * */


	
	public Tipo() {
	}

	public Tipo(String idTipo, String nombreTipo) {
		this.idTipo = idTipo;
		this.nombreTipo = nombreTipo;
	}

	public String getIdTipo() {
		return idTipo;
	}

	public void setIdTipo(String idTipo) {
		this.idTipo = idTipo;
	}

	public String getNombreTipo() {
		return nombreTipo;
	}

	public void setNombreTipo(String nombreTipo) {
		this.nombreTipo = nombreTipo;
	}
	
	
	

}
