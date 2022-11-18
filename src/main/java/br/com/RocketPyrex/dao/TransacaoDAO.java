package br.com.RocketPyrex.dao;

import java.util.List;

import br.com.RocketPyrex.conta.Transacao;

public interface TransacaoDAO {
	
	void cadastrarTransacao(Transacao transacao);
	
	List<Transacao> listarTransacao();
	
	Transacao buscarPorTransacao(int CodTransacao);
	
	void atualizarTransacao(Transacao transacao);
	
	void removerTransacao(int CodTransacao);
}
