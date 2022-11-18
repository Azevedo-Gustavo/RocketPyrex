package br.com.RocketPyrex.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import br.com.RocketPyrex.conta.Transacao;
import br.com.RocketPyrex.dao.TransacaoDAO;
import br.com.RocketPyrex.singleton.FintechDBManager;


public class TransacaoDAOImpl implements TransacaoDAO {
	
	private Connection conexao;
	PreparedStatement stmt = null;
	
	public void cadastrarTransacao(Transacao transacao) {
		
		try {
			conexao = FintechDBManager.obterConexao();
	        String sql = "INSERT INTO T_TRANSACAO(COD_TRANSA, T_TP_TRANSA_COD_TP_TRANSA, T_USUARIO_COD_USUARIO, VL_TRANSA, DT_TRANSA, DS_TRANSA) VALUES (SQ_TRANSACAO.NEXTVAL, ?, ?, ?, ?, ?)";
	        stmt = conexao.prepareStatement(sql);
	        stmt.setInt(1, transacao.getT_tp_transa_cod_tp_transacao());
	        stmt.setInt(2, transacao.getT_usuario_cod_usuario());
	        stmt.setDouble(3, transacao.getValorTransacao());
	        java.sql.Date data =
					new java.sql.Date(
							transacao.getDataTransacao().getTimeInMillis());
			stmt.setDate(4, data);
	        stmt.setString(5, transacao.getDescricaoTransacao());
	        
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
	
	public List<Transacao> listarTransacao() {
		//Cria uma lista de transações
		List<Transacao> lista = new ArrayList<Transacao>();
		ResultSet rs = null;
		
		try {
			conexao = FintechDBManager.obterConexao();
			stmt = conexao.prepareStatement ("SELECT COD_TRANSA, T_TP_TRANSA_COD_TP_TRANSA, T_USUARIO_COD_USUARIO, VL_TRANSA, DT_TRANSA, DS_TRANSA FROM T_TRANSACAO");
			rs = stmt.executeQuery();
			
			//Percorre todos os registros encontrados
			while (rs.next()) {
				int codTransacao = rs.getInt("COD_TRANSA");
				int t_tp_transa_cod_tp_transacao = rs.getInt("T_TP_TRANSA_COD_TP_TRANSA");
				int t_usuario_cod_usuario = rs.getInt("T_USUARIO_COD_USUARIO");
				double valorTransacao = rs.getDouble("VL_TRANSA");
				java.sql.Date data = rs.getDate("DT_TRANSA");
				Calendar dataTransacao = Calendar.getInstance();
				dataTransacao.setTimeInMillis(data.getTime());
				String descricaoTransacao = rs.getString("DS_TRANSA");
				//Cria um objeto Transação com as informações encontradas
				Transacao transacao = new Transacao (codTransacao, t_tp_transa_cod_tp_transacao, t_usuario_cod_usuario,
						valorTransacao, dataTransacao, descricaoTransacao);
				//Adiciona uma transação na lista
				lista.add(transacao);
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
	
	public Transacao buscarPorTransacao(int CodTransacao) {
		Transacao transacao = null;
        ResultSet rs = null;
        
        try {
        	conexao = FintechDBManager.obterConexao();
        	stmt = conexao.prepareStatement("SELECT COD_TRANSA, T_TP_TRANSA_COD_TP_TRANSA, T_USUARIO_COD_USUARIO, VL_TRANSA, DT_TRANSA, DS_TRANSA FROM T_TRANSACAO WHERE COD_INVESTIMENTO = ?");
        	stmt.setInt(1, CodTransacao);
        	rs = stmt.executeQuery();
        	
        	if (rs.next()){
        		int codTransacao = rs.getInt("COD_TRANSA");
        		int t_tp_transa_cod_tp_transacao = rs.getInt("T_TP_TRANSA_COD_TP_TRANSA");
        		int t_usuario_cod_usuario = rs.getInt("T_USUARIO_COD_USUARIO");
        		double valorTransacao = rs.getDouble("VL_TRANSA");
        		java.sql.Date data = rs.getDate("DT_TRANSA");
				Calendar dataTransacao = Calendar.getInstance();
				dataTransacao.setTimeInMillis(data.getTime());
        		String descricaoTransacao = rs.getString("DS_TRANSA");
        		transacao = new Transacao (codTransacao, t_tp_transa_cod_tp_transacao, t_usuario_cod_usuario,
        				valorTransacao, dataTransacao, descricaoTransacao);
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
        			} return transacao;
        			}
	
	public void atualizarTransacao(Transacao transacao) {
		
		try {
			conexao = FintechDBManager.obterConexao();
			String sql = "UPDATE T_TRANSACAO SET T_TP_TRANSA_COD_TP_TRANSA = ?, T_USUARIO_COD_USUARIO = ?, VL_TRANSA = ?, "
        		+ "VL_RENDIMENTO = ?, DT_TRANSA = ?, DS_TRANSA = ?, FROM T_TRANSACAO = ? WHERE COD_TRANSA = ?";
			stmt = conexao.prepareStatement(sql);
			stmt.setInt(1, transacao.getT_tp_transa_cod_tp_transacao());
			stmt.setInt(2, transacao.getT_usuario_cod_usuario());
			stmt.setDouble(3, transacao.getValorTransacao());
			java.sql.Date data = new java.sql.Date(transacao.getDataTransacao().getTimeInMillis());
			stmt.setDate(4, data);
			stmt.setString(5, transacao.getDescricaoTransacao());
			stmt.setInt(6, transacao.getCodTransacao());
			
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
	
	public void removerTransacao(int CodTransacao) {
		
		try {
			conexao = FintechDBManager.obterConexao();
			String sql = "DELETE FROM T_TRANSACAO WHERE COD_INVEST = ?";
			stmt = conexao.prepareStatement(sql);
			stmt.setInt(1, CodTransacao);
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