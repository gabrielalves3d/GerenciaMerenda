<%-- 
    Document   : index
    Created on : 11/06/2017, 21:01:33
    Author     : Gabriel Alves
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%  
            String mensagem = (String)session.getAttribute("msg");
            
            if(mensagem!=null){
                session.removeAttribute("msg");
        %>
        <h2><%= mensagem%></h2>
        <% }%>
        
        
        <h1>GERENCIA MERENDA</h1>
        <a href="CadastrarInsumo.jsp"> Cadastrar Tipo Animal</a>
    </body>
</html>
