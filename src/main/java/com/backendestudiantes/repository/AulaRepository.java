package com.backendestudiantes.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.backendestudiantes.model.AulaModel;

public interface AulaRepository extends JpaRepository<AulaModel, Long> {

}
