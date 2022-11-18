package br.com.RocketPyrex.usuario;

@SuppressWarnings("serial")
public class PessoaJuridica extends Usuario {
	
	private Integer codPessoaJuridica;
	private Integer t_porte_cod_porte;
	private Integer t_usuario_cod_usuario;
	private Integer cnpj;

	public PessoaJuridica(Integer codUsuario, String nome, String objetivo, String email, Integer codPessoaJuridica,
			Integer t_porte_cod_porte, Integer t_usuario_cod_usuario, Integer cnpj) {
		super(codUsuario, nome, objetivo, email);
		this.codPessoaJuridica = codPessoaJuridica;
		this.t_porte_cod_porte = t_porte_cod_porte;
		this.t_usuario_cod_usuario = t_usuario_cod_usuario;
		this.cnpj = cnpj;
	}

	public Integer getCodPessoaJuridica() {
		return codPessoaJuridica;
	}

	public void setCodPessoaJuridica(Integer codPessoaJuridica) {
		this.codPessoaJuridica = codPessoaJuridica;
	}

	public Integer getT_porte_cod_porte() {
		return t_porte_cod_porte;
	}

	public void setT_porte_cod_porte(Integer t_porte_cod_porte) {
		this.t_porte_cod_porte = t_porte_cod_porte;
	}

	public Integer getT_usuario_cod_usuario() {
		return t_usuario_cod_usuario;
	}

	public void setT_usuario_cod_usuario(Integer t_usuario_cod_usuario) {
		this.t_usuario_cod_usuario = t_usuario_cod_usuario;
	}

	public Integer getCnpj() {
		return cnpj;
	}

	public void setCnpj(Integer cnpj) {
		this.cnpj = cnpj;
	}

	@Override
	public String toString() {
		return "PessoaJuridica [codPessoaJuridica = " + codPessoaJuridica + ", t_porte_cod_porte = " + t_porte_cod_porte
				+ ", t_usuario_cod_usuario = " + t_usuario_cod_usuario + ", cnpj = " + cnpj + "]";
	}

}