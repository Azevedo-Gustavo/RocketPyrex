package br.com.RocketPyrex.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import br.com.RocketPyrex.usuario.Usuario;
import br.com.RocketPyrex.dao.UsuarioDAO;
import br.com.RocketPyrex.factory.DAOFactory;

/**
 * Servlet implementation class CadastroUsuario
 */
@WebServlet("/login")
public class Login extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
       
    private UsuarioDAO uDAO;
    
    public Login() { 
    	uDAO = DAOFactory.getUsuarioDAO();
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String email = request.getParameter("email");
		String senha = request.getParameter("senha");
		
		Usuario usuario = new Usuario();
		
		if (uDAO.validarUsuario(usuario)) {
			HttpSession session = request.getSession();
			session.setAttribute("user", email);
			} else {
				request.setAttribute("erro", "Usuário e/ou senha inválidos");
				}
		request.getRequestDispatcher("login.jsp").forward(request, response);
		}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		session.invalidate();
		request.getRequestDispatcher("login.jsp").forward(request, response);
	}
	
}
