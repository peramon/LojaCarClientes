package com.lojacar.models.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lojacar.models.dao.GerenteDao;
import com.lojacar.models.entity.Gerente;

@Service
public class GerenteServiceImplements implements GerenteServiceInterface{

	@Autowired
	private GerenteDao gerenteDao;
	
	@Override
	@Transactional(readOnly = true)
	public List<Gerente> findAll() {
		// TODO Auto-generated method stub
		return (List<Gerente>) gerenteDao.findAll();
	}

	@Override
	@Transactional(readOnly = true)
	public Gerente findById(Long id) {
		// TODO Auto-generated method stub
		return gerenteDao.findById(id).orElse(null);
	}

	@Override
	public Gerente save(Gerente gerente) {
		// TODO Auto-generated method stub
		return gerenteDao.save(gerente);
	}

	@Override
	public void gerenteDelete(Long id) {
		// TODO Auto-generated method stub
		Gerente gerente = findById(id);
		gerenteDao.delete(gerente);
	}

	@Override
	public Gerente updateGerente(Long id, Gerente gerente) {
		// TODO Auto-generated method stub
		Gerente gerenteActual = findById(id);
		gerenteActual.setNombres(gerente.getNombres());
		gerenteActual.setApellidos(gerente.getApellidos());
		gerenteActual.setCorreo(gerente.getCorreo());
		gerenteActual.setDireccion(gerente.getDireccion());
		return gerenteDao.save(gerenteActual);
	}

}
