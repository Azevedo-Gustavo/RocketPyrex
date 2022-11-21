package br.com.RocketPyrex.dao;

import br.com.RocketPyrex.usuario.Usuario;

public interface UsuarioDAO {
	
	void cadastrarUsuario(Usuario usuario);

	boolean validarUsuario(Usuario usuario);
	
}
