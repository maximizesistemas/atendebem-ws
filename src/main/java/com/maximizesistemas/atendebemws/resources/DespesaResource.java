package com.maximizesistemas.atendebemws.resources;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.maximizesistemas.atendebemws.dto.DespesaDTO;
import com.maximizesistemas.atendebemws.entities.Despesa;
import com.maximizesistemas.atendebemws.services.DespesaService;

@RestController
@RequestMapping(value = "/despesas")
public class DespesaResource {
	
	@Autowired
	private DespesaService service;

	@GetMapping
	public ResponseEntity<List<DespesaDTO>> findAll() {
		List<Despesa> list = service.findAll();
		List<DespesaDTO> listDto = list.stream().map(x -> new DespesaDTO(x)).collect(Collectors.toList());
		return ResponseEntity.ok().body(listDto);
	}
	
	
	@GetMapping(value="/{id}")
	public ResponseEntity<DespesaDTO> findById(@PathVariable Long id) {
		Despesa obj = service.findById(id);
		DespesaDTO objDto = new DespesaDTO(obj);
		return ResponseEntity.ok().body(objDto);
	}
}
