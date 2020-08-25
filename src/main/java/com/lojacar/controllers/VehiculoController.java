package com.lojacar.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.lojacar.models.entity.Vehiculo;
import com.lojacar.models.service.IVehiculoService;

@RestController
//@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST})
@CrossOrigin(origins = "https://lojacar.herokuapp.com",methods = {RequestMethod.GET,RequestMethod.POST})
@RequestMapping("/lojacar")
public class VehiculoController {

	@Autowired
	IVehiculoService vehiculoService;
	
	@GetMapping("/vehiculos")
	@ResponseStatus(HttpStatus.OK)
	public List<Vehiculo> getAll(){
		return vehiculoService.findAll();
	}
	
	@GetMapping("/vehiculo/{id}")
	@ResponseStatus(HttpStatus.OK)
	public Vehiculo getById(@PathVariable Long id) {
		return vehiculoService.findById(id);
	}
	
	@PostMapping("/vehiculo")
	@ResponseStatus(HttpStatus.CREATED)
	public Vehiculo createVehiculo(@RequestBody Vehiculo vehiculos) {
		return vehiculoService.saveVehiculo(vehiculos);
	}
	
}
