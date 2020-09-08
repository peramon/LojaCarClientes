package dto;

import java.io.Serializable;
import java.util.Date;

import com.lojacar.models.entity.Cliente;
import com.lojacar.models.entity.Empleado;

public class CitaDTO implements Serializable{
	
	private Long id;
	public String descripcion;
	public Date fecha_atencion;
	private Cliente cliente;
	private Empleado empleado;
	
	public CitaDTO() {
		super();
	}
	
	public CitaDTO(String descripcion, Date fecha_atencion, Cliente cliente, Empleado empleado) {
		this.descripcion = descripcion;
		this.fecha_atencion = fecha_atencion;
		this.cliente = cliente;
		this.empleado = empleado;
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

	public Date getFecha_atencion() {
		return fecha_atencion;
	}

	public void setFecha_atencion(Date fecha_atencion) {
		this.fecha_atencion = fecha_atencion;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Empleado getEmpleado() {
		return empleado;
	}

	public void setEmpleado(Empleado empleado) {
		this.empleado = empleado;
	}
	
	
	
	
}
