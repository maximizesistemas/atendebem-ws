package com.maximizesistemas.atendebemws.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.maximizesistemas.atendebemws.entities.Atendimento;
import com.maximizesistemas.atendebemws.repositories.AtendimentoRepository;

@Service
public class AtendimentoService {
	@Autowired
	private AtendimentoRepository repository;
	
	public List<Atendimento> findAll() {
		return repository.findAll();
	}
	
	public Atendimento findById(Long id) {
		Optional<Atendimento> obj =  repository.findById(id);
		return obj.get();
	}
}