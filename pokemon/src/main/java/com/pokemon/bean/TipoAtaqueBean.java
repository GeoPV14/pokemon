package com.pokemon.bean;

public class TipoAtaqueBean {
	private int idTipoAtaque;
	private String tipo;
	
	public TipoAtaqueBean() {
		super();
	}

	public TipoAtaqueBean(int idTipoAtaque, String tipo) {
		super();
		this.idTipoAtaque = idTipoAtaque;
		this.tipo = tipo;
	}

	public int getIdTipoAtaque() {
		return idTipoAtaque;
	}

	public void setIdTipoAtaque(int idTipoAtaque) {
		this.idTipoAtaque = idTipoAtaque;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	

}
