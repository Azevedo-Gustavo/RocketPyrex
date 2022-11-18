package br.com.RocketPyrex.teste;


import java.util.Calendar;
import java.util.List;

import br.com.RocketPyrex.conta.Transacao;
import br.com.RocketPyrex.dao.ContaBancariaDAO;
import br.com.RocketPyrex.dao.EnderecoDAO;
import br.com.RocketPyrex.dao.InvestimentoDAO;
import br.com.RocketPyrex.dao.TelefoneDAO;
import br.com.RocketPyrex.dao.TransacaoDAO;
import br.com.RocketPyrex.factory.DAOFactory;
import br.com.RocketPyrex.conta.Investimento;
import br.com.RocketPyrex.conta.ContaBancaria;
import br.com.RocketPyrex.usuario.Endereco;
import br.com.RocketPyrex.usuario.Telefone;

public class TesteCRUD {

	public static void main(String[] args) {
			
			ContaBancariaDAO cbDao = DAOFactory.getContaBancariaDAO();
			
			ContaBancaria contabancaria = new ContaBancaria();
			
			contabancaria.setT_banco_cod_banco(1);
	        contabancaria.setT_usuario_cod_usuario(2);
	        contabancaria.setNumAgencia("035");
	        contabancaria.setDigitoAgencia("2");
	        contabancaria.setNumConta("1457");
	        contabancaria.setDigitoConta("0");
	        contabancaria.setSaldo(2670.00);
	
	        cbDao.cadastrarContaBancaria(contabancaria);
			//System.out.println(contabancaria.toString());
			
			List<ContaBancaria> contas = cbDao.listarContaBancaria();
			
			for(ContaBancaria conta: contas){
				System.out.println(conta.toString());
	        
			}
			
			EnderecoDAO edDao = DAOFactory.getEnderecoDAO();
			
			Endereco endereco = new Endereco();
			
			endereco.setT_usuario_cod_usuario(6);
	        endereco.setLogradouro("Rua Java Bean");
	        endereco.setNumero(78);
	        endereco.setCep("12.745-625");
	        endereco.setBairro("Java");
	        endereco.setEstado("RS");
	        endereco.setPais("BR");
	        endereco.setComplemento("Teste");
	        endereco.setCidade("Javanês");
			
	        edDao.cadastrarEndereco(endereco);
			//System.out.println(endereco.toString());
			
			List<Endereco> enderecos = edDao.listarEndereco();
			
			for(Endereco local: enderecos){
				System.out.println(local.toString());
			}
			
			InvestimentoDAO investDao = DAOFactory.getInvestimentoDAO();
			
			Investimento investimento = new Investimento();
			
			investimento.setT_usuario_cod_usuario(2);
	        investimento.setT_tp_invest_cod_tp_invest(1);
	        investimento.setValorInvestimento(50.00);
	        investimento.setValorRendimento(0.10);
	        investimento.setDataInvestimento(Calendar.getInstance());
	        investimento.setDescricaoInvestimento("Testando");
	        
	        investDao.cadastrarInvestimento(investimento);
			//System.out.println(investimento.toString());
			
			List<Investimento> investimentos = investDao.listarInvestimento();
			
			for(Investimento invest: investimentos){
				System.out.println(invest.toString());
			}
			
			TelefoneDAO telDao = DAOFactory.getTelefoneDAO();
			
			Telefone telefone = new Telefone();
			
			telefone.setT_tp_telefone_cod_tp_telefone(1);
	        telefone.setT_usuario_cod_usuario(6);
	        telefone.setDdd("11");
	        telefone.setNumtelefone("97468-8926");
			
	        telDao.cadastrarTelefone(telefone);
			//System.out.println(telefone.toString());
			
			List<Telefone> telefones = telDao.listarTelefone();
			
			for(Telefone tel: telefones){
				System.out.println(tel.toString());
			}
			
			TransacaoDAO tDao = DAOFactory.getTransacaoDAO();
			
			Transacao transacao = new Transacao();
			
			transacao.setT_tp_transa_cod_tp_transacao(1);
			transacao.setT_usuario_cod_usuario(5);
			transacao.setValorTransacao(2.00);
			transacao.setDataTransacao(Calendar.getInstance());
			transacao.setDescricaoTransacao("Testando");
			
			tDao.cadastrarTransacao(transacao);
			System.out.println(transacao.toString());
			
			List<Transacao> transacoes = tDao.listarTransacao();
			
			for(Transacao transf: transacoes){
				System.out.println(transf.toString());
			}
	}		
}
	
