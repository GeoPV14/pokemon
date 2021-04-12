package com.pokemon.service;

import java.util.List;

import com.pokemon.bean.FormaEvolucionBean;

public interface FormaEvolucionService {
	public String saveFormaEvolucion(FormaEvolucionBean formaEvolucionBean);
	public boolean updateFormaEvolucion(FormaEvolucionBean formaEvolucionBean);
	public FormaEvolucionBean findByIdFormaEvolucion(String idFormEvol);
	public List<FormaEvolucionBean> findAllFormaEvolucion();
	public boolean deleteFormaEvolucion(String idFormEvol);

}
