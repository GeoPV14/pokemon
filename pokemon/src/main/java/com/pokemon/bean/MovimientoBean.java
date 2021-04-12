package com.pokemon.bean;

public class MovimientoBean {
	private int idMovimiento;
	private String nombre;
	private int potencia;
	private int precisionMov;
	private String descripcion;
	private int pp;
	private int prioridad = 0;
	
	public MovimientoBean() {
		super();
	}

	public MovimientoBean(int idMovimiento, String nombre, int potencia, int precisionMov, String descripcion, int pp,
			int prioridad) {
		super();
		this.idMovimiento = idMovimiento;
		this.nombre = nombre;
		this.potencia = potencia;
		this.precisionMov = precisionMov;
		this.descripcion = descripcion;
		this.pp = pp;
		this.prioridad = prioridad;
	}

	public int getIdMovimiento() {
		return idMovimiento;
	}

	public void setIdMovimiento(int idMovimiento) {
		this.idMovimiento = idMovimiento;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getPotencia() {
		return potencia;
	}

	public void setPotencia(int potencia) {
		this.potencia = potencia;
	}

	public int getPrecisionMov() {
		return precisionMov;
	}

	public void setPrecisionMov(int precisionMov) {
		this.precisionMov = precisionMov;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public int getPp() {
		return pp;
	}

	public void setPp(int pp) {
		this.pp = pp;
	}

	public int getPrioridad() {
		return prioridad;
	}

	public void setPrioridad(int prioridad) {
		this.prioridad = prioridad;
	}
	
	

}
