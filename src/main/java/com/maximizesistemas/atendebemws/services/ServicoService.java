package com.maximizesistemas.atendebemws.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.maximizesistemas.atendebemws.entities.Servico;
import com.maximizesistemas.atendebemws.repositories.ServicoRepository;

@Service
public class ServicoService {
	@Autowired
	private ServicoRepository repository;
	
	public List<Servico> findAll() {
		return repository.findAll();
	}
	
	public Servico findById(Long id) {
		Optional<Servico> obj =  repository.findById(id);
		return obj.get();
	}
}
