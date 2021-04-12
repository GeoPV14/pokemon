package com.pokemon.service;

import java.util.List;

import com.pokemon.bean.PokemonTipoBean;

public interface PokemonTipoService {
	public Integer savePokemonTipo(PokemonTipoBean pokemonTipoBean);//Create
	public PokemonTipoBean findPokemonTipoById(Integer idTipo);//Read
	public boolean updatePokemonTipo(PokemonTipoBean pokemonTipoBean);//Update
	public boolean deletePokemonTipo(Integer idTipo);//Delete
	public List<PokemonTipoBean> findAllPokemonTipo();//ReadAll

}
