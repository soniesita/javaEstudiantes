package com.backendestudiantes.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.backendestudiantes.model.TipoDocumentoModel;
import com.backendestudiantes.service.TipoDocumentoService;

@RestController	
@CrossOrigin(origins = "http://localhost:4200/")
@RequestMapping ("/tipo_documento")
public class TipoDocumentoRest {

	@Autowired
	private TipoDocumentoService tipoDocumentoService;
	
	@GetMapping
	private ResponseEntity<List<TipoDocumentoModel>> getAllTipoDocumento (){
		
		return ResponseEntity.ok(tipoDocumentoService.findAll());
	}
}
