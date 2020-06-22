package com.lojacar.models.service;

import java.util.List;

import com.lojacar.models.entity.Empleado;

public interface IEmpleadoService {
	
	public List<Empleado> findAll();
	public Empleado findById(Long id);
	public Empleado save(Empleado empleado);

}
