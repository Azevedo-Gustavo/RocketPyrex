package br.com.RocketPyrex.dao;

import java.util.List;

import br.com.RocketPyrex.usuario.PessoaJuridica;

public interface PessoaJuridicaDAO {

	void cadastrarPJ(PessoaJuridica pessoajuridica);
	
	List<PessoaJuridica> listarPJ();
	
	PessoaJuridica buscarPorPJ(int CodPessoaJuridica);
	
	void atualizarPJ(PessoaJuridica pessoajuridica);
	
	void removerPJ(int codPessoaFisica);
	
}
