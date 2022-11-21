package br.com.RocketPyrex.factory;

import br.com.RocketPyrex.dao.ContaBancariaDAO;
import br.com.RocketPyrex.dao.EnderecoDAO;
import br.com.RocketPyrex.dao.InvestimentoDAO;
import br.com.RocketPyrex.dao.TelefoneDAO;
import br.com.RocketPyrex.dao.TransacaoDAO;
import br.com.RocketPyrex.dao.UsuarioDAO;
import br.com.RocketPyrex.impl.ContaBancariaDAOImpl;
import br.com.RocketPyrex.impl.EnderecoDAOImpl;
import br.com.RocketPyrex.impl.InvestimentoDAOImpl;
import br.com.RocketPyrex.impl.TelefoneDAOImpl;
import br.com.RocketPyrex.impl.TransacaoDAOImpl;
import br.com.RocketPyrex.impl.UsuarioDAOImpl;

public class DAOFactory {
	
	public static ContaBancariaDAO getContaBancariaDAO() {
		return new ContaBancariaDAOImpl();
	}
	
	public static EnderecoDAO getEnderecoDAO() {
		return new EnderecoDAOImpl();
	}
	
	public static InvestimentoDAO getInvestimentoDAO() {
		return new InvestimentoDAOImpl();
	}
 	
	public static TelefoneDAO getTelefoneDAO() {
		return new TelefoneDAOImpl();
	}
	
	public static TransacaoDAO getTransacaoDAO() {
		return new TransacaoDAOImpl();
	}
	
	public static UsuarioDAO getUsuarioDAO() {
		return new UsuarioDAOImpl();
	}
}
