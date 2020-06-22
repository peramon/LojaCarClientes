package com.lojacar.models.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lojacar.models.dao.ClienteDao;
import com.lojacar.models.entity.Cliente;

@Service
public class ClienteServiceImpl implements IClienteService {

	@Autowired
	private ClienteDao clienteDao;
	
	@Override
	@Transactional(readOnly = true)
	public List<Cliente> findAll2() {
		// TODO Auto-generated method stub
		return (List<Cliente>) clienteDao.findAll(); // Clase propia de dao
	}

	@Override
	@Transactional(readOnly = true)
	public Cliente findByiD(Long id) {
		// TODO Auto-generated method stub
		return clienteDao.findById(id).orElse(null);
	}

	@Override
	public Cliente save(Cliente cliente) {
		// TODO Auto-generated method stub
		return clienteDao.save(cliente);
	}

	@Override
	public void deleteById(Long id) {
		// TODO Auto-generated method stub
		clienteDao.deleteById(id);
	}

}
