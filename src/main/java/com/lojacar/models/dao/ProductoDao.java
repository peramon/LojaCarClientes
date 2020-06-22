package com.lojacar.models.dao;

import org.springframework.data.repository.CrudRepository;


import com.lojacar.models.entity.Producto;

public interface ProductoDao extends CrudRepository<Producto, Long>{

}
