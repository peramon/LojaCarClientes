package com.lojacar.models.service;

import java.util.List;


import com.lojacar.models.entity.Vehiculo;

public interface IVehiculoService {
	
	public List<Vehiculo> findAll();
	public Vehiculo findById(Long id);
	public Vehiculo saveVehiculo(Vehiculo vehiculos);

}
