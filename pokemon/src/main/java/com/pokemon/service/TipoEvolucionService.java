package com.pokemon.service;

import java.util.List;

import com.pokemon.bean.TipoEvolucionBean;

public interface TipoEvolucionService {

	public boolean saveTipoEvolucion(TipoEvolucionBean tipoEvolucionBean);
	public TipoEvolucionBean findIdTipoEvolucion(Integer id);
	public List<TipoEvolucionBean> findAllTipoEvolucion();
	public boolean updateTipoEvolucion(TipoEvolucionBean tipoEvolucionBean);
	public boolean delateTipoEvolucion(Integer id);
	
}
