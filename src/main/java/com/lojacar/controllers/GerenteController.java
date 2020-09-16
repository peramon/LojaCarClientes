package com.lojacar.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.lojacar.models.entity.Gerente;
import com.lojacar.models.service.GerenteServiceInterface;

@RestController
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST})
@RequestMapping("/lojacar")
public class GerenteController {
	
	@Autowired
	GerenteServiceInterface gerenteService;
	
	@GetMapping("/gerentes")
	@ResponseStatus(HttpStatus.OK)
	public List<Gerente> getAll(){
		return gerenteService.findAll();
	}
	
	@GetMapping("/gerente/{id}")
	@ResponseStatus(HttpStatus.OK)
	public Gerente getById(@PathVariable Long id) {
		return gerenteService.findById(id);
	}
	
	@PostMapping("/gerente")
	@ResponseStatus(HttpStatus.CREATED)
	public Gerente save(@RequestBody Gerente gerente) {
		return gerenteService.save(gerente);
	}
	
	@DeleteMapping("/gerenteDelete/{id}")
	@ResponseStatus(HttpStatus.OK)
	public void deleteGerente(@PathVariable Long id) {
		gerenteService.gerenteDelete(id);
	}
	
	@PutMapping("/gerente/{id}")
	@ResponseStatus(HttpStatus.OK)
	public Gerente updateGerente( @PathVariable Long id, @RequestBody Gerente gerente) {
		return gerenteService.updateGerente(id, gerente);
	}
	
}
