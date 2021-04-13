package com.pokemon.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.pokemon.bean.EstadisticasBaseBean;
import com.pokemon.model.EstadisticasBase;
import com.pokemon.repository.EstadisticasBaseRepository;
import com.pokemon.service.EstadisticasBaseService;

@Service
@Transactional
public class EstadisticasBaseServiceImpl implements EstadisticasBaseService{

	@Autowired
	private EstadisticasBaseRepository estadisticasBaseRepo;
	
	@Override
	public boolean saveEstadisticasBase(EstadisticasBaseBean estadisticasBaseBean) {
		EstadisticasBase estadisticasBase = new EstadisticasBase();
		BeanUtils.copyProperties(estadisticasBaseBean, estadisticasBase);
		this.estadisticasBaseRepo.save(estadisticasBase);
		return true;
	}

	@Override
	public EstadisticasBaseBean findIdEstadisticasBase(Integer id) {
		EstadisticasBase estadisticasBase = this.estadisticasBaseRepo.findById(id).orElseThrow();
		EstadisticasBaseBean estadisticasBaseBean = new EstadisticasBaseBean();
		BeanUtils.copyProperties(estadisticasBase, estadisticasBaseBean);
		return estadisticasBaseBean;
	}

	@Override
	public List<EstadisticasBaseBean> findAllEstadisticasBase() {
		List<EstadisticasBase> estadisticasBaseList = this.estadisticasBaseRepo.findAll();
		List<EstadisticasBaseBean> estadisticasBaseBeanList = new ArrayList<>();
		for(EstadisticasBase estadisticasBase : estadisticasBaseList) {
			EstadisticasBaseBean estadisticasBaseBean = new EstadisticasBaseBean();
			BeanUtils.copyProperties(estadisticasBase, estadisticasBaseBean);
			estadisticasBaseBeanList.add(estadisticasBaseBean);
		}
		return estadisticasBaseBeanList;
	}

	@Override
	public boolean updateEstadisticasBase(EstadisticasBaseBean estadisticasBaseBean) {
		EstadisticasBase estadisticasBase = this.estadisticasBaseRepo.findById(estadisticasBaseBean.getNumeroPokedex()).orElseThrow();
		BeanUtils.copyProperties(estadisticasBaseBean, estadisticasBase);
		this.estadisticasBaseRepo.save(estadisticasBase);
		return true;
	}

	@Override
	public boolean delateEstadisticasBase(Integer id) {
		EstadisticasBase estadisticasBase = this.estadisticasBaseRepo.findById(id).orElseThrow();
		this.estadisticasBaseRepo.delete(estadisticasBase);
		return true;
	}

}
