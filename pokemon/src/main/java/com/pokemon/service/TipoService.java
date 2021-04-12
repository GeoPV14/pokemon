package com.pokemon.service;

import java.util.List;

import com.pokemon.bean.TipoBean;

public interface TipoService {
	public String saveTipo(TipoBean tipoBean);
	public boolean updateTipo(TipoBean tipoBean);
	public TipoBean findTipoById(String idTipo);
	public List<TipoBean> findAllTipo();
	public boolean deteleTipo(String idTipo);

}
