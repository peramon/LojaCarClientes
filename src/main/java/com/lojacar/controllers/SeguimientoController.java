package com.lojacar.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.lojacar.models.entity.Seguimiento;
import com.lojacar.models.service.SeguimientoServiceInterface;

@RestController
@CrossOrigin(origins = "*", methods = {RequestMethod.GET, RequestMethod.POST})
@RequestMapping("/lojacar")
public class SeguimientoController {

	@Autowired
	SeguimientoServiceInterface seguimientoService;
	
	@GetMapping("/seguimientos")
	@ResponseStatus(HttpStatus.OK)
	public List<Seguimiento> getAll(){
		return seguimientoService.findAll();
	}
	
	@GetMapping("/seguimiento/{id}")
	@ResponseStatus(HttpStatus.OK)
	public Seguimiento getById(@PathVariable Long id) {
		return seguimientoService.findById(id);
	}
	
	@PostMapping("/seguimiento")
	@ResponseStatus(HttpStatus.CREATED)
	public Seguimiento save(@RequestBody Seguimiento seguimiento) {
		return seguimientoService.saveSeguimiento(seguimiento);
	}
	
	@DeleteMapping("/seguimientoDelete/{id}")
	@ResponseStatus(HttpStatus.OK)
	public void deleteSeguimiento(@PathVariable Long id) {
		seguimientoService.deleteSeguimiento(id);
	}
	
	
	
	
}
