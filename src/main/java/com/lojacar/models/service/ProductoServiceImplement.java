package com.lojacar.models.service;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lojacar.models.dao.ProductoDao;
import com.lojacar.models.entity.Producto;

@Service
public class ProductoServiceImplement implements ProductoServiceInterface{
	
	@Autowired
	private ProductoDao productoDao;
	
	@Override
	@Transactional(readOnly = true)
	public List<Producto> findAll() {
		// TODO Auto-generated method stub
		return (List<Producto>) productoDao.findAll();
	}

	@Override
	@Transactional(readOnly = true)
	public Producto findById(Long id) {
		// TODO Auto-generated method stub
		return productoDao.findById(id).orElse(null);
	}

	@Override
	public Producto saveProducto(Producto productos) {
		// TODO Auto-generated method stub
		return productoDao.save(productos);
	}
}
