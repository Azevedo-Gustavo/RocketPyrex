package br.com.RocketPyrex.dao;

import java.util.List;

import br.com.RocketPyrex.usuario.PessoaFisica;

public interface PessoaFisicaDAO {

	void cadastrarPF(PessoaFisica pessoafisica);
	
	List<PessoaFisica> listarPF();
	
	PessoaFisica buscarPorPF(int CodPessoaFisica);
	
	void atualizarPF(PessoaFisica pessoafisica);
	
	void removerPF(int codPessoaFisica);
	
}
