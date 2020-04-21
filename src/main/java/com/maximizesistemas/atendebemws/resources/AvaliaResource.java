package com.maximizesistemas.atendebemws.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.maximizesistemas.atendebemws.entities.Avalia;
import com.maximizesistemas.atendebemws.services.AvaliaService;

@RestController
@RequestMapping(value = "/avaliacoes")
public class AvaliaResource {
	@Autowired
	private AvaliaService service;

	@GetMapping
	public ResponseEntity<List<Avalia>> findAll() {
		List<Avalia> list = service.findAll(); 
		return ResponseEntity.ok().body(list);
	}
	
	@GetMapping(value="/{id}")
	public ResponseEntity<Avalia> findById(@PathVariable Long id) {
		Avalia obj = service.findById(id);
		return ResponseEntity.ok().body(obj);
	}
}
