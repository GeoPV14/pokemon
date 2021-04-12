package com.pokemon.service;

import java.util.List;

import com.pokemon.bean.TipoAtaqueBean;

public interface TipoAtaqueService {
	public Integer saveTipoAtaque(TipoAtaqueBean tipoAtaqueBean);//Create
	public TipoAtaqueBean findTipoAtaqueById(Integer idTipoAtaque);//Read
	public boolean updateTipoAtaque(TipoAtaqueBean tipoAtaqueBean);//Update
	public boolean deleteTipoAtaque(Integer idTipoAtaque);//Delete
	public List<TipoAtaqueBean> findAllTipoAtaque();//ReadAll

}
