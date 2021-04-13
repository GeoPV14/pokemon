package com.pokemon.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.pokemon.bean.PokemonBean;
import com.pokemon.model.Pokemon;
import com.pokemon.repository.PokemonRepository;
import com.pokemon.service.PokemonService;

@Service
@Transactional
public class PokemonServiceImpl implements PokemonService{
	
	@Autowired
	private PokemonRepository pokemonRepo;

	@Override
	public boolean savePokemon(PokemonBean pokemonBean) {
		Pokemon pokemon = new Pokemon();
		BeanUtils.copyProperties(pokemonBean, pokemon);
		this.pokemonRepo.save(pokemon);
		return true;
	}

	@Override
	public PokemonBean findIdPokemon(Integer id) {
		Pokemon pokemon = this.pokemonRepo.findById(id).orElseThrow();
		PokemonBean pokemonBean = new PokemonBean();
		BeanUtils.copyProperties(pokemon, pokemonBean);
		return pokemonBean;
	}

	@Override
	public List<PokemonBean> findAllPokemon() {
		List<Pokemon> pokemonList = this.pokemonRepo.findAll();
		List<PokemonBean> pokemonBeanList = new ArrayList<>();
		for(Pokemon pokemon : pokemonList) {
			PokemonBean pokemonBean = new PokemonBean();
			BeanUtils.copyProperties(pokemon, pokemonBean);
			pokemonBeanList.add(pokemonBean);
		}
		return pokemonBeanList;
	}

	@Override
	public boolean updatePokemon(PokemonBean pokemonBean) {
		Pokemon pokemon = this.pokemonRepo.findById(pokemonBean.getNumeroPokedex()).orElseThrow();
		BeanUtils.copyProperties(pokemonBean, pokemon);
		this.pokemonRepo.save(pokemon);
		return true;
	}

	@Override
	public boolean delatePokemon(Integer id) {
		Pokemon pokemon = this.pokemonRepo.findById(id).orElseThrow();
		this.pokemonRepo.delete(pokemon);
		return true;
	}

}
