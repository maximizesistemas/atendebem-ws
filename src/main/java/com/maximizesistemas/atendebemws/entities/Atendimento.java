package com.maximizesistemas.atendebemws.entities;

import java.io.Serializable;
import java.time.Instant;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.maximizesistemas.atendebemws.enums.AtendimentoStatus;

@Entity
@Table(name = "atendimento")
public class Atendimento implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	private Long id;

	@ManyToOne
	@JoinColumn(name = "usuario_id") // nome que vai criar no banco de dados
	@JsonIgnore
	private Usuario usuario;

	private int sincronizado;

	private int situacao;

	@ManyToOne
	@JoinColumn(name = "cliente_id") // nome que vai criar no banco de dados
	private Cliente cliente;
	private String dtaAbertura;
	private String dtaPrevInicio;
	private String dtaPrevFim;
	private String titulo;
	private String observacao;
	private float valorAtividade;
	private float valorDespesa;
	private float valorProduto;
	private float valorAbonado;
	private float descontoPer;
	private float descontoValor;
	private float totalGeral;
	private int abonado;
	private Long idFormaPagamento;
	private int prazoMedio;
	private float total;
	private int desconto;
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss'Z'", timezone = "GMT")
	private Instant dtahora;

	@OneToMany(mappedBy = "atendimento")
	private List<ParcelaAt> parcelaAt = new ArrayList<>();

	@OneToMany(mappedBy = "atendimento")
	private Set<ProdutoAt> produtoAt = new HashSet<>();

	@OneToMany(mappedBy = "atendimento")
	private Set<Atividade> atividade = new HashSet<>();

	@OneToMany(mappedBy = "atendimento")
	private Set<DespesaAt> despesaAt = new HashSet<>();

	public Atendimento() {

	}

	public Atendimento(Long id, Usuario usuario, int sincronizado, AtendimentoStatus situacao, Cliente cliente,
			String dtaAbertura, String dtaPrevInicio, String dtaPrevFim, String titulo, String observacao,
			float valorAtividade, float valorDespesa, float valorProduto, float valorAbonado, float descontoPer,
			float descontoValor, float totalGeral, int abonado, Long idFormaPagamento, int prazoMedio, float total,
			int desconto, Instant dtahora) {
		super();
		this.id = id;
		this.usuario = usuario;
		this.sincronizado = sincronizado;
		setSituacao(situacao);
		this.cliente = cliente;
		this.dtaAbertura = dtaAbertura;
		this.dtaPrevInicio = dtaPrevInicio;
		this.dtaPrevFim = dtaPrevFim;
		this.titulo = titulo;
		this.observacao = observacao;
		this.valorAtividade = valorAtividade;
		this.valorDespesa = valorDespesa;
		this.valorProduto = valorProduto;
		this.valorAbonado = valorAbonado;
		this.descontoPer = descontoPer;
		this.descontoValor = descontoValor;
		this.totalGeral = totalGeral;
		this.abonado = abonado;
		this.idFormaPagamento = idFormaPagamento;
		this.prazoMedio = prazoMedio;
		this.total = total;
		this.desconto = desconto;
		this.dtahora = dtahora;
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

	public AtendimentoStatus getSituacao() {
		return AtendimentoStatus.valueOf(situacao);
	}

	public void setSituacao(AtendimentoStatus situacao) {
		if (situacao != null)
			this.situacao = situacao.getCode();
	}

	@JsonIgnore
	public Usuario getUsua() {
		return usuario;
	}

	
	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public void setSituacao(int situacao) {
		this.situacao = situacao;
	}


	public String getDtaAbertura() {
		return dtaAbertura;
	}

	public void setDtaAbertura(String dtaAbertura) {
		this.dtaAbertura = dtaAbertura;
	}

	public String getDtaPrevInicio() {
		return dtaPrevInicio;
	}

	public void setDtaPrevInicio(String dtaPrevInicio) {
		this.dtaPrevInicio = dtaPrevInicio;
	}

	public String getDtaPrevFim() {
		return dtaPrevFim;
	}

	public void setDtaPrevFim(String dtaPrevFim) {
		this.dtaPrevFim = dtaPrevFim;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getObservacao() {
		return observacao;
	}

	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}

	public float getValorAtividade() {
		return valorAtividade;
	}

	public void setValorAtividade(float valorAtividade) {
		this.valorAtividade = valorAtividade;
	}

	public float getValorDespesa() {
		return valorDespesa;
	}

	public void setValorDespesa(float valorDespesa) {
		this.valorDespesa = valorDespesa;
	}

	public float getValorProduto() {
		return valorProduto;
	}

	public void setValorProduto(float valorProduto) {
		this.valorProduto = valorProduto;
	}

	public float getValorAbonado() {
		return valorAbonado;
	}

	public void setValorAbonado(float valorAbonado) {
		this.valorAbonado = valorAbonado;
	}

	public float getDescontoPer() {
		return descontoPer;
	}

	public void setDescontoPer(float descontoPer) {
		this.descontoPer = descontoPer;
	}

	public float getDescontoValor() {
		return descontoValor;
	}

	public void setDescontoValor(float descontoValor) {
		this.descontoValor = descontoValor;
	}

	public float getTotalGeral() {
		return totalGeral;
	}

	public void setTotalGeral(float totalGeral) {
		this.totalGeral = totalGeral;
	}

	public int getAbonado() {
		return abonado;
	}

	public void setAbonado(int abonado) {
		this.abonado = abonado;
	}

	public Long getIdFormaPagamento() {
		return idFormaPagamento;
	}

	public void setIdFormaPagamento(Long idFormaPagamento) {
		this.idFormaPagamento = idFormaPagamento;
	}

	public int getPrazoMedio() {
		return prazoMedio;
	}

	public void setPrazoMedio(int prazoMedio) {
		this.prazoMedio = prazoMedio;
	}

	public float getTotal() {
		return total;
	}

	public void setTotal(float total) {
		this.total = total;
	}

	public int getDesconto() {
		return desconto;
	}

	public void setDesconto(int desconto) {
		this.desconto = desconto;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public Instant getDtahora() {
		return dtahora;
	}

	public void setDtahora(Instant dtahora) {
		this.dtahora = dtahora;
	}

	
	public List<ParcelaAt> getParcelaAt() {
		return parcelaAt;
	}

	public void setParcelaAt(List<ParcelaAt> parcelaAt) {
		this.parcelaAt = parcelaAt;
	}

	public Set<ProdutoAt> getProdutoAt() {
		return produtoAt;
	}

	public void setProdutoAt(Set<ProdutoAt> produtoAt) {
		this.produtoAt = produtoAt;
	}

	public Set<Atividade> getAtividade() {
		return atividade;
	}

	public void setAtividade(Set<Atividade> atividade) {
		this.atividade = atividade;
	}

	public Set<DespesaAt> getDespesaAt() {
		return despesaAt;
	}

	public void setDespesaAt(Set<DespesaAt> despesaAt) {
		this.despesaAt = despesaAt;
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
		Atendimento other = (Atendimento) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

}
