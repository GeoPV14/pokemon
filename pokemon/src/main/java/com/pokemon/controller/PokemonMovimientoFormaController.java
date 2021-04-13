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

import com.pokemon.bean.PokemonMovimientoFormaBean;
import com.pokemon.service.PokemonMovimientoFormaService;

@RestController
@RequestMapping("/PokemonMovimientoForma")
public class PokemonMovimientoFormaController {
	
	@Autowired
	private PokemonMovimientoFormaService pokemonMovimientoFormaService;
	
	@PostMapping("/save")
	public ResponseEntity<Boolean> guardarPokemonMovimientoForma(@RequestBody PokemonMovimientoFormaBean pokemonMovimientoFormaBean){
		return new ResponseEntity<>(this.pokemonMovimientoFormaService.savePokemonMovimientoForma(pokemonMovimientoFormaBean), HttpStatus.OK);
	}
	
	@GetMapping("/findById/{id}")
	public ResponseEntity<PokemonMovimientoFormaBean> mostrarPorIdPokemonMovimientoForma(@PathVariable("id") Integer id){
		return new ResponseEntity<>(this.pokemonMovimientoFormaService.findIdPokemonMovimientoForma(id), HttpStatus.OK);
	}
	
	@GetMapping("/findAll")
	public ResponseEntity<List<PokemonMovimientoFormaBean>> mostrarTodosPokemonMovimientoForma(){
		return new ResponseEntity<>(this.pokemonMovimientoFormaService.findAllPokemonMovimientoForma(), HttpStatus.OK);
	}
	
	@PutMapping("/update")
	public ResponseEntity<Boolean> actualizarPokemonMovimientoForma(@RequestBody PokemonMovimientoFormaBean pokemonMovimientoFormaBean){
		return new ResponseEntity<>(this.pokemonMovimientoFormaService.updatePokemonMovimientoForma(pokemonMovimientoFormaBean), HttpStatus.OK);
	}
	
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<Boolean> eliminarPokemonMovimientoForma(@PathVariable("id") Integer id){
		return new ResponseEntity<>(this.pokemonMovimientoFormaService.delatePokemonMovimientoForma(id), HttpStatus.OK);
	}
}
