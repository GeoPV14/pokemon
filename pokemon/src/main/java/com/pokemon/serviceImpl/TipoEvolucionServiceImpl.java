package com.pokemon.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.pokemon.bean.TipoEvolucionBean;
import com.pokemon.model.TipoEvolucion;
import com.pokemon.repository.TipoEvolucionRepository;
import com.pokemon.service.TipoEvolucionService;

@Service
@Transactional
public class TipoEvolucionServiceImpl implements TipoEvolucionService{
	
	@Autowired
	private TipoEvolucionRepository tipoEvolucionRepo;

	@Override
	public boolean saveTipoEvolucion(TipoEvolucionBean tipoEvolucionBean) {
		TipoEvolucion tipoEvolucion = new TipoEvolucion();
		BeanUtils.copyProperties(tipoEvolucionBean, tipoEvolucion);
		this.tipoEvolucionRepo.save(tipoEvolucion);
		return true;
	}

	@Override
	public TipoEvolucionBean findIdTipoEvolucion(Integer id) {
		TipoEvolucion tipoEvolucion = this.tipoEvolucionRepo.findById(id).orElseThrow();
		TipoEvolucionBean tipoEvolucionBean = new TipoEvolucionBean();
		BeanUtils.copyProperties(tipoEvolucion, tipoEvolucionBean);
		return tipoEvolucionBean;
	}

	@Override
	public List<TipoEvolucionBean> findAllTipoEvolucion() {
		List<TipoEvolucion> tipoEvolucionList = this.tipoEvolucionRepo.findAll();
		List<TipoEvolucionBean> tipoEvolucionBeanList = new ArrayList<>();
		for(TipoEvolucion tipoEvolucion : tipoEvolucionList) {
			TipoEvolucionBean tipoEvolucionBean = new TipoEvolucionBean();
			BeanUtils.copyProperties(tipoEvolucion, tipoEvolucionBean);
			tipoEvolucionBeanList.add(tipoEvolucionBean);
		}
		return tipoEvolucionBeanList;
	}

	@Override
	public boolean updateTipoEvolucion(TipoEvolucionBean tipoEvolucionBean) {
		TipoEvolucion tipoEvolucion = this.tipoEvolucionRepo.findById(tipoEvolucionBean.getIdTipoEvolucion()).orElseThrow();
		BeanUtils.copyProperties(tipoEvolucionBean, tipoEvolucion);
		this.tipoEvolucionRepo.save(tipoEvolucion);
		return true;
	}

	@Override
	public boolean delateTipoEvolucion(Integer id) {
		TipoEvolucion tipoEvolucion = this.tipoEvolucionRepo.findById(id).orElseThrow();
		this.tipoEvolucionRepo.delete(tipoEvolucion);
		return true;
	}

}
