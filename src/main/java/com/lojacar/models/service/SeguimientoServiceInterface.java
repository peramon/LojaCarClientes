package com.lojacar.models.service;

import java.util.List;

import com.lojacar.models.entity.Seguimiento;

public interface SeguimientoServiceInterface {
	public List<Seguimiento> findAll();
	public Seguimiento findById(Long id);
	public Seguimiento saveSeguimiento(Seguimiento seguimiento);
	public void deleteSeguimiento(Long id); 
}
