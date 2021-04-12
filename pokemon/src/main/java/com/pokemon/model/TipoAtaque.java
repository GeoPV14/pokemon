package com.pokemon.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tipo_ataque")
public class TipoAtaque {
	
	@Id
	@Column(name = "id_tipo_ataque")
	private int idTipoAtaque;
	
	@Column(name = "tipo", length = 15, nullable = false)
	private String tipo;

	public TipoAtaque() {
		super();
	}

	public TipoAtaque(int idTipoAtaque, String tipo) {
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
