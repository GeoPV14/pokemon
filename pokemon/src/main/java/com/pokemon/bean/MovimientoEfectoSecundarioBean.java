package com.pokemon.bean;

public class MovimientoEfectoSecundarioBean {

	private int idMovimiento;
	private int idEfectoSecundario;
	private double probabilidad;
	
	public MovimientoEfectoSecundarioBean() {
		super();
	}

	public int getIdMovimiento() {
		return idMovimiento;
	}

	public void setIdMovimiento(int idMovimiento) {
		this.idMovimiento = idMovimiento;
	}

	public int getIdEfectoSecundario() {
		return idEfectoSecundario;
	}

	public void setIdEfectoSecundario(int idEfectoSecundario) {
		this.idEfectoSecundario = idEfectoSecundario;
	}

	public double getProbabilidad() {
		return probabilidad;
	}

	public void setProbabilidad(double probabilidad) {
		this.probabilidad = probabilidad;
	}
	
}
