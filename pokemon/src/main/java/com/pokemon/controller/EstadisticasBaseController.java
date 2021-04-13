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

import com.pokemon.bean.EstadisticasBaseBean;
import com.pokemon.service.EstadisticasBaseService;

@RestController
@RequestMapping("/EstadisticasBase")
public class EstadisticasBaseController {
	
	@Autowired
	private EstadisticasBaseService estadisticasBaseService;
	
	@PostMapping("/save")
	public ResponseEntity<Boolean> guardarEstadisticasBase(@RequestBody EstadisticasBaseBean estadisticasBaseBean){
		return new ResponseEntity<>(this.estadisticasBaseService.saveEstadisticasBase(estadisticasBaseBean), HttpStatus.OK);
	}
	
	@GetMapping("/findById/{id}")
	public ResponseEntity<EstadisticasBaseBean> buscarEstadisticasBaseId(@PathVariable("id") Integer id){
		return new ResponseEntity<>(this.estadisticasBaseService.findIdEstadisticasBase(id), HttpStatus.OK);
	}
	
	@GetMapping("/findAll")
	public ResponseEntity<List<EstadisticasBaseBean>> mostrarTodasEstadisticasBase(){
		return new ResponseEntity<>(this.estadisticasBaseService.findAllEstadisticasBase(),HttpStatus.OK);
	}
	
	@PutMapping("/update")
	public ResponseEntity<Boolean> actualizarEstadisticasBase(@RequestBody EstadisticasBaseBean estadisticasBaseBean){
		return new ResponseEntity<>(this.estadisticasBaseService.updateEstadisticasBase(estadisticasBaseBean), HttpStatus.OK);
	}
	
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<Boolean> eliminarEstadisticasBase(@PathVariable("id") Integer id){
		return new ResponseEntity<>(this.estadisticasBaseService.delateEstadisticasBase(id), HttpStatus.OK);
	}

}
