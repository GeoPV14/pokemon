package com.pokemon.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pokemon.bean.MOBean;
import com.pokemon.service.MOService;

@RestController
@RequestMapping("/MO")
public class MOController {
	
	@Autowired
	private MOService moService;
	
	@PostMapping("/save")
	public ResponseEntity<String> saveMO(@RequestBody MOBean mOBean){
		return new ResponseEntity<>(this.moService.saveMO(mOBean), HttpStatus.OK);
	}
	
	@PutMapping("/update")
	public ResponseEntity<Boolean> updateMO(@RequestBody MOBean mOBean){
		return new ResponseEntity<>(this.moService.updateMO(mOBean), HttpStatus.OK);
	}
	
	@GetMapping("/findById/{idMO}")
	public ResponseEntity<MOBean> findMOById(@PathVariable("idMO") String idMO){
		return new ResponseEntity<>(this.moService.findByIdMO(idMO), HttpStatus.OK);
	}
	
	@GetMapping("/findAll")
	public ResponseEntity<List<MOBean>> findAllMO(@RequestBody MOBean mOBean){
		return new ResponseEntity<>(this.moService.findAllMO(), HttpStatus.OK);
	}
	
	@DeleteMapping("/delete/{idMO}")
	public ResponseEntity<Boolean> deleteMO(@PathVariable("idMO") String idMO){
		return new ResponseEntity<>(this.moService.deleteMO(idMO), HttpStatus.OK);
	}

}
