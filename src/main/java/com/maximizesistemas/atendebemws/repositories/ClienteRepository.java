package com.maximizesistemas.atendebemws.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.maximizesistemas.atendebemws.entities.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long>{

}