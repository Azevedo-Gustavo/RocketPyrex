package br.com.RocketPyrex.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import br.com.RocketPyrex.conta.Investimento;
import br.com.RocketPyrex.dao.InvestimentoDAO;
import br.com.RocketPyrex.singleton.FintechDBManager;


public class InvestimentoDAOImpl implements InvestimentoDAO {
	
	Connection conexao;
	PreparedStatement stmt = null;
	
	public void cadastrarInvestimento(Investimento investimento) {
		
		try {
			conexao = FintechDBManager.obterConexao();
	        String sql = "INSERT INTO T_INVESTIMENTO(COD_INVEST, T_USUARIO_COD_USUARIO, T_TP_INVEST_COD_TP_INVEST, VL_INVEST, VL_RENDIMENTO, DT_INVEST, DS_INVEST) VALUES (SQ_INVESTIMENTO.NEXTVAL, ?, ?, ?, ?, ?, ?)";
	        stmt = conexao.prepareStatement(sql);
	        stmt.setInt(1, investimento.getT_usuario_cod_usuario());
	        stmt.setInt(2, investimento.getT_tp_invest_cod_tp_invest());
	        stmt.setDouble(3, investimento.getValorInvestimento());
	        stmt.setDouble(4, investimento.getValorRendimento());
	        java.sql.Date data =
					new java.sql.Date(
							investimento.getDataInvestimento().getTimeInMillis());
			stmt.setDate(5, data);
	        stmt.setString(6, investimento.getDescricaoInvestimento());
	        
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
	
	public List<Investimento> listarInvestimento() {
		//Cria uma lista de investimentos
		List<Investimento> lista = new ArrayList<Investimento>();
	    ResultSet rs = null;
	        
	    try {
	    	conexao = FintechDBManager.obterConexao();
	        stmt = conexao.prepareStatement ("SELECT COD_INVEST, T_USUARIO_COD_USUARIO, T_TP_INVEST_COD_TP_INVEST, VL_INVEST, VL_RENDIMENTO, DT_INVEST, DS_INVEST FROM T_INVESTIMENTO");
	        rs = stmt.executeQuery();
	        
	        //Percorre todos os registros encontrados
	        while (rs.next()) {
	        	int codInvestimento = rs.getInt("COD_INVEST");
	        	int t_usuario_cod_usuario = rs.getInt("T_USUARIO_COD_USUARIO");
	        	int t_tp_invest_cod_tp_invest = rs.getInt("T_TP_INVEST_COD_TP_INVEST");
	        	double valorInvestimento = rs.getDouble("VL_INVEST");
	        	double valorRendimento = rs.getDouble("VL_RENDIMENTO");
	        	java.sql.Date data = rs.getDate("DT_INVEST");
				Calendar dataInvestimento= Calendar.getInstance();
				dataInvestimento.setTimeInMillis(data.getTime());
	        	String descricaoInvestimento = rs.getString("DS_INVEST");
	        	//Cria um objeto Investimento com as informações encontradas
	        	Investimento investimento = new Investimento (codInvestimento, t_usuario_cod_usuario, 
	        			t_tp_invest_cod_tp_invest, valorInvestimento, valorRendimento, dataInvestimento, descricaoInvestimento);
	        	//Adiciona o investimento na lista
	        	lista.add(investimento);
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
	
	public Investimento buscarPorInvestimento(int CodInvestimento) {
		Investimento investimento = null;
		ResultSet rs = null;
		
		try {
			conexao = FintechDBManager.obterConexao();
			stmt = conexao.prepareStatement("SELECT COD_INVEST, T_USUARIO_COD_USUARIO, T_TP_INVEST_COD_TP_INVEST, VL_INVEST, VL_RENDIMENTO, DT_INVEST, DS_INVEST FROM T_INVESTIMENTO WHERE COD_INVESTIMENTO = ?");
			stmt.setInt(1, CodInvestimento);
			rs = stmt.executeQuery();
			
			if (rs.next()){
				int codInvestimento = rs.getInt("COD_INVESTIMENTO");
				int t_usuario_cod_usuario = rs.getInt("T_USUARIO_COD_USUARIO");
				int t_tp_invest_cod_tp_invest = rs.getInt("T_TP_INVEST_COD_TP_INVEST");
				double valorInvestimento = rs.getDouble("VL_INVEST");
				double valorRendimento = rs.getDouble("VL_RENDIMENTO");
				java.sql.Date data = rs.getDate("DT_INVEST");
				Calendar dataInvestimento = Calendar.getInstance();
				dataInvestimento.setTimeInMillis(data.getTime());
				String descricaoInvestimento = rs.getString("DS_INVEST");
				investimento = new Investimento (codInvestimento, t_usuario_cod_usuario, t_tp_invest_cod_tp_invest, 
						valorInvestimento, valorRendimento, dataInvestimento, descricaoInvestimento);
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
					} return investimento;
					}
	
	public void atualizarInvestimento(Investimento investimento) {
		
		try {
			conexao = FintechDBManager.obterConexao();
	        String sql = "UPDATE T_INVESTIMENTO SET T_USUARIO_COD_USUARIO = ?, T_TP_INVEST_COD_TP_INVEST = ?, VL_INVEST = ?, VL_RENDIMENTO = ?, "
	        		+ "DT_INVEST = ?, DS_INVEST = ?, FROM T_INVESTIMENTO = ? WHERE COD_INVEST = ?";
	        stmt = conexao.prepareStatement(sql);
	        stmt.setInt(1, investimento.getT_usuario_cod_usuario());
	        stmt.setInt(2, investimento.getT_tp_invest_cod_tp_invest());
	        stmt.setDouble(3, investimento.getValorInvestimento());
	        stmt.setDouble(4, investimento.getValorRendimento());
	        java.sql.Date data = new java.sql.Date(investimento.getDataInvestimento().getTimeInMillis());
			stmt.setDate(4, data);
	        stmt.setString(6, investimento.getDescricaoInvestimento());
	        stmt.setInt(7, investimento.getCodInvestimento());
	        
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
	
	public void removerInvestimento(int CodInvestimento) {
		
		try {
			conexao = FintechDBManager.obterConexao();
	        String sql = "DELETE FROM T_INVESTIMENTO WHERE COD_INVEST = ?";
	        stmt = conexao.prepareStatement(sql);
	        stmt.setInt(1, CodInvestimento);
	        
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
