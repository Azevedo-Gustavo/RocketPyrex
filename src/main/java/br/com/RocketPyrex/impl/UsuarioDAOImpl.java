package br.com.RocketPyrex.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import br.com.RocketPyrex.dao.UsuarioDAO;
import br.com.RocketPyrex.singleton.FintechDBManager;
import br.com.RocketPyrex.usuario.Usuario;

public class UsuarioDAOImpl implements UsuarioDAO {
	
	private Connection conexao;
	PreparedStatement stmt = null;
	
	public void cadastrarUsuario(Usuario usuario) {
		
		try {
			conexao = FintechDBManager.obterConexao();
	        String sql = "INSERT INTO T_USUARIO(COD_USUARIO, NOME, DS_OBJETIVO, EMAIL, DOC_USUARIO, "
	        		+ "T_TP_USUARIO_COD_TP_USUARIO, T_PORTE_COD_PORTE, DS_SENHA) "
	        		+ "VALUES (SQ_TRANSACAO.NEXTVAL, ?, ?, ?, ?, ?, ?, ?)";
	        stmt = conexao.prepareStatement(sql);
	        stmt.setString(1, usuario.getNome());
	        stmt.setString(2, usuario.getObjetivo());
	        stmt.setString(3, usuario.getEmail());
	        stmt.setString(4, usuario.getDocUsuario());
	        stmt.setInt(5, usuario.getT_tp_usuario_cod_tp_usuario());
	        stmt.setInt(6, usuario.getT_porte_cod_porte());
	        stmt.setString(7, usuario.getSenha());
	        
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
	

    public boolean validarUsuario(Usuario usuario) {
    	ResultSet rs = null;
    	
    	try {
    		conexao = FintechDBManager.obterConexao();
	        String sql = "SELECT (EMAIL, SENHA) FROM T_USUARIO (WHERE EMAIL = ? AND SENHA = ?)";
	        stmt = conexao.prepareStatement(sql);
	        stmt.setString(1, usuario.getEmail());
	        stmt.setString(1, usuario.getSenha());
	        
	        rs = stmt.executeQuery();
	        
	        if (rs.next()){
	        	return true;
	        	}
	        } catch (SQLException e) {
	        	e.printStackTrace();
	        	}finally {
	        		try {
	        			stmt.close();
        				rs.close();
        				conexao.close();
        				} catch (SQLException e) {
        					e.printStackTrace();
        					}
	        		}
    	return false;
    	}
    }