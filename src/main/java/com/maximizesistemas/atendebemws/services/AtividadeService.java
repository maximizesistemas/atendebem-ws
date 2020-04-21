package com.maximizesistemas.atendebemws.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.maximizesistemas.atendebemws.entities.Atividade;
import com.maximizesistemas.atendebemws.repositories.AtividadeRepository;

@Service
public class AtividadeService {
	@Autowired
	private AtividadeRepository repository;
	
	public List<Atividade> findAll() {
		return repository.findAll();
	}
	
	public Atividade findById(Long id) {
		Optional<Atividade> obj =  repository.findById(id);
		return obj.get();
	}
}