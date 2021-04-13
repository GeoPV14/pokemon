package com.pokemon.service;

import java.util.List;

import com.pokemon.bean.PokemonFormaEvolucionBean;

public interface PokemonFormaEvolucionService {
	
	public boolean savePokemonFormaEvolucion(PokemonFormaEvolucionBean pokemonFormaEvolucionBean);
	public PokemonFormaEvolucionBean findIdPokemonFormaEvolucion(Integer id);
	public List<PokemonFormaEvolucionBean> findAllPokemonFormaEvolucion();
	public boolean updatePokemonFormaEvolucion(PokemonFormaEvolucionBean pokemonFormaEvolucionBean);
	public boolean delatePokemonFormaEvolucion(Integer id);
}
