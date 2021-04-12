package com.pokemon.service;

import java.util.List;

import com.pokemon.bean.TipoPiedraBean;

public interface TipoPiedraService {
	public Integer saveTipoPiedra (TipoPiedraBean tipoPiedraBean);//Create
	public TipoPiedraBean findTipoPiedraById(Integer idTipoPiedra);//Read
	public boolean updateTipoPiedra(TipoPiedraBean tipoPiedraBean);//Update
	public boolean deleteTipoPiedra(Integer idTipoPiedra);//Delete
	public List<TipoPiedraBean> findAllTipoPiedra();//ReadAll

}
