package com.backendestudiantes.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.backendestudiantes.model.MateriaModel;

@Repository
public interface MateriaRepository extends JpaRepository<MateriaModel, Long> {

}
