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

import com.pokemon.bean.NivelEvolucionBean;
import com.pokemon.service.NivelEvolucionService;

@RestController
@RequestMapping("/nivelEvolucion")
public class NivelEvolucionController {
	
	@Autowired
	private NivelEvolucionService nivelEvoService;
	
	@PostMapping("/save")
	public ResponseEntity<String> saveNivelEvolucion(@RequestBody NivelEvolucionBean nivelEvolucionBean){
		return new ResponseEntity<>(this.nivelEvoService.saveNivelEvolucion(nivelEvolucionBean), HttpStatus.OK);
	}
	
	@PutMapping("/update")
	public ResponseEntity<Boolean> updateNivelEvolucion(@RequestBody NivelEvolucionBean nivelEvolucionBean){
		return new ResponseEntity<>(this.nivelEvoService.updateNivelEvolucion(nivelEvolucionBean), HttpStatus.OK);
	}
	
	@GetMapping("/findById/{idNivelEvo}")
	public ResponseEntity<NivelEvolucionBean> findNivelEvolucionById(@PathVariable("idNivelEvo") String idNivelEvo){
		return new ResponseEntity<>(this.nivelEvoService.findByIdNivelEvolucion(idNivelEvo), HttpStatus.OK);
	}
	
	@GetMapping("/findAll")
	public ResponseEntity<List<NivelEvolucionBean>> findAllNivelEvolucion(@RequestBody NivelEvolucionBean nivelEvolucionBean){
		return new ResponseEntity<>(this.nivelEvoService.findAllNivelEvolucion(), HttpStatus.OK);
	}
	
	@DeleteMapping("/delete/{idNivelEvo}")
	public ResponseEntity<Boolean> deleteNivelEvolucion(@PathVariable("idNivelEvo") String isNivelEvo){
		return new ResponseEntity<>(this.nivelEvoService.deleteNivelEvolucion(isNivelEvo), HttpStatus.OK);
	}

}
