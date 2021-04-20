package com.pokemon.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pokemon.bean.MTBean;
import com.pokemon.model.MT;
import com.pokemon.repository.MTRepository;
import com.pokemon.service.MTService;

@Service
@Transactional
public class MTServiceImpl implements MTService{
	
	@Autowired
	private MTRepository mtRepo;	
	
	@Override
	public String saveMT(MTBean mTBean) {
		
		MT mt = new MT();
		
		mt.setIdMT(mTBean.getIdMT());
		mt.setNombreMT(mTBean.getNombreMT());
		
		this.mtRepo.save(mt);
		
		return mt.getIdMT();
	}

	@Override
	public boolean updateMT(MTBean mTBean) {
		
		MT mt = this.mtRepo.findById(mTBean.getIdMT()).orElseThrow();
		BeanUtils.copyProperties(mTBean, mt);
		this.mtRepo.save(mt);
		
		return true;
	}

	@Override
	public MTBean findByIdMT(String idMT) {
		
		MT mt = this.mtRepo.findById(idMT).orElseThrow();
		MTBean mtBean = new MTBean();
		
		BeanUtils.copyProperties(mt, mtBean);
		
		return mtBean;
	}

	@Override
	public List<MTBean> findAllMT() {
		
		List<MT> mtList = this.mtRepo.findAll();
		List<MTBean> mtBeanList = new ArrayList<>();
		
		for(MT mt: mtList) {
			MTBean mtBean = new MTBean();
			BeanUtils.copyProperties(mt, mtBean);
			mtBeanList.add(mtBean);
		}
		
		return mtBeanList;
	}

	@Override
	public boolean deleteMT(String idMT) {
		
		MT mt = this.mtRepo.findById(idMT).orElseThrow();
		this.mtRepo.delete(mt);
		
		return true;
	}
	
	

}
