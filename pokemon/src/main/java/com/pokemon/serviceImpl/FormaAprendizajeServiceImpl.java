package com.pokemon.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pokemon.bean.FormaAprendizajeBean;
import com.pokemon.model.FormaAprendizaje;
import com.pokemon.repository.FormaAprendizajeRepository;
import com.pokemon.service.FormaAprendizajeService;

@Service
@Transactional
public class FormaAprendizajeServiceImpl implements FormaAprendizajeService{
	
	@Autowired
	private FormaAprendizajeRepository formAprenRepo;

	@Override
	public Integer saveFormaAprendizaje(FormaAprendizajeBean formaAprendizajeBean) {
		
		FormaAprendizaje formApre = new FormaAprendizaje();
		
		formApre.setIdFormaAprendizaje(formaAprendizajeBean.getIdFormaAprendizaje());
		formApre.setIdTipoAprendizaje(formaAprendizajeBean.getIdFormaAprendizaje());
		
		this.formAprenRepo.save(formApre);
		
		return formApre.getIdFormaAprendizaje();
	}

	@Override
	public FormaAprendizajeBean findFormaAprendizajeById(Integer idFormaAprendizaje) {
		
		FormaAprendizaje formApre = this.formAprenRepo.findById(idFormaAprendizaje).orElseThrow();
		FormaAprendizajeBean formApreBean = new FormaAprendizajeBean();
		
		BeanUtils.copyProperties(formApre, formApreBean);
		
		return formApreBean;
	}

	@Override
	public boolean updateFormaAprendizaje(FormaAprendizajeBean formaAprendizajeBean) {
		
		FormaAprendizaje formApre = this.formAprenRepo.findById(formaAprendizajeBean.getIdFormaAprendizaje()).orElseThrow();
		
		BeanUtils.copyProperties(formaAprendizajeBean, formApre);
		this.formAprenRepo.save(formApre);
		
		return true;
	}

	@Override
	public boolean deleteFormaAprendizaje(Integer idFormaAprendizaje) {
		
		FormaAprendizaje formApre = this.formAprenRepo.findById(idFormaAprendizaje).orElseThrow();
		this.formAprenRepo.delete(formApre);
		
		return true;
	}

	@Override
	public List<FormaAprendizajeBean> findAllFormaAprendizaje() {
		
		List<FormaAprendizaje> formApreList = this.formAprenRepo.findAll();
		List<FormaAprendizajeBean> formApreBeanList = new ArrayList<>();
		
		for(FormaAprendizaje formApre : formApreList) {
			FormaAprendizajeBean formApreBean = new FormaAprendizajeBean();
			
			BeanUtils.copyProperties(formApre, formApreBean);
			formApreBeanList.add(formApreBean);
		}
		
		return formApreBeanList;
	}

}
