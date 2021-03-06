package com.lojacar.models.entity;


import java.io.Serializable;
import java.util.Date;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.PrePersist;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "empleados")
public class Empleado implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Long id;
	public String cedula;
	public String nombres;
	public String apellidos;
	public String correo;
	public String telefono;
	public String direccion;
	
	

	@Column(name = "create_at")
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date createAt;

	@OneToOne
	@JoinColumn(name = "idCredencial")
	private Credencial credencialEmpleado;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idRolEmpleado")
	private RolEmpleado rolEmpleado;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idArea")
	private Area areaEmpleado;
	
	@OneToMany(mappedBy = "empleadoM", cascade = CascadeType.ALL)
	private List<Mantenimiento> empleadoMList;
	
	@ManyToMany(cascade = CascadeType.ALL)
    @JoinTable
    private Set<Pedido> Pedido;
	
	@ManyToMany(cascade = CascadeType.ALL)
    @JoinTable
    private List<Actividad> Actividad;
	
	@ManyToMany(mappedBy = "Empleados")
    private Set<Gerente> Gerente;
	
	@OneToMany(mappedBy = "empleadoS", cascade = CascadeType.ALL)
	private List<Seguimiento> empleadoSList;
	
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
	

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
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
	
	

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public Date getCreateAt() {
		return createAt;
	}

	public void setCreateAt(Date createAt) {
		this.createAt = createAt;
	}
	
	public Credencial getCredencialEmpleado() {
		return credencialEmpleado;
	}

	public void setCredencialEmpleado(Credencial credencialEmpleado) {
		this.credencialEmpleado = credencialEmpleado;
	}

	public RolEmpleado getRolEmpleado() {
		return rolEmpleado;
	}

	public void setRolEmpleado(RolEmpleado rolEmpleado) {
		this.rolEmpleado = rolEmpleado;
	}

	public List<Actividad> getActividad() {
		return Actividad;
	}

	public void setActividad(List<Actividad> actividad) {
		Actividad = actividad;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = -3316127915915059537L;

}
