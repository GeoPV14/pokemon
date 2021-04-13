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

import com.pokemon.bean.PokemonBean;
import com.pokemon.service.PokemonService;

@RestController
@RequestMapping("/Pokemon")
public class PokemonController {
	
	@Autowired
	private PokemonService pokemonService;
	
	@PostMapping
	public ResponseEntity<Boolean> guardarPokemon(@RequestBody PokemonBean pokemonBean){
		return new ResponseEntity<>(this.pokemonService.savePokemon(pokemonBean), HttpStatus.OK);
	}
	
	@GetMapping("/findById/{id}")
	public ResponseEntity<PokemonBean> mostrarPorIdPokemon(@PathVariable("id") Integer id){
		return new ResponseEntity<>(this.pokemonService.findIdPokemon(id), HttpStatus.OK);
	}
	
	@GetMapping("/findAll")
	public ResponseEntity<List<PokemonBean>> mostrarTodosPokemon(){
		return new ResponseEntity<>(this.pokemonService.findAllPokemon(), HttpStatus.OK);
	}
	
	@PutMapping("/update")
	public ResponseEntity<Boolean> actualizarPokemon(@RequestBody PokemonBean pokemonBean){
		return new ResponseEntity<>(this.pokemonService.updatePokemon(pokemonBean), HttpStatus.OK);
	}
	
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<Boolean> eliminarPokemon(@PathVariable("id") Integer id){
		return new ResponseEntity<>(this.pokemonService.delatePokemon(id), HttpStatus.OK);
	}
}
