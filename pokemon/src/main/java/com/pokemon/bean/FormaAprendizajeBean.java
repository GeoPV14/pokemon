package com.pokemon.bean;

public class FormaAprendizajeBean {
	private int idFormaAprendizaje;
	private int idTipoAprendizaje;
	
	public FormaAprendizajeBean() {
		super();
	}

	public FormaAprendizajeBean(int idFormaAprendizaje, int idTipoAprendizaje) {
		super();
		this.idFormaAprendizaje = idFormaAprendizaje;
		this.idTipoAprendizaje = idTipoAprendizaje;
	}

	public int getIdFormaAprendizaje() {
		return idFormaAprendizaje;
	}

	public void setIdFormaAprendizaje(int idFormaAprendizaje) {
		this.idFormaAprendizaje = idFormaAprendizaje;
	}

	public int getIdTipoAprendizaje() {
		return idTipoAprendizaje;
	}

	public void setIdTipoAprendizaje(int idTipoAprendizaje) {
		this.idTipoAprendizaje = idTipoAprendizaje;
	}
	
	

	

}
