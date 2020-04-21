package com.maximizesistemas.atendebemws.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.maximizesistemas.atendebemws.entities.Atendimento;

public interface AtendimentoRepository extends JpaRepository<Atendimento, Long>{

}