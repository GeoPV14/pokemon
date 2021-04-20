package com.pokemon.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.pokemon.bean.EfectoSecundarioBean;
import com.pokemon.model.EfectoSecundario;
import com.pokemon.repository.EfectoSecundarioRepository;
import com.pokemon.service.EfectoSecundarioService;

@Service
@Transactional
public class EfectoSecundarioServiceImpl implements EfectoSecundarioService{

	@Autowired
	private EfectoSecundarioRepository efecSecRepo;
	
	@Override
	public String saveEfectoSecundario(EfectoSecundarioBean efectoSecundarioBean) {
		
		EfectoSecundario efecSec = new EfectoSecundario();
		
		efecSec.setIdEfectoSecundario(efectoSecundarioBean.getEfectoSecundario());
		efecSec.setEfectoSecundario(efectoSecundarioBean.getEfectoSecundario());
		
		this.efecSecRepo.save(efecSec);
		
		return efecSec.getIdEfectoSecundario();
	}

	@Override
	public boolean updateEfectoSecundario(EfectoSecundarioBean efectoSecundarioBean) {
		
		EfectoSecundario efecSec = this.efecSecRepo.findById(efectoSecundarioBean.getIdEfectoSecundario()).orElseThrow();
		
		BeanUtils.copyProperties(efectoSecundarioBean, efecSec);
		
		this.efecSecRepo.save(efecSec);
		
		return true;
	}

	@Override
	public EfectoSecundarioBean findEfectoSecundarioById(String idEfectSec) {
		
		EfectoSecundario efecSec = this.efecSecRepo.findById(idEfectSec).orElseThrow();
		EfectoSecundarioBean efecSecBean = new EfectoSecundarioBean();
		
		BeanUtils.copyProperties(efecSec, efecSecBean);		
		
		return efecSecBean;
	}

	@Override
	public List<EfectoSecundarioBean> findAllEfectoSecundario() {
		List<EfectoSecundario> efecSecList = this.efecSecRepo.findAll();
		List<EfectoSecundarioBean> efecSecBeanList = new ArrayList<>();
		
		for(EfectoSecundario efecSec: efecSecList) {
			EfectoSecundarioBean efecSecBean = new EfectoSecundarioBean();
			
			BeanUtils.copyProperties(efecSec, efecSecBean);
			efecSecBeanList.add(efecSecBean);
		}
		
		return efecSecBeanList;
	}

	@Override
	public boolean deleteEfectoSecundario(String idEfectSec) {
		
		EfectoSecundario efecSec = this.efecSecRepo.findById(idEfectSec).orElseThrow();
		this.efecSecRepo.delete(efecSec);
		
		return true;
	}

}
