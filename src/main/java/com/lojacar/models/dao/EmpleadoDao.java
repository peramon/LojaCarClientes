package com.lojacar.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.lojacar.models.entity.Empleado;


public interface EmpleadoDao extends CrudRepository<Empleado, Long>{

}
