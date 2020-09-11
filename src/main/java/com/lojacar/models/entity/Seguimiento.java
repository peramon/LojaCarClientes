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

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "seguimientos")
public class Seguimiento implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Long id;
	public String descripcion;
	public String prioridad;
	
	@Column(name = "fecha_atencion")
	@Temporal(TemporalType.TIMESTAMP)
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date fecha_atencion;
	

	@Column(name = "fecha_inicio")
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date fecha_inicio;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idCliente")
	@JsonIgnoreProperties(value = {"applications", "hibernateLazyInitializer"})
	private Cliente clienteS;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idEmpleado")
	@JsonIgnoreProperties(value = {"applications", "hibernateLazyInitializer"})
	private Empleado empleadoS;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idTipoSeguimiento")
	private TipoSeguimiento tipoSeguimiento;
	
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

	public String getPrioridad() {
		return prioridad;
	}

	public void setPrioridad(String prioridad) {
		this.prioridad = prioridad;
	}

	public Date getCreateAt() {
		return fecha_inicio;
	}

	public void setCreateAt(Date createAt) {
		this.fecha_inicio = createAt;
	}
	


	public Date getFecha_atencion() {
		return fecha_atencion;
	}

	public void setFecha_atencion(Date fecha_atencion) {
		this.fecha_atencion = fecha_atencion;
	}
	

	public Empleado getEmpleadoS() {
		return empleadoS;
	}

	public void setEmpleadoS(Empleado empleadoS) {
		this.empleadoS = empleadoS;
	}
	
	

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = -3316127915915059537L;

}
