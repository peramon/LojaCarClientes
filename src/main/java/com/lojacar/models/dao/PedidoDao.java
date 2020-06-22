package com.lojacar.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.lojacar.models.entity.Pedido;

public interface PedidoDao extends CrudRepository<Pedido, Long> {

}
