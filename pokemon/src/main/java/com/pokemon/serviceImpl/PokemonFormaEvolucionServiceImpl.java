package com.pokemon.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.pokemon.bean.PokemonFormaEvolucionBean;
import com.pokemon.model.PokemonFormaEvolucion;
import com.pokemon.repository.PokemonFormaEvolucionRepository;
import com.pokemon.service.PokemonFormaEvolucionService;

@Service
@Transactional
public class PokemonFormaEvolucionServiceImpl implements PokemonFormaEvolucionService{

	@Autowired
	private PokemonFormaEvolucionRepository pokemonFormaEvolucionRepo;
	
	@Override
	public boolean savePokemonFormaEvolucion(PokemonFormaEvolucionBean pokemonFormaEvolucionBean) {
		PokemonFormaEvolucion pokemonFormaEvolucion = new PokemonFormaEvolucion();
		BeanUtils.copyProperties(pokemonFormaEvolucionBean, pokemonFormaEvolucion);
		this.pokemonFormaEvolucionRepo.save(pokemonFormaEvolucion);
		return true;
	}

	@Override
	public PokemonFormaEvolucionBean findIdPokemonFormaEvolucion(Integer id) {
		PokemonFormaEvolucion pokemonFormaEvolucion = this.pokemonFormaEvolucionRepo.findById(id).orElseThrow();
		PokemonFormaEvolucionBean pokemonFormaEvolucionBean = new PokemonFormaEvolucionBean();
		BeanUtils.copyProperties(pokemonFormaEvolucion, pokemonFormaEvolucionBean);
		return pokemonFormaEvolucionBean;
	}

	@Override
	public List<PokemonFormaEvolucionBean> findAllPokemonFormaEvolucion() {
		List<PokemonFormaEvolucion> pokemonFormaEvolucionList = this.pokemonFormaEvolucionRepo.findAll();
		List<PokemonFormaEvolucionBean> pokemonFormaEvolucionBeanList = new ArrayList<>();
		for(PokemonFormaEvolucion pokemonFormaEvolucion : pokemonFormaEvolucionList) {
			PokemonFormaEvolucionBean pokemonFormaEvolucionBean = new PokemonFormaEvolucionBean();
			BeanUtils.copyProperties(pokemonFormaEvolucion, pokemonFormaEvolucionBean);
			pokemonFormaEvolucionBeanList.add(pokemonFormaEvolucionBean);
		}
		return pokemonFormaEvolucionBeanList;
	}

	@Override
	public boolean updatePokemonFormaEvolucion(PokemonFormaEvolucionBean pokemonFormaEvolucionBean) {
		PokemonFormaEvolucion pokemonFormaEvolucion = this.pokemonFormaEvolucionRepo.findById(pokemonFormaEvolucionBean.getIdFormaEvolucion()).orElseThrow();
		BeanUtils.copyProperties(pokemonFormaEvolucionBean, pokemonFormaEvolucion);
		this.pokemonFormaEvolucionRepo.save(pokemonFormaEvolucion);
		return true;
	}

	@Override
	public boolean delatePokemonFormaEvolucion(Integer id) {
		PokemonFormaEvolucion pokemonFormaEvolucion = this.pokemonFormaEvolucionRepo.findById(id).orElseThrow();
		this.pokemonFormaEvolucionRepo.delete(pokemonFormaEvolucion);
		return true;
	}

}
