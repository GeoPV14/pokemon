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

import com.pokemon.bean.EfectoSecundarioBean;
import com.pokemon.service.EfectoSecundarioService;

@RestController
@RequestMapping("/efectoSecundario")
public class EfectoSecundarioController {
	
	@Autowired
	private EfectoSecundarioService efectSecServ;
	
	@PostMapping("/save")
	public ResponseEntity<String> saveEfectoSecundario(@RequestBody EfectoSecundarioBean efectoSecundarioBean){
		return new ResponseEntity<>(this.efectSecServ.saveEfectoSecundario(efectoSecundarioBean), HttpStatus.OK);
	}
	
	@PutMapping("/update")
	public ResponseEntity<Boolean> updateEfectoSecundario(@RequestBody EfectoSecundarioBean efectoSecundarioBean){
		return new ResponseEntity<>(this.efectSecServ.updateEfectoSecundario(efectoSecundarioBean), HttpStatus.OK);
	}
	
	@GetMapping("/findEfecSecById/{idEfecSec}")
	public ResponseEntity<EfectoSecundarioBean> findEfecSecById(@PathVariable("idEfecSec") String idEfecSec){
		return new ResponseEntity<>(this.efectSecServ.findEfectoSecundarioById(idEfecSec), HttpStatus.OK);
	}
	
	@GetMapping("/findAll")
	public ResponseEntity<List<EfectoSecundarioBean>> findAllEfecSec(){
		return new ResponseEntity<>(this.efectSecServ.findAllEfectoSecundario(), HttpStatus.OK);
	}
	
	@DeleteMapping("/deleteById/{idEfecSec}")
	public ResponseEntity<Boolean> deleteEfecSec(@PathVariable("idEfecSec") String idEfecSec){
		return new ResponseEntity<>(this.efectSecServ.deleteEfectoSecundario(idEfecSec), HttpStatus.OK);
	}

}
