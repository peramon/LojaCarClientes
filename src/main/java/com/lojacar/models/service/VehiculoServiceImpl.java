package com.lojacar.models.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lojacar.models.dao.VehiculoDao;

import com.lojacar.models.entity.Vehiculo;

@Service
public class VehiculoServiceImpl implements IVehiculoService {
	
	@Autowired
	private VehiculoDao vehiculoDao;

	@Override
	@Transactional(readOnly = true)
	public List<Vehiculo> findAll() {
		// TODO Auto-generated method stub
		return (List<Vehiculo>) vehiculoDao.findAll();
		
	}

	@Override
	@Transactional(readOnly = true)
	public Vehiculo findById(Long id) {
		// TODO Auto-generated method stub
		return vehiculoDao.findById(id).orElse(null);
	}

	@Override
	public Vehiculo saveVehiculo(Vehiculo vehiculos) {
		// TODO Auto-generated method stub
		
		return vehiculoDao.save(vehiculos);
	}
	

}
