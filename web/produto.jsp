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
        <title>Minha Loja</title>
    </head>
    <body>

        <%
            //pegando parametro de id do produto
            int produtoId = Integer.parseInt(request.getParameter("id"));

        %>

        <%                    String init = request.getParameter("inicio");
            String end = request.getParameter("fim");

            int inicio = init != null ? Integer.parseInt(init) : 0;
            int fim = end != null ? Integer.parseInt(end) : 1;

        %>

        <div class="row">
            <div align="center">
                <%    for (int i = inicio; i < fim; i++) {
                        Produto p = Produto.lista.get(i);
                %>
                <div class="col-md-4">
                    <div class="card mb-4" style="width: 18rem;">
                        <h2>  <p class="card-text"><%= Produto.lista.get(produtoId).getDescricao()%></p> </h2>
                        <img src="<%=Produto.lista.get(produtoId).getImagem()%>" class="img-responsive" alt="img" style="width: 200px; height:320px">
                        <div class="card-body border-top">            
                            <h3>    <p class="card-text">R$<%= Produto.lista.get(produtoId).getPreco()%></p>      </h3>
                            <h4>     <p class="card-text"><%= Produto.lista.get(produtoId).getEspecificacao()%></p> </h4>  
                            <button type="button" class="btn btn-success">Comprar</button>
                        </div>
                    </div>
                </div>
                <%}%>
            </div>
        </div>
    </body>
</html>