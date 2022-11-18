package br.com.RocketPyrex.dao;

import java.util.List;

import br.com.RocketPyrex.usuario.Endereco;

public interface EnderecoDAO {
	
	void cadastrarEndereco (Endereco endereco);
	
	List<Endereco> listarEndereco();
	
	Endereco buscarPorEndereco(int CodEndereco);
	
	void atualizarEndereco(Endereco endereco);
	
	void removerEndereco(int CodEndereco);

}
