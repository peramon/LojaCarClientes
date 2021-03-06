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

import com.lojacar.models.entity.Empleado;
import com.lojacar.models.service.IEmpleadoService;

@RestController
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST})
@RequestMapping("/lojacar")
public class EmpleadoController {

	@Autowired
	IEmpleadoService empleadoService;
	
	@GetMapping("/empleados")
	@ResponseStatus(HttpStatus.OK)
	public List<Empleado> getAll(){
		return empleadoService.findAll();
	}
	
	@GetMapping("/empleado/{id}")
	@ResponseStatus(HttpStatus.OK)
	public Empleado getById(@PathVariable Long id) {
		return empleadoService.findById(id);
	}
	
	@PostMapping("/empleado")
	@ResponseStatus(HttpStatus.CREATED)
	public Empleado save(@RequestBody Empleado empleado) {
		return empleadoService.save(empleado);
	}
	
	@PutMapping("/empleado/{id}")
	@ResponseStatus(HttpStatus.OK)
	public Empleado updateEmpleado( @PathVariable Long id, @RequestBody Empleado empleado) {
		return empleadoService.updateEmpleado(id, empleado);
	}
	
	// @PutMapping("/empleado/{id}")
	
	@DeleteMapping("/empleadoDelete/{id}")
	@ResponseStatus(HttpStatus.OK)
	public void deleteEmpleado(@PathVariable Long id) {
			empleadoService.deleteEmpleado(id);
		
	}
	
}
