package com.pokemon.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pokemon.bean.NivelAprendizajeBean;
import com.pokemon.model.NivelAprendizaje;
import com.pokemon.repository.NivelAprendizajeRepository;
import com.pokemon.service.NivelAprendizajeService;

@Service
@Transactional
public class NivelAprendizajeServiceImpl implements NivelAprendizajeService{
	
	@Autowired
	NivelAprendizajeRepository nivelAprRepo;

	@Override
	public Integer saveNivelAprendizaje(NivelAprendizajeBean nivelAprendizajeBean) {
		NivelAprendizaje nivelAprendizaje = new NivelAprendizaje();
		
		nivelAprendizaje.setIdFormaAprendizaje(nivelAprendizajeBean.getIdFormaAprendizaje());
		nivelAprendizaje.setNivel(nivelAprendizajeBean.getNivel());
		
		this.nivelAprRepo.save(nivelAprendizaje);
		
		return nivelAprendizaje.getIdFormaAprendizaje();
	}

	@Override
	public NivelAprendizajeBean findNivelAprendizajeById(Integer idFormaAprendizaje) {
		NivelAprendizaje nivelAprendizaje = this.nivelAprRepo.findById(idFormaAprendizaje).orElseThrow();
		NivelAprendizajeBean nivelAprendizajeBean = new NivelAprendizajeBean();
		
		BeanUtils.copyProperties(nivelAprendizaje, nivelAprendizajeBean);
		
		return nivelAprendizajeBean;
	}
	

	@Override
	public boolean updateNivelAprendizaje(NivelAprendizajeBean nivelAprendizajeBean) {
		NivelAprendizaje nivelAprendizaje = this.nivelAprRepo.findById(nivelAprendizajeBean.getIdFormaAprendizaje()).orElseThrow();
		
		BeanUtils.copyProperties(nivelAprendizajeBean, nivelAprendizaje);
		this.nivelAprRepo.save(nivelAprendizaje);
		
		return true;
	}

	@Override
	public boolean deleteTipoAtaque(Integer idFormaAprendizaje) {
		NivelAprendizaje nivelAprendizaje = this.nivelAprRepo.findById(idFormaAprendizaje).orElseThrow();
		
		this.nivelAprRepo.delete(nivelAprendizaje);
		
		return true;
	}

	@Override
	public List<NivelAprendizajeBean> findAllNivelAprendizaje() {
		List<NivelAprendizaje> nivelAprendizajeList = this.nivelAprRepo.findAll();
		List<NivelAprendizajeBean> nivelAprendizajeBeanList = new ArrayList<>();
		
		for(NivelAprendizaje nivelAprendizaje : nivelAprendizajeList) {
			NivelAprendizajeBean nivelAprendizajeBean = new NivelAprendizajeBean();
			
			BeanUtils.copyProperties(nivelAprendizaje, nivelAprendizajeBean);
			
			nivelAprendizajeBeanList.add(nivelAprendizajeBean);
		}
		return nivelAprendizajeBeanList;
	}

}
