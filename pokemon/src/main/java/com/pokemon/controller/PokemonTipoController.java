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

import com.pokemon.bean.PokemonTipoBean;
import com.pokemon.service.PokemonTipoService;

@RestController
@RequestMapping("/pokemonTipo")
public class PokemonTipoController {
	
	@Autowired
	private PokemonTipoService pokemonTipoService;
	
	@PostMapping("/save")
	public ResponseEntity<Integer> savePokemonTipo(@RequestBody PokemonTipoBean pokemonTipoBean){
		return new ResponseEntity<>(this.pokemonTipoService.savePokemonTipo(pokemonTipoBean), HttpStatus.OK);
	}
	
	@PutMapping("/update")
	public ResponseEntity<Boolean> updatePokemonTipo(@RequestBody PokemonTipoBean pokemonTipoBean){
		return new ResponseEntity<>(this.pokemonTipoService.updatePokemonTipo(pokemonTipoBean), HttpStatus.OK);
	}
	
	@GetMapping("/findById/{numeroPokedex}")
	public ResponseEntity<PokemonTipoBean> findPokemonById(@PathVariable("numeroPokedex") Integer numeroPokedex){
		return new ResponseEntity<>(this.pokemonTipoService.findPokemonTipoById(numeroPokedex), HttpStatus.OK);
	}
	
	@DeleteMapping("/delete/{numeroPokedex}")
	public ResponseEntity<Boolean> deletePokemonTipo(@PathVariable("numeroPokedex") Integer numeroPokedex){
		return new ResponseEntity<>(this.pokemonTipoService.deletePokemonTipo(numeroPokedex), HttpStatus.OK);
	}
	
	@GetMapping("/findAll")
	public ResponseEntity<List<PokemonTipoBean>> findAllPokemonTipo(){
		return new ResponseEntity<>(this.pokemonTipoService.findAllPokemonTipo(), HttpStatus.OK);
	}

}
