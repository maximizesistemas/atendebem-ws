package com.maximizesistemas.atendebemws.resources;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.maximizesistemas.atendebemws.dto.AtividadeDTO;
import com.maximizesistemas.atendebemws.entities.Atividade;
import com.maximizesistemas.atendebemws.services.AtividadeService;

@RestController
@RequestMapping(value = "/Atividades")
public class AtividadeResource {
	
	@Autowired
	private AtividadeService service;

	@GetMapping
	public ResponseEntity<List<AtividadeDTO>> findAll() {
		List<Atividade> list = service.findAll();
		List<AtividadeDTO> listDto = list.stream().map(x -> new AtividadeDTO(x)).collect(Collectors.toList());
		return ResponseEntity.ok().body(listDto);
	}
	
	
	@GetMapping(value="/{id}")
	public ResponseEntity<AtividadeDTO> findById(@PathVariable Long id) {
		Atividade obj = service.findById(id);
		AtividadeDTO objDto = new AtividadeDTO(obj);
		return ResponseEntity.ok().body(objDto);
	}
}
