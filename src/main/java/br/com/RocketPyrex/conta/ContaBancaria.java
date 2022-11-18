package br.com.RocketPyrex.conta;

import java.io.Serializable;

public class ContaBancaria implements Serializable {
	
	private static final long serialVersionUID = 1L;
	private Integer codConta;
	private Integer t_banco_cod_banco;
	private Integer t_usuario_cod_usuario;
	private String numAgencia;
	private String digitoAgencia;
	private String numConta;
	private String digitoConta;
	private Double saldo;
	
	public ContaBancaria() {};
	
	public ContaBancaria(Integer codConta, Integer t_banco_cod_banco, Integer t_usuario_cod_usuario, String numAgencia,
			String digitoAgencia, String numConta, String digitoConta, Double saldo) {
		super();
		this.codConta = codConta;
		this.t_banco_cod_banco = t_banco_cod_banco;
		this.t_usuario_cod_usuario = t_usuario_cod_usuario;
		this.numAgencia = numAgencia;
		this.digitoAgencia = digitoAgencia;
		this.numConta = numConta;
		this.digitoConta = digitoConta;
		this.saldo = saldo;
	}

	public Integer getCodConta() {
		return codConta;
	}

	public void setCodConta(Integer codConta) {
		this.codConta = codConta;
	}

	public Integer getT_banco_cod_banco() {
		return t_banco_cod_banco;
	}

	public void setT_banco_cod_banco(Integer t_banco_cod_banco) {
		this.t_banco_cod_banco = t_banco_cod_banco;
	}

	public Integer getT_usuario_cod_usuario() {
		return t_usuario_cod_usuario;
	}

	public void setT_usuario_cod_usuario(Integer t_usuario_cod_usuario) {
		this.t_usuario_cod_usuario = t_usuario_cod_usuario;
	}

	public String getNumAgencia() {
		return numAgencia;
	}

	public void setNumAgencia(String numAgencia) {
		this.numAgencia = numAgencia;
	}

	public String getDigitoAgencia() {
		return digitoAgencia;
	}

	public void setDigitoAgencia(String digitoAgencia) {
		this.digitoAgencia = digitoAgencia;
	}

	public String getNumConta() {
		return numConta;
	}

	public void setNumConta(String numConta) {
		this.numConta = numConta;
	}

	public String getDigitoConta() {
		return digitoConta;
	}

	public void setDigitoConta(String digitoConta) {
		this.digitoConta = digitoConta;
	}

	public Double getSaldo() {
		return saldo;
	}

	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}

	@Override
	public String toString() {
		return "Conta [codConta = " + codConta + ", t_banco_cod_banco = " + t_banco_cod_banco + ", t_usuario_cod_usuario = "
				+ t_usuario_cod_usuario + ", numAgencia = " + numAgencia + ", digitoAgencia = " + digitoAgencia
				+ ", numConta = " + numConta + ", digitoConta = " + digitoConta + ", saldo = " + saldo + "]";
	}
	
}
