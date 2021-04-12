package com.pokemon.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "NIVEL_EVOLUCION")
public class NivelEvolucion {
	
	@Id
	@Column(name = "ID_FORMA_EVOLUCION", length = 3, nullable = false)
	private String idNivelEvol;
	
	@Column(name = "NIVEL", length = 3, nullable = false)
	private String NivelEvol;

	
	/* * Relaciones * */
	
	
	
	/* * Contructores_Getters&Setters * */
	
	public NivelEvolucion() {
	}


	public NivelEvolucion(String idNivelEvol, String nivelEvol) {
		this.idNivelEvol = idNivelEvol;
		NivelEvol = nivelEvol;
	}


	public String getIdNivelEvol() {
		return idNivelEvol;
	}


	public void setIdNivelEvol(String idNivelEvol) {
		this.idNivelEvol = idNivelEvol;
	}


	public String getNivelEvol() {
		return NivelEvol;
	}


	public void setNivelEvol(String nivelEvol) {
		NivelEvol = nivelEvol;
	}
	
	

}
