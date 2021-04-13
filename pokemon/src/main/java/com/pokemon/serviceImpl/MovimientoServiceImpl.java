package com.pokemon.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pokemon.bean.MovimientoBean;
import com.pokemon.model.Movimiento;
import com.pokemon.repository.MovimientoRepository;
import com.pokemon.service.MovimientoService;

@Service
@Transactional
public class MovimientoServiceImpl implements MovimientoService{
	
	@Autowired
	MovimientoRepository movimientoRepo;

	@Override
	public Integer saveMovimiento(MovimientoBean movimientoBean) {
		Movimiento movimiento = new Movimiento();
		
		movimiento.setIdMovimiento(movimientoBean.getIdMovimiento());
		movimiento.setNombre(movimientoBean.getNombre());
		movimiento.setPotencia(movimientoBean.getPotencia());
		movimiento.setPrecisionMov(movimientoBean.getPrecisionMov());
		movimiento.setDescripcion(movimientoBean.getDescripcion());
		movimiento.setPp(movimientoBean.getPp());
		movimiento.setPrioridad(movimientoBean.getPrioridad());
		
		this.movimientoRepo.save(movimiento);
		
		return movimiento.getIdMovimiento();
	}

	@Override
	public MovimientoBean findMovimientoById(Integer idMovimiento) {
		Movimiento movimiento = this.movimientoRepo.findById(idMovimiento).orElseThrow();
		MovimientoBean movimientoBean = new MovimientoBean();
		
		BeanUtils.copyProperties(movimiento, movimientoBean);
		
		return movimientoBean;
	}

	@Override
	public boolean updateMovimiento(MovimientoBean movimientoBean) {
		Movimiento movimiento = this.movimientoRepo.findById(movimientoBean.getIdMovimiento()).orElseThrow();
		
		BeanUtils.copyProperties(movimientoBean, movimiento);
		this.movimientoRepo.save(movimiento);
		
		return true;
		
	}

	@Override
	public boolean deleteMovimiento(Integer idMovimiento) {
		Movimiento movimiento = this.movimientoRepo.findById(idMovimiento).orElseThrow();
		
		this.movimientoRepo.delete(movimiento);
		
		return true;
	}

	@Override
	public List<MovimientoBean> findAllMovimientos() {
		List<Movimiento> movimientoList = this.movimientoRepo.findAll();
		List<MovimientoBean> movimientoBeanList = new ArrayList<>();
		
		for(Movimiento movimiento : movimientoList) {
			MovimientoBean movimientoBean = new MovimientoBean();
			
			BeanUtils.copyProperties(movimiento, movimientoBean);
			movimientoBeanList.add(movimientoBean);
		}
		return movimientoBeanList;
	}

}
