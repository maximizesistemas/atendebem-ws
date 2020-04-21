package com.maximizesistemas.atendebemws.dto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.maximizesistemas.atendebemws.entities.Atendimento;
import com.maximizesistemas.atendebemws.entities.Cliente;
import com.maximizesistemas.atendebemws.entities.Usuario;

public class ClienteDTO implements Serializable {

	private static final long serialVersionUID = 1L;

	private Long id;

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

	private List<Atendimento> atendimento = new ArrayList<>();

	public ClienteDTO() {

	}

	public ClienteDTO(Cliente obj) {
		this.id = obj.getId();
		this.usuario = obj.getUsua();
		this.sincronizado = obj.getSincronizado();
		this.foto = obj.getFoto();
		this.ativo = obj.getAtivo();
		this.codigo = obj.getCodigo();
		this.prospect = obj.getProspect();
		this.nome = obj.getNome();
		this.endereco = obj.getEndereco();
		this.bairro = obj.getBairro();
		this.cep = obj.getCep();
		this.cidade = obj.getCidade();
		this.uf = obj.getUf();
		this.telefone = obj.getTelefone();
		this.celular = obj.getCelular();
		this.contato = obj.getContato();
		this.classificacao = obj.getClassificacao();
		this.email = obj.getEmail();
		this.atributo = obj.getEmail();
		this.observacao = obj.getObservacao();
		this.distancia = obj.getDistancia();
		this.dtacadastro = obj.getDtacadastro();
		this.setAtendimento(obj.getAtendimento());
	}

	public Cliente toCliente() {
		Cliente c = new Cliente();
		c.setId(this.getId());
		c.setUsua(this.getUsua());
		c.setSincronizado(this.getSincronizado());
		c.setFoto(this.getFoto());
		c.setAtivo(this.getAtivo());
		c.setCodigo(this.getCodigo());
		c.setProspect(this.getProspect());
		c.setNome(this.getNome());
		c.setEndereco(this.getEndereco());
		c.setBairro(this.getBairro());
		c.setCep(this.getCep());
		c.setCidade(this.getCidade());
		c.setCidade(this.getCidade());
		c.setTelefone(this.getTelefone());
		c.setCelular(this.getCelular());
		c.setContato(this.getContato());
		c.setClassificacao(this.getClassificacao());
		c.setEmail(this.getEmail());
		c.setAtributo(this.getAtributo());
		c.setObservacao(this.getObservacao());
		c.setDistancia(this.getDistancia());
		c.setDtacadastro(this.getDtacadastro());
		c.setAtendimento(this.getAtendimento());
		return c;
	}

	public ClienteDTO createFrom(Cliente c) {
		ClienteDTO dto = new ClienteDTO();
		dto.setId(c.getId());
		dto.setUsua(c.getUsua());
		dto.setSincronizado(c.getSincronizado());
		dto.setFoto(c.getFoto());
		dto.setAtivo(c.getAtivo());
		dto.setCodigo(c.getCodigo());
		dto.setProspect(c.getProspect());
		dto.setNome(c.getNome());
		dto.setEndereco(c.getEndereco());
		dto.setBairro(c.getBairro());
		dto.setCep(c.getCep());
		dto.setCidade(c.getCidade());
		dto.setCidade(c.getCidade());
		dto.setTelefone(c.getTelefone());
		dto.setCelular(c.getCelular());
		dto.setContato(c.getContato());
		dto.setClassificacao(c.getClassificacao());
		dto.setEmail(c.getEmail());
		dto.setAtributo(c.getAtributo());
		dto.setObservacao(c.getObservacao());
		dto.setDistancia(c.getDistancia());
		dto.setDtacadastro(c.getDtacadastro());
		dto.setAtendimento(c.getAtendimento());

		return dto;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Usuario getUsua() {
		return usuario;
	}

	public void setUsua(Usuario usua) {
		this.usuario = usua;
	}

	// @JsonIgnore
	// public List<Atendimento> getAtend() {
	// return atendimento;
	// }

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

	public List<Atendimento> getAtendimento() {
		return atendimento;
	}

	public void setAtendimento(List<Atendimento> atendimento) {
		this.atendimento = atendimento;
	}

}
