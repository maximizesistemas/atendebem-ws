package com.maximizesistemas.atendebemws.dto;

import java.io.Serializable;

import com.maximizesistemas.atendebemws.entities.Atendimento;
import com.maximizesistemas.atendebemws.entities.Despesa;
import com.maximizesistemas.atendebemws.entities.DespesaAt;

public class DespesaAtDTO implements Serializable {

	private static final long serialVersionUID = 1L;

	private Long id;
	private int sincronizado;
	private Atendimento atendimento;
	private Despesa despesa;
	private String data;
	private String anotacoes;
	private int abonado;
	private int ajustavel;
	private float valorTotal;
	private int kmRodado;
	private float quantidade;
	private float valorUnitario;

	public DespesaAtDTO() {
	}

	public DespesaAtDTO(DespesaAt obj) {
		id = obj.getId();
		sincronizado = obj.getSincronizado();
		atendimento = obj.getAtendimento();
		despesa = obj.getDespesa();
		data = obj.getData();
		anotacoes = obj.getAnotacoes();
		abonado = obj.getAbonado();
		ajustavel = obj.getAjustavel();
		valorTotal = obj.getValorTotal();
		kmRodado = obj.getKmRodado();
		quantidade = obj.getQuantidade();
		valorUnitario = obj.getValorUnitario();
	}

	public DespesaAt toDespesaAt() {
		DespesaAt u = new DespesaAt();
		u.setId(this.getId());
		u.setSincronizado(this.getSincronizado());
		u.setAtendimento(this.getAtendimento());
		u.setDespesa(this.getDespesa());
		u.setData(this.getData());
		u.setAnotacoes(this.getAnotacoes());
		u.setAbonado(this.getAbonado());
		u.setAjustavel(this.getAjustavel());
		u.setValorTotal(this.getValorTotal());
		u.setKmRodado(this.getKmRodado());
		u.setQuantidade(this.getQuantidade());
		u.setValorUnitario(this.getValorUnitario());
		return u;
	}

	public DespesaAtDTO createFrom(DespesaAt u) {
		DespesaAtDTO dto = new DespesaAtDTO();
		dto.setId(u.getId());
		dto.setSincronizado(u.getSincronizado());
		dto.setAtendimento(u.getAtendimento());
		dto.setDespesa(u.getDespesa());
		dto.setData(u.getData());
		dto.setAnotacoes(u.getAnotacoes());
		dto.setAbonado(u.getAbonado());
		dto.setAjustavel(u.getAjustavel());
		dto.setValorTotal(u.getValorTotal());
		dto.setKmRodado(u.getKmRodado());
		dto.setQuantidade(u.getQuantidade());
		dto.setValorUnitario(u.getValorUnitario());
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

	public Despesa getDespesa() {
		return despesa;
	}

	public void setDespesa(Despesa despesa) {
		this.despesa = despesa;
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

	public float getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(float quantidade) {
		this.quantidade = quantidade;
	}

	public float getValorUnitario() {
		return valorUnitario;
	}

	public void setValorUnitario(float valorUnitario) {
		this.valorUnitario = valorUnitario;
	}

}
