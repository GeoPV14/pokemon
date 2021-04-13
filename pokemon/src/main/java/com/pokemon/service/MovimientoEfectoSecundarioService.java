package com.pokemon.service;

import java.util.List;

import com.pokemon.bean.MovimientoEfectoSecundarioBean;

public interface MovimientoEfectoSecundarioService {

	public boolean saveMovimientoEfectoSecundario(MovimientoEfectoSecundarioBean movimientoEfectoSecundarioBean);
	public MovimientoEfectoSecundarioBean findIdMovimientoEfectoSecundario(Integer id);
	public List<MovimientoEfectoSecundarioBean> findAllMovimientoEfectoSecundario();
	public boolean updateMovimientoEfectoSecundario(MovimientoEfectoSecundarioBean movimientoEfectoSecundarioBean);
	public boolean delateMovimientoEfectoSecundario(Integer id);
}
