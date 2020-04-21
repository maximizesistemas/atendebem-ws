package com.maximizesistemas.atendebemws.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "parcelaat")
public class ParcelaAt implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
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

	public ParcelaAt() {

	}

	public ParcelaAt(Long id, int sincronizado, Atendimento atendimento, int nroParcela, String dtaVcto, Long dtaVctoi,
			float valorParcela, String dtaRecebimento, float valorPago, int situacao) {
		super();
		this.id = id;
		this.sincronizado = sincronizado;
		this.atendimento = atendimento;
		this.nroParcela = nroParcela;
		this.dtaVcto = dtaVcto;
		this.dtaVctoi = dtaVctoi;
		this.valorParcela = valorParcela;
		this.dtaRecebimento = dtaRecebimento;
		this.valorPago = valorPago;
		this.situacao = situacao;
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
		ParcelaAt other = (ParcelaAt) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

}
