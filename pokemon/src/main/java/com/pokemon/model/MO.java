package com.pokemon.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "MO")
public class MO {
	
	@Id
	@Column(name = "ID_FORMA_APRENDIZAJE", length = 3, nullable = false)
	private String idMO;
	
	@Column(name = "MO", length = 10, nullable = false)
	private String MO;

	
	/* * Relaciones * */



	/* * Contructores_Getters&Setters * */

	
	public MO() {
	}

	public MO(String idMO, String mO) {
		this.idMO = idMO;
		MO = mO;
	}

	public String getIdMO() {
		return idMO;
	}

	public void setIdMO(String idMO) {
		this.idMO = idMO;
	}

	public String getMO() {
		return MO;
	}

	public void setMO(String mO) {
		MO = mO;
	}
	
	

}
