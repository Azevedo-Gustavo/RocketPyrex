package br.com.RocketPyrex.dao;

import java.util.List;

import br.com.RocketPyrex.conta.ContaBancaria;

public interface ContaBancariaDAO {
	
	void cadastrarContaBancaria(ContaBancaria contabancaria);
	
	List<ContaBancaria> listarContaBancaria();
	
	ContaBancaria buscarPorContaBancaria(int CodConta);
	
	void atualizarContaBancaria(ContaBancaria contabancaria);
	
	void removerContaBancaria(int CodConta);
}
