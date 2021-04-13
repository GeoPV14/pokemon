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

import com.pokemon.bean.MovimientoEfectoSecundarioBean;
import com.pokemon.service.MovimientoEfectoSecundarioService;

@RestController
@RequestMapping("/MovimientoEfectoSecundario")
public class MovimientoEfectoSecundarioController {

	@Autowired
	private MovimientoEfectoSecundarioService movimientoEfectoSecundarioService;
	
	@PostMapping("/save")
	public ResponseEntity<Boolean> guardarMovimientoEfectoSecundario(@RequestBody MovimientoEfectoSecundarioBean movimientoEfectoSecundarioBean){
		return new ResponseEntity<>(this.movimientoEfectoSecundarioService.saveMovimientoEfectoSecundario(movimientoEfectoSecundarioBean), HttpStatus.OK);
	}
	
	@GetMapping("/findById/{id}")
	public ResponseEntity<MovimientoEfectoSecundarioBean> mostrarMovimientoEfectoSecundarioPorId(@PathVariable("id") Integer id){
		return new ResponseEntity<>(this.movimientoEfectoSecundarioService.findIdMovimientoEfectoSecundario(id), HttpStatus.OK);
	}
	
	@GetMapping("/findAll")
	public ResponseEntity<List<MovimientoEfectoSecundarioBean>> mostrarTodosMovimientoEfectoSecundario(){
		return new ResponseEntity<>(this.movimientoEfectoSecundarioService.findAllMovimientoEfectoSecundario(), HttpStatus.OK);
	}
	
	@PutMapping("/update")
	public ResponseEntity<Boolean> actualizarMovimientoEfectoSecundario(@RequestBody MovimientoEfectoSecundarioBean movimientoEfectoSecundarioBean){
		return new ResponseEntity<>(this.movimientoEfectoSecundarioService.updateMovimientoEfectoSecundario(movimientoEfectoSecundarioBean), HttpStatus.OK);
	}
	
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<Boolean> eliminarMovimientoEfectoSecundario(@PathVariable("id") Integer id){
		return new ResponseEntity<>(this.movimientoEfectoSecundarioService.delateMovimientoEfectoSecundario(id), HttpStatus.OK);
	}
}
