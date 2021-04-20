package com.pokemon.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pokemon.bean.MOBean;
import com.pokemon.model.MO;
import com.pokemon.repository.MORepository;
import com.pokemon.service.MOService;

@Service
@Transactional
public class MOServiceImpl implements MOService{

	@Autowired
	private MORepository moRepo;
	
	@Override
	public String saveMO(MOBean mOBean) {
		
		MO mo = new MO();
		
		mo.setIdMO(mOBean.getIdMO());
		mo.setMO(mOBean.getIdMO());
		
		this.moRepo.save(mo);
		
		return mo.getIdMO();
	}

	@Override
	public boolean updateMO(MOBean moBean) {
		
		MO mo = this.moRepo.findById(moBean.getIdMO()).orElseThrow();
		BeanUtils.copyProperties(moBean, mo);
		this.moRepo.save(mo);
		
		return true;
	}

	@Override
	public MOBean findByIdMO(String idMO) {
		
		MO mo = this.moRepo.findById(idMO).orElseThrow();
		MOBean moBean = new MOBean();
		BeanUtils.copyProperties(mo, moBean);
		
		return moBean;
	}

	@Override
	public List<MOBean> findAllMO() {
		List<MO> moList = this.moRepo.findAll();
		List<MOBean> moBeanList = new ArrayList<>();
		
		for(MO mo: moList) {
			MOBean moBean = new MOBean();
			BeanUtils.copyProperties(mo, moBean);
			moBeanList.add(moBean);
		}
		
		return moBeanList;
	}

	@Override
	public boolean deleteMO(String idMO) {
		
		MO mo = this.moRepo.findById(idMO).orElseThrow();
		this.moRepo.delete(mo);
		
		return true;
	}
	

}
