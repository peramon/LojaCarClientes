package com.lojacar.models.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lojacar.models.dao.ActividadDao;
import com.lojacar.models.entity.Actividad;


@Service
public class ActividadServiceImplement implements ActividadServiceInterface {

	@Autowired
	private ActividadDao actividadDao;
	
	@Override
	@Transactional(readOnly = true)
	public List<Actividad> findAll() {
		// TODO Auto-generated method stub
		return (List<Actividad>) actividadDao.findAll();
	}
	
	@Override
	@Transactional(readOnly = true)
	public Actividad findById(Long id) {
		// TODO Auto-generated method stub
		return actividadDao.findById(id).orElse(null);
	}

	@Override
	@Transactional(readOnly = true)
	public Actividad save(Actividad actividad) {
		// TODO Auto-generated method stub
		return actividadDao.save(actividad);
	}

	@Override
	public void deleteActividad(Long id) {
		Actividad actividad = findById(id);
		actividadDao.delete(actividad);
		
	}

}
