package com.maximizesistemas.atendebemws.resources;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.maximizesistemas.atendebemws.dto.AtendimentoDTO;
import com.maximizesistemas.atendebemws.entities.Atendimento;
import com.maximizesistemas.atendebemws.services.AtendimentoService;

@RestController
@RequestMapping(value = "/atendimentos")
public class AtendimentoResource {
	
	@Autowired
	private AtendimentoService service;

	@GetMapping
	public ResponseEntity<List<AtendimentoDTO>> findAll() {
		List<Atendimento> list = service.findAll();
		List<AtendimentoDTO> listDto = list.stream().map(x -> new AtendimentoDTO(x)).collect(Collectors.toList());
		return ResponseEntity.ok().body(listDto);
	}
	
	
	@GetMapping(value="/{id}")
	public ResponseEntity<AtendimentoDTO> findById(@PathVariable Long id) {
		Atendimento obj = service.findById(id);
		AtendimentoDTO objDto = new AtendimentoDTO(obj);
		return ResponseEntity.ok().body(objDto);
	}
}
