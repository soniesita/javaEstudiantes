package com.backendestudiantes.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.backendestudiantes.model.AulaModel;
import com.backendestudiantes.service.AulaService;

@RestController
@RequestMapping ("/aulas")
@CrossOrigin(origins = "http://localhost:4200/")
public class AulaRest {

	@Autowired
	private AulaService aulaService;
	
	@GetMapping
	private ResponseEntity<List<AulaModel>> getAllAula (){
		
		return ResponseEntity.ok(aulaService.findAll());
	}
}
