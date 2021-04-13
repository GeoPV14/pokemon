package com.pokemon.service;

import java.util.List;

import com.pokemon.bean.EvolucionaDeBean;

public interface EvolucionaDeService {

	public boolean saveEvolucionaDe(EvolucionaDeBean evolucionaDeBean);
	public EvolucionaDeBean findIdEvolucionaDe(Integer id);
	public List<EvolucionaDeBean> findAllEvolucionaDe();
	public boolean updateEvolucionaDe(EvolucionaDeBean evolucionaDeBean);
	public boolean delateEvolucionaDe(Integer id);
}
