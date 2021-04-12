package com.pokemon.service;

import java.util.List;

import com.pokemon.bean.MovimientoBean;

public interface MovimientoService {
	public Integer saveMovimiento(MovimientoBean movimientoBean);//Create
	public MovimientoBean findMovimientoById(Integer idMovimiento);//Read
	public boolean updateMovimiento(MovimientoBean movimientoBean);//Update
	public boolean deleteMovimiento(Integer idMovimiento);//Delete
	public List<MovimientoBean> findAllMovimientos();//ReadAll

}
