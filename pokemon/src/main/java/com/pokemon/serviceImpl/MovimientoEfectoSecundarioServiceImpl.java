package com.pokemon.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.pokemon.bean.MovimientoEfectoSecundarioBean;
import com.pokemon.model.MovimientoEfectoSecundario;
import com.pokemon.repository.MovimientoEfectoSecundarioRepository;
import com.pokemon.service.MovimientoEfectoSecundarioService;

@Service
@Transactional
public class MovimientoEfectoSecundarioServiceImpl implements MovimientoEfectoSecundarioService{

	@Autowired
	private MovimientoEfectoSecundarioRepository movimientoEfectoSecundarioRepo;
	
	@Override
	public boolean saveMovimientoEfectoSecundario(MovimientoEfectoSecundarioBean movimientoEfectoSecundarioBean) {
		MovimientoEfectoSecundario movimientoEfectoSecundario = new MovimientoEfectoSecundario();
		BeanUtils.copyProperties(movimientoEfectoSecundarioBean, movimientoEfectoSecundario);
		this.movimientoEfectoSecundarioRepo.save(movimientoEfectoSecundario);
		return true;
	}

	@Override
	public MovimientoEfectoSecundarioBean findIdMovimientoEfectoSecundario(Integer id) {
		MovimientoEfectoSecundario movimientoEfectoSecundario = this.movimientoEfectoSecundarioRepo.findById(id).orElseThrow();
		MovimientoEfectoSecundarioBean movimientoEfectoSecundarioBean = new MovimientoEfectoSecundarioBean();
		BeanUtils.copyProperties(movimientoEfectoSecundario, movimientoEfectoSecundarioBean);
		return movimientoEfectoSecundarioBean;
	}

	@Override
	public List<MovimientoEfectoSecundarioBean> findAllMovimientoEfectoSecundario() {
		List<MovimientoEfectoSecundario> movimientoEfectoSecundarioList = this.movimientoEfectoSecundarioRepo.findAll();
		List<MovimientoEfectoSecundarioBean> movimientoEfectoSecundarioBeanList = new ArrayList<>();
		for(MovimientoEfectoSecundario movimientoEfectoSecundario : movimientoEfectoSecundarioList) {
			MovimientoEfectoSecundarioBean movimientoEfectoSecundarioBean = new MovimientoEfectoSecundarioBean();
			BeanUtils.copyProperties(movimientoEfectoSecundario, movimientoEfectoSecundarioBean);
			movimientoEfectoSecundarioBeanList.add(movimientoEfectoSecundarioBean);
		}
		return movimientoEfectoSecundarioBeanList;
	}

	@Override
	public boolean updateMovimientoEfectoSecundario(MovimientoEfectoSecundarioBean movimientoEfectoSecundarioBean) {
		MovimientoEfectoSecundario movimientoEfectoSecundario = this.movimientoEfectoSecundarioRepo.findById(movimientoEfectoSecundarioBean.getIdMovimiento()).orElseThrow();
		BeanUtils.copyProperties(movimientoEfectoSecundarioBean, movimientoEfectoSecundario);
		this.movimientoEfectoSecundarioRepo.save(movimientoEfectoSecundario);
		return true;
	}

	@Override
	public boolean delateMovimientoEfectoSecundario(Integer id) {
		MovimientoEfectoSecundario movimientoEfectoSecundario = this.movimientoEfectoSecundarioRepo.findById(id).orElseThrow();
		this.movimientoEfectoSecundarioRepo.delete(movimientoEfectoSecundario);
		return true;
	}

}
