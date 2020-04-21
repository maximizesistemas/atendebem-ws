package com.maximizesistemas.atendebemws.dto;

import java.io.Serializable;

import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.maximizesistemas.atendebemws.entities.Atendimento;
import com.maximizesistemas.atendebemws.entities.ParcelaAt;

public class ParcelaAtDTO implements Serializable {

	private static final long serialVersionUID = 1L;

	private Long id;
	private int sincronizado;
	@ManyToOne
	@JoinColumn(name = "atendimento_id") // nome que vai criar no banco de dados
	@JsonIgnore
	private Atendimento atendimento;
	private int nroParcela;
	private String dtaVcto;
	private Long dtaVctoi;
	private float valorParcela;
	private String dtaRecebimento;
	private float valorPago;
	private int situacao;

	public ParcelaAtDTO() {
	}

	public ParcelaAtDTO(ParcelaAt obj) {
		id = obj.getId();
		atendimento = obj.getAtendimento();
		nroParcela = obj.getNroParcela();
		dtaVcto = obj.getDtaVcto();
		dtaVctoi = obj.getDtaVctoi();
		valorParcela = obj.getValorParcela();
		dtaRecebimento = obj.getDtaRecebimento();
		valorPago = obj.getValorPago();
		situacao = obj.getSituacao();
	}

	public ParcelaAt ParcelaAt() {
		ParcelaAt u = new ParcelaAt();
		u.setId(this.getId());
		u.setAtendimento(this.getAtendimento());
		u.setNroParcela(this.getNroParcela());
		u.setDtaVcto(this.getDtaVcto());
		u.setDtaVctoi(this.getDtaVctoi());
		u.setValorParcela(this.getValorParcela());
		u.setDtaRecebimento(this.getDtaRecebimento());
		u.setValorPago(this.getValorPago());
		u.setSituacao(this.getSituacao());
		return u;
	}

	public ParcelaAtDTO createFrom(ParcelaAt u) {
		ParcelaAtDTO dto = new ParcelaAtDTO();
		dto.setId(u.getId());
		dto.setAtendimento(u.getAtendimento());
		dto.setNroParcela(u.getNroParcela());
		dto.setDtaVcto(u.getDtaVcto());
		dto.setDtaVctoi(u.getDtaVctoi());
		dto.setValorParcela(u.getValorParcela());
		dto.setDtaRecebimento(u.getDtaRecebimento());
		dto.setValorPago(u.getValorPago());
		dto.setSituacao(u.getSituacao());
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

	public int getNroParcela() {
		return nroParcela;
	}

	public void setNroParcela(int nroParcela) {
		this.nroParcela = nroParcela;
	}

	public String getDtaVcto() {
		return dtaVcto;
	}

	public void setDtaVcto(String dtaVcto) {
		this.dtaVcto = dtaVcto;
	}

	public Long getDtaVctoi() {
		return dtaVctoi;
	}

	public void setDtaVctoi(Long dtaVctoi) {
		this.dtaVctoi = dtaVctoi;
	}

	public float getValorParcela() {
		return valorParcela;
	}

	public void setValorParcela(float valorParcela) {
		this.valorParcela = valorParcela;
	}

	public String getDtaRecebimento() {
		return dtaRecebimento;
	}

	public void setDtaRecebimento(String dtaRecebimento) {
		this.dtaRecebimento = dtaRecebimento;
	}

	public float getValorPago() {
		return valorPago;
	}

	public void setValorPago(float valorPago) {
		this.valorPago = valorPago;
	}

	public int getSituacao() {
		return situacao;
	}

	public void setSituacao(int situacao) {
		this.situacao = situacao;
	}

}
