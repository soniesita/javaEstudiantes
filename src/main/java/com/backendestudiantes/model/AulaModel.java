package com.backendestudiantes.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table (name = "aula")
public class AulaModel {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private String aula;
	
	
	public AulaModel() {
		
	}
	
	public AulaModel(String aula) {
		super();
		this.aula = aula;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getAula() {
		return aula;
	}
	public void setAula(String aula) {
		this.aula = aula;
	}
	
	
	
	
	
}
