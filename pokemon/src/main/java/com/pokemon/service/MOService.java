package com.pokemon.service;

import java.util.List;

import com.pokemon.bean.MOBean;

public interface MOService {
	public String saveMO(MOBean mOBean);
	public boolean updateMO(MOBean moBean);
	public MOBean findByIdMO(String idMO);
	public List<MOBean> findAllMO();
	public boolean deleteMO(String idMO);

}
