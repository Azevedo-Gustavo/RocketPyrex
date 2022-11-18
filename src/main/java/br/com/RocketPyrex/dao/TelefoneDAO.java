package br.com.RocketPyrex.dao;

import java.util.List;

import br.com.RocketPyrex.usuario.Telefone;

public interface TelefoneDAO {

	void cadastrarTelefone(Telefone telefone);
	
	List<Telefone> listarTelefone();
	
	Telefone buscarPorTelefone(int CodTelefone);
	
	void atualizarTelefone(Telefone telefone);
	
	void removerTelefone(int codTelefone);
	
}
