package com.pokemon.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pokemon.bean.TipoPiedraBean;
import com.pokemon.model.TipoPiedra;
import com.pokemon.repository.TipoPiedraRepository;
import com.pokemon.service.TipoPiedraService;

@Service
@Transactional
public class TipoPiedraServiceImpl implements TipoPiedraService{
	
	@Autowired
	TipoPiedraRepository tipoPiedraRepo;

	@Override
	public Integer saveTipoPiedra(TipoPiedraBean tipoPiedraBean) {
		TipoPiedra tipoPiedra = new TipoPiedra();
		
		tipoPiedra.setIdTipoPiedra(tipoPiedraBean.getIdTipoPiedra());
		tipoPiedra.setNombrePiedra(tipoPiedraBean.getNombrePiedra());
		
		this.tipoPiedraRepo.save(tipoPiedra);
		
		return tipoPiedra.getIdTipoPiedra();
	}

	@Override
	public TipoPiedraBean findTipoPiedraById(Integer idTipoPiedra) {
		TipoPiedra tipoPiedra = this.tipoPiedraRepo.findById(idTipoPiedra).orElseThrow();
		TipoPiedraBean tipoPiedraBean = new TipoPiedraBean();
		
		BeanUtils.copyProperties(tipoPiedra, tipoPiedraBean);
		
		return tipoPiedraBean;
	}

	@Override
	public boolean updateTipoPiedra(TipoPiedraBean tipoPiedraBean) {
		TipoPiedra tipoPiedra = this.tipoPiedraRepo.findById(tipoPiedraBean.getIdTipoPiedra()).orElseThrow();
		
		BeanUtils.copyProperties(tipoPiedraBean, tipoPiedra);
		this.tipoPiedraRepo.save(tipoPiedra);
		return true;
	}

	@Override
	public boolean deleteTipoPiedra(Integer idTipoPiedra) {
		TipoPiedra tipoPiedra = this.tipoPiedraRepo.findById(idTipoPiedra).orElseThrow();
		this.tipoPiedraRepo.delete(tipoPiedra);
		return true;
	}

	@Override
	public List<TipoPiedraBean> findAllTipoPiedra() {
		List<TipoPiedra> tipoPiedraList = this.tipoPiedraRepo.findAll();
		List<TipoPiedraBean> tipoPiedraBeanList = new ArrayList<>();
		
		for(TipoPiedra tipoPiedra : tipoPiedraList) {
			TipoPiedraBean tipoPiedraBean = new TipoPiedraBean();
			BeanUtils.copyProperties(tipoPiedra, tipoPiedraBean);
			tipoPiedraBeanList.add(tipoPiedraBean);
		}
		return tipoPiedraBeanList;
	}

}
