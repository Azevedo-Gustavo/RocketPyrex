package br.com.RocketPyrex.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.RocketPyrex.conta.ContaBancaria;
import br.com.RocketPyrex.dao.ContaBancariaDAO;
import br.com.RocketPyrex.singleton.FintechDBManager;


public class ContaBancariaDAOImpl implements ContaBancariaDAO {
	private Connection conexao;
	PreparedStatement stmt = null;
  
    public void cadastrarContaBancaria(ContaBancaria contabancaria) {
    	
    	try {
    		conexao = FintechDBManager.obterConexao();
	        String sql = "INSERT INTO T_CONTA_BANCARIA(COD_CONTA, T_BANCO_COD_BANCO, T_USUARIO_COD_USUARIO, NUM_AGENCIA, DIGITO_AGENCIA, NUM_CONTA, DIGITO_CONTA, VL_SALDO) VALUES (SQ_CONTA_BANCARIA.NEXTVAL, ?, ?, ?, ?, ?, ?, ?)";
	        stmt = conexao.prepareStatement(sql);
	        stmt.setInt(1, contabancaria.getT_banco_cod_banco());
	        stmt.setInt(2, contabancaria.getT_usuario_cod_usuario());
	        stmt.setString(3, contabancaria.getNumAgencia());
	        stmt.setString(4, contabancaria.getDigitoAgencia());
	        stmt.setString(5, contabancaria.getNumConta());
	        stmt.setString(6, contabancaria.getDigitoConta());
	        stmt.setDouble(7, contabancaria.getSaldo());
	        
	        stmt.executeUpdate();
	        
	        } catch (SQLException e) {
	        	e.printStackTrace();
	        	} finally {
	        		try {
	        			stmt.close();
	        			conexao.close();
	        			} catch (SQLException e) {
	        				e.printStackTrace();
	        				}
	        		}
    	}

	public List<ContaBancaria> listarContaBancaria() {
		//Cria uma lista de Contas Bancaria
		List<ContaBancaria> lista = new ArrayList<ContaBancaria>();
		ResultSet rs = null;
      
		try {
			conexao = FintechDBManager.obterConexao();
	        stmt = conexao.prepareStatement ("SELECT COD_CONTA, T_BANCO_COD_BANCO, T_USUARIO_COD_USUARIO, NUM_AGENCIA, DIGITO_AGENCIA, NUM_CONTA, DIGITO_CONTA, VL_SALDO FROM T_CONTA_BANCARIA");
	        rs = stmt.executeQuery();
	        
	        //Percorre todos os registros encontrados
	        while (rs.next()) {
	        	int codConta = rs.getInt("COD_CONTA");
	        	int t_banco_cod_banco = rs.getInt("T_BANCO_COD_BANCO");
	        	int t_usuario_cod_usuario = rs.getInt("T_USUARIO_COD_USUARIO");
	        	String numAgencia = rs.getString("NUM_AGENCIA");
	        	String digitoAgencia = rs.getString("DIGITO_AGENCIA");
	        	String numConta = rs.getString("NUM_CONTA");
	        	String digitoConta = rs.getString("DIGITO_CONTA");
	        	double saldo = rs.getDouble("VL_SALDO");
	        	//Cria um objeto Conta Bancaria com as informações encontradas
	        	ContaBancaria contabancaria = new ContaBancaria (codConta, t_banco_cod_banco, t_usuario_cod_usuario, 
	        			numAgencia, digitoAgencia, numConta, digitoConta, saldo);
	        	//Adiciona uma conta bancaria na lista
	        	lista.add(contabancaria);
	        	}
	        } catch (SQLException e) {
	        	e.printStackTrace();
	        	} finally {
	        		try {
	        			stmt.close();
	        			conexao.close();
	        			} catch (SQLException e) {
	        				e.printStackTrace();
	        				}
	        		} return lista;
	        		}
	
	public ContaBancaria buscarPorContaBancaria(int CodConta) {
		ContaBancaria contabancaria = null;
        ResultSet rs = null;
        
        try {
        	conexao = FintechDBManager.obterConexao();
        	stmt = conexao.prepareStatement("SELECT COD_CONTA, T_BANCO_COD_BANCO, T_USUARIO_COD_USUARIO, NUM_AGENCIA, DIGITO_AGENCIA, NUM_CONTA, DIGITO_CONTA, VL_SALDO FROM T_CONTA_BANCARIA WHERE COD_CONTA = ?");
        	stmt.setInt(1, CodConta);
        	rs = stmt.executeQuery();
        	
        	if (rs.next()){
        		int codConta = rs.getInt("COD_CONTA");
	            int t_banco_cod_banco = rs.getInt("T_BANCO_COD_BANCO");
	            int t_usuario_cod_usuario = rs.getInt("T_USUARIO_COD_USUARIO");
	            String numAgencia = rs.getString("NUM_AGENCIA");
	            String digitoAgencia = rs.getString("DIGITO_AGENCIA");
	            String numConta = rs.getString("NUM_CONTA");
	            String digitoConta = rs.getString("DIGITO_CONTA");
	            double saldo = rs.getDouble("VL_SALDO");
	            contabancaria = new ContaBancaria (codConta, t_banco_cod_banco, t_usuario_cod_usuario, numAgencia,
	          			digitoAgencia, numConta, digitoConta, saldo);
	            }
        	} catch (SQLException e) {
        		e.printStackTrace();
        		} finally {
        			try {
        				stmt.close();
        				conexao.close();
        				} catch (SQLException e) {
        					e.printStackTrace();
        					}
        			} return contabancaria;
        			}
	
	public void atualizarContaBancaria(ContaBancaria contabancaria) {
		
		try {
			conexao = FintechDBManager.obterConexao();
	        String sql = "UPDATE T_CONTA_BANCARIA SET T_BANCO_COD_BANCO = ?, T_USUARIO_COD_USUARIO = ?,"
	        		+ "NUM_AGENCIA = ?, DIGITO_AGENCIA = ?, NUM_CONTA = ?, DIGITO_CONTA = ?, VL_SALDO = ?, "
	        		+ "FROM T_CONTA_BANCARIA = ? WHERE COD_CONTA = ?";
	        stmt = conexao.prepareStatement(sql);
	        stmt.setInt(1, contabancaria.getT_banco_cod_banco());
	        stmt.setInt(2, contabancaria.getT_usuario_cod_usuario());
	        stmt.setString(3, contabancaria.getNumAgencia());
	        stmt.setString(4, contabancaria.getDigitoAgencia());
	        stmt.setString(5, contabancaria.getNumConta());
	        stmt.setString(6, contabancaria.getDigitoConta());
	        stmt.setDouble(7, contabancaria.getSaldo());
	        stmt.setInt(8, contabancaria.getCodConta());
	  
	        stmt.executeUpdate();
	        
		} catch (SQLException e) {
			e.printStackTrace();
			} finally {
				try {
					stmt.close();
					conexao.close();
					} catch (SQLException e) {
						e.printStackTrace();
						}
				}
		}
	
	public void removerContaBancaria(int CodConta) {
		
		try {
			conexao = FintechDBManager.obterConexao();
	        String sql = "DELETE FROM T_CONTA_BANCARIA WHERE COD_CONTA = ?";
	        stmt = conexao.prepareStatement(sql);
	        stmt.setInt(1, CodConta);
	        stmt.executeUpdate();
	        
		} catch (SQLException e) {
			e.printStackTrace();
			} finally {
				try {
					stmt.close();
					conexao.close();
					} catch (SQLException e) {
						e.printStackTrace();
						}
				}
		}
	}