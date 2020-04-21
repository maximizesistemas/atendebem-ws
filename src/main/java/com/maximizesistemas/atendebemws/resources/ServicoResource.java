package com.maximizesistemas.atendebemws.resources;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.maximizesistemas.atendebemws.dto.ServicoDTO;
import com.maximizesistemas.atendebemws.entities.Servico;
import com.maximizesistemas.atendebemws.services.ServicoService;

@RestController
@RequestMapping(value = "/Servicos")
public class ServicoResource {
	
	@Autowired
	private ServicoService service;

	@GetMapping
	public ResponseEntity<List<ServicoDTO>> findAll() {
		List<Servico> list = service.findAll();
		List<ServicoDTO> listDto = list.stream().map(x -> new ServicoDTO(x)).collect(Collectors.toList());
		return ResponseEntity.ok().body(listDto);
	}
	
	
	@GetMapping(value="/{id}")
	public ResponseEntity<ServicoDTO> findById(@PathVariable Long id) {
		Servico obj = service.findById(id);
		ServicoDTO objDto = new ServicoDTO(obj);
		return ResponseEntity.ok().body(objDto);
	}
}
