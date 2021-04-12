package com.pokemon.bean;

public class FormaAprendizajeBean {
	private String idTipoAprendizaje;
	private String tipoAprendizaje;
	
	public FormaAprendizajeBean() {
	}

	public FormaAprendizajeBean(String idTipoAprendizaje, String tipoAprendizaje) {
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
