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

import com.pokemon.bean.TipoPiedraBean;
import com.pokemon.service.TipoPiedraService;

@RestController
@RequestMapping("/tipoPiedra")
public class TipoPiedraController {
	
	@Autowired
	private TipoPiedraService tipoPiedraService;
	
	@PostMapping("/save")
	public ResponseEntity<Integer> saveTipoPiedra(@RequestBody TipoPiedraBean tipoPiedraBean){
		return new ResponseEntity<>(this.tipoPiedraService.saveTipoPiedra(tipoPiedraBean), HttpStatus.OK);
	}
	
	@PutMapping("/update")
	public ResponseEntity<Boolean> updateTipoPiedra(@RequestBody TipoPiedraBean tipoPiedraBean){
		return new ResponseEntity<>(this.tipoPiedraService.updateTipoPiedra(tipoPiedraBean), HttpStatus.OK);
	}
	
	@GetMapping("/findById/{idTipoPiedra}")
	public ResponseEntity<TipoPiedraBean> findTipoPiedraById(@PathVariable("idTipoPiedra") Integer idTipoPiedra){
		return new ResponseEntity<>(this.tipoPiedraService.findTipoPiedraById(idTipoPiedra), HttpStatus.OK);
	}
	
	@DeleteMapping("/delete/{idTipoPiedra}")
	public ResponseEntity<Boolean> deleteTipoPiedra(@PathVariable("idTipoPiedra") Integer idTipoPiedra){
		return new ResponseEntity<>(this.tipoPiedraService.deleteTipoPiedra(idTipoPiedra), HttpStatus.OK);
	}
	
	@GetMapping("/findAll")
	public ResponseEntity<List<TipoPiedraBean>> findAllTipoPiedra(){
		return new ResponseEntity<>(this.tipoPiedraService.findAllTipoPiedra(), HttpStatus.OK);
	}

}
