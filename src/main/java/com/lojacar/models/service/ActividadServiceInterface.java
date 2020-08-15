package com.lojacar.models.service;

import java.util.List;

import com.lojacar.models.entity.Actividad;



public interface ActividadServiceInterface {
	public List<Actividad> findAll();
	public Actividad findById(Long id);
	public Actividad save(Actividad actividad);
	public void deleteActividad(Long id);

}
