package br.com.RocketPyrex.usuario;

import java.io.Serializable;

public class Endereco implements Serializable{
	
	private static final long serialVersionUID = 1L;
	private Integer codEndereco;
    private Integer t_usuario_cod_usuario;
    private String logradouro;
    private Integer numero;
    private String cep;
    private String bairro;
    private String estado;
    private String pais;
    private String complemento;
    private String cidade;
	

    public Endereco(Integer codEndereco, Integer t_usuario_cod_usuario, String logradouro, Integer numero, String cep,
			String bairro, String estado, String pais, String complemento, String cidade) {
		super();
		this.codEndereco = codEndereco;
		this.t_usuario_cod_usuario = t_usuario_cod_usuario;
		this.logradouro = logradouro;
		this.numero = numero;
		this.cep = cep;
		this.bairro = bairro;
		this.estado = estado;
		this.pais = pais;
		this.complemento = complemento;
		this.cidade = cidade;
	}
	
    public Integer getCodEndereco() {
		return codEndereco;
	}
	public void setCodEndereco(Integer codEndereco) {
		this.codEndereco = codEndereco;
	}
	public Integer getT_usuario_cod_usuario() {
		return t_usuario_cod_usuario;
	}
	public void setT_usuario_cod_usuario(Integer t_usuario_cod_usuario) {
		this.t_usuario_cod_usuario = t_usuario_cod_usuario;
	}
	public String getLogradouro() {
		return logradouro;
	}
	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}
	public Integer getNumero() {
		return numero;
	}
	public void setNumero(Integer numero) {
		this.numero = numero;
	}
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public String getPais() {
		return pais;
	}
	public void setPais(String pais) {
		this.pais = pais;
	}
	public String getComplemento() {
		return complemento;
	}
	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	@Override
	public String toString() {
		return "Endereco [codEndereco = " + codEndereco + ", t_usuario_cod_usuario = " + t_usuario_cod_usuario
				+ ", logradouro = " + logradouro + ", numero = " + numero + ", cep = " + cep + ", bairro = " + bairro
				+ ", estado = " + estado + ", pais = " + pais + ", complemento = " + complemento + ", cidade = " + cidade + "]";
	}
    
}

