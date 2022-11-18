package br.com.RocketPyrex.conta;

import java.io.Serializable;
import java.util.Calendar;


public class Investimento implements Serializable{
	
	private static final long serialVersionUID = 1L;
	private Integer codInvestimento;
	private Integer t_usuario_cod_usuario;
	private Integer t_tp_invest_cod_tp_invest;
	private Double valorInvestimento;
	private Double valorRendimento;
	private Calendar dataInvestimento;
	private String descricaoInvestimento;
		
	public Investimento() {};

	public Investimento(Integer codInvestimento, Integer t_usuario_cod_usuario, Integer t_tp_invest_cod_tp_invest,
			Double valorInvestimento, Double valorRendimento, Calendar dataInvestimento, String descricaoInvestimento) {
		super();
		this.codInvestimento = codInvestimento;
		this.t_usuario_cod_usuario = t_usuario_cod_usuario;
		this.t_tp_invest_cod_tp_invest = t_tp_invest_cod_tp_invest;
		this.valorInvestimento = valorInvestimento;
		this.valorRendimento = valorRendimento;
		this.dataInvestimento = dataInvestimento;
		this.descricaoInvestimento = descricaoInvestimento;
	}

	public Integer getCodInvestimento() {
		return codInvestimento;
	}

	public void setCodInvestimento(Integer codInvestimento) {
		this.codInvestimento = codInvestimento;
	}

	public Integer getT_usuario_cod_usuario() {
		return t_usuario_cod_usuario;
	}

	public void setT_usuario_cod_usuario(Integer t_usuario_cod_usuario) {
		this.t_usuario_cod_usuario = t_usuario_cod_usuario;
	}

	public Integer getT_tp_invest_cod_tp_invest() {
		return t_tp_invest_cod_tp_invest;
	}

	public void setT_tp_invest_cod_tp_invest(Integer t_tp_invest_cod_tp_invest) {
		this.t_tp_invest_cod_tp_invest = t_tp_invest_cod_tp_invest;
	}

	public Double getValorInvestimento() {
		return valorInvestimento;
	}

	public void setValorInvestimento(Double valorInvestimento) {
		this.valorInvestimento = valorInvestimento;
	}

	public Double getValorRendimento() {
		return valorRendimento;
	}

	public void setValorRendimento(Double valorRendimento) {
		this.valorRendimento = valorRendimento;
	}

	public Calendar getDataInvestimento() {
		return dataInvestimento;
	}

	public void setDataInvestimento(Calendar dataInvestimento) {
		this.dataInvestimento = dataInvestimento;
	}

	public String getDescricaoInvestimento() {
		return descricaoInvestimento;
	}

	public void setDescricaoInvestimento(String descricaoInvestimento) {
		this.descricaoInvestimento = descricaoInvestimento;
	}

}
