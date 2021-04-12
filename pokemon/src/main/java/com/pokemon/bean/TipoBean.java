package com.pokemon.bean;

public class TipoBean {
	private String idTipo;
	private String nombreTipo;
	
	public TipoBean() {
	}
	
	public TipoBean(String idTipo, String nombreTipo) {
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
