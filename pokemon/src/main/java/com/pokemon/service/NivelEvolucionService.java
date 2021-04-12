package com.pokemon.service;

import java.util.List;

import com.pokemon.bean.NivelEvolucionBean;

public interface NivelEvolucionService {
	public String saveNivelEvolucion(NivelEvolucionBean nivelEvolucionBean);
	public boolean updateNivelEvolucion(NivelEvolucionBean nivelEvolucionBean);
	public NivelEvolucionBean findByIdNivelEvolucion(String idNivelEvol);
	public List<NivelEvolucionBean> findAllNivelEvolucion();
	public boolean deleteNivelEvolucion(String idNivelEvol);

}
