package com.maximizesistemas.atendebemws.dto;

import java.io.Serializable;

import com.maximizesistemas.atendebemws.entities.Servico;
import com.maximizesistemas.atendebemws.entities.Usuario;

public class ServicoDTO implements Serializable {

	private static final long serialVersionUID = 1L;

	private Long id;

	private Usuario usuario;

	private int sincronizado;
	private String descricao;
	private int tipo;
	private float valor;
	private int ajustavel;

	public ServicoDTO() {
	}

	public ServicoDTO(Servico obj) {
		id = obj.getId();
		usuario = obj.getUsua();
		sincronizado = obj.getSincronizado();
		descricao = obj.getDescricao();
		tipo = obj.getTipo();
		valor = obj.getValor();
		ajustavel = obj.getAjustavel();
	}

	public Servico toServico() {
		Servico u = new Servico();
		u.setId(this.getId());
		u.setUsua(this.getUsuario());
		u.setSincronizado(this.getSincronizado());
		u.setDescricao(this.getDescricao());
		u.setTipo(this.getTipo());
		u.setValor(this.getValor());
		u.setAjustavel(this.getAjustavel());
		return u;
	}

	public ServicoDTO createFrom(Servico u) {
		ServicoDTO dto = new ServicoDTO();
		dto.setId(u.getId());
		dto.setUsuario(u.getUsua());
		dto.setSincronizado(u.getSincronizado());
		dto.setDescricao(u.getDescricao());
		dto.setTipo(u.getTipo());
		dto.setValor(u.getValor());
		dto.setAjustavel(u.getAjustavel());
		return dto;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public int getSincronizado() {
		return sincronizado;
	}

	public void setSincronizado(int sincronizado) {
		this.sincronizado = sincronizado;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public int getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}

	public float getValor() {
		return valor;
	}

	public void setValor(float valor) {
		this.valor = valor;
	}

	public int getAjustavel() {
		return ajustavel;
	}

	public void setAjustavel(int ajustavel) {
		this.ajustavel = ajustavel;
	}

}
