package com.maximizesistemas.atendebemws.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "despesaat")
public class DespesaAt implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	private Long id;
	private int sincronizado;

	@ManyToOne
	@JoinColumn(name = "atendimento_id") // nome que vai criar no banco de dados
	@JsonIgnore
	private Atendimento atendimento;

	@ManyToOne
	@JoinColumn(name = "despesa_id")
	private Despesa despesa;
	private String data;
	private String anotacoes;
	private int abonado;
	private int ajustavel;
	private float valorTotal;
	private int kmRodado;
	private float quantidade;
	private float valorUnitario;

	public DespesaAt() {

	}

	public DespesaAt(Long id, int sincronizado, Atendimento atendimento, Despesa despesa, String data, String anotacoes,
			int abonado, int ajustavel, float valorTotal, int kmRodado, float quantidadde, float valorUnitario) {
		super();
		this.id = id;
		this.sincronizado = sincronizado;
		this.atendimento = atendimento;
		this.despesa = despesa;
		this.data = data;
		this.anotacoes = anotacoes;
		this.abonado = abonado;
		this.ajustavel = ajustavel;
		this.valorTotal = valorTotal;
		this.kmRodado = kmRodado;
		this.quantidade = quantidadde;
		this.valorUnitario = valorUnitario;
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

	@JsonIgnore
	public Atendimento getAtendimento() {
		return atendimento;
	}

	public void setAtendimento(Atendimento atendimento) {
		this.atendimento = atendimento;
	}

	public Despesa getDespesa() {
		return despesa;
	}

	public void setDespesa(Despesa despesa) {
		this.despesa = despesa;
	}

	public float getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(float quantidade) {
		this.quantidade = quantidade;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public String getAnotacoes() {
		return anotacoes;
	}

	public void setAnotacoes(String anotacoes) {
		this.anotacoes = anotacoes;
	}

	public int getAbonado() {
		return abonado;
	}

	public void setAbonado(int abonado) {
		this.abonado = abonado;
	}

	public int getAjustavel() {
		return ajustavel;
	}

	public void setAjustavel(int ajustavel) {
		this.ajustavel = ajustavel;
	}

	public float getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(float valorTotal) {
		this.valorTotal = valorTotal;
	}

	public int getKmRodado() {
		return kmRodado;
	}

	public void setKmRodado(int kmRodado) {
		this.kmRodado = kmRodado;
	}

	public float getValorUnitario() {
		return valorUnitario;
	}

	public void setValorUnitario(float valorUnitario) {
		this.valorUnitario = valorUnitario;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
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
		DespesaAt other = (DespesaAt) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

}
