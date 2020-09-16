package com.lojacar.models.entity;

import java.io.Serializable;


import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import javax.persistence.Table;

@Entity
@Table(name = "credenciales")
public class Credencial implements Serializable{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Long id;
	public String pass;
	public String usuario;
	

	
	@OneToOne(mappedBy = "credencialEmpleado", cascade = CascadeType.ALL )
	private Empleado empleado;
	
	@OneToOne(mappedBy = "credencialGerente", cascade = CascadeType.ALL )
	private Gerente gerente;
	

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	
	
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = -3316127915915059537L;
	
}
