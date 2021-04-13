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

import com.pokemon.bean.PiedraBean;
import com.pokemon.service.PiedraService;

@RestController
@RequestMapping("/piedra")
public class PiedraController {
	
	@Autowired
	private PiedraService piedraService;
	
	@PostMapping("/save")
	public ResponseEntity<Integer> savePiedra(@RequestBody PiedraBean piedraBean){
		return new ResponseEntity<>(this.piedraService.savePiedra(piedraBean), HttpStatus.OK);
	}
	
	@PutMapping("/update")
	public ResponseEntity<Boolean> updatePiedras(@RequestBody PiedraBean piedraBean){
		return new ResponseEntity<>(this.piedraService.updatePiedra(piedraBean), HttpStatus.OK);
	}
	
	@GetMapping("/findById/{idTipoPiedra}")
	public ResponseEntity<PiedraBean> findPiedraById(@PathVariable("idTipoPiedra") Integer idTipoPiedra){
		return new ResponseEntity<>(this.piedraService.findPiedraById(idTipoPiedra), HttpStatus.OK);
	}
	
	@DeleteMapping("/delete/{idTipoPiedra}")
	public ResponseEntity<Boolean> deletePiedra(@PathVariable("idTipoPiedra") Integer idTipoPiedra){
		return new ResponseEntity<>(this.piedraService.deletePiedra(idTipoPiedra), HttpStatus.OK);
	}
	
	@GetMapping("/findAll")
	public ResponseEntity<List<PiedraBean>> findAllPiedras(){
		return new ResponseEntity<>(this.piedraService.findAllPiedras(), HttpStatus.OK);
	}
	
	

}
