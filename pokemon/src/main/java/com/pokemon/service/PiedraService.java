package com.pokemon.service;

import java.util.List;

import com.pokemon.bean.PiedraBean;

public interface PiedraService {
	public Integer savePiedra(PiedraBean piedraBean);//Create
	public PiedraBean findPiedraById(Integer idTipoPiedra);//Read
	public boolean updatePiedra(PiedraBean piedraBean);//Update
	public boolean deletePiedra(Integer idTipoPiedra);//Delete
	public List<PiedraBean> findAllPiedras();//ReadAll

}
