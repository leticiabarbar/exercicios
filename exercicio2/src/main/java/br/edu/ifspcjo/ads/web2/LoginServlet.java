package br.edu.ifspcjo.ads.web2;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

import java.io.IOException;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
	private static final String VALID_EMAIL = "usuario@ifsp.edu.br";
    private static final String VALID_PASSWORD = "123456";

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String email = request.getParameter("email");
        String senha = request.getParameter("senha");

        if (email == null || senha == null || email.isEmpty() || senha.isEmpty()) {
            response.sendRedirect("error.jsp");
        } else if (email.equals(VALID_EMAIL) && senha.equals(VALID_PASSWORD)) {
            request.setAttribute("usuario", email);
            request.getRequestDispatcher("welcome.jsp").forward(request, response);
        } else {
            response.sendRedirect("error.jsp");
        }
    }
}
