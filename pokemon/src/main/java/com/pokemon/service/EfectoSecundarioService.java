package com.pokemon.service;

import java.util.List;

import com.pokemon.bean.EfectoSecundarioBean;

public interface EfectoSecundarioService {
	public String saveEfectoSecundario(EfectoSecundarioBean efectoSecundarioBean);
	public boolean updateEfectoSecundario(EfectoSecundarioBean efectoSecundarioBean);
	public EfectoSecundarioBean findEfectoSecundarioById(String idEfectSec);
	public List<EfectoSecundarioBean> findAllEfectoSecundario();
	public boolean deleteEfectoSecundario(String idEfectSec);

}
