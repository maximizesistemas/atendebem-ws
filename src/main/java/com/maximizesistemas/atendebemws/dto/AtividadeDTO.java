package com.maximizesistemas.atendebemws.dto;

import java.io.Serializable;

import com.maximizesistemas.atendebemws.entities.Atendimento;
import com.maximizesistemas.atendebemws.entities.Atividade;
import com.maximizesistemas.atendebemws.entities.Servico;

public class AtividadeDTO implements Serializable {

	private static final long serialVersionUID = 1L;

	private Long id;
	private int sincronizado;
	private Atendimento atendimento;
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

	public AtividadeDTO() {
	}

	public AtividadeDTO(Atividade obj) {
		id = obj.getId();
		sincronizado = obj.getSincronizado();
		atendimento = obj.getAtendimento();
		servico = obj.getServico();
		dtaHoraInicio = obj.getDtaHoraInicio();
		dtaHoraFim = obj.getDtaHoraFim();
		anotacoes = obj.getAnotacoes();
		tempoTotal = obj.getTempoTotal();
		abonado = obj.getAbonado();
		ajustavel = obj.getAjustavel();
		tipoFixoPorHora = obj.getTipoFixoPorHora();
		valor = obj.getValor();
		valorTotal = obj.getValorTotal();
	}

	public Atividade toAtividade() {
		Atividade u = new Atividade();
		u.setId(this.getId());
		u.setSincronizado(this.getSincronizado());
		u.setAtendimento(this.getAtendimento());
		u.setServico(this.getServico());
		u.setDtaHoraInicio(this.getDtaHoraInicio());
		u.setDtaHoraFim(this.getDtaHoraFim());
		u.setAnotacoes(this.getAnotacoes());
		u.setTempoTotal(this.getTempoTotal());
		u.setAbonado(this.getAbonado());
		u.setAjustavel(this.getAjustavel());
		u.setTipoFixoPorHora(this.getTipoFixoPorHora());
		u.setValor(this.getValor());
		u.setValorTotal(this.getValorTotal());
		return u;
	}

	public AtividadeDTO createFrom(Atividade u) {
		AtividadeDTO dto = new AtividadeDTO();
		dto.setId(u.getId());
		dto.setSincronizado(u.getSincronizado());
		dto.setAtendimento(u.getAtendimento());
		dto.setServico(u.getServico());
		dto.setDtaHoraInicio(u.getDtaHoraInicio());
		dto.setDtaHoraFim(u.getDtaHoraFim());
		dto.setAnotacoes(u.getAnotacoes());
		dto.setTempoTotal(u.getTempoTotal());
		dto.setAbonado(u.getAbonado());
		dto.setAjustavel(u.getAjustavel());
		dto.setTipoFixoPorHora(u.getTipoFixoPorHora());
		dto.setValor(u.getValor());
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

	public Servico getServico() {
		return servico;
	}

	public void setServico(Servico servico) {
		this.servico = servico;
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

}
