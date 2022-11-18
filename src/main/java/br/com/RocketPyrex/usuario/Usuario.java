package br.com.RocketPyrex.usuario;

import java.io.Serializable;

public class Usuario implements Serializable{
	
	private static final long serialVersionUID = 1L;
	private Integer codUsuario;
	private String nome;
	private String objetivo;
	private String email;
	private String docUsuario;
	private int t_tp_usuario_cod_tp_usuario;
	private int t_porte_cod_porte;
	
	public Usuario() {
		
	}
	
	public Usuario(Integer codUsuario, String nome, String objetivo, String email, 
			String docUsuario, int t_tp_usuario_cod_tp_usuario, int t_porte_cod_porte) {
		super();
		this.codUsuario = codUsuario;
		this.nome = nome;
		this.objetivo = objetivo;
		this.email = email;
		this.docUsuario = docUsuario;
		this.t_tp_usuario_cod_tp_usuario = t_tp_usuario_cod_tp_usuario;
		this.t_porte_cod_porte = t_porte_cod_porte;
		
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
	
	public String getDocUsuario() {
		return docUsuario;
	}

	public void setDocUsuario(String docUsuario) {
		this.docUsuario = docUsuario;
	}
	
	public int getT_tp_usuario_cod_tp_usuario() {
		return t_tp_usuario_cod_tp_usuario;
	}
	
	public void setT_tp_usuario_cod_tp_usuario(int t_tp_usuario_cod_tp_usuario) {
		this.t_tp_usuario_cod_tp_usuario = t_tp_usuario_cod_tp_usuario;
	}
	
	public int getT_porte_cod_porte() {
		return t_porte_cod_porte;
	}
	
	public void setT_porte_cod_porte(int t_porte_cod_porte) {
		this.t_porte_cod_porte = t_porte_cod_porte;
	}
	
}