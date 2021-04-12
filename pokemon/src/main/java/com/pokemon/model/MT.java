package com.pokemon.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "MT")
public class MT {
	
	@Id
	@Column(name = "ID_FORMA_APRENDIZAJE", length = 3, nullable = false)
	private String idMT;
	
	@Column(name = "MT", length = 5, nullable = false)
	private String nombreMT;

	
	/* * Relaciones * */



	/* * Contructores_Getters&Setters * */


	
	public MT() {
	}

	public MT(String idMT, String nombreMT) {
		this.idMT = idMT;
		this.nombreMT = nombreMT;
	}

	public String getIdMT() {
		return idMT;
	}

	public void setIdMT(String idMT) {
		this.idMT = idMT;
	}

	public String getNombreMT() {
		return nombreMT;
	}

	public void setNombreMT(String nombreMT) {
		this.nombreMT = nombreMT;
	}
	
	

}
