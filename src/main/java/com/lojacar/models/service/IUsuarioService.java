package com.lojacar.models.service;

import java.util.List;

import com.lojacar.models.entity.Pedido;

public interface IUsuarioService {
	public List<Pedido> findAll();
	public Pedido finById(Long id);
	public Pedido save(Pedido usuario);
	public void deleteById( Long id);
}
