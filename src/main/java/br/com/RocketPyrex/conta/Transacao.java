package br.com.RocketPyrex.conta;

import java.io.Serializable;
import java.util.Calendar;

public class Transacao implements Serializable{
	
	private static final long serialVersionUID = 1L;
	private Integer codTransacao;
	private Integer t_tp_transa_cod_tp_transacao;
	private Integer t_usuario_cod_usuario;
	private Double valorTransacao;
	private Calendar dataTransacao;
	private String descricaoTransacao;
	
	public Transacao() {};
	
	public Transacao(Integer codTransacao, Integer t_tp_transa_cod_tp_transacao, Integer t_usuario_cod_usuario,
			Double valorTransacao, Calendar dataTransacao, String descricaoTransacao) {
		super();
		this.codTransacao = codTransacao;
		this.t_tp_transa_cod_tp_transacao = t_tp_transa_cod_tp_transacao;
		this.t_usuario_cod_usuario = t_usuario_cod_usuario;
		this.valorTransacao = valorTransacao;
		this.dataTransacao = dataTransacao;
		this.descricaoTransacao = descricaoTransacao;
	}

	public Integer getCodTransacao() {
		return codTransacao;
	}

	public void setCodTransacao(Integer cod_transacao) {
		this.codTransacao = cod_transacao;
	}

	public Integer getT_tp_transa_cod_tp_transacao() {
		return t_tp_transa_cod_tp_transacao;
	}

	public void setT_tp_transa_cod_tp_transacao(Integer t_tp_transa_cod_tp_transacao) {
		this.t_tp_transa_cod_tp_transacao = t_tp_transa_cod_tp_transacao;
	}

	public Integer getT_usuario_cod_usuario() {
		return t_usuario_cod_usuario;
	}

	public void setT_usuario_cod_usuario(Integer t_usuario_cod_usuario) {
		this.t_usuario_cod_usuario = t_usuario_cod_usuario;
	}

	public Double getValorTransacao() {
		return valorTransacao;
	}

	public void setValorTransacao(Double valorTransacao) {
		this.valorTransacao = valorTransacao;
	}

	public Calendar getDataTransacao() {
		return dataTransacao;
	}

	public void setDataTransacao(Calendar dataTransacao) {
		this.dataTransacao = dataTransacao;
	}

	public String getDescricaoTransacao() {
		return descricaoTransacao;
	}

	public void setDescricaoTransacao(String descricaoTransacao) {
		this.descricaoTransacao = descricaoTransacao;
	}
	
}
