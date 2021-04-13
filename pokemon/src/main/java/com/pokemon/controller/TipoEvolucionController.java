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

import com.pokemon.bean.TipoEvolucionBean;
import com.pokemon.service.TipoEvolucionService;

@RestController
@RequestMapping("/TipoEvolucion")
public class TipoEvolucionController {
	
	@Autowired
	private TipoEvolucionService tipoEvolucionService;
	
	@PostMapping("/save")
	public ResponseEntity<Boolean> guardarTipoEvolucion(@RequestBody TipoEvolucionBean tipoEvolucionBean){
		return new ResponseEntity<>(this.tipoEvolucionService.saveTipoEvolucion(tipoEvolucionBean), HttpStatus.OK);
	}
	
	@GetMapping("/findById/{id}")
	public ResponseEntity<TipoEvolucionBean> buscarPorIdTipoEvolucion(@PathVariable("id") Integer Id){
		return new ResponseEntity<>(this.tipoEvolucionService.findIdTipoEvolucion(Id), HttpStatus.OK);
	} 
	
	@GetMapping("/findAll")
	public ResponseEntity<List<TipoEvolucionBean>> mostrarTodosTipoEvolucion(){
		return new ResponseEntity<>(this.tipoEvolucionService.findAllTipoEvolucion(), HttpStatus.OK);
	}
	
	@PutMapping("/update")
	public ResponseEntity<Boolean> actualizarTipoEvolucion(@RequestBody TipoEvolucionBean tipoEvolucionBean){
		return new ResponseEntity<>(this.tipoEvolucionService.updateTipoEvolucion(tipoEvolucionBean), HttpStatus.OK);
	}
	
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<Boolean> eliminarTipoEvolucion(@PathVariable("id") Integer id){
		return new ResponseEntity<>(this.tipoEvolucionService.delateTipoEvolucion(id), HttpStatus.OK);
	}

}
