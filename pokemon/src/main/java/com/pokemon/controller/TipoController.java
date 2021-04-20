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

import com.pokemon.bean.TipoBean;
import com.pokemon.service.TipoService;

@RestController
@RequestMapping("/tipo")
public class TipoController {
	
	@Autowired
	private TipoService tiposervice;
	
	@PostMapping("/save")
	public ResponseEntity<String> saveTipo(@RequestBody TipoBean tipoBean){
		return new ResponseEntity<>(this.tiposervice.saveTipo(tipoBean), HttpStatus.OK);
	}
	
	@PutMapping("/update")
	public ResponseEntity<Boolean> updateTipo(@RequestBody TipoBean tipoBean){
		return new ResponseEntity<>(this.tiposervice.updateTipo(tipoBean), HttpStatus.OK);
	}
	
	@GetMapping("/findTipoById/{idTipo}")
	public ResponseEntity<TipoBean> findTipoById(@PathVariable("idTipo") String idTipo){
		return new ResponseEntity<>(this.tiposervice.findTipoById(idTipo), HttpStatus.OK);
	}
	
	@GetMapping("/findAll")
	public ResponseEntity<List<TipoBean>> findAllTipos(@RequestBody TipoBean tipoBean){
		return new ResponseEntity<>(this.tiposervice.findAllTipo(), HttpStatus.OK);
	}
	
	@DeleteMapping("/delete/{idTipo}")
	public ResponseEntity<Boolean> deleteTipo(@PathVariable("idTipo") String idTipo){
		return new ResponseEntity<>(this.tiposervice.deteleTipo(idTipo), HttpStatus.OK);
	}
	

}
