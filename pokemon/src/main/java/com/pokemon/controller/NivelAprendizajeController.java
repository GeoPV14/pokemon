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

import com.pokemon.bean.NivelAprendizajeBean;
import com.pokemon.service.NivelAprendizajeService;

@RestController
@RequestMapping("/nivelAprendizaje")
public class NivelAprendizajeController {

	@Autowired
	private NivelAprendizajeService nivelAprendizajeService;
	
	@PostMapping("/save")
	public ResponseEntity<Integer> saveNivelAprendizaje(@RequestBody NivelAprendizajeBean nivelAprendizajeBean){
		return new ResponseEntity<>(this.nivelAprendizajeService.saveNivelAprendizaje(nivelAprendizajeBean), HttpStatus.OK);
	}
	
	@PutMapping("/update")
	public ResponseEntity<Boolean> updateNivelAprendizaje(@RequestBody NivelAprendizajeBean nivelAprendizajeBean){
		return new ResponseEntity<>(this.nivelAprendizajeService.updateNivelAprendizaje(nivelAprendizajeBean), HttpStatus.OK);
	}
	
	@GetMapping("/findById/{idFormaAprendizaje}")
	public ResponseEntity<NivelAprendizajeBean> findNivelAprendizajeById(@PathVariable("idFormaAprendizaje") Integer idFormaAprendizaje){
		return new ResponseEntity<>(this.nivelAprendizajeService.findNivelAprendizajeById(idFormaAprendizaje), HttpStatus.OK);
	}
	
	@DeleteMapping("/delete/{idFormaAprendizaje}")
	public ResponseEntity<Boolean> deleteNivelAprendizaje(@PathVariable("idFormaAprendizaje") Integer idFormaAprendizaje){
		return new ResponseEntity<>(this.nivelAprendizajeService.deleteTipoAtaque(idFormaAprendizaje), HttpStatus.OK);
	}
	
	@GetMapping("/findAll")
	public ResponseEntity<List<NivelAprendizajeBean>> findAllNivelAprendizaje(){
		return new ResponseEntity<>(this.nivelAprendizajeService.findAllNivelAprendizaje(), HttpStatus.OK);
	}
}
