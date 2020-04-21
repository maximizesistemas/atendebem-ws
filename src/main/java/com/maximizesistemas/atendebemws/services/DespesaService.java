package com.maximizesistemas.atendebemws.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.maximizesistemas.atendebemws.entities.Despesa;
import com.maximizesistemas.atendebemws.repositories.DespesaRepository;

@Service
public class DespesaService {
	@Autowired
	private DespesaRepository repository;
	
	public List<Despesa> findAll() {
		return repository.findAll();
	}
	
	public Despesa findById(Long id) {
		Optional<Despesa> obj =  repository.findById(id);
		return obj.get();
	}
}