package com.pokemon.service;

import java.util.List;

import com.pokemon.bean.FormaAprendizajeBean;

public interface FormaAprendizajeService {
	public Integer saveFormaAprendizaje(FormaAprendizajeBean formaAprendizajeBean);//Create
	public FormaAprendizajeBean findFormaAprendizajeById(Integer idFormaAprendizaje);//Read
	public boolean updateFormaAprendizaje(FormaAprendizajeBean formaAprendizajeBean);//Update
	public boolean deleteFormaAprendizaje(Integer idFormaAprendizaje);//Delete
	public List<FormaAprendizajeBean> findAllFormaAprendizaje();//ReadAll
}
