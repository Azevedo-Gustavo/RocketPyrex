package br.com.RocketPyrex.teste;

import br.com.RocketPyrex.dao.UsuarioDAO;
import br.com.RocketPyrex.factory.DAOFactory;
import br.com.RocketPyrex.usuario.Usuario;

public class TesteCadastroUsuario {

	public static void main(String[] args) {
			
			UsuarioDAO uDao = DAOFactory.getUsuarioDAO();
			
			Usuario usuario = new Usuario();
			
			usuario.setNome("Gustavo");
			usuario.setObjetivo("Teste");
			usuario.setEmail("teste@teste.com");
			usuario.setDocUsuario("123.456.789/12");
			usuario.setT_tp_usuario_cod_tp_usuario(1);
			usuario.setT_porte_cod_porte(1);
			usuario.setSenha("123456");
			
	        uDao.cadastrarUsuario(usuario);
			}
	}