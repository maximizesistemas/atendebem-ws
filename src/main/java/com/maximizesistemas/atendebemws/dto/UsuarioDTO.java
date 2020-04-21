package com.maximizesistemas.atendebemws.dto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.maximizesistemas.atendebemws.entities.Atendimento;
import com.maximizesistemas.atendebemws.entities.Cliente;
import com.maximizesistemas.atendebemws.entities.Despesa;
import com.maximizesistemas.atendebemws.entities.Produto;
import com.maximizesistemas.atendebemws.entities.Servico;
import com.maximizesistemas.atendebemws.entities.Usuario;

public class UsuarioDTO implements Serializable {

	private static final long serialVersionUID = 1L;

	private String id;
	private String nome;
	private String email;
	private String senha;
	private Integer emp;

	private List<Atendimento> atendimento = new ArrayList<>();
	private List<Cliente> cliente = new ArrayList<>();
	private List<Produto> produto = new ArrayList<>();
	private List<Despesa> despesa = new ArrayList<>();
	private List<Servico> servico = new ArrayList<>();

	public UsuarioDTO() {

	}

	public UsuarioDTO(Usuario obj) {
		id = obj.getId();
		nome = obj.getNome();
		email = obj.getEmail();
		nome = obj.getNome();
		senha = obj.getSenha();
		emp = obj.getEmp();
		atendimento = obj.getAtend();
		cliente = obj.getClie();
		produto = obj.getProd();
		despesa = obj.getDesp();
		servico = obj.getServico();
	}

	public Usuario toUsuario() {
		Usuario u = new Usuario();
		u.setId(this.getId());
		u.setNome(this.getNome());
		u.setEmail(this.getEmail());
		u.setSenha(this.getSenha());
		u.setEmp(this.getEmp());
		return u;
	}

	public UsuarioDTO createFrom(Usuario u) {
		UsuarioDTO dto = new UsuarioDTO();
		dto.setId(u.getId());
		dto.setNome(u.getNome());
		dto.setEmail(u.getEmail());
		dto.setSenha(u.getSenha());
		dto.setEmp(u.getEmp());
		return dto;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public Integer getEmp() {
		return emp;
	}

	public void setEmp(Integer emp) {
		this.emp = emp;
	}

	public List<Atendimento> getAtendimento() {
		return atendimento;
	}

	public List<Cliente> getClie() {
		return cliente;
	}

	public List<Produto> getProd() {
		return produto;
	}

	public List<Despesa> getDespesa() {
		return despesa;
	}

	public List<Servico> getServico() {
		return servico;
	}

}
