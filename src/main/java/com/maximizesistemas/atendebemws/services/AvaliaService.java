package com.maximizesistemas.atendebemws.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.maximizesistemas.atendebemws.entities.Avalia;
import com.maximizesistemas.atendebemws.repositories.AvaliaRepository;

@Service
public class AvaliaService {
	@Autowired
	private AvaliaRepository repository;
	
	public List<Avalia> findAll() {
		return repository.findAll();
	}
	
	public Avalia findById(Long id) {
		Optional<Avalia> obj =  repository.findById(id);
		return obj.get();
	}
}
