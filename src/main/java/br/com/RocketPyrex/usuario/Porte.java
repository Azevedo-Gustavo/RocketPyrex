package br.com.RocketPyrex.usuario;

import java.io.Serializable;

public class Porte implements Serializable{
	
	private static final long serialVersionUID = 1L;
	private Integer codPorte;
	private String descricaoPorte;
	
	public Porte() {};
	
	public Porte(Integer codPorte, String descricaoPorte) {
		super();
		this.codPorte = codPorte;
		this.descricaoPorte = descricaoPorte;
	}

	public Integer getCodPorte() {
		return codPorte;
	}

	public void setCodPorte(Integer codPorte) {
		this.codPorte = codPorte;
	}

	public String getDescricaoPorte() {
		return descricaoPorte;
	}

	public void setDescricaoPorte(String descricaoPorte) {
		this.descricaoPorte = descricaoPorte;
	}

	@Override
	public String toString() {
		return "Porte [codPorte = " + codPorte + ", descricaoPorte = " + descricaoPorte + "]";
	}
	
}
