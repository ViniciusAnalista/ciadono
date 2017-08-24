package br.com.ciadono.entity;

import java.math.BigDecimal;
import java.util.Date;

public class Mensalidade {
	
	private int        idMensalidade;
	private Aluno 	   aluno;
	private Date       dataVencimento;
	private Date 	   dataPagamento;
	private BigDecimal valor;
	
	public int getIdMensalidade() {
		return idMensalidade;
	}
	public void setIdMensalidade(int idMensalidade) {
		this.idMensalidade = idMensalidade;
	}
	public Aluno getAluno() {
		return aluno;
	}
	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}
	public Date getDataVencimento() {
		return dataVencimento;
	}
	public void setDataVencimento(Date dataVencimento) {
		this.dataVencimento = dataVencimento;
	}
	public Date getDataPagamento() {
		return dataPagamento;
	}
	public void setDataPagamento(Date dataPagamento) {
		this.dataPagamento = dataPagamento;
	}
	public BigDecimal getValor() {
		return valor;
	}
	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}
}