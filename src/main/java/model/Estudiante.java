package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table (name = "estudiante")
@NamedQuery(name = "Estudiante.findAll", query = "SELECT r FROM Rol r")
public class Estudiante {
	@Id
	@Column(name = "idEstudiante")
	private int idEstudiante;
	
	@Column (name = "nombresApellidos")
	private String nombresApellidos;
	
	@Column (name = "tipoDocumento")
	private int tipoDocumento;
	
	@Column (name = "documento")
	private String documento;
	
	@Column (name = "telefono")
	private String telefono;
	
	@Column (name = "carrera")
	private int carrera;

	public Estudiante() {
	}

	public int getIdEstudiante() {
		return idEstudiante;
	}

	public void setIdEstudiante(int idEstudiante) {
		this.idEstudiante = idEstudiante;
	}

	public String getNombresApellidos() {
		return nombresApellidos;
	}

	public void setNombresApellidos(String nombresApellidos) {
		this.nombresApellidos = nombresApellidos;
	}

	public int getTipoDocumento() {
		return tipoDocumento;
	}

	public void setTipoDocumento(int tipoDocumento) {
		this.tipoDocumento = tipoDocumento;
	}

	public String getDocumento() {
		return documento;
	}

	public void setDocumento(String documento) {
		this.documento = documento;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public int getCarrera() {
		return carrera;
	}

	public void setCarrera(int carrera) {
		this.carrera = carrera;
	}
	
	
	
}
