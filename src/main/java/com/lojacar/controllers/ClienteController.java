package com.lojacar.controllers;


import java.util.List;

import javax.websocket.server.PathParam;
import javax.xml.ws.Response;

import org.apache.tomcat.util.http.parser.MediaType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.lojacar.models.entity.Cliente;
import com.lojacar.models.entity.Empleado;
import com.lojacar.models.service.IClienteService;
import com.lojacar.models.service.IEmpleadoService;
import com.lojacar.models.service.VehiculoServiceInterface;

import dto.CitaDTO;

@RestController
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST})
@RequestMapping("/lojacar")
public class ClienteController {

	@Autowired
	IClienteService clienteService;
	
	@Autowired
	IEmpleadoService empleadoService;
	
	@Autowired
	VehiculoServiceInterface vehiculoSerice;
	
	@GetMapping("/clientes")
	@ResponseStatus(HttpStatus.OK)
	public List<Cliente> getAll(){
		return clienteService.findAll2();
	}
	
	@GetMapping("/cliente/{id}")
	@ResponseStatus(HttpStatus.OK)
	public Cliente getById(@PathVariable Long id) {
		return clienteService.findByiD(id);
	}
	
	@PostMapping("/empleado/{id}/cliente")
	@ResponseStatus(HttpStatus.OK)
	public Cliente save(@RequestBody Cliente clientes, @PathVariable Long id) {
		Empleado empleado = empleadoService.findById(id);
		clientes.setEmpleados(empleado);
		return clienteService.save(clientes);
	}
	

	
	@PostMapping("/cliente")
	@ResponseStatus(HttpStatus.CREATED)
	public Cliente save(@RequestBody Cliente cliente) {
		return clienteService.save(cliente);
	}
	
	@PutMapping("/cliente/{id}")
	@ResponseStatus(HttpStatus.OK)
	public Cliente updateCliente( @PathVariable Long id, @RequestBody Cliente cliente) {
		return clienteService.updateCliente(id, cliente);
	}
	

	
	
	

}
