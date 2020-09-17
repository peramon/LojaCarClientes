package com.lojacar.models.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.PrePersist;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "clientes")
public class Cliente implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Long id;
	public String nombres;
	public String apellidos;
	public String telefono_casa;
	public String telefono_movil;
	public String correo_electronico;
	public String direccion;
	public String profesion;
	public String detalle;
	public boolean contactenme;
	

	@OneToOne
	@JoinColumn(name = "empleado_id", unique = false)
	private Empleado empleados;

	/*@JoinTable(name = "clientes_vehiculos", 
			joinColumns = @JoinColumn(name = "cliente_id", nullable = false), 
			inverseJoinColumns = @JoinColumn(name = "vehiculo_id", nullable = false))
	@ManyToMany()
	private List<Producto> vehiculos;*/

	@Column(name = "fecha_cre")
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date fecha_cre;
	
	@OneToMany(mappedBy = "cliente", cascade = CascadeType.ALL)
	private List<Pedido> clientePList;
	
	@OneToMany(mappedBy = "clienteS", cascade = CascadeType.ALL)
	private List<Seguimiento> clienteSList;
	
	@OneToMany(mappedBy = "clienteProducto", cascade = CascadeType.ALL)
	private List<Producto> clienteProductoList;
	
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
		return nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getTelefono_casa() {
		return telefono_casa;
	}

	public void setTelefono_casa(String telefono_casa) {
		this.telefono_casa = telefono_casa;
	}

	public String getTelefono_movil() {
		return telefono_movil;
	}

	public void setTelefono_movil(String telefono_movil) {
		this.telefono_movil = telefono_movil;
	}

	public String getCorreo_electronico() {
		return correo_electronico;
	}

	public void setCorreo_electronico(String correo_electronico) {
		this.correo_electronico = correo_electronico;
	}

	
	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getProfesion() {
		return profesion;
	}

	public void setProfesion(String profesion) {
		this.profesion = profesion;
	}

	public String getDetalle() {
		return detalle;
	}

	public void setDetalle(String detalle) {
		this.detalle = detalle;
	}

	/*public Empleado getEmpleados() {
		return empleados;
	}

	public void setEmpleados(Empleado empleados) {
		this.empleados = empleados;
	}
	*/
	

	/*public List<Producto> getVehiculos() {
		return vehiculos;
	}

	public void setVehiculos(List<Producto> vehiculos) {
		this.vehiculos = vehiculos;
	}*/


	public Date getCreateAt() {
		return fecha_cre;
	}

	public void setCreateAt(Date createAt) {
		this.fecha_cre = createAt;
	}

	public boolean isContactenme() {
		return contactenme;
	}

	public void setContactenme(boolean contactenme) {
		this.contactenme = contactenme;
	}


	public List<Seguimiento> getClienteSList() {
		return clienteSList;
	}

	public void setClienteSList(List<Seguimiento> clienteSList) {
		this.clienteSList = clienteSList;
	}
	
	
	public List<Producto> getClienteProductoList() {
		return clienteProductoList;
	}

	public void setClienteProductoList(List<Producto> clienteProductoList) {
		this.clienteProductoList = clienteProductoList;
	}





	/**
	 * 
	 */
	private static final long serialVersionUID = -3718529806554960849L;

}
