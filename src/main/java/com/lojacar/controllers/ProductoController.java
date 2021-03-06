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

import com.lojacar.models.entity.Producto;
import com.lojacar.models.service.ProductoServiceInterface;

@RestController
@CrossOrigin(origins = "*",methods = {RequestMethod.GET,RequestMethod.POST})
@RequestMapping("/lojacar")
public class ProductoController {

	@Autowired
	ProductoServiceInterface productoService;
	
	@GetMapping("/productos")
	@ResponseStatus(HttpStatus.OK)
	public List<Producto> getAll(){
		return productoService.findAll();
	}
	
	@GetMapping("/producto/{id}")
	@ResponseStatus(HttpStatus.OK)
	public Producto getById(@PathVariable Long id) {
		return productoService.findById(id);
	}
	
	@PostMapping("/producto")
	@ResponseStatus(HttpStatus.CREATED)
	public Producto createProducto(@RequestBody Producto productos) {
		return productoService.saveProducto(productos);
	}
	
}
