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

import com.pokemon.bean.PokemonFormaEvolucionBean;
import com.pokemon.service.PokemonFormaEvolucionService;

@RestController
@RequestMapping("PokemonFormaEvolucion")
public class PokemonFormaEvolucionController {
	
	@Autowired
	private PokemonFormaEvolucionService pokemonFormaEvolucionService;
	
	@PostMapping("/save")
	public ResponseEntity<Boolean> guardarPokemonFormaEvolucion(@RequestBody PokemonFormaEvolucionBean pokemonFormaEvolucionBean){
		return new ResponseEntity<>(this.pokemonFormaEvolucionService.savePokemonFormaEvolucion(pokemonFormaEvolucionBean), HttpStatus.OK);
	}
	
	@GetMapping("/findById/{id}")
	public ResponseEntity<PokemonFormaEvolucionBean> mostrarPoIdPokemonFormaEvolucion(@PathVariable("id") Integer id){
		return new ResponseEntity<>(this.pokemonFormaEvolucionService.findIdPokemonFormaEvolucion(id), HttpStatus.OK);
	}
	
	@GetMapping("/findAll")
	public ResponseEntity<List<PokemonFormaEvolucionBean>> mostrarTodosPokemonFormaEvolucion(){
		return new ResponseEntity<>(this.pokemonFormaEvolucionService.findAllPokemonFormaEvolucion(), HttpStatus.OK);
	}
	
	@PutMapping("/update")
	public ResponseEntity<Boolean> actualizarPokemonFormaEvolucion(@RequestBody PokemonFormaEvolucionBean pokemonFormaEvolucionBean){
		return new ResponseEntity<>(this.pokemonFormaEvolucionService.updatePokemonFormaEvolucion(pokemonFormaEvolucionBean), HttpStatus.OK);
	}
	
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<Boolean> eliminarPokemonFormaEvolucion(@PathVariable("id") Integer id){
		return new ResponseEntity<>(this.pokemonFormaEvolucionService.delatePokemonFormaEvolucion(id), HttpStatus.OK);
	}
}
