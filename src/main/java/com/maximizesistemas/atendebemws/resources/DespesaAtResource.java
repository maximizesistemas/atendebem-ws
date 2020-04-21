package com.maximizesistemas.atendebemws.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.maximizesistemas.atendebemws.entities.DespesaAt;
import com.maximizesistemas.atendebemws.services.DespesaAtService;

@RestController
@RequestMapping(value = "/despesasat")
public class DespesaAtResource {
	@Autowired
	private DespesaAtService service;

	@GetMapping
	public ResponseEntity<List<DespesaAt>> findAll() {
		List<DespesaAt> list = service.findAll(); 
		return ResponseEntity.ok().body(list);
	}
	
	@GetMapping(value="/{id}")
	public ResponseEntity<DespesaAt> findById(@PathVariable Long id) {
		DespesaAt obj = service.findById(id);
		return ResponseEntity.ok().body(obj);
	}
}
