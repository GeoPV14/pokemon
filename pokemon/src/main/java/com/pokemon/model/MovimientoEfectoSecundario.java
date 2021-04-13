package com.pokemon.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "MOVIMIENTO_EFECTO_SECUNDARIO")
public class MovimientoEfectoSecundario {
	
	@Id
	@Column(name = "ID_MOVIMIENTO")
	private int idMovimiento;
	
	@Column(name = "ID_EFECTO_SECUNDARIO")
	private int idEfectoSecundario;
	
	@Column(name = "PROBABILIDAD")
	private double probabilidad;

	public MovimientoEfectoSecundario() {
		super();
	}

	public MovimientoEfectoSecundario(int idMovimiento) {
		super();
		this.idMovimiento = idMovimiento;
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
