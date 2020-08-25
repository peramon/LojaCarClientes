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

import com.lojacar.models.entity.Actividad;
import com.lojacar.models.service.ActividadServiceInterface;



@RestController
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST})
@RequestMapping("/lojacar")
public class ActividadController {

	
	@Autowired
	ActividadServiceInterface actividadService;
	
	@GetMapping("/actividades")
	@ResponseStatus(HttpStatus.OK)
	public List<Actividad> getAll(){
		return actividadService.findAll();
	}
	
	@GetMapping("/actividad/{id}")
	@ResponseStatus(HttpStatus.OK)
	public Actividad getById(@PathVariable Long id) {
		return actividadService.findById(id);
	}
	
	@PostMapping("/actividad")
	@ResponseStatus(HttpStatus.CREATED)
	public Actividad save(@RequestBody Actividad actividad) {
		return actividadService.save(actividad);
	}
	
	
	@DeleteMapping("/actividadDelete/{id}")
	@ResponseStatus(HttpStatus.OK)
	public void deleteActividad(@PathVariable Long id) {
			actividadService.deleteActividad(id);
		
	}
	
}
