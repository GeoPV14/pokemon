package com.pokemon.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.pokemon.bean.EvolucionaDeBean;
import com.pokemon.model.EvolucionaDe;
import com.pokemon.repository.EvolucionaDeRepository;
import com.pokemon.service.EvolucionaDeService;

@Service
@Transactional
public class EvolucionaDeServiceImpl implements EvolucionaDeService{

	@Autowired
	private EvolucionaDeRepository evolucionaDeRepo;
	
	@Override
	public boolean saveEvolucionaDe(EvolucionaDeBean evolucionaDeBean) {
		EvolucionaDe evolucionaDe = new EvolucionaDe();
		BeanUtils.copyProperties(evolucionaDeBean, evolucionaDe);
		evolucionaDeRepo.save(evolucionaDe);
		return true;
	}

	@Override
	public EvolucionaDeBean findIdEvolucionaDe(Integer id) {
		EvolucionaDeBean evolucionaDeBean = new EvolucionaDeBean();
		EvolucionaDe evolucionaDe = this.evolucionaDeRepo.findById(id).orElseThrow();
		BeanUtils.copyProperties(evolucionaDe, evolucionaDeBean);
		return evolucionaDeBean;
	}

	@Override
	public List<EvolucionaDeBean> findAllEvolucionaDe() {
		List<EvolucionaDe> evolucionaDeList = this.evolucionaDeRepo.findAll();
		List<EvolucionaDeBean> evolucionaDeBeanList = new ArrayList<>();
		for(EvolucionaDe evolucionaDe : evolucionaDeList){
			EvolucionaDeBean evolucionaDeBean = new EvolucionaDeBean();
			BeanUtils.copyProperties(evolucionaDe, evolucionaDeBean);
			evolucionaDeBeanList.add(evolucionaDeBean);
		}
		return evolucionaDeBeanList;
	}

	@Override
	public boolean updateEvolucionaDe(EvolucionaDeBean evolucionaDeBean) {
		EvolucionaDe evolucionaDe = this.evolucionaDeRepo.findById(evolucionaDeBean.getPokemonEvolucionado()).orElseThrow();
		BeanUtils.copyProperties(evolucionaDeBean, evolucionaDe);
		this.evolucionaDeRepo.save(evolucionaDe);
		return true;
	}

	@Override
	public boolean delateEvolucionaDe(Integer id) {
		EvolucionaDe evolucionaDe = this.evolucionaDeRepo.findById(id).orElseThrow();
		this.evolucionaDeRepo.delete(evolucionaDe);
		return true;
	}

}
