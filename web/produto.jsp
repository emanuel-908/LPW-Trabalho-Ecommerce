<%--
    Document   : produto
    Created on : 27/11/2019, 17:19:06
    Author     : Desenvolvimento
--%>

<%@page import="modelos.Produto"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
   <head>
      <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
      <title>JSP Page</title>
   </head>
   <body>

      <%
         //pegando parametro de id do produto
         int produtoId = Integer.parseInt(request.getParameter("id"));

      %>


      <p>O id do produto é: <%=produtoId%> </p>

      <p> <%= Produto.lista.get(produtoId).getDescricao()%> </p>
      <p> <img src="<%=Produto.lista.get(produtoId).getImagem()%>" class="img-responsive" alt="img" style="width: 240px; height:320px"> </p>
      <p>R$: <%= Produto.lista.get(produtoId).getPreco()%> </p>
    <h2>  <p> <%= Produto.lista.get(produtoId).getEspecificacao()%> </p> </h2>


      <button type="button" class="btn btn-success">Comprar</button>

   </body>
</html>
