package com.maximizesistemas.atendebemws.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "cliente")
public class Cliente implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	private Long id;

	@ManyToOne
	@JoinColumn(name = "usuario_id") // nome que vai criar no banco de dados
	@JsonIgnore
	private Usuario usuario;
	private int sincronizado;
	private byte[] foto;
	private int ativo;
	private Long codigo;
	private int prospect;
	private String nome;
	private String endereco;
	private String bairro;
	private int cep;
	private String cidade;
	private String uf;
	private Long telefone;
	private Long celular;
	private String contato;
	private int classificacao;
	private String email;
	private String atributo;
	private String observacao;
	private float distancia;
	private String dtacadastro;

	@JsonIgnore
	@OneToMany(mappedBy = "cliente")
	private List<Atendimento> atendimento = new ArrayList<>();

	public Cliente() {

	}

	public Cliente(Long id, Usuario usuario, int sincronizado, byte[] foto, int ativo, Long codigo, int prospect,
			String nome, String endereco, String bairro, int cep, String cidade, String uf, Long telefone, Long celular,
			String contato, int classificacao, String email, String atributo, String observacao, float distancia,
			String dtacadastro) {
		super();
		this.id = id;
		this.usuario = usuario;
		this.sincronizado = sincronizado;
		this.foto = foto;
		this.ativo = ativo;
		this.codigo = codigo;
		this.prospect = prospect;
		this.nome = nome;
		this.endereco = endereco;
		this.bairro = bairro;
		this.cep = cep;
		this.cidade = cidade;
		this.uf = uf;
		this.telefone = telefone;
		this.celular = celular;
		this.contato = contato;
		this.classificacao = classificacao;
		this.email = email;
		this.atributo = atributo;
		this.observacao = observacao;
		this.distancia = distancia;
		this.dtacadastro = dtacadastro;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@JsonIgnore
	public Usuario getUsua() {
		return usuario;
	}

	public void setUsua(Usuario usua) {
		this.usuario = usua;
	}

	public int getSincronizado() {
		return sincronizado;
	}

	public void setSincronizado(int sincronizado) {
		this.sincronizado = sincronizado;
	}

	public byte[] getFoto() {
		return foto;
	}

	public void setFoto(byte[] foto) {
		this.foto = foto;
	}

	public int getAtivo() {
		return ativo;
	}

	public void setAtivo(int ativo) {
		this.ativo = ativo;
	}

	public Long getCodigo() {
		return codigo;
	}

	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}

	public int getProspect() {
		return prospect;
	}

	public void setProspect(int prospect) {
		this.prospect = prospect;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public int getCep() {
		return cep;
	}

	public void setCep(int cep) {
		this.cep = cep;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getUf() {
		return uf;
	}

	public void setUf(String uf) {
		this.uf = uf;
	}

	public Long getTelefone() {
		return telefone;
	}

	public void setTelefone(Long telefone) {
		this.telefone = telefone;
	}

	public Long getCelular() {
		return celular;
	}

	public void setCelular(Long celular) {
		this.celular = celular;
	}

	public String getContato() {
		return contato;
	}

	public void setContato(String contato) {
		this.contato = contato;
	}

	public int getClassificacao() {
		return classificacao;
	}

	public void setClassificacao(int classificacao) {
		this.classificacao = classificacao;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAtributo() {
		return atributo;
	}

	public void setAtributo(String atributo) {
		this.atributo = atributo;
	}

	public String getObservacao() {
		return observacao;
	}

	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}

	public float getDistancia() {
		return distancia;
	}

	public void setDistancia(float distancia) {
		this.distancia = distancia;
	}

	public String getDtacadastro() {
		return dtacadastro;
	}

	public void setDtacadastro(String dtacadastro) {
		this.dtacadastro = dtacadastro;
	}

	@JsonIgnore
	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	@JsonIgnore
	public List<Atendimento> getAtendimento() {
		return atendimento;
	}

	public void setAtendimento(List<Atendimento> atendimento) {
		this.atendimento = atendimento;
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
		Cliente other = (Cliente) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

}
