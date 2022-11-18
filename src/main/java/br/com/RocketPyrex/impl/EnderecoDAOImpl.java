package br.com.RocketPyrex.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.RocketPyrex.dao.EnderecoDAO;
import br.com.RocketPyrex.singleton.FintechDBManager;
import br.com.RocketPyrex.usuario.Endereco;


public class EnderecoDAOImpl implements EnderecoDAO {
	private Connection conexao;
	PreparedStatement stmt = null;
  
    public void cadastrarEndereco (Endereco endereco) {
    	try {
    		conexao = FintechDBManager.obterConexao();
	        String sql = "INSERT INTO T_ENDERECO(COD_ENDERECO, T_USUARIO_COD_USUARIO, LOGRADOURO, NUM_NUMERO, NUM_CEP, BAIRRO, ESTADO, PAIS, COMPLEMENTO, CIDADE) VALUES (SQ_ENDERECO.NEXTVAL, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
	        stmt = conexao.prepareStatement(sql);
	        stmt.setInt(1, endereco.getT_usuario_cod_usuario());
	        stmt.setString(2, endereco.getLogradouro());
	        stmt.setInt(3, endereco.getNumero());
	        stmt.setString(4, endereco.getCep());
	        stmt.setString(5, endereco.getBairro());
	        stmt.setString(6, endereco.getEstado());
	        stmt.setString(7, endereco.getPais());
	        stmt.setString(8, endereco.getComplemento());
	        stmt.setString(9, endereco.getCidade());
	        
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

	public List<Endereco> listarEndereco() {
		//Cria uma lista do Endereço
	    List<Endereco> lista = new ArrayList<Endereco>();
	    ResultSet rs = null;
	        
	    try {
	    	conexao = FintechDBManager.obterConexao();
	        stmt = conexao.prepareStatement ("SELECT COD_ENDERECO, T_USUARIO_COD_USUARIO, LOGRADOURO, NUM_NUMERO, NUM_CEP, BAIRRO, ESTADO, PAIS, COMPLEMENTO, CIDADE FROM T_ENDERECO");
	        rs = stmt.executeQuery();
	        
	        //Percorre todos os registros encontrados
	        while (rs.next()) {
	        	int codEndereco = rs.getInt("COD_ENDERECO");
	        	int t_usuario_cod_usuario = rs.getInt("T_USUARIO_COD_USUARIO");
	        	String logradouro = rs.getString("LOGRADOURO");
	        	int numero = rs.getInt("NUM_NUMERO");
	        	String cep = rs.getString("NUM_CEP");
	        	String bairro = rs.getString("BAIRRO");
	        	String estado = rs.getString("ESTADO");
	        	String pais = rs.getString("PAIS");
	        	String complemento = rs.getString("COMPLEMENTO");
	        	String cidade = rs.getString("CIDADE");
	        	//Cria um objeto Endereço com as informações encontradas
	        	Endereco endereco = new Endereco (codEndereco, t_usuario_cod_usuario, logradouro, 
	        			numero, cep, bairro, estado, pais, complemento, cidade);
	        	//Adiciona o endereço na lista
	        	lista.add(endereco);
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
  
    public Endereco buscarPorEndereco(int CodEndereco) {
    	Endereco endereco = null;
        ResultSet rs = null;
        
        try {
        	conexao = FintechDBManager.obterConexao();
        	stmt = conexao.prepareStatement("SELECT COD_ENDERECO, T_USUARIO_COD_USUARIO, LOGRADOURO, NUM_NUMERO, NUM_CEP, BAIRRO, ESTADO, PAIS, COMPLEMENTO, CIDADE FROM T_ENDERECO WHERE COD_ENDERECO = ?");
        	stmt.setInt(1, CodEndereco);
        	rs = stmt.executeQuery();
        	
        	if (rs.next()){
        		int codEndereco = rs.getInt("COD_ENDERECO");
	            int t_usuario_cod_usuario = rs.getInt("T_USUARIO_COD_USUARIO");
	            String logradouro = rs.getString("LOGRADOURO");
	            int numero = rs.getInt("NUM_NUMERO");
	            String cep = rs.getString("NUM_CEP");
	            String bairro = rs.getString("BAIRRO");
	            String estado = rs.getString("ESTADO");
	            String pais = rs.getString("PAIS");
	            String complemento = rs.getString("COMPLEMENTO");
	            String cidade = rs.getString("CIDADE");
	            endereco = new Endereco (codEndereco, t_usuario_cod_usuario, logradouro, 
		        		  numero, cep, bairro, estado, pais, complemento, cidade);
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
        			} return endereco;
        			}
	
    public void atualizarEndereco(Endereco endereco) {
    	
    	try {
    		conexao = FintechDBManager.obterConexao();
    		
	        String sql = "UPDATE T_ENDERECO SET T_USUARIO_COD_USUARIO = ?, LOGRADOURO = ?, NUM_NUMERO = ?, NUM_CEP = ?, BAIRRO = ?, ESTADO = ?, PAIS = ?, COMPLEMENTO = ?, CIDADE = ?, FROM T_ENDERECO = ? WHERE COD_ENDERECO = ?";
	        stmt = conexao.prepareStatement(sql);
	        stmt.setInt(1, endereco.getT_usuario_cod_usuario());
	        stmt.setString(2, endereco.getLogradouro());
	        stmt.setInt(3, endereco.getNumero());
	        stmt.setString(4, endereco.getCep());
	        stmt.setString(5, endereco.getBairro());
	        stmt.setString(6, endereco.getEstado());
	        stmt.setString(7, endereco.getPais());
	        stmt.setString(8, endereco.getComplemento());
	        stmt.setString(9, endereco.getCidade());
	        stmt.setInt(10, endereco.getCodEndereco());
	  
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
  
    public void removerEndereco(int CodEndereco) {
    	
    	try {
    		conexao = FintechDBManager.obterConexao();
	        String sql = "DELETE FROM T_ENDERECO WHERE COD_ENDERECO = ?";
	        stmt = conexao.prepareStatement(sql);
	        stmt.setInt(1, CodEndereco);
	        
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