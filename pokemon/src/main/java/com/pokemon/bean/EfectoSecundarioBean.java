package com.pokemon.bean;

public class EfectoSecundarioBean {
	private String idEfectoSecundario;
	private String EfectoSecundario;
	
	public EfectoSecundarioBean() {
	}

	public EfectoSecundarioBean(String idEfectoSecundario, String efectoSecundario) {
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
