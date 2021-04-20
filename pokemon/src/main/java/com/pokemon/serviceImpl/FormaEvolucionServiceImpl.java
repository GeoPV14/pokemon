package com.pokemon.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.pokemon.bean.FormaEvolucionBean;
import com.pokemon.model.FormaEvolucion;
import com.pokemon.repository.FormaEvolucionRepository;
import com.pokemon.service.FormaEvolucionService;

@Service
@Transactional
public class FormaEvolucionServiceImpl implements FormaEvolucionService{
	
	@Autowired
	private FormaEvolucionRepository FormEvoRepo;

	@Override
	public String saveFormaEvolucion(FormaEvolucionBean formaEvolucionBean) {
		
		FormaEvolucion formEvol = new FormaEvolucion();
		
		formEvol.setIdFormaEvol(formaEvolucionBean.getIdFormaEvol());
		formEvol.setTipoEvol(formaEvolucionBean.getTipoEvol());
		
		this.FormEvoRepo.save(formEvol);
		
		return formEvol.getIdFormaEvol();
	}

	@Override
	public boolean updateFormaEvolucion(FormaEvolucionBean formaEvolucionBean) {
		
		FormaEvolucion formEvol = this.FormEvoRepo.findById(formaEvolucionBean.getIdFormaEvol()).orElseThrow();
		
		BeanUtils.copyProperties(formaEvolucionBean, formEvol);
		
		this.FormEvoRepo.save(formEvol);
		
		return true;
	}

	@Override
	public FormaEvolucionBean findByIdFormaEvolucion(String idFormEvol) {
		
		FormaEvolucion formEvol = this.FormEvoRepo.findById(idFormEvol).orElseThrow();
		FormaEvolucionBean formEvolBean = new FormaEvolucionBean();
		
		BeanUtils.copyProperties(formEvol, formEvolBean);
		
		return formEvolBean;
	}

	@Override
	public List<FormaEvolucionBean> findAllFormaEvolucion() {
		
		List<FormaEvolucion> formEvolList = this.FormEvoRepo.findAll();
		List<FormaEvolucionBean> formEvolBeanList = new ArrayList<>();
		
		for(FormaEvolucion formEvol: formEvolList) {
			FormaEvolucionBean formEvolBean = new FormaEvolucionBean();
			BeanUtils.copyProperties(formEvol, formEvolBean);
			formEvolBeanList.add(formEvolBean);
		}
		
		return formEvolBeanList;
	}

	@Override
	public boolean deleteFormaEvolucion(String idFormEvol) {
		
		FormaEvolucion formEvol = this.FormEvoRepo.findById(idFormEvol).orElseThrow();
		this.FormEvoRepo.delete(formEvol);
		
		return true;
	}

}
