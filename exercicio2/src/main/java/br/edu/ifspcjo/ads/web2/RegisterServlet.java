package br.edu.ifspcjo.ads.web2;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

import java.io.IOException;

@WebServlet("/register")
public class RegisterServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {

		String nome = request.getParameter("nome");
		String email = request.getParameter("email");
		String senha = request.getParameter("senha");

		if (nome == null || email == null || senha == null || nome.trim().isEmpty() || email.trim().isEmpty()
				|| senha.trim().isEmpty()) {

			response.sendRedirect("error.jsp");
		} else {

			request.setAttribute("nome", nome);
			request.setAttribute("email", email);
			request.getRequestDispatcher("success.jsp").forward(request, response);
		}
	}
}