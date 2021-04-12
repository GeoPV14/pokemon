package com.pokemon.service;

import java.util.List;

import com.pokemon.bean.FormaAprendizajeBean;

public interface FormaAprendizajeService {
	public String saveFormaAprendizaje(FormaAprendizajeBean formaAprendizajeBean);
	public boolean updateFormaAprendizaje(FormaAprendizajeBean formaAprendizajeBean);
	public FormaAprendizajeBean findFormaAprendizaje(String idFormApren);
	public List<FormaAprendizajeBean> findAllFormaAprendizaje();
	public boolean deleteFormaAprendizaje(String idFormApren);

}
