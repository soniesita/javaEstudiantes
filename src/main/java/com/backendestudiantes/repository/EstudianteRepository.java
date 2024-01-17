package com.backendestudiantes.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.backendestudiantes.model.EstudianteModel;

public interface EstudianteRepository extends JpaRepository<EstudianteModel, Long>{

}
