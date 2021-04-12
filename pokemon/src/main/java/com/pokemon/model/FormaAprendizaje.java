package com.pokemon.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TIPO_FORMA_APRENDIZAJE")
public class FormaAprendizaje {
	
	@Id
	@Column(name = "ID_TIPO_APRENDIZAJE", length = 2, nullable = false)
	private String idTipoAprendizaje;
	
	@Column(name = "TIPO_APRENDIZAJE", length = 10, nullable = false)
	private String tipoAprendizaje;

		
	/* * Relaciones * */
	
	
	
	/* * Contructores_Getters&Setters * */
	
	public FormaAprendizaje() {
	}


	public FormaAprendizaje(String idTipoAprendizaje, String tipoAprendizaje) {
		this.idTipoAprendizaje = idTipoAprendizaje;
		this.tipoAprendizaje = tipoAprendizaje;
	}


	public String getIdTipoAprendizaje() {
		return idTipoAprendizaje;
	}


	public void setIdTipoAprendizaje(String idTipoAprendizaje) {
		this.idTipoAprendizaje = idTipoAprendizaje;
	}


	public String getTipoAprendizaje() {
		return tipoAprendizaje;
	}


	public void setTipoAprendizaje(String tipoAprendizaje) {
		this.tipoAprendizaje = tipoAprendizaje;
	}
	
		

}
