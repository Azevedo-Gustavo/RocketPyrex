package br.com.RocketPyrex.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.RocketPyrex.dao.TelefoneDAO;
import br.com.RocketPyrex.singleton.FintechDBManager;
import br.com.RocketPyrex.usuario.Telefone;

public class TelefoneDAOImpl implements TelefoneDAO {
	
	private Connection conexao;
	PreparedStatement stmt = null;
  
    public void cadastrarTelefone(Telefone telefone) {
    	try {
    		conexao = FintechDBManager.obterConexao();
	        String sql = "INSERT INTO T_TELEFONE(COD_TELEFONE, T_TP_TELEFONE_COD_TP_TELEFONE, T_USUARIO_COD_USUARIO, DDD, TELEFONE) VALUES (SQ_TELEFONE.NEXTVAL, ?, ?, ?, ?)";
	        stmt = conexao.prepareStatement(sql);
	        stmt.setInt(1, telefone.getT_tp_telefone_cod_tp_telefone());
	        stmt.setInt(2, telefone.getT_usuario_cod_usuario());
	        stmt.setString(3, telefone.getDdd());
	        stmt.setString(4, telefone.getNumtelefone());
	        
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

	public List<Telefone> listarTelefone() {
		//Cria uma lista de Telefones
	    List<Telefone> lista = new ArrayList<Telefone>();
	    ResultSet rs = null;
	      
	    try {
	    	conexao = FintechDBManager.obterConexao();
	        stmt = conexao.prepareStatement ("SELECT COD_TELEFONE, T_TP_TELEFONE_COD_TP_TELEFONE, T_USUARIO_COD_USUARIO, DDD, TELEFONE FROM T_TELEFONE");
	        rs = stmt.executeQuery();
	        
	        //Percorre todos os registros encontrados
	        while (rs.next()) {
	        	int codTelefone = rs.getInt("COD_TELEFONE");
	        	int t_tp_telefone_cod_tp_telefone = rs.getInt("T_TP_TELEFONE_COD_TP_TELEFONE");
	        	int t_usuario_cod_usuario = rs.getInt("T_USUARIO_COD_USUARIO");
	        	String ddd = rs.getString("DDD");
	        	String numTelefone = rs.getString("TELEFONE");
	        	//Cria um objeto Telefone com as informações encontradas
	        	Telefone telefone = new Telefone (codTelefone, t_tp_telefone_cod_tp_telefone, t_usuario_cod_usuario,
	        			ddd, numTelefone);
	        	//Adiciona um telefone na lista
	        	lista.add(telefone);
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
  
    public Telefone buscarPorTelefone(int CodTelefone) {
    	Telefone telefone = null;
        ResultSet rs = null;
        
        try {
        	conexao = FintechDBManager.obterConexao();
        	stmt = conexao.prepareStatement("SELECT COD_TELEFONE, T_TP_TELEFONE_COD_TP_TELEFONE, T_USUARIO_COD_USUARIO, DDD, TELEFONE FROM T_TELEFONE WHERE COD_TELEFONE = ?");
        	stmt.setInt(1, CodTelefone);
        	rs = stmt.executeQuery();
        	
        	if (rs.next()){
        		int codTelefone = rs.getInt("COD_TELEFONE");
        		int t_tp_telefone_cod_tp_telefone = rs.getInt("T_TP_TELEFONE_COD_TP_TELEFONE");
	            int t_usuario_cod_usuario = rs.getInt("T_USUARIO_COD_USUARIO");
	        	String ddd = rs.getString("DDD");
	        	String numTelefone = rs.getString("TELEFONE");
	        	telefone = new Telefone (codTelefone, t_tp_telefone_cod_tp_telefone, t_usuario_cod_usuario,
	        			ddd, numTelefone);
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
        			} return telefone;
        			}
	
    public void atualizarTelefone(Telefone telefone) {
    	
    	try {
    		conexao = FintechDBManager.obterConexao();
    		
	        String sql = "UPDATE T_TELEFONE SET T_TP_TELEFONE_COD_TP_TELEFONE = ?, T_USUARIO_COD_USUARIO = ?,"
	        		+ "DDD = ?, TELEFONE = ?," + "FROM T_TELEFONE = ? WHERE COD_TELEFONE = ?";
	        stmt = conexao.prepareStatement(sql);
	        stmt.setInt(1, telefone.getT_tp_telefone_cod_tp_telefone());
	        stmt.setInt(2, telefone.getT_usuario_cod_usuario());
	        stmt.setString(3, telefone.getDdd());
	        stmt.setString(4, telefone.getNumtelefone());
	        stmt.setInt(5, telefone.getCodTelefone());
	        
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
  
    public void removerTelefone(int codTelefone) {
    	
    	try {
    		conexao = FintechDBManager.obterConexao();
	        String sql = "DELETE FROM T_TELEFONE WHERE COD_TELEFONE = ?";
	        stmt = conexao.prepareStatement(sql);
	        stmt.setInt(1, codTelefone);
	        
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