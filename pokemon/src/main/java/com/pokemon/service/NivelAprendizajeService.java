package com.pokemon.service;

import java.util.List;

import com.pokemon.bean.NivelAprendizajeBean;
import com.pokemon.bean.TipoAtaqueBean;

public interface NivelAprendizajeService {
	public Integer saveNivelAprendizaje(NivelAprendizajeBean nivelAprendizajeBean);//Create
	public TipoAtaqueBean findNivelAprendizajeById(Integer idFormaAprendizaje);//Read
	public boolean updateNivelAprendizaje(NivelAprendizajeBean nivelAprendizajeBean);//Update
	public boolean deleteTipoAtaque(Integer idFormaAprendizaje);//Delete
	public List<NivelAprendizajeBean> findAllNivelAprendizaje();//ReadAll

}
