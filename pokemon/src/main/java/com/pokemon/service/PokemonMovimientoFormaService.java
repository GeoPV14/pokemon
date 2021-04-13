package com.pokemon.service;

import java.util.List;

import com.pokemon.bean.PokemonMovimientoFormaBean;

public interface PokemonMovimientoFormaService {
	
	public boolean savePokemonMovimientoForma(PokemonMovimientoFormaBean pokemonMovimientoFormaBean);
	public PokemonMovimientoFormaBean findIdPokemonMovimientoForma(Integer id);
	public List<PokemonMovimientoFormaBean> findAllPokemonMovimientoForma();
	public boolean updatePokemonMovimientoForma(PokemonMovimientoFormaBean pokemonMovimientoFormaBean);
	public boolean delatePokemonMovimientoForma(Integer id);
}
