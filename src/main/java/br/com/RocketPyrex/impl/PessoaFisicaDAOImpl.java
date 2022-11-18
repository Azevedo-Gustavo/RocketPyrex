package br.com.RocketPyrex.impl;

//Necessário revisar os métodos: List<PessoaFisica> listarPF() e PessoaFisica buscarPorPF(int CodPessoaFisica)

/*import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.RocketPyrex.jdbc.FintechDBManager;
import br.com.RocketPyrex.usuario.PessoaFisica;

public class PessoaFisicaDAOImpl implements PessoaFisicaDAO {
	private Connection conexao;
	PreparedStatement stmt = null;
  
    public void cadastrarPF(PessoaFisica pessoafisica) {
    	try {
    		conexao = FintechDBManager.obterConexao();
	        String sql = "INSERT INTO TAB_PESSOA_FISICA(COD_P_FISICA, T_USUARIO_COD_USUARIO,"
	        		+ "NUM_CPF, GENERO) VALUES (SQ_PESSOA_FISICA.NEXTVAL, ?, ?, ?, ?)";
	        stmt = conexao.prepareStatement(sql);
	        stmt.setInt(1, pessoafisica.getCodPessoaFisica());
	        stmt.setInt(2, pessoafisica.getT_usuario_cod_usuario());
	        stmt.setString(3, pessoafisica.getCpf());
	        stmt.setString(4, String.valueOf(pessoafisica.getGenero()));
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

	public List<PessoaFisica> listarPF() {
		//Cria uma lista de Pessoa Fisica
	    List<PessoaFisica> lista = new ArrayList<PessoaFisica>();
	    ResultSet rs = null;
	      
	      
	      //public List <Investimento> getAll(){
	    	//  return (List<Investimento>) Investimento.findAll();
	      //}; 
	        
	    try {
	    	conexao = FintechDBManager.obterConexao();
	        stmt = conexao.prepareStatement ("SELECT COD_P_FISICA, T_USUARIO_COD_USUARIO, "
	        		+ "NUM_CPF, GENERO" + "FROM TAB_PESSOA_FISICA");
	        rs = stmt.executeQuery();
	        
	        //Percorre todos os registros encontrados
	        while (rs.next()) {
	        	int codPessoaFisica = rs.getInt("COD_P_FISICA");
	        	int t_usuario_cod_usuario = rs.getInt("T_USUARIO_COD_USUARIO");
	        	String cpf = rs.getString("NUM_CPF");
	        	String genero = rs.getString("GENERO");
	        	//Cria um objeto Pessoa Fisica com as informações encontradas
	        	PessoaFisica pessoafisica = new PessoaFisica (codUsuario, nome, objetivo, email, codPessoaFisica, t_usuario_cod_usuario, cpf, genero);
	        	//Adiciona pessoa fisica na lista
	        	lista.add(pessoafisica);
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
  
    public PessoaFisica buscarPorPF(int CodPessoaFisica) {
    	PessoaFisica pessoafisica = null;
        ResultSet rs = null;
        
        try {
        	conexao = FintechDBManager.obterConexao();
        	stmt = conexao.prepareStatement("SELECT * FROM TAB_PESSOA_FISICA WHERE COD_P_FISICA = ?");
        	stmt.setInt(1, CodPessoaFisica);
        	rs = stmt.executeQuery();
        	
        	if (rs.next()){
        		int codPessoaFisica = rs.getInt("COD_P_FISICA");
	            int t_usuario_cod_usuario = rs.getInt("T_USUARIO_COD_USUARIO");
	            String cpf = rs.getString("NUM_CPF");
	            String genero = rs.getString("GENERO");
	            pessoafisica = new PessoaFisica (codPessoaFisica, t_usuario_cod_usuario, cpf, genero);
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
        			} return pessoafisica;
        			}
	
    public void atualizarPF(PessoaFisica pessoafisica) {
    	
    	try {
    		conexao = FintechDBManager.obterConexao();
    		
	        String sql = "UPDATE TAB_PESSOA_FISICA SET T_USUARIO_COD_USUARIO = ?,"
	        		+ "NUM_CPF = ?, GENERO = ?," + "FROM TAB_PESSOA_FISICA = ? WHERE COD_P_FISICA = ?";
	        stmt = conexao.prepareStatement(sql);
	        stmt.setInt(1, pessoafisica.getCodPessoaFisica());
	        stmt.setInt(2, pessoafisica.getT_usuario_cod_usuario());
	        stmt.setString(3, pessoafisica.getCpf());
	        stmt.setString(4, String.valueOf(pessoafisica.getGenero()));
	  
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
  
    public void removerPF(int codPessoaFisica) {
    	
    	try {
    		conexao = FintechDBManager.obterConexao();
	        String sql = "DELETE FROM TAB_PESSOA_FISICA WHERE COD_P_FISICA = ?";
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