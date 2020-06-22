package com.lojacar.models.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lojacar.models.dao.ProductoDao;
import com.lojacar.models.entity.Producto;

@Service
public class VehiculoServiceImpl implements IVehiculoService {
	
	@Autowired
	private ProductoDao vehiculoDao;

	@Override
	@Transactional(readOnly = true)
	public List<Producto> findAll() {
		// TODO Auto-generated method stub
		return (List<Producto>) vehiculoDao.findAll();
		
	}

	@Override
	@Transactional(readOnly = true)
	public Producto findById(Long id) {
		// TODO Auto-generated method stub
		return vehiculoDao.findById(id).orElse(null);
	}

	@Override
	public Producto saveVehiculo(Producto vehiculos) {
		// TODO Auto-generated method stub
		
		return vehiculoDao.save(vehiculos);
	}
	

}
