package com.maximizesistemas.atendebemws.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.maximizesistemas.atendebemws.entities.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long>{

}
