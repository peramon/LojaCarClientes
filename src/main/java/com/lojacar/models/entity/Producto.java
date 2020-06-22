package com.lojacar.models.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.PrePersist;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "productos")
public class Producto implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Long id;

	public Double precio;
	public Integer cantidad;

	@Column(name = "fecha_cre")
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date fecha_cre;
	
	/*@ManyToMany(mappedBy = "vehiculos")
    private List<Cliente> clientes;*/
	
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

	public Integer getCantidad() {
		return cantidad;
	}

	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}

	public Date getCreateAt() {
		return fecha_cre;
	}

	public void setCreateAt(Date createAt) {
		this.fecha_cre = createAt;
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = -4462746427748147726L;

}
