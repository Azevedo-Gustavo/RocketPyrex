package br.com.RocketPyrex.dao;

import java.util.List;

import br.com.RocketPyrex.conta.Investimento;

public interface InvestimentoDAO {

	void cadastrarInvestimento(Investimento investimento);
	
	List<Investimento> listarInvestimento();
	
	Investimento buscarPorInvestimento(int CodInvestimento);
	
	void atualizarInvestimento(Investimento investimento);
	
	void removerInvestimento(int CodInvestimento);
	
}
