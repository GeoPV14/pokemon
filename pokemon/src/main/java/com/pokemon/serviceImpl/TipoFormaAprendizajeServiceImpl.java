package com.pokemon.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pokemon.bean.TipoFormaAprendizajeBean;
import com.pokemon.model.TipoFormaAprendizaje;
import com.pokemon.repository.TipoFormaAprendizajeRepository;
import com.pokemon.service.TipoFormaAprendizajeService;

@Service
@Transactional
public class TipoFormaAprendizajeServiceImpl implements TipoFormaAprendizajeService{
	
	@Autowired
	TipoFormaAprendizajeRepository tipoFormAprenRepo;

	@Override
	public Integer savePokemonPiedra(TipoFormaAprendizajeBean tipoFormaAprendizajeBean) {
		TipoFormaAprendizaje tipoFormaA = new TipoFormaAprendizaje();
		
		tipoFormaA.setIdTipoAprendizaje(tipoFormaAprendizajeBean.getIdTipoAprendizaje());
		tipoFormaA.setTipoAprendizaje(tipoFormaAprendizajeBean.getTipoAprendizaje());
		
		this.tipoFormAprenRepo.save(tipoFormaA);
		return tipoFormaA.getIdTipoAprendizaje();
	}

	@Override
	public TipoFormaAprendizajeBean findTipoFormaAprendizajeById(Integer idTipoAprendizaje) {
		TipoFormaAprendizaje tipoFormaA = this.tipoFormAprenRepo.findById(idTipoAprendizaje).orElseThrow();
		TipoFormaAprendizajeBean tipoFormaAprendizajeBean = new TipoFormaAprendizajeBean();
		
		BeanUtils.copyProperties(tipoFormaA, tipoFormaAprendizajeBean);
		return tipoFormaAprendizajeBean;
	}

	@Override
	public boolean updateTipoFormaAprendiza(TipoFormaAprendizajeBean tipoFormaAprendizajeBean) {
		TipoFormaAprendizaje tipoFormaA = this.tipoFormAprenRepo.findById(tipoFormaAprendizajeBean.getIdTipoAprendizaje()).orElseThrow();
		
		BeanUtils.copyProperties(tipoFormaAprendizajeBean, tipoFormaA);
		this.tipoFormAprenRepo.save(tipoFormaA);
		return true;
	}

	@Override
	public boolean deleteTipoFormaAprendizaje(Integer idTipoAprendizaje) {
		TipoFormaAprendizaje tipoFormaA = this.tipoFormAprenRepo.findById(idTipoAprendizaje).orElseThrow();
		this.tipoFormAprenRepo.delete(tipoFormaA);
		return true;
	}

	@Override
	public List<TipoFormaAprendizajeBean> findAllTipoFormaAprendizaje() {
		List<TipoFormaAprendizaje> tipoFormaAList = this.tipoFormAprenRepo.findAll();
		List<TipoFormaAprendizajeBean> tipoFormaABeanList = new ArrayList<>();
		
		for(TipoFormaAprendizaje tipoFormaA : tipoFormaAList) {
			TipoFormaAprendizajeBean tipoFormaAprendizajeBean = new TipoFormaAprendizajeBean();
			
			BeanUtils.copyProperties(tipoFormaA, tipoFormaAprendizajeBean);
			tipoFormaABeanList.add(tipoFormaAprendizajeBean);
		}
		
		return tipoFormaABeanList;
	}

}
