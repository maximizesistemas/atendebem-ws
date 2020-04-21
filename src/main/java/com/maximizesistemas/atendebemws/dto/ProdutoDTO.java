package com.maximizesistemas.atendebemws.dto;

import java.io.Serializable;

import javax.persistence.Id;

import com.maximizesistemas.atendebemws.entities.Produto;
import com.maximizesistemas.atendebemws.entities.Usuario;

public class ProdutoDTO implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	private Long id;
	private Usuario usuario;
	private int sincronizado;
	private byte[] foto;
	private int ativo;
	private String descricao;
	private String tipo;
	private String fornec_fabric;
	private int codigo_barras;
	private float preco;
	private float estoque;
	private String observacao;

	public ProdutoDTO() {

	}

	public ProdutoDTO(Produto obj) {
		this.id = obj.getId();
		this.usuario = obj.getUsua();
		this.sincronizado = obj.getSincronizado();
		this.foto = obj.getFoto();
		this.ativo = obj.getAtivo();
		this.descricao = obj.getDescricao();
		this.tipo = obj.getTipo();
		this.fornec_fabric = obj.getFornec_fabric();
		this.codigo_barras = obj.getCodigo_barras();
		this.preco = obj.getPreco();
		this.estoque = obj.getEstoque();
		this.observacao = obj.getObservacao();
	}

	public Produto toProduto() {
		Produto u = new Produto();
		u.setId(this.getId());
		u.setUsua(this.getUsua());
		u.setSincronizado(this.getSincronizado());
		u.setFoto(this.getFoto());
		u.setAtivo(this.getAtivo());
		u.setDescricao(this.getDescricao());
		u.setTipo(this.getTipo());
		u.setFornec_fabric(this.getFornec_fabric());
		u.setCodigo_barras(this.getCodigo_barras());
		u.setPreco(this.getPreco());
		u.setEstoque(this.getEstoque());
		u.setObservacao(this.getObservacao());
		return u;
	}

	public ProdutoDTO createFrom(Produto u) {
		ProdutoDTO dto = new ProdutoDTO();
		dto.setId(u.getId());
		dto.setUsua(u.getUsua());
		dto.setSincronizado(u.getSincronizado());
		dto.setFoto(u.getFoto());
		dto.setAtivo(u.getAtivo());
		dto.setDescricao(u.getDescricao());
		dto.setTipo(u.getTipo());
		dto.setFornec_fabric(u.getFornec_fabric());
		dto.setCodigo_barras(u.getCodigo_barras());
		dto.setPreco(u.getPreco());
		dto.setEstoque(u.getEstoque());
		dto.setObservacao(u.getObservacao());
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

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getFornec_fabric() {
		return fornec_fabric;
	}

	public void setFornec_fabric(String fornec_fabric) {
		this.fornec_fabric = fornec_fabric;
	}

	public int getCodigo_barras() {
		return codigo_barras;
	}

	public void setCodigo_barras(int codigo_barras) {
		this.codigo_barras = codigo_barras;
	}

	public float getPreco() {
		return preco;
	}

	public void setPreco(float preco) {
		this.preco = preco;
	}

	public float getEstoque() {
		return estoque;
	}

	public void setEstoque(float estoque) {
		this.estoque = estoque;
	}

	public String getObservacao() {
		return observacao;
	}

	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}

}
