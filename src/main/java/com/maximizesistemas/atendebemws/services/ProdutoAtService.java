package com.maximizesistemas.atendebemws.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.maximizesistemas.atendebemws.entities.ProdutoAt;
import com.maximizesistemas.atendebemws.repositories.ProdutoAtRepository;

@Service
public class ProdutoAtService {
	@Autowired
	private ProdutoAtRepository repository;
	
	public List<ProdutoAt> findAll() {
		return repository.findAll();
	}
	
	public ProdutoAt findById(Long id) {
		Optional<ProdutoAt> obj =  repository.findById(id);
		return obj.get();
	}
}