package com.lojacar.models.service;

import java.util.List;

import com.lojacar.models.entity.Producto;

public interface ProductoServiceInterface {
	
	public List<Producto> findAll();
	public Producto findById(Long id);
	public Producto saveProducto(Producto productos);
}
