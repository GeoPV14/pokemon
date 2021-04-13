package com.pokemon.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pokemon.bean.PiedraBean;
import com.pokemon.model.Piedra;
import com.pokemon.repository.PiedraRepository;
import com.pokemon.service.PiedraService;

@Service
@Transactional
public class PiedraServiceImpl implements PiedraService{
	@Autowired
	PiedraRepository piedraRepo;

	@Override
	public Integer savePiedra(PiedraBean piedraBean) {
		Piedra piedra = new Piedra();
		
		piedra.setIdFormaEvolucion(piedraBean.getIdFormaEvolucion());
		piedra.setIdTipoPiedra(piedraBean.getIdTipoPiedra());
		
		this.piedraRepo.save(piedra);
		return piedra.getIdTipoPiedra();
	}

	@Override
	public PiedraBean findPiedraById(Integer idTipoPiedra) {
		Piedra piedra = this.piedraRepo.findById(idTipoPiedra).orElseThrow();
		PiedraBean piedraBean = new PiedraBean();
		
		BeanUtils.copyProperties(piedra, piedraBean);
		
		return piedraBean;
	}

	@Override
	public boolean updatePiedra(PiedraBean piedraBean) {
		Piedra piedra = this.piedraRepo.findById(piedraBean.getIdFormaEvolucion()).orElseThrow();
		
		BeanUtils.copyProperties(piedraBean, piedra);
		this.piedraRepo.save(piedra);
		return true;
	}

	@Override
	public boolean deletePiedra(Integer idTipoPiedra) {
		Piedra piedra = this.piedraRepo.findById(idTipoPiedra).orElseThrow();
		this.piedraRepo.delete(piedra);
		return true;
	}

	@Override
	public List<PiedraBean> findAllPiedras() {
		List<Piedra> piedraList = this.piedraRepo.findAll();
		List<PiedraBean> piedraBeanList = new ArrayList<>();
		
		for(Piedra piedra : piedraList) {
			PiedraBean piedraBean = new PiedraBean();
			
			BeanUtils.copyProperties(piedra, piedraBean);
			piedraBeanList.add(piedraBean);
		}
		return piedraBeanList;
	}
	
	

}
