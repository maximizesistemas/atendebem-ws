package com.maximizesistemas.atendebemws.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "servico")
public class Servico implements Serializable{

	
	private static final long serialVersionUID = 1L;
	@Id
	private Long id;	
    
	@ManyToOne
	@JoinColumn(name = "usuario_id") //nome que vai criar no banco de dados
	@JsonIgnore
	private Usuario usuario; 
    
    private int sincronizado;
    private String descricao;
    private int tipo;
    private float valor;
    private int ajustavel;
    
    public Servico() {
    	
    }

	public Servico(Long id, Usuario usuario, int sincronizado, String descricao, int tipo, float valor, int ajustavel) {
		super();
		this.id = id;
		this.usuario = usuario;
		this.sincronizado = sincronizado;
		this.descricao = descricao;
		this.tipo = tipo;
		this.valor = valor;
		this.ajustavel = ajustavel;
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
		Servico other = (Servico) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
    
    

}
