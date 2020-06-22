package com.lojacar.models.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "Actividades")
public class Actividades implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Long id;
	public String nombre;


	@Column(name = "fecha_cre")
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date fecha_cre;

	@PrePersist
	public void prePersist() {
		fecha_cre = new Date();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombres() {
		return nombre;
	}

	public void setNombres(String nombres) {
		this.nombre = nombres;
	}

	public Date getCreateAt() {
		return fecha_cre;
	}

	public void setCreateAt(Date createAt) {
		this.fecha_cre = createAt;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = -3316127915915059537L;

}
