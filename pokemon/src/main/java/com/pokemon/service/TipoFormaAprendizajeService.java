package com.pokemon.service;

import java.util.List;

import com.pokemon.bean.TipoFormaAprendizajeBean;

public interface TipoFormaAprendizajeService {
	public Integer savePokemonPiedra(TipoFormaAprendizajeBean tipoFormaAprendizajeBean);//Create
	public TipoFormaAprendizajeBean findTipoFormaAprendizajeById(Integer idTipoAprendizaje);//Read
	public boolean updateTipoFormaAprendiza(TipoFormaAprendizajeBean tipoFormaAprendizajeBean);//Update
	public boolean deleteTipoFormaAprendizaje(Integer idTipoAprendizaje);//Delete
	public List<TipoFormaAprendizajeBean> findAllTipoFormaAprendizaje();//ReadAll


}
