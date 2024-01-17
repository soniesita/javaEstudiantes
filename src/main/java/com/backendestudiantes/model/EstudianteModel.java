package com.backendestudiantes.model;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "estudiante")
public class EstudianteModel {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String nombre;
	private String apellido;
	private String edad;

	@ManyToOne
	@JoinColumn(name = "tipo_documento_id")
	private TipoDocumentoModel tipoDocumentoModel;
	
	@ManyToOne
	@JoinColumn(name = "aula_id")
	private AulaModel aulaModel;
	
	@ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.MERGE)
	@JoinTable(name = "estudiante_materia", joinColumns = @JoinColumn(name = "estudiante_id", referencedColumnName = "id"), inverseJoinColumns = @JoinColumn(name = "materia_id", referencedColumnName = "id"))
	private List<MateriaModel> materiaModels;

	public EstudianteModel() {
	}

	public EstudianteModel(String nombre, String apellido, String edad, TipoDocumentoModel tipoDocumentoModel,
			AulaModel aulaModel) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.tipoDocumentoModel = tipoDocumentoModel;
		this.aulaModel = aulaModel;
		
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getEdad() {
		return edad;
	}

	public void setEdad(String edad) {
		this.edad = edad;
	}

	public TipoDocumentoModel getTipoDocumentoModel() {
		return tipoDocumentoModel;
	}

	public void setTipoDocumentoModel(TipoDocumentoModel tipoDocumentoModel) {
		this.tipoDocumentoModel = tipoDocumentoModel;
	}

	public AulaModel getAulaModel() {
		return aulaModel;
	}

	public void setAulaModel(AulaModel aulaModel) {
		this.aulaModel = aulaModel;
	}

}
