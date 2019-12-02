<%--
    Document   : index
    Created on : 21/08/2019, 17:26:44
    Author     : gutol
--%>

<%@page import="modelos.Produto"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Minha Loja</title>
        <link rel="stylesheet" href="css/bootstrap.min.css">
        <link rel="stylesheet" href="css/ofertas.css">
    </head>
    <body>

        <jsp:include page="menu.jsp">
            <jsp:param name="item" value="ofertas" />
        </jsp:include>

        <jsp:useBean id="Produtos" class="modelos.Produto" />

        <%
            String init = request.getParameter("inicio");
            String end = request.getParameter("fim");

            int inicio = init != null ? Integer.parseInt(init) : 0;
            int fim = end != null ? Integer.parseInt(end) : 6;

         %>

         <div class="ofertas">
            <div class="row">
               <%    for (int i = inicio; i <fim; i++){
                         Produto p = Produto.lista.get(i);

                        if(p.getOferta()){
               %>
                           <div class="col-md-4">
                              <div class="card mb-4" style="width: 18rem;">
                                 <img src="<%=p.getImagem()%>" class="img-responsive" alt="img" style="width: 100px; height:120px">
                                 <div class="card-body border-top">
                                    <h5 class="card-title"> <a href="produto.jsp?id=<%= i %>"> <%=p.getDescricao()%> <a> </h5>
                                    <p class="card-text">R$<%=p.getPreco()%></p>
                                    <a href="#" class="btn btn-primary">comprar</a>
                                  </div>
                              </div>
                           </div>
                        <%}%>
                     <%}%>
               </div>
               </div>

        <nav aria-label="Page navigation example">
         <ul class="pagination justify-content-center">
            <li class="page-item">
               </li>

            <li class="page-item"><a class="page-link" href="?inicio=0&fim=6">1</a></li>
            <li class="page-item"><a class="page-link" href="?inicio=6&fim=12">2</a></li>
               </nav>

        <script src="js/bootstrap.min.js"></script>
    </body>
</html>