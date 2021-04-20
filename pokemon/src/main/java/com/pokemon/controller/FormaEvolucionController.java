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

import com.pokemon.bean.FormaEvolucionBean;
import com.pokemon.service.FormaEvolucionService;

@RestController
@RequestMapping("/formEvol")
public class FormaEvolucionController {
	
	@Autowired
	private FormaEvolucionService formEvolServ;
	
	@PostMapping("/save")
	public ResponseEntity<String> saveFormaEvolucion(@RequestBody FormaEvolucionBean formaEvolucionBean){
		return new ResponseEntity<>(this.formEvolServ.saveFormaEvolucion(formaEvolucionBean), HttpStatus.OK);
	}
	
	@PutMapping("/update")
	public ResponseEntity<Boolean> updateFormaEvolucion(@RequestBody FormaEvolucionBean formaEvolucionBean){
		return new ResponseEntity<>(this.formEvolServ.updateFormaEvolucion(formaEvolucionBean), HttpStatus.OK);
	}
	
	@GetMapping("/findFormaEvolById/{idFormEvol}")
	public ResponseEntity<FormaEvolucionBean> findFormaEvolById(@PathVariable("idFormEvol") String idFormEvol){
		return new ResponseEntity<>(this.formEvolServ.findByIdFormaEvolucion(idFormEvol), HttpStatus.OK);
	}
	
	@GetMapping("/findAll")
	public ResponseEntity<List<FormaEvolucionBean>> findAllFormaEvol(){
		return new ResponseEntity<>(this.formEvolServ.findAllFormaEvolucion(), HttpStatus.OK);
	}
	
	@DeleteMapping("/deleteById/{idFormEvol}")
	public ResponseEntity<Boolean> deleteFormEvolById(@PathVariable("idFormEvol") String idFormEvol){
		return new ResponseEntity<>(this.formEvolServ.deleteFormaEvolucion(idFormEvol), HttpStatus.OK);
	}

}
