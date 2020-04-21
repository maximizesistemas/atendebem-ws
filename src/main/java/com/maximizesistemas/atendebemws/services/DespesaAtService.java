package com.maximizesistemas.atendebemws.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.maximizesistemas.atendebemws.entities.DespesaAt;
import com.maximizesistemas.atendebemws.repositories.DespesaAtRepository;

@Service
public class DespesaAtService {
	@Autowired
	private DespesaAtRepository repository;
	
	public List<DespesaAt> findAll() {
		return repository.findAll();
	}
	
	public DespesaAt findById(Long id) {
		Optional<DespesaAt> obj =  repository.findById(id);
		return obj.get();
	}
}