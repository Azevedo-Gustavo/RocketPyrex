package br.com.RocketPyrex.impl;

//Necessário revisar os métodos: List<PessoaJuridica> listarPJ() e PessoaJuridica buscarPorPJ(int CodPessoaJuridica)

/*import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.RocketPyrex.jdbc.FintechDBManager;
import br.com.RocketPyrex.usuario.PessoaJuridica;

public class PessoaJuridicaDAOImpl implements PessoaJuridicaDAO {
	private Connection conexao;
	PreparedStatement stmt = null;
  
    public void cadastrarPJ(PessoaJuridica pessoajuridica) {
    	try {
    		conexao = FintechDBManager.obterConexao();
	        String sql = "INSERT INTO TAB_PESSOA_JURIDICA(COD_P_JURIDICA, T_PORTE_COD_PORTE, T_USUARIO_COD_USUARIO,"
	        		+ "NUM_CNPJ) VALUES (SQ_PESSOA_JURIDICA.NEXTVAL, ?, ?, ?, ?)";
	        stmt = conexao.prepareStatement(sql);
	        stmt.setInt(1, pessoajuridica.getCodPessoaJuridica());
	        stmt.setInt(2, pessoajuridica.getT_porte_cod_porte());
	        stmt.setInt(3, pessoajuridica.getT_usuario_cod_usuario());
	        stmt.setInt(4, pessoajuridica.getCnpj());
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

	public List<PessoaJuridica> listarPJ() {
		//Cria uma lista de Pessoa Juridica
	    List<PessoaJuridica> lista = new ArrayList<PessoaJuridica>();
	    ResultSet rs = null;
	      
	      
	      //public List <Investimento> getAll(){
	    	//  return (List<Investimento>) Investimento.findAll();
	      //};
	        
	    try {
	    	conexao = FintechDBManager.obterConexao();
	        stmt = conexao.prepareStatement ("SELECT COD_P_JURIDICA, T_PORTE_COD_PORTE, T_USUARIO_COD_USUARIO, "
	        		+ "NUM_CNPJ" + "FROM TAB_PESSOA_JURIDICA");
	        rs = stmt.executeQuery();
	        
	        //Percorre todos os registros encontrados
	        while (rs.next()) {
	        	int codPessoaJuridica = rs.getInt("COD_P_JURIDICA");
	        	int t_porte_cod_porte = rs.getInt("T_PORTE_COD_PORTE");
	        	int t_usuario_cod_usuario = rs.getInt("T_USUARIO_COD_USUARIO");
	        	String cnpj = rs.getString("NUM_CNPJ");
	        	//Cria um objeto Pessoa Juridica com as informações encontradas
	        	PessoaJuridica pessoajuridica = new PessoaJuridica (codPessoaJuridica, t_porte_cod_porte,
	        			t_usuario_cod_usuario, cnpj);
	        	//Adiciona pessoa juridica na lista
	        	lista.add(pessoajuridica);
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
  
    public PessoaJuridica buscarPorPJ(int CodPessoaJuridica) {
    	PessoaJuridica pessoajuridica = null;
        ResultSet rs = null;
        
        try {
        	conexao = FintechDBManager.obterConexao();
        	stmt = conexao.prepareStatement("SELECT * FROM TAB_PESSOA_JURIDICA WHERE COD_P_JURIDICA = ?");
        	stmt.setInt(1, CodPessoaJuridica);
        	rs = stmt.executeQuery();
        	
        	if (rs.next()){
        		int codPessoaFisica = rs.getInt("COD_P_JURIDICA");
        		int t_porte_cod_porte = rs.getInt("T_PORTE_COD_PORTE");
	        	int t_usuario_cod_usuario = rs.getInt("T_USUARIO_COD_USUARIO");
	        	String cnpj = rs.getString("NUM_CNPJ");
	        	pessoajuridica = new PessoaJuridica (codPessoaJuridica, t_porte_cod_porte,
	        			t_usuario_cod_usuario, cnpj);
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
        			} return pessoajuridica;
        			}
	
    public void atualizarPJ(PessoaJuridica pessoajuridica) {
    	
    	try {
    		conexao = FintechDBManager.obterConexao();
    		
	        String sql = "UPDATE TAB_PESSOA_JURIDICA SET T_PORTE_COD_PORTE = ?, T_USUARIO_COD_USUARIO = ?,"
	        		+ "NUM_CPF = ?, GENERO = ?," + "FROM TAB_PESSOA_JURIDICA = ? WHERE COD_P_JURIDICA = ?";
	        stmt = conexao.prepareStatement(sql);
	        stmt.setInt(1, pessoajuridica.getCodPessoaJuridica());
	        stmt.setInt(2, pessoajuridica.getT_porte_cod_porte());
	        stmt.setInt(3, pessoajuridica.getT_usuario_cod_usuario());
	        stmt.setInt(4, pessoajuridica.getCnpj());
	  
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
  
    public void removerPJ(int codPessoaFisica) {
    	
    	try {
    		conexao = FintechDBManager.obterConexao();
	        String sql = "DELETE FROM TAB_PESSOA_JURIDICA WHERE COD_P_JURIDICA = ?";
	        stmt = conexao.prepareStatement(sql);
	        stmt.setInt(1, codPessoaFisica);
	        
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
    }*/