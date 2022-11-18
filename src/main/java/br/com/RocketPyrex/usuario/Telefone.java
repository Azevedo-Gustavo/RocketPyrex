package br.com.RocketPyrex.usuario;

import java.io.Serializable;

public class Telefone implements Serializable{
	
	private static final long serialVersionUID = 1L;
	private Integer codTelefone;
	private Integer t_tp_telefone_cod_tp_telefone;
	private Integer t_usuario_cod_usuario;
	private String ddd;
	private String numTelefone;
	
	public Telefone() {
		
	};
	
	public Telefone(Integer codTelefone, Integer t_tp_telefone_cod_tp_telefone, Integer t_usuario_cod_usuario,
			String ddd, String numTelefone) {
		super();
		this.codTelefone = codTelefone;
		this.t_tp_telefone_cod_tp_telefone = t_tp_telefone_cod_tp_telefone;
		this.t_usuario_cod_usuario = t_usuario_cod_usuario;
		this.ddd = ddd;
		this.numTelefone = numTelefone;
	}

	public Integer getCodTelefone() {
		return codTelefone;
	}

	public void setCodTelefone(Integer codTelefone) {
		this.codTelefone = codTelefone;
	}

	public Integer getT_tp_telefone_cod_tp_telefone() {
		return t_tp_telefone_cod_tp_telefone;
	}

	public void setT_tp_telefone_cod_tp_telefone(Integer t_tp_telefone_cod_tp_telefone) {
		this.t_tp_telefone_cod_tp_telefone = t_tp_telefone_cod_tp_telefone;
	}

	public Integer getT_usuario_cod_usuario() {
		return t_usuario_cod_usuario;
	}

	public void setT_usuario_cod_usuario(Integer t_usuario_cod_usuario) {
		this.t_usuario_cod_usuario = t_usuario_cod_usuario;
	}

	public String getDdd() {
		return ddd;
	}

	public void setDdd(String ddd) {
		this.ddd = ddd;
	}

	public String getNumtelefone() {
		return numTelefone;
	}

	public void setNumtelefone(String numTelefone) {
		this.numTelefone = numTelefone;
	}

	@Override
	public String toString() {
		return "Telefone [codTelefone = " + codTelefone + ", t_tp_telefone_cod_tp_telefone = "
				+ t_tp_telefone_cod_tp_telefone + ", t_usuario_cod_usuario = " + t_usuario_cod_usuario + ", ddd = " + ddd
				+ ", numTelefone = " + numTelefone + "]";
	}
	
}
