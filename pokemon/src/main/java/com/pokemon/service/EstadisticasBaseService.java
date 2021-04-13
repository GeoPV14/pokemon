package com.pokemon.service;

import java.util.List;

import com.pokemon.bean.EstadisticasBaseBean;

public interface EstadisticasBaseService {
	
	public boolean saveEstadisticasBase(EstadisticasBaseBean estadisticasBaseBean);
	public EstadisticasBaseBean findIdEstadisticasBase(Integer id);
	public List<EstadisticasBaseBean> findAllEstadisticasBase();
	public boolean updateEstadisticasBase(EstadisticasBaseBean estadisticasBaseBean);
	public boolean delateEstadisticasBase(Integer id);
}
