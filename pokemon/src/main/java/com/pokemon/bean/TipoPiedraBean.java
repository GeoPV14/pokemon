package com.pokemon.bean;

public class TipoPiedraBean {
	private int idTipoPiedra;
	private String nombrePiedra;
	
	public TipoPiedraBean() {
		super();
	}

	public TipoPiedraBean(int idTipoPiedra, String nombrePiedra) {
		super();
		this.idTipoPiedra = idTipoPiedra;
		this.nombrePiedra = nombrePiedra;
	}

	public int getIdTipoPiedra() {
		return idTipoPiedra;
	}

	public void setIdTipoPiedra(int idTipoPiedra) {
		this.idTipoPiedra = idTipoPiedra;
	}

	public String getNombrePiedra() {
		return nombrePiedra;
	}

	public void setNombrePiedra(String nombrePiedra) {
		this.nombrePiedra = nombrePiedra;
	}
	
	

}
