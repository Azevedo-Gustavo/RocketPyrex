package br.com.RocketPyrex.usuario;

import java.io.Serializable;

public class Usuario implements Serializable{
	
	private static final long serialVersionUID = 1L;
	private Integer codUsuario;
	private String nome;
	private String objetivo;
	private String email;
	
	public Usuario(Integer codUsuario, String nome, String objetivo, String email) {
		super();
		this.codUsuario = codUsuario;
		this.nome = nome;
		this.objetivo = objetivo;
		this.email = email;
	}

	public Integer getCodUsuario() {
		return codUsuario;
	}

	public void setCodUsuario(Integer codUsuario) {
		this.codUsuario = codUsuario;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getObjetivo() {
		return objetivo;
	}

	public void setObjetivo(String objetivo) {
		this.objetivo = objetivo;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Usuario [codUsuario = " + codUsuario + ", nome = " + nome + ", objetivo = " + objetivo + ", email = " + email
				+ "]";
	}
	
}