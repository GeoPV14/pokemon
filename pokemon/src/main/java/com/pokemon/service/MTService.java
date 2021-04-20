package com.pokemon.service;

import java.util.List;

import com.pokemon.bean.MTBean;

public interface MTService {
	public String saveMT(MTBean mTBean);
	public boolean updateMT(MTBean mTBean);
	public MTBean findByIdMT(String idMT);
	public List<MTBean> findAllMT();
	public boolean deleteMT(String idMT);

}
