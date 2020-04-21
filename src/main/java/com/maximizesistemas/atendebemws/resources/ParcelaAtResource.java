package com.maximizesistemas.atendebemws.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.maximizesistemas.atendebemws.entities.ParcelaAt;
import com.maximizesistemas.atendebemws.services.ParcelaAtService;

@RestController
@RequestMapping(value = "/parcelasAt")
public class ParcelaAtResource {
	@Autowired
	private ParcelaAtService service;

	@GetMapping
	public ResponseEntity<List<ParcelaAt>> findAll() {
		List<ParcelaAt> list = service.findAll(); 
		return ResponseEntity.ok().body(list);
	}
	
	@GetMapping(value="/{id}")
	public ResponseEntity<ParcelaAt> findById(@PathVariable Long id) {
		ParcelaAt obj = service.findById(id);
		return ResponseEntity.ok().body(obj);
	}
}
