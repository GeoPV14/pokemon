package com.pokemon.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "EFECTO_SECUNDARIO")
public class EfectoSecundario {
	
	@Id
	@Column(name = "ID_EFECTO_SECUNDARIO", length = 3, nullable = false)
	private String idEfectoSecundario;
	
	@Column(name = "EFECTO_SECUNDARIO", length = 50, nullable = false)
	private String EfectoSecundario;
	
	
	/* * Relaciones * */
	
	
	
	/* * Contructores_Getters&Setters * */
	

	public EfectoSecundario() {
	}

	public EfectoSecundario(String idEfectoSecundario, String efectoSecundario) {
		this.idEfectoSecundario = idEfectoSecundario;
		EfectoSecundario = efectoSecundario;
	}

	public String getIdEfectoSecundario() {
		return idEfectoSecundario;
	}

	public void setIdEfectoSecundario(String idEfectoSecundario) {
		this.idEfectoSecundario = idEfectoSecundario;
	}

	public String getEfectoSecundario() {
		return EfectoSecundario;
	}

	public void setEfectoSecundario(String efectoSecundario) {
		EfectoSecundario = efectoSecundario;
	}

	
	

}
