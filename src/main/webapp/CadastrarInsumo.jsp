<%-- 
    Document   : CadastrarInsumo
    Created on : 11/06/2017, 17:21:01
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
        <h1>Cadastro de Insumo</h1>
        <form method="post" action="CadastrarInsumoServlet">
            Código:<input type="text" name="codigo"/><br/>
            Nome:<input type="text" name="nome"/><br/>
            Quantidade:<input type="text" name="quantidade"/><br/>
            <input type="submit" value="Cadastrar"/>
            <input type="reset" value="Limpar Campos"/>
        </form>
    </body>
</html>
