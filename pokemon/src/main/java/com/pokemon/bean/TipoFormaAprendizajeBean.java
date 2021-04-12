package com.pokemon.bean;

public class TipoFormaAprendizajeBean {
	private int idTipoAprendizaje;
	private String tipoAprendizaje;
	
	public TipoFormaAprendizajeBean() {
		super();
	}

	public TipoFormaAprendizajeBean(int idTipoAprendizaje, String tipoAprendizaje) {
		super();
		this.idTipoAprendizaje = idTipoAprendizaje;
		this.tipoAprendizaje = tipoAprendizaje;
	}

	public int getIdTipoAprendizaje() {
		return idTipoAprendizaje;
	}

	public void setIdTipoAprendizaje(int idTipoAprendizaje) {
		this.idTipoAprendizaje = idTipoAprendizaje;
	}

	public String getTipoAprendizaje() {
		return tipoAprendizaje;
	}

	public void setTipoAprendizaje(String tipoAprendizaje) {
		this.tipoAprendizaje = tipoAprendizaje;
	}
	
	

}
