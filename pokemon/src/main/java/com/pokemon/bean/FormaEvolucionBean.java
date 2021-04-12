package com.pokemon.bean;

public class FormaEvolucionBean {
	private String idFormaEvol;
	private String tipoEvol;
	
	public FormaEvolucionBean() {
	}

	public FormaEvolucionBean(String idFormaEvol, String tipoEvol) {
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
