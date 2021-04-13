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

import com.pokemon.bean.TipoAtaqueBean;
import com.pokemon.service.TipoAtaqueService;

@RestController
@RequestMapping("/tipoAtaque")
public class TipoAtaqueController {
	
	@Autowired
	private TipoAtaqueService tipoAtaqueService;
	
	@PostMapping("/save")
	public ResponseEntity<Integer> saveTipoAtaque(@RequestBody TipoAtaqueBean tipoAtaqueBean){
		return new ResponseEntity<>(this.tipoAtaqueService.saveTipoAtaque(tipoAtaqueBean), HttpStatus.OK);
	}
	
	@PutMapping("/update")
	public ResponseEntity<Boolean> updateTipoAtaque(@RequestBody TipoAtaqueBean tipoAtaqueBean){
		return new ResponseEntity<>(this.tipoAtaqueService.updateTipoAtaque(tipoAtaqueBean), HttpStatus.OK);
	}
	
	@GetMapping("/findById/{idTipoAtaque}")
	public ResponseEntity<TipoAtaqueBean> findTipoAtaqueById(@PathVariable("idTipoAtaque") Integer idTipoAtaque){
		return new ResponseEntity<>(this.tipoAtaqueService.findTipoAtaqueById(idTipoAtaque), HttpStatus.OK);
	}
	
	@DeleteMapping("/delete/{idTipoAtaque}")
	public ResponseEntity<Boolean> deleteTipoAtaque(@PathVariable("idTipoAtaque") Integer idTipoAtaque){
		return new ResponseEntity<>(this.tipoAtaqueService.deleteTipoAtaque(idTipoAtaque), HttpStatus.OK);
	}
	
	@GetMapping("/findAll")
	public ResponseEntity<List<TipoAtaqueBean>> findAllTipoAtaque(){
		return new ResponseEntity<>(this.tipoAtaqueService.findAllTipoAtaque(), HttpStatus.OK);
	}

}
