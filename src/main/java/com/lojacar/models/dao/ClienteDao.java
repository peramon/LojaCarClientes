package com.lojacar.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.lojacar.models.entity.Cliente;

public interface ClienteDao extends CrudRepository<Cliente, Long>{

}
