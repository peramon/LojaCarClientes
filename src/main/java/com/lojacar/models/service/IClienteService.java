package com.lojacar.models.service;

import java.util.List;

import com.lojacar.models.entity.Cliente;


public interface IClienteService {

	public List<Cliente> findAll2();
	public Cliente findByiD(Long id);
	public Cliente save(Cliente cliente);// Primero Aqui
	public void deleteById(Long id);
	
}
