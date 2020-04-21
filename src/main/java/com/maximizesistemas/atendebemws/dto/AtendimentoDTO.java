package com.maximizesistemas.atendebemws.dto;

import java.io.Serializable;
import java.time.Instant;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.maximizesistemas.atendebemws.entities.Atendimento;
import com.maximizesistemas.atendebemws.entities.Atividade;
import com.maximizesistemas.atendebemws.entities.Cliente;
import com.maximizesistemas.atendebemws.entities.DespesaAt;
import com.maximizesistemas.atendebemws.entities.ParcelaAt;
import com.maximizesistemas.atendebemws.entities.ProdutoAt;
import com.maximizesistemas.atendebemws.entities.Usuario;
import com.maximizesistemas.atendebemws.enums.AtendimentoStatus;

public class AtendimentoDTO implements Serializable {

	private static final long serialVersionUID = 1L;

	private Long id;

	private Usuario usuario;
	private int sincronizado;
	private AtendimentoStatus situacao;
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
	private Instant dtaHora;
	private List<ParcelaAt> parcelaAt = new ArrayList<>();
	private Set<ProdutoAt> produtoAt = new HashSet<>();
	private Set<Atividade> atividade = new HashSet<>();
	private Set<DespesaAt> despesaAt = new HashSet<>();

	public AtendimentoDTO() {

	}

	public AtendimentoDTO(Atendimento obj) {
		id = obj.getId();
		usuario = obj.getUsuario();
		sincronizado = obj.getSincronizado();
		situacao = obj.getSituacao();
		cliente = obj.getCliente();
		dtaAbertura = obj.getDtaAbertura();
		dtaPrevInicio = obj.getDtaPrevInicio();
		dtaPrevFim = obj.getDtaPrevFim();
		titulo = obj.getTitulo();
		observacao = obj.getObservacao();
		valorAtividade = obj.getValorAtividade();
		valorDespesa = obj.getValorDespesa();
		valorProduto = obj.getValorProduto();
		valorAbonado = obj.getValorAbonado();
		descontoPer = obj.getDescontoPer();
		descontoValor = obj.getDescontoValor();
        totalGeral = obj.getTotal();
        abonado = obj.getAbonado();
        idFormaPagamento = obj.getIdFormaPagamento();
        prazoMedio = obj.getPrazoMedio();
        total = obj.getTotal();
        desconto = obj.getDesconto();
        dtaHora = obj.getDtahora();
    	parcelaAt = obj.getParcelaAt();
    	produtoAt = obj.getProdutoAt();
    	atividade = obj.getAtividade();
    	despesaAt = obj.getDespesaAt();        
	}
	
	public Atendimento toAtendimento() {
		Atendimento u = new Atendimento();
		u.setId(this.getId());
		u.setUsuario(this.getUsuario());
		u.setSincronizado(this.getSincronizado());
		u.setSituacao(this.getSituacao());
		u.setCliente(this.getCliente());
		u.setDtaAbertura(this.getDtaAbertura());
		u.setDtaPrevInicio(this.getDtaPrevInicio());
		u.setDtaPrevFim(this.getDtaPrevFim());
		u.setTitulo(this.getTitulo());
		u.setObservacao(this.getObservacao());
		u.setValorAtividade(this.getValorAtividade());
		u.setValorDespesa(this.getValorDespesa());
		u.setValorProduto(this.getValorProduto());
		u.setValorAbonado(this.getValorAbonado());
		u.setDescontoPer(this.getDescontoPer());
		u.setDescontoValor(this.getDescontoValor());
		u.setTotalGeral(this.getTotal());
		u.setAbonado(this.getAbonado());
		u.setIdFormaPagamento(this.getIdFormaPagamento());
		u.setPrazoMedio(this.getPrazoMedio());
		u.setTotal(this.getTotal());
		u.setDesconto(this.getDesconto());
		u.setDtahora(this.getDtaHora());
		u.setParcelaAt(this.getParcelaAt());
		u.setProdutoAt(this.getProdutoAt());
		u.setAtividade(this.getAtividade());
		u.setDespesaAt(this.getDespesaAt());  
		return u;
	}

	public AtendimentoDTO createFrom(Atendimento u) {
		AtendimentoDTO dto = new AtendimentoDTO();
		dto.setId(u.getId());
		dto.setId(u.getId());
		dto.setUsuario(u.getUsuario());
		dto.setSincronizado(u.getSincronizado());
		dto.setSituacao(u.getSituacao());
		dto.setCliente(u.getCliente());
		dto.setDtaAbertura(u.getDtaAbertura());
		dto.setDtaPrevInicio(u.getDtaPrevInicio());
		dto.setDtaPrevFim(u.getDtaPrevFim());
		dto.setTitulo(u.getTitulo());
		dto.setObservacao(u.getObservacao());
		dto.setValorAtividade(u.getValorAtividade());
		dto.setValorDespesa(u.getValorDespesa());
		dto.setValorProduto(u.getValorProduto());
		dto.setValorAbonado(u.getValorAbonado());
		dto.setDescontoPer(u.getDescontoPer());
		dto.setDescontoValor(u.getDescontoValor());
		dto.setTotalGeral(u.getTotal());
		dto.setAbonado(u.getAbonado());
		dto.setIdFormaPagamento(u.getIdFormaPagamento());
		dto.setPrazoMedio(u.getPrazoMedio());
		dto.setTotal(u.getTotal());
		dto.setDesconto(u.getDesconto());
		dto.setDtaHora(u.getDtahora());
		dto.setParcelaAt(u.getParcelaAt());
		dto.setProdutoAt(u.getProdutoAt());
		dto.setAtividade(u.getAtividade());
		dto.setDespesaAt(u.getDespesaAt()); 
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

	public AtendimentoStatus getSituacao() {
		return situacao;
	}

	public void setSituacao(AtendimentoStatus situacao) {
		this.situacao = situacao;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
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

	public Instant getDtaHora() {
		return dtaHora;
	}

	public void setDtaHora(Instant dtaHora) {
		this.dtaHora = dtaHora;
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



}
