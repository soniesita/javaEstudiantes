package com.backendestudiantes.rest;

import java.net.URI;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.backendestudiantes.excepciones.ResourceNotFoundException;

import com.backendestudiantes.model.EstudianteModel;


import com.backendestudiantes.repository.EstudianteRepository;
import com.backendestudiantes.service.EstudianteService;



@RestController
@RequestMapping("/estudiantes/")
@CrossOrigin(origins = "http://localhost:4200/")
public class EstudianteRest {

	@Autowired
	private EstudianteRepository estudianteRepository;

	@Autowired
	private EstudianteService estudianteService;


	@GetMapping
	public ResponseEntity<List<EstudianteModel>> getAllEstudiantes() {
		List<EstudianteModel> estudiantes = estudianteRepository.findAll();
		return ResponseEntity.ok(estudiantes);
	}

	@PostMapping
	private ResponseEntity<EstudianteModel> saveEstudiante(@RequestBody EstudianteModel estudianteModel) {
		try {
			EstudianteModel estudianteGuardado = estudianteService.save(estudianteModel);
			return ResponseEntity.created(new URI("/estudiantes/" + estudianteGuardado.getId()))
					.body(estudianteGuardado);
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
		}
	}

	/**
	 * metodo para obtener estudiante por id
	 * 
	 * @param id
	 * @return
	 */
	@GetMapping(path = "{id}")
	private ResponseEntity<EstudianteModel> getEstudianteId(@PathVariable Long id) {
		Optional<EstudianteModel> estudianteOptional = estudianteService.findById(id);
		if (!estudianteOptional.isPresent()) {
			return ResponseEntity.unprocessableEntity().build();
		}
		return ResponseEntity.ok(estudianteOptional.get());
	}

	/**
	 * 
	 * @param id
	 * @param detallesEmpleado
	 * @return
	 */
	@PutMapping("{id}")
	public ResponseEntity<EstudianteModel> actualizarEstudiante(@PathVariable Long id,
			@RequestBody EstudianteModel detallesEstudiante) {
		Optional<EstudianteModel> estudianteOptional = estudianteService.findById(id);
		if (!estudianteOptional.isPresent()) {
			return ResponseEntity.unprocessableEntity().build();
		}

		EstudianteModel estudianteExistente = estudianteOptional.get();
		estudianteExistente.setNombre(detallesEstudiante.getNombre());
		estudianteExistente.setApellido(detallesEstudiante.getApellido());
		estudianteExistente.setEdad(detallesEstudiante.getEdad());
		estudianteExistente.setTipoDocumentoModel(detallesEstudiante.getTipoDocumentoModel());
		estudianteExistente.setAulaModel(detallesEstudiante.getAulaModel());

		EstudianteModel estudianteActualizado = estudianteService.save(estudianteExistente);

		return ResponseEntity.ok(estudianteActualizado);

	}

	@DeleteMapping("{id}")
	public ResponseEntity<Map<String, Boolean>> eliminarEstudiante(@PathVariable Long id) {
		EstudianteModel estudianteModel = estudianteService.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("No existe el estudiante con el ID : " + id));
		estudianteService.delete(estudianteModel);
		Map<String, Boolean> respuesta = new HashMap<>();
		respuesta.put("eliminar", Boolean.TRUE);
		return ResponseEntity.ok(respuesta);
	}
}