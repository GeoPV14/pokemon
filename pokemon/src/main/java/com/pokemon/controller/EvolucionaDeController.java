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

import com.pokemon.bean.EvolucionaDeBean;
import com.pokemon.service.EvolucionaDeService;

@RestController
@RequestMapping("/EvolucionaDe")
public class EvolucionaDeController {
	
	@Autowired
	private EvolucionaDeService evolucionaDeService;
	
	@PostMapping("/save")
	public ResponseEntity<Boolean> guardarEvolucionaDe(@RequestBody EvolucionaDeBean evolucionaDeBean){
		return new ResponseEntity<>(this.evolucionaDeService.saveEvolucionaDe(evolucionaDeBean), HttpStatus.OK);
	}
	
	@GetMapping("/findById/{id}")
	public ResponseEntity<EvolucionaDeBean> mostrarEvolucionaDePorId(@PathVariable("id") Integer id){
		return new ResponseEntity<>(this.evolucionaDeService.findIdEvolucionaDe(id), HttpStatus.OK);
	}
	
	@GetMapping("/findAll")
	public ResponseEntity<List<EvolucionaDeBean>> mostrarTodosEvolucionaDe(){
		return new ResponseEntity<>(this.evolucionaDeService.findAllEvolucionaDe(), HttpStatus.OK);
	}
	
	@PutMapping("/update")
	public ResponseEntity<Boolean> actualizarEvolucionaDe(@RequestBody EvolucionaDeBean evolucionaDeBean){
		return new ResponseEntity<>(this.evolucionaDeService.updateEvolucionaDe(evolucionaDeBean), HttpStatus.OK);
	}
	
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<Boolean> eliminarEvolucionaDe(@PathVariable("id") Integer id){
		return new ResponseEntity<>(this.evolucionaDeService.delateEvolucionaDe(id), HttpStatus.OK);
	}
}
