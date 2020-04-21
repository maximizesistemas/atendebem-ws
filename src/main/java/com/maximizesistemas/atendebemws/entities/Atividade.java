package com.maximizesistemas.atendebemws.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "atividade")
public class Atividade implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	private Long id;
	private int sincronizado;

	@ManyToOne
	@JoinColumn(name = "atendimento_id") // nome que vai criar no banco de dados
	@JsonIgnore
	private Atendimento atendimento;

	@ManyToOne
	@JoinColumn(name = "servico_id")
	private Servico servico;

	private String dtaHoraInicio;
	private String dtaHoraFim;
	private String anotacoes;
	private String tempoTotal;
	private int abonado;
	private int ajustavel;
	private int tipoFixoPorHora;
	private float valor;
	private float valorTotal;

	public Atividade() {

	}

	public Atividade(Long id, int sincronizado, Atendimento atendimento, Servico servico, String dtaHoraInicio,
			String dtaHoraFim, String anotacoes, String tempoTotal, int abonado, int ajustavel, int tipoFixoPorHora,
			float valor, float valorTotal) {
		super();
		this.id = id;
		this.sincronizado = sincronizado;
		this.atendimento = atendimento;
		this.servico = servico;
		this.dtaHoraInicio = dtaHoraInicio;
		this.dtaHoraFim = dtaHoraFim;
		this.anotacoes = anotacoes;
		this.tempoTotal = tempoTotal;
		this.abonado = abonado;
		this.ajustavel = ajustavel;
		this.tipoFixoPorHora = tipoFixoPorHora;
		this.valor = valor;
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

	public String getDtaHoraInicio() {
		return dtaHoraInicio;
	}

	public void setDtaHoraInicio(String dtaHoraInicio) {
		this.dtaHoraInicio = dtaHoraInicio;
	}

	public String getDtaHoraFim() {
		return dtaHoraFim;
	}

	public void setDtaHoraFim(String dtaHoraFim) {
		this.dtaHoraFim = dtaHoraFim;
	}

	public String getAnotacoes() {
		return anotacoes;
	}

	public void setAnotacoes(String anotacoes) {
		this.anotacoes = anotacoes;
	}

	public String getTempoTotal() {
		return tempoTotal;
	}

	public void setTempoTotal(String tempoTotal) {
		this.tempoTotal = tempoTotal;
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

	public int getTipoFixoPorHora() {
		return tipoFixoPorHora;
	}

	public void setTipoFixoPorHora(int tipoFixoPorHora) {
		this.tipoFixoPorHora = tipoFixoPorHora;
	}

	public float getValor() {
		return valor;
	}

	public void setValor(float valor) {
		this.valor = valor;
	}

	public float getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(float valorTotal) {
		this.valorTotal = valorTotal;
	}

	public Atendimento getAtendimento() {
		return atendimento;
	}

	public void setAtendimento(Atendimento atendimento) {
		this.atendimento = atendimento;
	}

	public Servico getServico() {
		return servico;
	}

	public void setServico(Servico servico) {
		this.servico = servico;
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
		Atividade other = (Atividade) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

}
