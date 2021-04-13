package com.pokemon.service;

import java.util.List;

import com.pokemon.bean.PokemonBean;

public interface PokemonService {
	
	public boolean savePokemon(PokemonBean pokemonBean);
	public PokemonBean findIdPokemon(Integer id);
	public List<PokemonBean> findAllPokemon();
	public boolean updatePokemon(PokemonBean pokemonBean);
	public boolean delatePokemon(Integer id);
}
