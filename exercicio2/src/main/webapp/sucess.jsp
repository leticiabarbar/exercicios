<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="br.edu.ifspcjo.ads.web2.model.User" %>

<%
    // Recupera o objeto "usuario" enviado pelo RegisterServlet
    User usuario = (User) request.getAttribute("usuario");
%>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Cadastro realizado</title>
</head>
<body>
    <h1>Cadastro realizado com sucesso!</h1>

    <% if (usuario != null) { %>
        <p>Bem-vindo, <strong><%= usuario.getNome() %></strong>!</p>
        <p>Seu e-mail cadastrado é: <%= usuario.getEmail() %></p>
    <% } else { %>
        <p>Erro ao recuperar os dados do usuário.</p>
    <% } %>

    <p><a href="index.jsp">Voltar para o login</a></p>
</body>
</html>
