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

import com.pokemon.bean.MTBean;
import com.pokemon.service.MTService;

@RestController
@RequestMapping("/MT")
public class MTController {
	
	@Autowired
	private MTService mtserv;
	
	@PostMapping("/save")
	public ResponseEntity<String> saveMT(@RequestBody MTBean mTBean){
		return new ResponseEntity<>(this.mtserv.saveMT(mTBean), HttpStatus.OK);
	}
	
	@PutMapping("/update")
	public ResponseEntity<Boolean> updateMT(@RequestBody MTBean mTBean){
		return new ResponseEntity<>(this.mtserv.updateMT(mTBean), HttpStatus.OK);
	}
	
	@GetMapping("/findById/{idMT}")
	public ResponseEntity<MTBean> findMTById(@PathVariable("idMT") String idMT){
		return new ResponseEntity<>(this.mtserv.findByIdMT(idMT), HttpStatus.OK);
	}
	
	@GetMapping("/findAll")
	public ResponseEntity<List<MTBean>> findAllMT(@RequestBody MTBean mTBean){
		return new ResponseEntity<>(this.mtserv.findAllMT(), HttpStatus.OK);
	}
	
	@DeleteMapping("/delete/{idMT}")
	public ResponseEntity<Boolean> deleteMT(@PathVariable("idMT") String idMT){
		return new ResponseEntity<>(this.mtserv.deleteMT(idMT), HttpStatus.OK);
	}

}
