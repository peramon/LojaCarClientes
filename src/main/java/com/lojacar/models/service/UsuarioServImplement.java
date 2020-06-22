package com.lojacar.models.service;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lojacar.models.dao.PedidoDao;
import com.lojacar.models.entity.Pedido;

@Service
public class UsuarioServImplement implements IUsuarioService {

	
    @Autowired
    private PedidoDao usuarioDao;
	@Override
	@Transactional(readOnly = true)
	public List<Pedido> findAll() {
		
		return (List<Pedido>) usuarioDao.findAll();
	}

	@Override
	@Transactional(readOnly = true)
	public Pedido finById(Long id) {
		
		return usuarioDao.findById(id).orElse(null);
	}

	@Override
	public Pedido save(Pedido usuario) {
		
		return usuarioDao.save(usuario);
	}

	@Override
	public void deleteById(Long id) {
		usuarioDao.deleteById(id);
	}

	/*@Override
	public Usuarios update( Long id) {
		
		return usuarioDao.
	}*/

	

	

}
