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

import com.pokemon.bean.TipoFormaAprendizajeBean;
import com.pokemon.service.TipoFormaAprendizajeService;

@RestController
@RequestMapping("/tipoFormaA")
public class TipoFormaAprendizajeController {
	
	@Autowired
	private TipoFormaAprendizajeService tipoFormaApService;
	
	@PostMapping("/save")
	public ResponseEntity<Integer> saveTipoFormaA(@RequestBody TipoFormaAprendizajeBean tipoFormaAprendizajeBean){
		return new ResponseEntity<>(this.tipoFormaApService.savePokemonPiedra(tipoFormaAprendizajeBean), HttpStatus.OK);
	}
	
	@PutMapping("/update")
	public ResponseEntity<Boolean> updateTipoFormaA(@RequestBody TipoFormaAprendizajeBean tipoFormaAprendizajeBean){
		return new ResponseEntity<>(this.tipoFormaApService.updateTipoFormaAprendiza(tipoFormaAprendizajeBean), HttpStatus.OK);
	}
	
	@GetMapping("/findById/{idTipoAprendizaje}")
	public ResponseEntity<TipoFormaAprendizajeBean> findTipoFormaAById(@PathVariable("idTipoAprendizaje") Integer idTipoAprendizaje){
		return new ResponseEntity<>(this.tipoFormaApService.findTipoFormaAprendizajeById(idTipoAprendizaje), HttpStatus.OK);
	}
	
	@DeleteMapping("/delete/{idTipoAprendizaje}")
	public ResponseEntity<Boolean> deleteTipoFormaA(@PathVariable("idTipoAprendizaje") Integer idTipoAprendizaje){
		return new ResponseEntity<>(this.tipoFormaApService.deleteTipoFormaAprendizaje(idTipoAprendizaje), HttpStatus.OK);
	}
	
	@GetMapping("/findAll")
	public ResponseEntity<List<TipoFormaAprendizajeBean>> findAllTipoFormaA(){
		return new ResponseEntity<>(this.tipoFormaApService.findAllTipoFormaAprendizaje(), HttpStatus.OK);
	}

}
