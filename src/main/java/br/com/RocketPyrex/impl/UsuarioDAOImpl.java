package br.com.RocketPyrex.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.RocketPyrex.dao.UsuarioDAO;
import br.com.RocketPyrex.singleton.FintechDBManager;
import br.com.RocketPyrex.usuario.Usuario;

public class UsuarioDAOImpl implements UsuarioDAO {
	
	private Connection conexao;
	PreparedStatement stmt = null;
  
    public void cadastrarUsuario(Usuario usuario) {
    	try {
    		conexao = FintechDBManager.obterConexao();
	        String sql = "INSERT INTO T_USUARIO(COD_USUARIO, NOME, DS_OBJETIVO, EMAIL) VALUES (SQ_USUARIO.NEXTVAL, ?, ?, ?)";
	        stmt = conexao.prepareStatement(sql);
	        stmt.setString(1, usuario.getNome());
	        stmt.setString(2, usuario.getObjetivo());
	        stmt.setString(3, usuario.getEmail());
	        
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

	public List<Usuario> listarUsuario() {
		//Cria uma lista de Usuarios
	    List<Usuario> lista = new ArrayList<Usuario>();
	    ResultSet rs = null;
	      
	    try {
	    	conexao = FintechDBManager.obterConexao();
	        stmt = conexao.prepareStatement ("SELECT COD_USUARIO, NOME, DS_OBJETIVO, EMAIL FROM T_USUARIO");
	        rs = stmt.executeQuery();
	        
	        //Percorre todos os registros encontrados
	        while (rs.next()) {
	        	int codUsuario = rs.getInt("COD_USUARIO");
	        	String nome = rs.getString("NOME");
	        	String objetivo = rs.getString("DS_OBJETIVO");
	        	String email = rs.getString("EMAIL");
	        	//Cria um objeto Usuario com as informações encontradas
	        	Usuario usuario = new Usuario (codUsuario, nome, objetivo,email);
	        	//Adiciona um usuario na lista
	        	lista.add(usuario);
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
  
    public Usuario buscarPorUsuario(int CodUsuario) {
    	Usuario usuario = null;
        ResultSet rs = null;
        
        try {
        	conexao = FintechDBManager.obterConexao();
        	stmt = conexao.prepareStatement("SELECT COD_USUARIO, NOME, DS_OBJETIVO, EMAIL FROM T_USUARIO WHERE COD_USUARIO = ?");
        	stmt.setInt(1, CodUsuario);
        	rs = stmt.executeQuery();
        	
        	if (rs.next()){
        		int codUsuario = rs.getInt("COD_USUARIO");
	        	String nome = rs.getString("NOME");
	        	String objetivo = rs.getString("DS_OBJETIVO");
	        	String email = rs.getString("EMAIL");
	        	usuario = new Usuario (codUsuario, nome, objetivo,email);
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
        			} return usuario;
        			}
	
    public void atualizarUsuario(Usuario usuario) {
    	
    	try {
    		conexao = FintechDBManager.obterConexao();
    		
	        String sql = "UPDATE T_USUARIO SET NOME = ?, DS_OBJETIVO = ?, EMAIL = ? WHERE COD_USUARIO = ?";
	        		
	        stmt = conexao.prepareStatement(sql);
	        stmt.setString(1, usuario.getNome());
	        stmt.setString(2, usuario.getObjetivo());
	        stmt.setString(3, usuario.getEmail());
	        stmt.setInt(4, usuario.getCodUsuario());
	        
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
  
    public void removerUsuario(int codUsuario) {
    	
    	try {
    		conexao = FintechDBManager.obterConexao();
	        String sql = "DELETE FROM T_USUARIO WHERE COD_USUARIO = ?";
	        stmt = conexao.prepareStatement(sql);
	        stmt.setInt(1, codUsuario);
	        
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