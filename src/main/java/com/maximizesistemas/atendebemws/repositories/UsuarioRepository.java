package com.maximizesistemas.atendebemws.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.maximizesistemas.atendebemws.entities.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, String>{

}
