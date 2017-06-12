<%-- 
    Document   : visualizar
    Created on : 11/06/2017, 22:00:39
    Author     : Gabriel Alves
--%>

<%@page import="com.mycompany.gerenciamerenda.fachada.Fachada"%>
<%@page import="com.mycompany.gerenciarmerenda.modelo.Insumo"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%! String nome; %>
        
        <%  
            nome = request.getParameter("nome"); 
            Insumo insumo = Fachada.getInstance().recuperarInsumo(nome);
        %>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Insumo</h1>
        <a href=\"ApresentarInsumoServlet\"></a><br>
        Código: <% out.println(insumo.getCodInsumo()); %> <br>
        Nome: <%= insumo.getNome()%> <br>
        Quantidade: <%= insumo.getQuantidade()%> <br>
    </body>
</html>
