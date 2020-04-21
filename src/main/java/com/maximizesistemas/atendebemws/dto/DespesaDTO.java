package com.maximizesistemas.atendebemws.dto;

import java.io.Serializable;

import com.maximizesistemas.atendebemws.entities.Despesa;
import com.maximizesistemas.atendebemws.entities.Usuario;

public class DespesaDTO implements Serializable{

	private static final long serialVersionUID = 1L;
	
    private Long id;	
	private Usuario usuario; 
    private int sincronizado;
    private String descricao;
    private float valor;
    private int ajustavel;
    private int kmrodado;
    private int exclui;
    
	public DespesaDTO() {
	}

	public DespesaDTO(Despesa obj) {
		id = obj.getId();
		usuario = obj.getUsuario();
		sincronizado = obj.getSincronizado();
		descricao = obj.getDescricao();
		valor = obj.getValor();
		ajustavel = obj.getAjustavel();
		kmrodado = obj.getKmrodado();
		exclui = obj.getExclui();
	}

	public Despesa toDespesa() {
		Despesa u = new Despesa();
		u.setId(this.getId());
		u.setUsuario(this.getUsua());
		u.setSincronizado(this.getSincronizado());
		u.setDescricao(this.getDescricao());
		u.setValor(this.getValor());
		u.setAjustavel(this.getAjustavel());
		u.setKmrodado(this.getKmrodado());
		u.setExclui(this.getExclui());
		return u;
	}

	public DespesaDTO createFrom(Despesa u) {
		DespesaDTO dto = new DespesaDTO();
		dto.setId(u.getId());
		dto.setUsua(u.getUsuario());
		dto.setSincronizado(u.getSincronizado());
		dto.setDescricao(u.getDescricao());
		dto.setValor(u.getValor());
		dto.setAjustavel(u.getAjustavel());
		dto.setKmrodado(u.getKmrodado());
		dto.setExclui(u.getExclui());
		return dto;
	}

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}

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
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
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
	public int getKmrodado() {
		return kmrodado;
	}
	public void setKmrodado(int kmrodado) {
		this.kmrodado = kmrodado;
	}
	public int getExclui() {
		return exclui;
	}
	public void setExclui(int exclui) {
		this.exclui = exclui;
	}

}
