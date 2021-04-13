package com.pokemon.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.pokemon.bean.PokemonMovimientoFormaBean;
import com.pokemon.model.PokemonMovimientoForma;
import com.pokemon.repository.PokemonMovimientoFormaRepository;
import com.pokemon.service.PokemonMovimientoFormaService;

@Service
@Transactional
public class PokemonMovimientoFormaServiceImpl implements PokemonMovimientoFormaService{

	@Autowired
	private PokemonMovimientoFormaRepository PokemonMovimientoFormaRepo;
	
	@Override
	public boolean savePokemonMovimientoForma(PokemonMovimientoFormaBean pokemonMovimientoFormaBean) {
		PokemonMovimientoForma pokemonMovimientoForma = new PokemonMovimientoForma();
		BeanUtils.copyProperties(pokemonMovimientoFormaBean, pokemonMovimientoForma);
		this.PokemonMovimientoFormaRepo.save(pokemonMovimientoForma);
		return true;
	}

	@Override
	public PokemonMovimientoFormaBean findIdPokemonMovimientoForma(Integer id) {
		PokemonMovimientoForma pokemonMovimientoForma = this.PokemonMovimientoFormaRepo.findById(id).orElseThrow();
		PokemonMovimientoFormaBean pokemonMovimientoFormaBean = new PokemonMovimientoFormaBean();
		BeanUtils.copyProperties(pokemonMovimientoForma, pokemonMovimientoFormaBean);
		return pokemonMovimientoFormaBean;
	}

	@Override
	public List<PokemonMovimientoFormaBean> findAllPokemonMovimientoForma() {
		List<PokemonMovimientoForma> pokemonMovimientoFormaList = this.PokemonMovimientoFormaRepo.findAll();
		List<PokemonMovimientoFormaBean> pokemonMovimientoFormaBeanList = new ArrayList<>();
		for(PokemonMovimientoForma pokemonMovimientoForma : pokemonMovimientoFormaList) {
			PokemonMovimientoFormaBean pokemonMovimientoFormaBean = new PokemonMovimientoFormaBean();
			BeanUtils.copyProperties(pokemonMovimientoForma, pokemonMovimientoFormaBean);
			pokemonMovimientoFormaBeanList.add(pokemonMovimientoFormaBean);
		}
		return pokemonMovimientoFormaBeanList;
	}

	@Override
	public boolean updatePokemonMovimientoForma(PokemonMovimientoFormaBean pokemonMovimientoFormaBean) {
		PokemonMovimientoForma pokemonMovimientoForma = this.PokemonMovimientoFormaRepo.findById(pokemonMovimientoFormaBean.getNumeroPokedex()).orElseThrow();
		BeanUtils.copyProperties(pokemonMovimientoFormaBean, pokemonMovimientoForma);
		this.PokemonMovimientoFormaRepo.save(pokemonMovimientoForma);
		return true;
	}

	@Override
	public boolean delatePokemonMovimientoForma(Integer id) {
		PokemonMovimientoForma pokemonMovimientoForma = this.PokemonMovimientoFormaRepo.findById(id).orElseThrow();
		this.PokemonMovimientoFormaRepo.delete(pokemonMovimientoForma);
		return true;
	}

}
