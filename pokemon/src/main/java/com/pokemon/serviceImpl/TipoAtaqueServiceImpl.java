package com.pokemon.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pokemon.bean.TipoAtaqueBean;
import com.pokemon.model.TipoAtaque;
import com.pokemon.repository.TipoAtaqueRepository;
import com.pokemon.service.TipoAtaqueService;

@Service
@Transactional
public class TipoAtaqueServiceImpl implements TipoAtaqueService{
	
	@Autowired
	TipoAtaqueRepository tipoAtaqueRepo;

	@Override
	public Integer saveTipoAtaque(TipoAtaqueBean tipoAtaqueBean) {
		TipoAtaque tipoAtaque = new TipoAtaque();
		
		tipoAtaque.setIdTipoAtaque(tipoAtaqueBean.getIdTipoAtaque());
		tipoAtaque.setTipo(tipoAtaqueBean.getTipo());
		
		this.tipoAtaqueRepo.save(tipoAtaque);
		
		return tipoAtaque.getIdTipoAtaque();
	}

	@Override
	public TipoAtaqueBean findTipoAtaqueById(Integer idTipoAtaque) {
		TipoAtaque tipoAtaque = this.tipoAtaqueRepo.findById(idTipoAtaque).orElseThrow();
		TipoAtaqueBean tipoAtaqueBean = new TipoAtaqueBean();
		
		BeanUtils.copyProperties(tipoAtaque, tipoAtaqueBean);
		
		return tipoAtaqueBean;
	}

	@Override
	public boolean updateTipoAtaque(TipoAtaqueBean tipoAtaqueBean) {
		TipoAtaque tipoAtaque = this.tipoAtaqueRepo.findById(tipoAtaqueBean.getIdTipoAtaque()).orElseThrow();
		
		BeanUtils.copyProperties(tipoAtaqueBean, tipoAtaque);
		
		this.tipoAtaqueRepo.save(tipoAtaque);
		
		return true;
	}

	@Override
	public boolean deleteTipoAtaque(Integer idTipoAtaque) {
		TipoAtaque tipoAtaque = this.tipoAtaqueRepo.findById(idTipoAtaque).orElseThrow();
		
		this.tipoAtaqueRepo.delete(tipoAtaque);
		
		return true;
	}

	@Override
	public List<TipoAtaqueBean> findAllTipoAtaque() {
		List<TipoAtaque> tipoAtaqueList = this.tipoAtaqueRepo.findAll();
		List<TipoAtaqueBean> tipoAtaqueBeanList = new ArrayList<>();
		
		for(TipoAtaque tipoAtaque : tipoAtaqueList) {
			TipoAtaqueBean tipoAtaqueBean = new TipoAtaqueBean();
			
			BeanUtils.copyProperties(tipoAtaque, tipoAtaqueBean);
			tipoAtaqueBeanList.add(tipoAtaqueBean);
		}
		return tipoAtaqueBeanList;
	}

}
