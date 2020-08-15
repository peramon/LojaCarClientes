package com.lojacar.models.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lojacar.models.dao.EmpleadoDao;
import com.lojacar.models.entity.Empleado;

@Service
public class EmpleadoServiceImpl implements IEmpleadoService {

	@Autowired
	private EmpleadoDao empleadoDao;
	
	@Override
	@Transactional(readOnly = true)
	public List<Empleado> findAll() {
		// TODO Auto-generated method stub
		return (List<Empleado>) empleadoDao.findAll();
	}

	@Override
	@Transactional(readOnly = true)
	public Empleado findById(Long id) {
		// TODO Auto-generated method stub
		return empleadoDao.findById(id).orElse(null);
	}

	@Override
	public Empleado save(Empleado empleado) {
		// TODO Auto-generated method stub
		return empleadoDao.save(empleado);
	}
	
	@Override
	public Empleado updateEmpleado(Long id, Empleado empleado) {
		Empleado empleadoActual =  findById(id);
		empleadoActual.setApellidos(empleado.getApellidos());
		empleadoActual.setNombres(empleado.getNombres());
		return empleadoDao.save(empleadoActual);
	}
	
	@Override
	public void deleteEmpleado(Long id) {
		// TODO Auto-generated method stub
		Empleado empleado =  findById(id);
		empleadoDao.delete(empleado);
	}

}
