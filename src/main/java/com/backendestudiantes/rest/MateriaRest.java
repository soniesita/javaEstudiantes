package com.backendestudiantes.rest;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.backendestudiantes.model.MateriaModel;
import com.backendestudiantes.repository.MateriaRepository;
import com.backendestudiantes.service.MateriaService;

@RestController
@CrossOrigin(origins = "http://localhost:4200/")
@RequestMapping("/materias/")
public class MateriaRest {



	@Autowired
	private MateriaService materiaService;

	@GetMapping
	private ResponseEntity<List<MateriaModel>> getAllMaterias() {
		return ResponseEntity.ok(materiaService.findAll());
	}

	@PostMapping
	private ResponseEntity<MateriaModel> saveMateria(@RequestBody MateriaModel materiaModel) {
		try {
			MateriaModel materiaGuardada = materiaService.save(materiaModel);

			return ResponseEntity.created(new URI("/materias/" + materiaGuardada.getId())).body(materiaGuardada);

		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
		}
	}
}
