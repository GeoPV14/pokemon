package com.pokemon.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pokemon.bean.TipoBean;
import com.pokemon.model.Tipo;
import com.pokemon.repository.TipoRepository;
import com.pokemon.service.TipoService;

@Service
@Transactional
public class TipoServiceImpl implements TipoService{
	
	@Autowired
	private TipoRepository tipoRepo;

	@Override
	public String saveTipo(TipoBean tipoBean) {
		
		Tipo tipo = new Tipo();
		
		tipo.setIdTipo(tipoBean.getIdTipo());
		tipo.setNombreTipo(tipoBean.getNombreTipo());
		
		this.tipoRepo.save(tipo);
		
		return tipo.getIdTipo();
	}

	@Override
	public boolean updateTipo(TipoBean tipoBean) {
		
		Tipo tipo = this.tipoRepo.findById(tipoBean.getIdTipo()).orElseThrow();		
		BeanUtils.copyProperties(tipoBean, tipo);
		this.tipoRepo.save(tipo);
				
		return true;
	}

	@Override
	public TipoBean findTipoById(String idTipo) {
		
		Tipo tipo = this.tipoRepo.findById(idTipo).orElseThrow();
		TipoBean tipoBean = new TipoBean();
		
		BeanUtils.copyProperties(tipo, tipoBean);
		
		return tipoBean;
	}

	@Override
	public List<TipoBean> findAllTipo() {
		List<Tipo> tipoList = this.tipoRepo.findAll();
		List<TipoBean> tipoBeanList = new ArrayList<>();
		
		for(Tipo tipo: tipoList) {
			TipoBean tipoBean = new TipoBean();
			
			BeanUtils.copyProperties(tipo, tipoBean);
			tipoBeanList.add(tipoBean);
		}
		
		return tipoBeanList;
	}

	@Override
	public boolean deteleTipo(String idTipo) {
		
		Tipo tipo = this.tipoRepo.findById(idTipo).orElseThrow();
		this.tipoRepo.delete(tipo);
		
		return true;
	}
	

}
