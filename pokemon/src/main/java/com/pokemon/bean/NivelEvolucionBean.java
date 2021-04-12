package com.pokemon.bean;

public class NivelEvolucionBean {
	private String idNivelEvol;
	private String NivelEvol;
	
	public NivelEvolucionBean() {
	}

	public NivelEvolucionBean(String idNivelEvol, String nivelEvol) {
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
