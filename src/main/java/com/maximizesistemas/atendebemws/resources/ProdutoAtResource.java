package com.maximizesistemas.atendebemws.resources;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.maximizesistemas.atendebemws.dto.ProdutoAtDTO;
import com.maximizesistemas.atendebemws.entities.ProdutoAt;
import com.maximizesistemas.atendebemws.services.ProdutoAtService;

@RestController
@RequestMapping(value = "/ProdutoAt")
public class ProdutoAtResource {
	
	@Autowired
	private ProdutoAtService service;

	@GetMapping
	public ResponseEntity<List<ProdutoAtDTO>> findAll() {
		List<ProdutoAt> list = service.findAll();
		List<ProdutoAtDTO> listDto = list.stream().map(x -> new ProdutoAtDTO(x)).collect(Collectors.toList());
		return ResponseEntity.ok().body(listDto);
	}
	
	
	@GetMapping(value="/{id}")
	public ResponseEntity<ProdutoAtDTO> findById(@PathVariable Long id) {
		ProdutoAt obj = service.findById(id);
		ProdutoAtDTO objDto = new ProdutoAtDTO(obj);
		return ResponseEntity.ok().body(objDto);
	}
}
