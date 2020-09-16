package com.lojacar.models.service;

import java.util.List;

import com.lojacar.models.entity.Gerente;

public interface GerenteServiceInterface {
	
	public List<Gerente> findAll();
	public Gerente findById(Long id);
	public Gerente save(Gerente gerente);
	public void gerenteDelete(Long id);
	public Gerente updateGerente(Long id, Gerente gerente);
}
