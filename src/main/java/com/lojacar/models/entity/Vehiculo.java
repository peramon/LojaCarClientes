package com.lojacar.models.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.PrePersist;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "vehiculos")
public class Vehiculo implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Long id;
	//public String nombre;
	//public String marca;
	public String anio;
	public String descripcion;
	public Double precio;

	@Column(name = "create_at")
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date createAt;
	
	@OneToMany(mappedBy = "vehiculo", cascade = CascadeType.ALL)
	private List<Mantenimiento> vehiculoList;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idModelo")
	@JsonIgnoreProperties(value = {"applications", "hibernateLazyInitializer"})
	private Modelo modelo;
	
	
	@OneToMany(mappedBy = "vehiculo", cascade = CascadeType.ALL)
	private List<Producto> 	vehiculosList;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idSeguimiento")
	private Vehiculo vehiculoSeguimiento;
	
	@PrePersist
	public void prePersist() {
		createAt = new Date();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getAnio() {
		return anio;
	}

	public void setAnio(String anio) {
		this.anio = anio;
	}

	public Date getCreateAt() {
		return createAt;
	}

	public void setCreateAt(Date createAt) {
		this.createAt = createAt;
	}
	

	public Double getPrecio() {
		return precio;
	}

	public void setPrecio(Double precio) {
		this.precio = precio;
	}
	
	public Modelo getModelo() {
		return modelo;
	}

	public void setModelo(Modelo modelo) {
		this.modelo = modelo;
	}



	/**
	 * 
	 */
	private static final long serialVersionUID = -4462746427748147726L;

}
