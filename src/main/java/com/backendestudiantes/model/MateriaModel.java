package com.backendestudiantes.model;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "materias")
public class MateriaModel {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String nombre;
	@ManyToMany(mappedBy = "materiaModels")
	private List<EstudianteModel> estudiantesModels;

	public MateriaModel() {
	}
	
	public MateriaModel(String nombre) {
		this.nombre = nombre;
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

	public List<EstudianteModel> getEstudianteModels() {
		return estudiantesModels;
	}

	public void setEstudianteModels(List<EstudianteModel> estudianteModels) {
		this.estudiantesModels = estudianteModels;
	}
	
}
