package com.pokemon.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "movimiento")
public class Movimiento {
	
	@Id
	@Column(name = "id_movimiento")
	private int idMovimiento;
	
	@Column(name = "nombre", length = 50, nullable = false)
	private String nombre;
	
	@Column(name = "potencia", nullable = false)
	private int potencia;
	
	@Column(name = "precision_mov", nullable = false)
	private int precisionMov;
	
	@Column(name = "descripcion", length = 600, nullable = false)
	private String descripcion;
	
	@Column(name = "pp", nullable = false)
	private int pp;
	
	@Column(name = "prioridad", nullable = false)
	private int prioridad = 0;

	public Movimiento() {
		super();
	}

	public Movimiento(int idMovimiento) {
		super();
		this.idMovimiento = idMovimiento;
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
