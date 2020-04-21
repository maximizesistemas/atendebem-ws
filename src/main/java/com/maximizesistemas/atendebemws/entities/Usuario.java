package com.maximizesistemas.atendebemws.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "usuario")
public class Usuario implements Serializable{

	
	 private static final long serialVersionUID = 1L;
	 @Id
	 private String id;
     private String nome;
	 private String email;
	 private String senha;
	 private Integer emp;

	 @OneToMany(mappedBy = "usuario")
	 private List<Atendimento> atendimento = new ArrayList<>();
	 
	 @OneToMany(mappedBy = "usuario") //nome do atributo que está do outro lado da associação
	 private List<Cliente> cliente = new ArrayList<>();
	 
	 @OneToMany(mappedBy = "usuario")
	private List<Produto> produto = new ArrayList<>();

	@OneToMany(mappedBy = "usuario")
	private List<Servico> servico = new ArrayList<>();
	 
	 @OneToMany(mappedBy = "usuario")
	 private List<Despesa> despesa = new ArrayList<>(); 

	 public Usuario() {
		 
	 }


	public Usuario(String id, String nome, String email, String senha, Integer emp) {
		super();
		this.id = id;
		this.nome = nome;
		this.email = email;
		this.senha = senha;
		this.emp = emp;
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

	public List<Atendimento> getAtend() {
		return atendimento;
	}

	public List<Cliente> getClie() {
		return cliente;
	}

	public List<Produto> getProd() {
		return produto;
	}

	public List<Servico> getServico() {
		return servico;
	}

	public List<Despesa> getDesp() {
		return despesa;
	}
	 

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Usuario other = (Usuario) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}


	 
	 
}
