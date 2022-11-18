package br.com.RocketPyrex.dao;

import java.util.List;

import br.com.RocketPyrex.usuario.Usuario;

public interface UsuarioDAO {

	void cadastrarUsuario(Usuario usuario);
	
	List<Usuario> listarUsuario();
	
	Usuario buscarPorUsuario(int CodUsuario);
	
	void atualizarUsuario(Usuario usuario);
	
	void removerUsuario(int codUsuario);
	
}
