package com.lojacar.models.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lojacar.models.dao.SeguimientoDao;
import com.lojacar.models.entity.Seguimiento;

@Service
public class SeguimientoServiceImplement implements SeguimientoServiceInterface {
	
	@Autowired
	private SeguimientoDao seguimientoDao;

	@Override
	@Transactional(readOnly = true)
	public List<Seguimiento> findAll() {
		// TODO Auto-generated method stub
		return (List<Seguimiento>) seguimientoDao.findAll();
	}

	@Override
	@Transactional(readOnly = true)
	public Seguimiento findById(Long id) {
		// TODO Auto-generated method stub
		return seguimientoDao.findById(id).orElse(null);
	}

	@Override
	public Seguimiento saveSeguimiento(Seguimiento seguimiento) {
		// TODO Auto-generated method stub
		return seguimientoDao.save(seguimiento);
	}

	@Override
	public void deleteSeguimiento(Long id) {
		// TODO Auto-generated method stub
		Seguimiento seguimiento = findById(id);
		seguimientoDao.delete(seguimiento);
	}
	

	
	

}
