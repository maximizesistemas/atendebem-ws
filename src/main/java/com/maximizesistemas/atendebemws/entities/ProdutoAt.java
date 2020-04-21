package com.maximizesistemas.atendebemws.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "produtoat")
public class ProdutoAt implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	private Long id;
	private int sincronizado;
	@ManyToOne
	@JoinColumn(name = "atendimento_id") // nome que vai criar no banco de dados
	@JsonIgnore
	private Atendimento atendimento;
	@ManyToOne
	@JoinColumn(name = "produto_id")
	private Produto produto;
	private float quantidade;
	private float descontoPer;
	private float descontoValor;
	private float preco;
	private float precoLiquido;
	private float valorTotal;

	public ProdutoAt() {

	}

	public ProdutoAt(Long id, int sincronizado, Atendimento atendimento, Produto produto, float quantidade,
			float descontoPer, float descontoValor, float preco, float precoLiquido, float valorTotal) {
		super();
		this.id = id;
		this.sincronizado = sincronizado;
		this.atendimento = atendimento;
		this.produto = produto;
		this.quantidade = quantidade;
		this.descontoPer = descontoPer;
		this.descontoValor = descontoValor;
		this.preco = preco;
		this.precoLiquido = precoLiquido;
		this.valorTotal = valorTotal;
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

	@JsonIgnore
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
		ProdutoAt other = (ProdutoAt) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

}
