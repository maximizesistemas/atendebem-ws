package com.maximizesistemas.atendebemws.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "produto")
public class Produto implements Serializable {

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
	private String descricao;
	private String tipo;
	private String fornec_fabric;
	private int codigo_barras;
	private float preco;
	private float estoque;
	private String observacao;

	public Produto() {

	}

	public Produto(Long id, Usuario usuario, int sincronizado, byte[] foto, int ativo, String descricao, String tipo,
			String fornec_fabric, int codigo_barras, float preco, float estoque, String observacao) {
		super();
		this.id = id;
		this.usuario = usuario;
		this.sincronizado = sincronizado;
		this.foto = foto;
		this.ativo = ativo;
		this.descricao = descricao;
		this.tipo = tipo;
		this.fornec_fabric = fornec_fabric;
		this.codigo_barras = codigo_barras;
		this.preco = preco;
		this.estoque = estoque;
		this.observacao = observacao;
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
		Produto other = (Produto) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

}
