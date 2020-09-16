package com.lojacar.models.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.PrePersist;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "mantenimientos")
public class Mantenimiento implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Long id;
	public String descripcion;
	public Double costo;

	@Column(name = "fecha_inicio")
	@Temporal(TemporalType.TIMESTAMP)
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date fecha_inicio;

	
	@Column(name = "fecha_mantenimiento")
	@Temporal(TemporalType.TIMESTAMP)
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date fecha_mantenimiento;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idEmpleado")
	private Empleado empleadoM;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idVehiculo")
	private Vehiculo vehiculo;
	
	
	@PrePersist
	public void prePersist() {
		fecha_inicio = new Date();
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

	public Double getCosto() {
		return costo;
	}

	public void setCosto(Double costo) {
		this.costo = costo;
	}

	public Date getCreateAt() {
		return fecha_inicio;
	}

	public void setCreateAt(Date fecha_inicio) {
		this.fecha_inicio = fecha_inicio;
	}

	
	public Date getFecha_mantenimiento() {
		return fecha_mantenimiento;
	}

	public void setFecha_mantenimiento(Date fecha_mantenimiento) {
		this.fecha_mantenimiento = fecha_mantenimiento;
	}

	
	
	public Empleado getEmpleadoM() {
		return empleadoM;
	}

	public void setEmpleadoM(Empleado empleadoM) {
		this.empleadoM = empleadoM;
	}

	public Vehiculo getVehiculo() {
		return vehiculo;
	}

	public void setVehiculo(Vehiculo vehiculo) {
		this.vehiculo = vehiculo;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = -3316127915915059537L;

}
