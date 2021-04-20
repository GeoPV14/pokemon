package com.pokemon.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pokemon.bean.NivelEvolucionBean;
import com.pokemon.model.NivelEvolucion;
import com.pokemon.repository.NivelEvolucionRepository;
import com.pokemon.service.NivelEvolucionService;

@Service
@Transactional
public class NivelEvolucionServiceImpl implements NivelEvolucionService{

	@Autowired
	private NivelEvolucionRepository nivelEvolRepo;
	
	@Override
	public String saveNivelEvolucion(NivelEvolucionBean nivelEvolucionBean) {
		
		NivelEvolucion nivelEvo = new NivelEvolucion();
		
		nivelEvo.setIdNivelEvol(nivelEvolucionBean.getIdNivelEvol());
		nivelEvo.setNivelEvol(nivelEvolucionBean.getNivelEvol());
		
		this.nivelEvolRepo.save(nivelEvo);
		
		return nivelEvo.getIdNivelEvol();
	}

	@Override
	public boolean updateNivelEvolucion(NivelEvolucionBean nivelEvolucionBean) {
		
		NivelEvolucion nivelEvo = this.nivelEvolRepo.findById(nivelEvolucionBean.getIdNivelEvol()).orElseThrow();
		BeanUtils.copyProperties(nivelEvolucionBean, nivelEvo);
		this.nivelEvolRepo.save(nivelEvo);
		
		return true;
	}

	@Override
	public NivelEvolucionBean findByIdNivelEvolucion(String idNivelEvol) {
		
		NivelEvolucion nivelEvo = this.nivelEvolRepo.findById(idNivelEvol).orElseThrow();
		NivelEvolucionBean nivelEvoBean = new NivelEvolucionBean();
		
		BeanUtils.copyProperties(nivelEvo, nivelEvoBean);
		
		return nivelEvoBean;
	}

	@Override
	public List<NivelEvolucionBean> findAllNivelEvolucion() {
		
		List<NivelEvolucion> nivelEvoList = this.nivelEvolRepo.findAll();
		List<NivelEvolucionBean> nivelEvoBeanList = new ArrayList<>();
		
		for(NivelEvolucion nivelEvo: nivelEvoList) {
			NivelEvolucionBean nivelEvoBean = new NivelEvolucionBean();
			BeanUtils.copyProperties(nivelEvo, nivelEvoBean);
			nivelEvoBeanList.add(nivelEvoBean);
		}
		
		return nivelEvoBeanList;
	}

	@Override
	public boolean deleteNivelEvolucion(String idNivelEvol) {
		
		NivelEvolucion nivelEvo = this.nivelEvolRepo.findById(idNivelEvol).orElseThrow();
		this.nivelEvolRepo.delete(nivelEvo);
		
		return true;
	}

}
