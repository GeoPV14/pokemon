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

import com.pokemon.bean.MovimientoBean;
import com.pokemon.service.MovimientoService;

@RestController
@RequestMapping("/movimiento")
public class MovimientoController {
	
	@Autowired
	private MovimientoService movimientoService;
	
	@PostMapping("/save")
	public ResponseEntity<Integer> saveMovimiento(@RequestBody MovimientoBean movimientoBean){
		return new ResponseEntity<>(this.movimientoService.saveMovimiento(movimientoBean), HttpStatus.OK);
	}
	
	@PutMapping("/update")
	public ResponseEntity<Boolean> updateMovimiento(@RequestBody MovimientoBean movimientoBean){
		return new ResponseEntity<>(this.movimientoService.updateMovimiento(movimientoBean), HttpStatus.OK);		
	}
	
	@GetMapping("/findById/{idMovimiento}")
	public ResponseEntity<MovimientoBean> findMovimientoById(@PathVariable("idMovimiento") Integer idMovimiento){
		return new ResponseEntity<>(this.movimientoService.findMovimientoById(idMovimiento), HttpStatus.OK);
	}
	
	@DeleteMapping("/delete/{idMovimiento}")
	public ResponseEntity<Boolean> deleteMovimiento(@PathVariable("idMovimiento") Integer idMovimiento){
		return new ResponseEntity<>(this.movimientoService.deleteMovimiento(idMovimiento), HttpStatus.OK);
	}
	
	@GetMapping("/findAll")
	public ResponseEntity<List<MovimientoBean>> findAllMovimiento(){
		return new ResponseEntity<>(this.movimientoService.findAllMovimientos(), HttpStatus.OK);
	}
}
