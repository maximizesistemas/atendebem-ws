package com.maximizesistemas.atendebemws.dto;

import java.io.Serializable;

import com.maximizesistemas.atendebemws.entities.Atendimento;
import com.maximizesistemas.atendebemws.entities.Produto;
import com.maximizesistemas.atendebemws.entities.ProdutoAt;

public class ProdutoAtDTO implements Serializable {

	private static final long serialVersionUID = 1L;

	private Long id;
	private int sincronizado;
	private Atendimento atendimento;
	private Produto produto;
	private float quantidade;
	private float descontoPer;
	private float descontoValor;
	private float preco;
	private float precoLiquido;
	private float valorTotal;

	public ProdutoAtDTO() {
	}

	public ProdutoAtDTO(ProdutoAt obj) {
		id = obj.getId();
		sincronizado = obj.getSincronizado();
		atendimento = obj.getAtendimento();
		produto = obj.getProduto();
		quantidade = obj.getQuantidade();
		descontoPer = obj.getDescontoPer();
		descontoValor = obj.getDescontoValor();
		preco = obj.getPreco();
		precoLiquido = obj.getPrecoLiquido();
		valorTotal = obj.getValorTotal();
	}

	public ProdutoAt toProdutoAt() {
		ProdutoAt u = new ProdutoAt();
		u.setId(this.getId());
		u.setSincronizado(this.getSincronizado());
		u.setAtendimento(this.getAtendimento());
		u.setProduto(this.getProduto());
		u.setQuantidade(this.getQuantidade());
		u.setDescontoPer(this.getDescontoPer());
		u.setDescontoValor(this.getDescontoValor());
		u.setPreco(this.getPreco());
		u.setPrecoLiquido(this.getPrecoLiquido());
		u.setValorTotal(this.getValorTotal());
		return u;
	}

	public ProdutoAtDTO createFrom(ProdutoAt u) {
		ProdutoAtDTO dto = new ProdutoAtDTO();
		dto.setId(u.getId());
		dto.setSincronizado(u.getSincronizado());
		dto.setAtendimento(u.getAtendimento());
		dto.setProduto(u.getProduto());
		dto.setQuantidade(u.getQuantidade());
		dto.setDescontoPer(u.getDescontoPer());
		dto.setDescontoValor(u.getDescontoValor());
		dto.setPreco(u.getPreco());
		dto.setPrecoLiquido(u.getPrecoLiquido());
		dto.setValorTotal(u.getValorTotal());
		return dto;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public int getSincronizado() {
		return sincronizado;
	}

	public void setSincronizado(int sincronizado) {
		this.sincronizado = sincronizado;
	}

	public Atendimento getAtendimento() {
		return atendimento;
	}

	public void setAtendimento(Atendimento atendimento) {
		this.atendimento = atendimento;
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

	public float getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(float quantidade) {
		this.quantidade = quantidade;
	}

	public float getDescontoPer() {
		return descontoPer;
	}

	public void setDescontoPer(float descontoPer) {
		this.descontoPer = descontoPer;
	}

	public float getDescontoValor() {
		return descontoValor;
	}

	public void setDescontoValor(float descontoValor) {
		this.descontoValor = descontoValor;
	}

	public float getPreco() {
		return preco;
	}

	public void setPreco(float preco) {
		this.preco = preco;
	}

	public float getPrecoLiquido() {
		return precoLiquido;
	}

	public void setPrecoLiquido(float precoLiquido) {
		this.precoLiquido = precoLiquido;
	}

	public float getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(float valorTotal) {
		this.valorTotal = valorTotal;
	}

}
