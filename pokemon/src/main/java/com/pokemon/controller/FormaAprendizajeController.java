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

import com.pokemon.bean.FormaAprendizajeBean;
import com.pokemon.service.FormaAprendizajeService;

@RestController
@RequestMapping("/formaAprendizaje")
public class FormaAprendizajeController {
	
	@Autowired
	private FormaAprendizajeService formAprenService;
	
	@PostMapping("/save")
	public ResponseEntity<Integer> saveFormaAprendizaje(@RequestBody FormaAprendizajeBean formaAprendizajeBean){
		return new ResponseEntity<>(this.formAprenService.saveFormaAprendizaje(formaAprendizajeBean), HttpStatus.OK);
	}
	
	@PutMapping("/update")
	public ResponseEntity<Boolean> updateFormaAprendizaje(@RequestBody FormaAprendizajeBean formaAprendizajeBean){
		return new ResponseEntity<>(this.formAprenService.updateFormaAprendizaje(formaAprendizajeBean), HttpStatus.OK);
	}
	
	@GetMapping("/findById/{idFormApre}")
	public ResponseEntity<FormaAprendizajeBean> findFormaAprendizajeById(@PathVariable("idFormApre") Integer idFormApre){
		return new ResponseEntity<>(this.formAprenService.findFormaAprendizajeById(idFormApre), HttpStatus.OK);
	}
	
	@GetMapping("/findAll")
	public ResponseEntity<List<FormaAprendizajeBean>> findAllFormaAprendizaje(){
		return new ResponseEntity<>(this.formAprenService.findAllFormaAprendizaje(), HttpStatus.OK);
	}
	
	@DeleteMapping("/delete/{idFormApre}")
	public ResponseEntity<Boolean> deleteFormaAprendizajeById(@PathVariable("idFormApre") Integer idFormApre){
		return new ResponseEntity<>(this.formAprenService.deleteFormaAprendizaje(idFormApre), HttpStatus.OK);
	}

}
