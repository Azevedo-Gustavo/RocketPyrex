package br.com.RocketPyrex.usuario;

@SuppressWarnings("serial")
public class PessoaFisica extends Usuario {
	
	private Integer codPessoaFisica;
	private Integer t_usuario_cod_usuario;
	private String cpf;
	private char genero;
	
	
	public PessoaFisica(Integer codUsuario, String nome, String objetivo, String email, Integer codPessoaFisica,
			Integer t_usuario_cod_usuario, String cpf, char genero) {
		super(codUsuario, nome, objetivo, email);
		this.codPessoaFisica = codPessoaFisica;
		this.t_usuario_cod_usuario = t_usuario_cod_usuario;
		this.cpf = cpf;
		this.genero = genero;
	}


	public Integer getCodPessoaFisica() {
		return codPessoaFisica;
	}

	public void setCodPessoaFisica(Integer codPessoaFisica) {
		this.codPessoaFisica = codPessoaFisica;
	}

	public Integer getT_usuario_cod_usuario() {
		return t_usuario_cod_usuario;
	}

	public void setT_usuario_cod_usuario(Integer t_usuario_cod_usuario) {
		this.t_usuario_cod_usuario = t_usuario_cod_usuario;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public char getGenero() {
		return genero;
	}

	public void setGenero(char genero) {
		this.genero = genero;
	}

	@Override
	public String toString() {
		return "PessoaFisica [codPessoaFisica = " + codPessoaFisica + ", t_usuario_cod_usuario = " + t_usuario_cod_usuario
				+ ", cpf = " + cpf + ", genero = " + genero + "]";
	}
	
}
