package com.pokemon.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pokemon.bean.PokemonTipoBean;
import com.pokemon.model.PokemonTipo;
import com.pokemon.repository.PokemonTipoRepository;
import com.pokemon.service.PokemonTipoService;

@Service
@Transactional
public class PokemonTipoServiceImpl implements PokemonTipoService{
	@Autowired
	PokemonTipoRepository pokemonTipoRepo;

	@Override
	public Integer savePokemonTipo(PokemonTipoBean pokemonTipoBean) {
		PokemonTipo pokemonTipo = new PokemonTipo();
		
		pokemonTipo.setIdTipo(pokemonTipoBean.getIdTipo());
		pokemonTipo.setNumeroPokedex(pokemonTipoBean.getNumeroPokedex());
		
		this.pokemonTipoRepo.save(pokemonTipo);
		
		return pokemonTipo.getIdTipo();
	}

	@Override
	public PokemonTipoBean findPokemonTipoById(Integer idTipo) {
		PokemonTipo pokemonTipo = this.pokemonTipoRepo.findById(idTipo).orElseThrow();
		PokemonTipoBean pokemonTipoBean = new PokemonTipoBean();
		
		BeanUtils.copyProperties(pokemonTipo, pokemonTipoBean);
		
		return pokemonTipoBean;
	}

	@Override
	public boolean updatePokemonTipo(PokemonTipoBean pokemonTipoBean) {
		PokemonTipo pokemonTipo = this.pokemonTipoRepo.findById(pokemonTipoBean.getIdTipo()).orElseThrow();
		
		BeanUtils.copyProperties(pokemonTipoBean, pokemonTipo);
		this.pokemonTipoRepo.save(pokemonTipo);
		
		return true;
	}

	@Override
	public boolean deletePokemonTipo(Integer idTipo) {
		PokemonTipo pokemonTipo = this.pokemonTipoRepo.findById(idTipo).orElseThrow();
		
		this.pokemonTipoRepo.delete(pokemonTipo);
		
		return true;
	}

	@Override
	public List<PokemonTipoBean> findAllPokemonTipo() {
		List<PokemonTipo> pokemonTipoList = this.pokemonTipoRepo.findAll();
		List<PokemonTipoBean> pokemonTipoBeanList = new ArrayList<>();
		
		for(PokemonTipo pokemonTipo : pokemonTipoList) {
			PokemonTipoBean pokemonTipoBean = new PokemonTipoBean();
			
			BeanUtils.copyProperties(pokemonTipo, pokemonTipoBean);
			pokemonTipoBeanList.add(pokemonTipoBean);
		}
		return pokemonTipoBeanList;
	}
	
	

}
