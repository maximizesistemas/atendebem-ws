package com.maximizesistemas.atendebemws.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.maximizesistemas.atendebemws.entities.ParcelaAt;
import com.maximizesistemas.atendebemws.repositories.ParcelaAtRepository;

@Service
public class ParcelaAtService {
	@Autowired
	private ParcelaAtRepository repository;
	
	public List<ParcelaAt> findAll() {
		return repository.findAll();
	}
	
	public ParcelaAt findById(Long id) {
		Optional<ParcelaAt> obj =  repository.findById(id);
		return obj.get();
	}
}