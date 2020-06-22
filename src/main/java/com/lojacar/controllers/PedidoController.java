package com.lojacar.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.lojacar.models.entity.Pedido;
import com.lojacar.models.service.IUsuarioService;

@RestController
public class PedidoController {

	@Autowired
	private IUsuarioService usuuarioService;
	
	@GetMapping("/listar")
	public List<Pedido> Listar(){
		return usuuarioService.findAll();
	}
	
	@GetMapping("/ver/{id}")
	public Pedido detalle(@PathVariable Long id) {
		Pedido usuario = usuuarioService.finById(id);
		return usuario;
	}
	
	@PostMapping("/crear")
	@ResponseStatus(HttpStatus.CREATED)
	public Pedido crear(@RequestBody Pedido usuario) {
		return usuuarioService.save(usuario);
	}
	@DeleteMapping("/eliminar/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void eliminar (@PathVariable Long id) {
		usuuarioService.deleteById(id);
	}
}
