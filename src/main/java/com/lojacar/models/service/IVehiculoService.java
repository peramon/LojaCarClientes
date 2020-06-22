package com.lojacar.models.service;

import java.util.List;

import com.lojacar.models.entity.Producto;

public interface IVehiculoService {
	
	public List<Producto> findAll();
	public Producto findById(Long id);
	public Producto saveVehiculo(Producto vehiculos);

}
